package reversestring4;
import java.io.*;
import java.util.*;


public class reverseString {
	public static void main(String[] args) {
	     String input = "Be in present";
	     char[] hello=input.toCharArray();
	     List<Character> trial1= new LinkedList<>();
	     for(char c: hello)
	     trial1.add(c);
	     Collections.reverse(trial1);
	     ListIterator li = trial1.listIterator();  
	     while(li.hasNext())
	    {System.out.print(li.next());}  
	   }}
	 


