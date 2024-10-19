
import java.util.Random;

public class App {
    public static void main(String[] args) {
        // Define Ratan Tata's information
        String biopic = "Ratan Tata is an Indian industrialist, philanthropist, and former chairman of the Tata Group.";
        String[] companies = {
            "Tata Motors",
            "Tata Steel",
            "Tata Consultancy Services",
            "Tata Power",
            "Tata Chemicals"
        };
        double netWorth = 1000000000; // in USD
        String[] awards = {
            "Padma Bhushan",
            "Padma Vibhushan",
            "Assam Baibhav",
            "Maharashtra Bhushan"
        };
        int employees = 750000; // approximate number of employees in the Tata Group

        // Create an array to hold all information categories
        String[] informationCategories = {
            "Biopic",
            "Net Worth",
            "Companies",
            "Awards",
            "Employee Numbers"
        };

        // Randomly select how many pieces of information to display (1 to 3)
        Random random = new Random();
        int numberOfOutputs = random.nextInt(3) + 1; // Generates a number between 1 and 3

        System.out.println("Random Ratan Tata Information");
        System.out.println("------------------------------");

        // Display random information
        for (int i = 0; i < numberOfOutputs; i++) {
            int randomIndex = random.nextInt(informationCategories.length);
            String category = informationCategories[randomIndex];

            switch (category) {
                case "Biopic":
                    System.out.println("Biopic: " + biopic);
                    break;
                case "Net Worth":
                    System.out.println("Net Worth: $" + netWorth);
                    break;
                case "Companies":
                    System.out.println("Companies:");
                    for (String company : companies) {
                        System.out.println("- " + company);
                    }
                    break;
                case "Awards":
                    System.out.println("Awards:");
                    for (String award : awards) {
                        System.out.println("- " + award);
                    }
                    break;
                case "Employee Numbers":
                    System.out.println("Employee Numbers: " + employees);
                    break;
                default:
                    break;
            }
            System.out.println(); // Print a newline for better readability
        }
    }
}
