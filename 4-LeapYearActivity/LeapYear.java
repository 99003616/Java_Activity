package com.ltts;

public class LeapYear {
	  public static void main(String[] args) {

		    int year = -1996;
		    boolean leap = false;
		    if (year>0) {
		    	if (year % 4 == 0) {
		    		if (year % 100 == 0) {
		    			if (year % 400 == 0)
		    				leap = true;
		    			else
		    				leap = false;
		    		}
		    		else
		    			leap = true;
		    		}	
		    	else
		    		leap = false;
		    	if (leap)
		    		System.out.println(1);
		    	else
		    		System.out.println(0);
		    }
		    else {System.out.println(-1);}	
		    }
}
