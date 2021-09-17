package pojo;

public class User {
    private String userName;
    private String HotelName;
    private int userId;
    private int bookingCost;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getHotelName() {
        return HotelName;
    }

    public void setHotelName(String hotelName) {
        HotelName = hotelName;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getBookingCost() {
        return bookingCost;
    }

    public void setBookingCost(int bookingCost) {
        this.bookingCost = bookingCost;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", HotelName='" + HotelName + '\'' +
                ", userId=" + userId +
                ", bookingCost=" + bookingCost +
                '}';
    }
}
