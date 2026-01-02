package Easy;

//Task.1603 Design Parking System

public class Parking {
    public static void main(String[] args) {
        ParkingSystem park = new ParkingSystem(1, 1, 0);
        System.out.println(park.addCar(3));
        System.out.println(park.addCar(3));
        System.out.println(park.addCar(1));

        ParkingSystem parkingSystem = new ParkingSystem(1, 1, 0);
        System.out.println(parkingSystem.addCar(1)); // return true because there is 1 available slot for a big car
        System.out.println(parkingSystem.addCar(2)); // return true because there is 1 available slot for a medium car
        System.out.println(parkingSystem.addCar(3)); // return false because there is no available slot for a small car
        System.out.println(parkingSystem.addCar(1)); // return false because there is no available slot for a big car. It is already occupied.

    }
}


class ParkingSystem {
    /**
     * Your ParkingSystem object will be instantiated and called as such:
     * ParkingSystem obj = new ParkingSystem(big, medium, small);
     * boolean param_1 = obj.addCar(carType);
     */
    int bigPlace;
    int mediumPlace;
    int smallPlace;

    public ParkingSystem(int big, int medium, int small) {
        this.bigPlace = big;
        this.mediumPlace = medium;
        this.smallPlace = small;
    }


    public boolean addCar(int carType) {
        if(carType == 1) {
            if(bigPlace > 0) {
                bigPlace--;
                return true;
            }
            return false;
        }
        else if (carType == 2) {
            if(mediumPlace > 0) {
                mediumPlace--;
                return true;
            }
            return false;
        }
        else if (carType == 3) {
            if(smallPlace > 0) {
                smallPlace--;
                return true;
            }
            return false;
        }
        return false;
    }
}
