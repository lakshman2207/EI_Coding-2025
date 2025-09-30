import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MissionDirector director = new MissionDirector();
        Scanner scanner = new Scanner(System.in);
        SpaceMission mission = null;

        while (true) {
            System.out.println("\n=== Select a Space Mission ===");
            System.out.println("1. Mars Exploration Mission");
            System.out.println("2. Satellite Deployment Mission");
            System.out.println("3. Lunar Research Mission");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    mission = director.createMarsExplorationMission();
                    System.out.println("\n--- Mars Exploration Mission Details ---");
                    System.out.println(mission);
                    break;

                case 2:
                    mission = director.createSatelliteDeploymentMission();
                    System.out.println("\n--- Satellite Deployment Mission Details ---");
                    System.out.println(mission);
                    break;

                case 3:
                    mission = director.createLunarResearchMission();
                    System.out.println("\n--- Lunar Research Mission Details ---");
                    System.out.println(mission);
                    break;

                case 4:
                    System.out.println("Exiting program...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }
}

