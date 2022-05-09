import java.util.ArrayList;
import java.util.Scanner;

public class LastItem {
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

      if (list.isEmpty()) {
        System.out.println("There are no items in the list.");
      } else {
        System.out.println("The last item in the list is: " + list.get(list.size() - 1));
      }
    }
  }
}
