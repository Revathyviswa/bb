/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class JavaApplication4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

		String s1;
		String s2="";
		System.out.println("enter string");
		s1=in.nextLine();
		int b=s1.length();
		for(int i=b-1;i>=0;i--)
		{
			s2=s2+s1.charAt(i);
		}
		System.out.println(""+s2);
	  
	}
}
    }
}
