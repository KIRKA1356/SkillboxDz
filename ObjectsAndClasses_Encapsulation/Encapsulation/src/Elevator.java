public class Elevator {
    private int currentFloor = 1; //текущий этаж
    private int minFloor;
    private int maxFloor;

    public Elevator(int minFloor, int maxFloor) {
        this.minFloor = minFloor;
        this.maxFloor = maxFloor;
    }

    public void setCurrentFloor(int currentFloor) {
        this.currentFloor = currentFloor;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public int moveDown(int currentFloor) {
        return currentFloor - 1;
    }

    public int moveUp(int currentFloor) {
        return currentFloor + 1;
    }

    public void movefloor(int floor) {
            if (currentFloor > floor)
                while(currentFloor > floor) {
                    currentFloor = moveDown(currentFloor);
                if (currentFloor == floor) {
                    System.out.println("Этаж: " + floor);
                    setCurrentFloor(floor);
                }

            }

        if (currentFloor < floor)
            while(currentFloor < floor) {
                currentFloor = moveUp(currentFloor);
                if (currentFloor == floor) {
                    System.out.println("Этаж: " + floor);
                    setCurrentFloor(floor);
                }
            }
    }
}




