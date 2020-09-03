import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


class Difference {
  	private int[] elements;
  	public int maximumDifference;
    private int diff;
    Difference(int[] a){
        this.elements=a;
    }
    void computeDifference(){
        for(int i=0;i<elements.length;i++){
            for(int j=i+1;j<elements.length;j++){
                diff=Math.abs(elements[j]-elements[i]);
                if(diff>maximumDifference){
                    maximumDifference=diff;
                }
            }
        }
    }
	
} // End of Difference class
