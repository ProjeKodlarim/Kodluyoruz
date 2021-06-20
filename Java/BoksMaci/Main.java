package com.boksmaci;

public class Main {

	public static void main(String[] args) {
		Fighter marc = new Fighter("Marc" , 15 , 100, 90, 0);
	      Fighter alex = new Fighter("Alex" , 10 , 95, 100, 0);
	      int i=(int) (1+Math.random()*2);
	      if(i==1) {
	    	  Ring r = new Ring(marc,alex , 90 , 100);
		      r.run();
	      }
	      else {
	    	  Ring r = new Ring(alex,marc , 90 , 100);
		      r.run();
	      }
	}

}
