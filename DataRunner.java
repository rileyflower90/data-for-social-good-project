import java.util.Scanner;

public class DataRunner {
  public static void main(String[] args) {
      /*
       * define files
       */ 
      String subsFile = "subs.txt";
      String viewsFile = "views.txt";
      String categoryFile = "category.txt"; 
/*
 * instance of userstory class
 */
  UserStory userStory = new UserStory("subs.txt", "views.txt", "category.txt");
/*
 * print overall data info by calling toString method from userstory class
 */
System.out.println("Overall Data Info: ");
System.out.println(userStory.toString());
/*
 * display category with most views using getCategoryWithMostViews method
 */
  String mostViewedCategory = userStory.getCategoryWithMostViews();
  System.out.println("Category with the Most Views: " + mostViewedCategory);
/*
 * display avg subscribers using getAvgSubscribers method
 */
  double avgSubscribers = userStory.getAvgSubscribers();
  System.out.println("Average Subscribers: " + avgSubscribers);
/*
 * display category with best sub-to-view ratio using getCategoryWithBestRatio method
 */
    String bestRatioCategory = userStory.getCategoryWithBestRatio();
    System.out.println("Category with Best Subscriber-to-View Ratio: " + bestRatioCategory);
  }
}