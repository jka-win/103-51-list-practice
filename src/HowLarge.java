import java.util.ArrayList;
import java.util.Scanner;

public class HowLarge {
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

      System.out.println("The total amount of items in the list was: " + list.size());
    }
  }
}
