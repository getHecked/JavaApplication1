/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package space.harbour.java.hw2;

/**
 *
 * @author Arjun
 */
public class Pascal {
    
    public static void main(String[] args)
    {
        Pascal pascal = new Pascal();
        pascal(5);
    }
    
    public static void pascal(int row)
    {
        int r, num;
        for (int i = 0; i <= row; i++) {
        num = 1;
        r = i + 1;
        for (int col = 0; col <= i; col++) {
            if (col > 0) {
                num = num * (r - col) / col;    
            }
            System.out.print(num + " ");
        }
        System.out.println();
    } 
    }

}