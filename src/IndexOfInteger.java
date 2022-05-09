import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfInteger {
  public static void main(String[] args) {
    try (var scanner = new Scanner(System.in)) {
      System.out.println("Enter integers for the list, or 0 to stop:");

      var list = new ArrayList<Integer>();
      while (true) {
        Integer item = Integer.valueOf(scanner.nextLine());
        if (item == 0) {
          break;
        } else {
          list.add(item);
        }
      }

      System.out.println("Done entering integers into the list.");
      System.out.println("What number are you looking for in the list?");
      Integer find = Integer.valueOf(scanner.nextLine());
      for (int i = 0; i < list.size(); i++) {
        if (list.get(i).equals(find)) {
          System.out.println("%d is at index %d".formatted(find, i));
        }
      }
    }
  }
}
