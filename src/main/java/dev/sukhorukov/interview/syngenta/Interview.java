package dev.sukhorukov.interview.syngenta;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

/*
2023 EPAM
Questions from interview with Nicolas Fabre on Syngenta's project
 */
public class Interview {

  public static void main(String[] args) {
    System.out.println(Arrays.deepToString(Interview.getTimesTable(5)));
  }

  /*
  Write method getTimesTable(N) so that it returns a 2 dimension array of int of size n * n. Each element of the array must contain the multiplication
  of the index of its row and the index of its column.
  ret[0][0] = 1 * 1 = 1
  ret[5][7] = 6 * 8 = 48
   */
  static int[][] getTimesTable(int n) {
    int[][] array = new int[n][n];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        array[i][j] = (i + 1) * (j + 1);
      }
    }
    return array;
  }

  /*
  Winter is coming. You want to prepare your pairs of gloves. The goal of this game is to determine the number of pairs you can gather.
  A pair is composed by 2 gloves of the same colour.

  Input : A file containing list of gloves by their colour.
   */
  static Map<String, Long> getAllAvailablePairs(Path filePath) throws IOException {
    Map<String, Long> colorPairs = new HashMap<>();
    final List<String> strings = Files.readAllLines(filePath);
    for (String color : new HashSet<>(strings)) {
      final long count = strings.stream().filter(s -> s.equals(color)).count();
      colorPairs.put(color, count / 2);
    }
    return colorPairs;
  }

  /*
  Find out if word is palindrome or not:
          "fwkttkwf",
          "heufueh",
          "raceCar",
          "Step on no pets",
          "gazzag",
          "a",
          "I",
          "ecte",
          "bivpajvhx",
          "tbqhxa",
          "Red rum, sir, is murder",
          "drive"
   */
  static boolean isPalindrome(String s) {
    String string = s.toLowerCase();
    for (int i = 0; i < string.length() / 2; i++) {
      if (string.charAt(i) != string.charAt((s.length() - 1) - i)) {
        return false;
      }
    }
    return true;
  }
}
