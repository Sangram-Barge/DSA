package com.sangram;

import java.util.ArrayList;

public class ArrayListTest {
  public void test() {
    ArrayList<String> strLst = new ArrayList<>(2);
    strLst.add("hello");
    strLst.add("sangram");
    strLst.add("barge");
    strLst.add("how");
    strLst.add("are");
    strLst.add("you");

    strLst.forEach(System.out::println);
  }
}
