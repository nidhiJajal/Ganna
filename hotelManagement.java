import java.util.*;

public class Main
{
    static void manageHotel(){
        int optHotel;
        do{
        Scanner sc = new Scanner(System.in);
       
        System.out.println("1. Add Hotel \n2. Remove Hotel");
        System.out.println("Please enter the option value");

        optHotel=sc.nextInt();

        ArrayList<String> hotelNameList = new ArrayList<>();
        ArrayList<String> totalRoomList = new ArrayList<>();
        ArrayList<String> roomRateList = new ArrayList<>();
        switch (optHotel) {
        case 1:
        {

            System.out.println("Enter Hotel name:");
            String hotelName = sc.nextLine();

            System.out.println("Enter Total Rooms:");
            String totalRooms = sc.nextLine();

            System.out.println("Enter Room rate:");
            String roomRate = sc.nextLine();
                   

                hotelNameList.add(hotelName);
                totalRoomList.add(totalRooms);
                roomRateList.add(roomRate);
                System.out.println(hotelNameList);
                System.out.println(totalRoomList);
                System.out.println(roomRateList);
        }
        case 2:
        {
            System.out.println(hotelNameList);
            System.out.println(totalRoomList);
            System.out.println(roomRateList);
        }
        }
        }while ( optHotel > 3 || optHotel < 1 );
    }
    static void manageGuest(){
        System.out.println("manage the guest");
    }
    static void report(){
        System.out.println("report");
    }
    public static void main(String[] args)
    {
        int option;
        do{
            
        Scanner sc = new Scanner(System.in);
        
        System.out.println("1. Manage Hotel \n2. Manage guest \n3. Report\\n4. Exit");
        System.out.println("Please enter the option value");
          
        option=sc.nextInt();
        switch (option) {
        case 1: 
            manageHotel();
        case 2:
            manageGuest();
        case 3:
            report();
        case 4:
            System.exit(0);
        default:
            System.out.println("try again");
        }
        }while ( option > 3 || option < 1 );
        
    }
}
