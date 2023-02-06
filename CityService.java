import java.util.Scanner;

public class CityService {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String[] modules = {"Administration", "Tourism", "Student", "Jobseekers", "Business"};
    String[] landmarks = {"Hotels", "Renting facilities", "Public transport  services", "Healthcare services", "Airline and private car  services", "Shopping landmarks", "Emergency and Governement support"};
    
    System.out.println("Welcome to the City service platform");
    System.out.println("Please select a module from the following options:");
    
    for (int i = 0; i < modules.length; i++) {
      System.out.println(i + 1 + ". " + modules[i]);
    }
    
    int moduleChoice = sc.nextInt();
    switch (moduleChoice) {
      case 1:
        System.out.println("You have selected the Administration module");
        System.out.println("As an administrator, you can perform the following tasks:");
        System.out.println("1. Upload new information");
        System.out.println("2. Authenticate user profiles");
        System.out.println("3. Supervise the maintenance of the other four modules");
        break;
      case 2:
        System.out.println("You have selected the Tourism module");
        System.out.println("In this module, you can access the following information:");
        for (int i = 0; i < landmarks.length; i++) {
          System.out.println(i + 1 + ". " + landmarks[i]);
        }
        break;
      case 3:
        System.out.println("You have selected the Student module");
        System.out.println("In this module, you can access information related to academia in the city, including the location of:");
        System.out.println("1. Best educational institutes");
        System.out.println("2. Libraries");
        System.out.println("3. Coaching centers");
        System.out.println("4. Technical colleges");
        System.out.println("5. Universities");
        System.out.println("6. Colleges");
        break;
      case 4:
        System.out.println("You have selected the Jobseekers module");
        System.out.println("In this module, you can access information on job opportunities available in the city across various industries");
        break;
      case 5:
        System.out.println("You have selected the Business module");
        System.out.println("In this module, you can access information on trade and business centers and industries in the city");
        break;
      default:
        System.out.println("Invalid selection. Please try again.");
        break;
    }
    
    sc.close();
  }
}
