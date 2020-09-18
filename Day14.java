import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


class Difference {
  	private int[] elements;
  	public int maximumDifference;

Difference(int[] arr){
       this.elements = arr;
   }
   public void computeDifference(){
       maximumDifference =0;
       for(int i=0;i<elements.length;i++)
           {
               for(int j= i+1;j<elements.length;j++)
                   {
                       if(Math.abs(elements[i]-elements[j])>maximumDifference)
                           {
                               maximumDifference = Math.abs(elements[i]-elements[j]);
                       }
               }
       }
   }	// Add your code here

} // End of Difference class
