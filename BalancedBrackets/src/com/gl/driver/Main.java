package com.gl.driver;

import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		boolean isBalanced =true;
		char c;
		System.out.println("Enter the string");
		Scanner sc = new Scanner(System.in);
		String st = sc.nextLine();
		Stack<Character> stack =new Stack<>();
      for(int i=0;i<st.length();i++) {
    	  char character = st.charAt(i);
    	  if (character=='{'||character=='['|| character=='(')
    	  {
    		  stack.push(character);
    		  continue;}
    	  if(stack.isEmpty())
    		 isBalanced = false;
    	  
    	  switch(character)
    	  {
    	  case '}':
    		  c=stack.pop();
    		  if(c=='('||c=='[')
    			  isBalanced = false;
    		  break;
    	  case ')':
    		  c=stack.pop();
    		  if(c=='{'||c=='[')
    			  isBalanced = false;
    		  break;
    	  case ']':
    		  c=stack.pop();
    		  if(c=='('||c=='{')
    			  isBalanced = false;
    		  break;
    	  }
      }
      if(isBalanced && stack.isEmpty())
    	  System.out.println("The entered string has balanced brackets");
      else
    	  System.out.println("The entered string contain  unbalanced brackets");
      }
}


