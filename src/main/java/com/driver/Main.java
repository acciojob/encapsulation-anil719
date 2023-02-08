package com.driver;

public class Main {
  public static void main(String[] args){
    RWOnly rwobj = new RWOnly();
    rwobj.setName("Anil");
    System.out.println(rwobj.getName());
  }
}