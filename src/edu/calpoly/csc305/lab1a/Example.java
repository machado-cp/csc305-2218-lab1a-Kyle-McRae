package edu.calpoly.csc305.lab1a;

class Example {
  private final String name = "Kyle";
  private final int[] nums = {1, 2, 3};

  boolean sameName(String other) {
    return other.equals(name);
  }

  public int[] getNums() {
    return nums;
  }
}  
