package edu.cnm.deepdive.fizzbuzz;

import java.awt.SystemTray;

public class FizzBuzz {


  public static final int DEFAULT_LIMIT = 100;

  public static void main(String[] args) {
    int limit = (args.length > 0) ? Integer.parseInt(args[0]) : DEFAULT_LIMIT;
    count(limit);
  }

  private static void count(int fizzLimit) {
    for (int i = 1; i <= fizzLimit; i++) {
      String output = "";
      if (i % 3 == 0) {
        output += "Fizz";
      }
      if (i % 5 == 0) {
        output += "Buzz";
      }
      if (output.isEmpty()){
        System.out.println(Integer.toBinaryString(i));
      }else {
        System.out.println(output);
      }
    }
  }

}
