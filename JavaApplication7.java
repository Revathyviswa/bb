/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class JavaApplication7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int num = arr[0];
        int count;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            count = 0;
            for(int j = 0; j < n; j++) {
                if(arr[i] == arr[j])
                    count++;
            }
            if(count == 1) {
                num = arr[i];
                break;
            }
        }
        System.out.print(num);
    }
}
