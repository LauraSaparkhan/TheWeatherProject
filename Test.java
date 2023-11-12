import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Type the name of the city to know its weather: ");
        try {
            String location = in.next();
            System.out.println("XML API's data");
            XMLWeatherAPI xmlWeatherAPI = new XMLWeatherAPI();
            xmlWeatherAPI.setLocation(location);
            XMLtoStandardAdapter adapter = new XMLtoStandardAdapter(xmlWeatherAPI);
            System.out.println(adapter.getWeatherData());
            System.out.println("\nJSON API's data");
            //JSON
            JSONWeatherAPI jsonWeatherAPI = new JSONWeatherAPI();
            jsonWeatherAPI.setLocation(location);
            JSONtoStandardAdapter adapter1 = new JSONtoStandardAdapter(jsonWeatherAPI);
            System.out.println(adapter1.getWeatherData());
        }catch(Exception e){
            System.out.println("Check again for mistypes");
        }
    }
}
