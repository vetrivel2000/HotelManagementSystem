import logical.LogicalLayer;
import pojo.Hotel;
import pojo.User;

import java.util.ArrayList;
import java.util.Scanner;

public class HotelRunner {
    static int userId=1;
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        LogicalLayer logical=new LogicalLayer();
        ArrayList<Hotel> hotels= new ArrayList<>();
        ArrayList<User> users = new ArrayList<>();
        hotels.add(new Hotel("H1","Mumbai",15,4,100));
        hotels.add(new Hotel("H2","Bangalore",17,5,250));
        hotels.add(new Hotel("H3","Bangalore",16,5,150));
        int option;
        do {
            System.out.println("1.Print the hotel data.\n" +
                    "2.Sort hotels by Name.\n" +
                    "3.Sort Hotel by highest rating.\n" +
                    "4.Print Hotel data for a Location\n" +
                    "5.Sort hotels by maximum number of rooms Available.\n" +
                    "6.Booking Hotel\n"+
                    "7.Print user Booking Data");
            option=scan.nextInt();
            switch (option)
            {
                case 1:
                {
                    for (Hotel hotel : hotels) {
                        System.out.println(hotel);
                    }
                    break;
                }
                case 2:
                {
                    ArrayList<Hotel> sortByName= logical.sortByName(hotels);
                    for(Hotel hotel:sortByName)
                    {
                        System.out.println(hotel);
                    }
                    break;
                }
                case 3:
                {
                    ArrayList<Hotel> sortByRating=logical.sortByRating(hotels);
                    for(Hotel hotel:sortByRating)
                    {
                        System.out.println(hotel);
                    }
                    break;
                }
                case 4:
                {
                    System.out.println("Enter location");
                    String location= scan.next();
                    for(Hotel hotel:hotels)
                    {
                        if(hotel.getPlace().equals(location))
                        {
                            System.out.println(hotel);
                        }
                    }
                    break;
                }
                case 5:
                {
                    ArrayList<Hotel> sortByRooms=logical.sortByRooms(hotels);
                    for(Hotel hotel:sortByRooms)
                    {
                        System.out.println(hotel);
                    }
                    break;
                }
                case 6:
                {
                    System.out.println("Enter your name");
                    String name=scan.next();
                    System.out.println("Enter Hotel name");
                    String hotelName= scan.next();
                    System.out.println("Number of rooms:");
                    int numberOfRooms=scan.nextInt();
                    int cost=0;
                    for (Hotel hotel:hotels)
                    {
                        int rooms= hotel.getRoomsAvailable();
                        if(hotel.getHotelName().equals(hotelName))
                        {
                            cost=numberOfRooms*hotel.getPrice();
                        }
                        rooms=rooms-numberOfRooms;
                        hotel.setRoomsAvailable(rooms);
                    }
                    User user = new User();
                    user.setUserId(userId);
                    user.setUserName(name);
                    user.setHotelName(hotelName);
                    user.setBookingCost(cost);
                    users.add(user);
                    break;
                }
                case 7:
                {
                    for(User user:users)
                    {
                        System.out.println(user);
                    }
                    break;
                }
            }
        }while (option<8);
    }
}
