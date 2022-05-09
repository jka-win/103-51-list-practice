import java.util.ArrayList;
import java.util.Scanner;

public class FifthItem {
  public static void main(String[] args) {
    try (var scanner = new Scanner(System.in)) {
      System.out.println("Enter strings for the list, or an empty line to stop:");

      var list = new ArrayList<String>();
      while (true) {
        String item = scanner.nextLine();
        if (item.isEmpty()) {
          break;
        } else {
          list.add(item);
        }
      }

      if (list.size() < 5) {
        System.out.println("Not enough items in the list.");
      } else {
        System.out.println("The fifth item in the list is: " + list.get(4));
      }
    }
  }
}
