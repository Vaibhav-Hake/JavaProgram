class Car {
    public static void main(String[] args) {

        String carName = "Swift";
        byte seatingCapacity = 5;

        
        byte driverSeat = 1;
        byte passengerSeats = (byte)(seatingCapacity - driverSeat);

    
        byte airbags = 2;
        byte doors = 4;
        byte wheels = 4;


        System.out.println("Car Name: " + carName);
        System.out.println("Total Seating Capacity: " + seatingCapacity);
        System.out.println("Driver Seat: " + driverSeat);
        System.out.println("Passenger Seats: " + passengerSeats);
        System.out.println("Fuel Type: " + fuelType);
           
        System.out.println("Number of Airbags: " + airbags);
        System.out.println("Number of Doors: " + doors);
        System.out.println("Number of Wheels: " + wheels);
    }
}