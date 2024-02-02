import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Destination {
    String name;
    String date;
    double budget;

    Destination(String name, String date, double budget) {
        this.name = name;
        this.date = date;
        this.budget = budget;
    }
}

class WeatherService {
    static String getWeatherInfo(String destination, String date) {
        return "Weather information for " + destination + " on " + date + ": Sunny";
    }
}
public class TravelPlanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Destination> destinations = new ArrayList<>();
        System.out.print("Enter the number of destinations: ");
        int numDestinations = scanner.nextInt();

        for (int i = 0; i < numDestinations; i++) {
            System.out.println("Destination " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = scanner.next();
            System.out.print("Date: ");
            String date = scanner.next();
            System.out.print("Budget: ");
            double budget = scanner.nextDouble();
            destinations.add(new Destination(name, date, budget));
        }
        System.out.println("\nTravel Plan:");

        for (Destination destination : destinations) {
            System.out.println("Destination: " + destination.name);
            System.out.println("Date: " + destination.date);
            System.out.println("Budget: $" + destination.budget);
            String weatherInfo = WeatherService.getWeatherInfo(destination.name, destination.date);
            System.out.println("Weather: " + weatherInfo);
            System.out.println();
        }
        scanner.close();
    }
}
