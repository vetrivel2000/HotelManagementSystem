package logical;

import pojo.Hotel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class LogicalLayer {
    public ArrayList<Hotel> sortByName(ArrayList<Hotel> hotels)
    {
        Comparator<Hotel> compare=new Comparator<Hotel>() {
            @Override
            public int compare(Hotel o1, Hotel o2) {
                return o2.getHotelName().compareTo(o1.getHotelName());
            }
        };
        hotels.sort(compare);
        return hotels;
    }
    public ArrayList<Hotel> sortByRating(ArrayList<Hotel> hotels)
    {
        Comparator<Hotel> compare=new Comparator<Hotel>() {
            @Override
            public int compare(Hotel o1, Hotel o2) {
                if(o1.getRating()< o2.getRating())
                {
                    return 1;
                }
                else
                {
                    return -1;
                }
            }
        };
        hotels.sort(compare);
        return hotels;
    }
    public ArrayList<Hotel> sortByRooms(ArrayList<Hotel> hotels)
    {
        Comparator<Hotel> compare=new Comparator<Hotel>() {
            @Override
            public int compare(Hotel o1, Hotel o2) {
                if(o1.getRoomsAvailable()< o2.getRoomsAvailable())
                {
                    return 1;
                }
                else
                {
                    return -1;
                }
            }
        };
        hotels.sort(compare);
        return hotels;
    }
}
