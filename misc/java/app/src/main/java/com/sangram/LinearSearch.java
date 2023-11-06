package com.sangram;

import java.util.Arrays;
import java.util.List;

public class LinearSearch {
  public static void main(String[] args) {
    var lst = Arrays.asList(1, 3, 4, 6, 20, 23, 4, 5, 2, 7, 73, 12, 15, 28, 39);
    linearSearch(lst, 23);
    int[][] arr = {
      {1, 8, -3, 12, 7, 15},
      {4, -8, 21, 3, 25},
      {9, 18, -43, 24, 0},
      {19, 88}
    };
    linearSearch2D(arr, -8);
  }

  private static void linearSearch2D(int[][] arr, int target) {
    System.out.println("linear 2d search");
    int row = 0, column = 0;
    for (row = 0; row < arr.length; row++)
      for (column = 0; column < arr[row].length; column++)
        if (arr[row][column] == target) {
          System.out.printf("""
              ---------------------------------
              %d present at row: %d, column: %d
              ---------------------------------
              %n""", target, row, column);
          break;
        }
  }
  private static void linearSearch(List<Integer> lst, Integer value) {
    for (int i = 0; i < lst.size(); i++)
      if (lst.get(i).equals(value)) {
        System.out.println("--------------------------------");
        System.out.println(value + " present at index " + i);
        System.out.println("--------------------------------");
        break;
      }
  }
}
