package Praktikum05;

public class travelHotelMain {
    public static void main(String[] args) {
       travelHotel [] hotels = new travelHotel[5];
       travelHotel hotel1 = new travelHotel("Citihub Hotel", 359.775, 4.6);
       travelHotel hotel2 = new travelHotel("Merdeka hotel", 327.194, 4.8);
       travelHotel hotel3 = new travelHotel("Lotus Garden Hotel", 306.340, 4.5);
       travelHotel hotel4 = new travelHotel("Palem Garden Hotel", 85.145, 4.0);
       travelHotel hotel5 = new travelHotel("Viva hotel", 310.419, 4.3);

       hotels[0] = hotel1;
       hotels[1] = hotel2;
       hotels[2] = hotel3;
       hotels[3] = hotel4;
       hotels[4] = hotel5;

       travelHotel.bubbleSortByHarga(hotels);
        System.out.println("======== Sorting berdasakan harga : ========");
        for (travelHotel hotel: hotels) {
            hotel.displayInfo();
        }

        System.out.println("\n");

        travelHotel.selectionDescByRating(hotels);
        System.out.println("======== Sorting berdasarkan rating : ========");
        for (travelHotel hotel: hotels) {
            hotel.displayInfo();
        }   
}
}
