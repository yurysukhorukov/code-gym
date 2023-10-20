package dev.sukhorukov;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] inputs = new String[]{"fwkttkwf", "heufueh", "raceCar", "Step on no pets", "gazzag", "a", "I","ecte", "bivpajvhx", "tbqhxa", "Red rum, sir, is murder", "drive"};

        Arrays.stream(inputs).forEach(s -> System.out.println(Interview.isPalindrome(s)));
    }
}
