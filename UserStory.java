import java.util.Scanner;

public class UserStory {
/*
 * arrays to store data for subs, views, and category name
 */
private int[] subs;
private int[] views;
private String[] category;
  
/*
 * constructor that initializes arrays for subs, views, category by reading
 * data from files
 */
public UserStory(String subsFile, String viewsFile, String categoryFile) {
/*
 * initialize arrays by reading from files
 */
 this.subs = FileReader.toIntArray(subsFile);
 this.views = FileReader.toIntArray(viewsFile);
 this.category = FileReader.toStringArray(categoryFile);
}

/*
 * name of category with most views
 */
  
  public String getCategoryWithMostViews() {
   int maxViews = 0;
   String categoryWithMostViews = "";
/*
 * loop thru each category to find one with most views
 */ 
    for (int i = 0; i < subs.length; i++) {
      if (views[i] > maxViews) {
        maxViews = views[i];
        categoryWithMostViews = category[i];
      }
    }
      return categoryWithMostViews;
    }

/*
 * method to get avg subs
 */
    public double getAvgSubscribers() {
      /*
       * variable to store total # of subs
       */
      int totalSubscribers = 0;
      /*
       * sum of all the subs
       */
      for (double sub : subs) {
        totalSubscribers += sub;
      }
      /*
       * returns average by dividing toal # of categories
       */
     return totalSubscribers / subs.length;

    }
    /*
     * method to get best sub-to-view ratio
     */
  public String getCategoryWithBestRatio() {
    int maxRatio = 0; 
    String categoryWithMaxRatio = "";

    for (int i = 0; i < subs.length; i++) {
      /*
       * avoids division by zero
       */
      if (views[i] != 0) {
        int ratio = subs[i] / views[i];

      if (ratio > maxRatio) {
        maxRatio = ratio;
        categoryWithMaxRatio = category[i];
      }
    }   
  }
      return categoryWithMaxRatio;
  }
  
    
  /* 
   * toString method to return general info about data
   */
  public String toString() {  
    String result = "";
/*
 * loop thru each category to add its info to the result string
 */
  
    for (int i = 0; i < category.length; i++) {
      result += "Category: " + category[i] + "\nSubscribers: " + subs[i] + "\nViews: " + views[i] + " billion\n\n";
    }
    return result;  
  }

} 