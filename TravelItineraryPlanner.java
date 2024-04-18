import java.util.Scanner;
import java.util.ArrayList;

public class TravelItineraryPlanner {
    private static Scanner scanner = new Scanner(System.in);
    private static ArrayList<Trip> trips = new ArrayList<>();

    public static void main(String[] args) {
        int option;
        do {
            System.out.println("Travel Itinerary Planner");
            System.out.println("1. Add a Trip");
            System.out.println("2. View Trips");
            System.out.println("3. Exit");
            System.out.print("Enter option: ");
            option = scanner.nextInt();
            scanner.nextLine();  // Consume newline left-over

            switch (option) {
                case 1:
                    addTrip();
                    break;
                case 2:
                    viewTrips();
                    break;
                case 3:
                    System.out.println("Exiting the planner...");
                    break;
                default:
                    System.out.println("Invalid option, please try again.");
            }
        } while (option != 3);
    }

    private static void addTrip() {
        System.out.print("Enter destination: ");
        String destination = scanner.nextLine();
        System.out.print("Enter start date (YYYY-MM-DD): ");
        String startDate = scanner.nextLine();
        System.out.print("Enter end date (YYYY-MM-DD): ");
        String endDate = scanner.nextLine();
        System.out.print("Enter estimated budget (Rs.): ");
        double budget = scanner.nextDouble();
        scanner.nextLine();  // Consume newline left-over

        Trip trip = new Trip(destination, startDate, endDate, budget);
        trips.add(trip);
        System.out.println("Trip added successfully!");
    }

    private static void viewTrips() {
        if (trips.isEmpty()) {
            System.out.println("No trips planned yet.");
            return;
        }
        for (Trip trip : trips) {
            System.out.println(trip);
            // Placeholder for additional features
            System.out.println("Weather forecast: [Not implemented]");
            System.out.println("Map view: [Not implemented]");
        }
    }

    static class Trip {
        String destination;
        String startDate;
        String endDate;
        double budget;

        public Trip(String destination, String startDate, String endDate, double budget) {
            this.destination = destination;
            this.startDate = startDate;
            this.endDate = endDate;
            this.budget = budget;
        }

        @Override
        public String toString() {
            return "Destination: " + destination + ", Start Date: " + startDate + ", End Date: " + endDate + ", Budget: $" + budget;
        }
    }
}
