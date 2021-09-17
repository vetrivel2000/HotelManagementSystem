package pojo;

public class Hotel {
    private String hotelName;
    private String place;
    private int roomsAvailable;
    private int rating;
    private int price;

    public Hotel(String hotelName, String place, int roomsAvailable, int rating, int price) {
        this.hotelName = hotelName;
        this.place = place;
        this.roomsAvailable = roomsAvailable;
        this.rating = rating;
        this.price = price;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public int getRoomsAvailable() {
        return roomsAvailable;
    }

    public void setRoomsAvailable(int roomsAvailable) {
        this.roomsAvailable = roomsAvailable;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "hotelName='" + hotelName + '\'' +
                ", place='" + place + '\'' +
                ", roomsAvailable=" + roomsAvailable +
                ", rating=" + rating +
                ", price=" + price +
                '}';
    }
}
