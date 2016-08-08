/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;

/**
 *
 * @author Student
 */
public class JavaApplication6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       public class DuplicateStr {
	public static void remove(String s)
	{
	    char [] a = s.toCharArray();
	    int len =a.length; 
	    for (int i=0;i<len;i++)
	    {
	        for (int j = i+1; j<len;j++)
	        {
	            if(a[i]==a[j])
	            {
	                int test =j;
	                for(int k=j+1; k<len ; k++)
	                {
	                    a[test] = a[k];
	                    test++;
	                }
	                len--;
	                j--;
	            }
	        }
	    }
	    System.out.println(String.copyValueOf(a).substring(0,len));
	}

	public static void main(String[] args) {
		DuplicateStr d=new DuplicateStr();
		d.remove("ssarritthhaa");

	}
    }
}
