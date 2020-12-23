package com.hackathon.Test_Hackathon;

public class Q_23 {

	
		static boolean isNumber(String s)
	    {
	        for (int i = 0; i < s.length(); i++)
	            if (Character.isDigit(s.charAt(i)) == false)
	                return false;
	 
	        return true;
	    }
	 
	   
	    static public void main(String[] args)
	    {
	        
	        String str = "67.90";
	 
	      
	        if (isNumber(str))
	            System.out.println("Integer");
	 
	       
	        else
	            System.out.println("String");
	    }
	
	}


