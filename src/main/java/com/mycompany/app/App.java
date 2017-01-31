package com.mycompany.app;

import java.util.*;	

public class App{

	public static int search(ArrayList<Integer> array, int x, int y) {
     System.out.println("inside search");
    
     if (array == null) return -1;
     int value = array.indexOf(x*y);

     return value;
  	}
}