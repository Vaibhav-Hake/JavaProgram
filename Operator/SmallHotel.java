class SmallHotel {
    public static void main(String[] args) {

        String hotelName = "Mini Stay";
        byte totalRooms = 60;

        byte bookedRooms = (byte)(totalRooms * 0.50);
        byte availableRooms = (byte)(totalRooms - bookedRooms);

        byte staff = 20;
        byte floors = 3;

        System.out.println("Hotel Name: " + hotelName);
        System.out.println("Total Rooms: " + totalRooms);
        System.out.println("Booked Rooms: " + bookedRooms);
        System.out.println("Available Rooms: " + availableRooms);
        System.out.println("Staff: " + staff);
        System.out.println("Floors: " + floors);
    }
}