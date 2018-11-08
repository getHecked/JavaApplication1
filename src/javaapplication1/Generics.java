/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author Arjun
 */
public class Generics {

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        System.out.println(array(a));
        Number[] a1 = {1, 2.2, 3.04, 4, 5};
        System.out.println(compareNumbers(a1));
    }

 
    
    public static Double compareNumbers(Number[] a) {
        Double max = a[0].doubleValue();
        for (int i = 0; i < a.length; i++) {
            Double temp = a[i].doubleValue();
            if(max<=temp)
            {
                max=temp;
            }
        }

        return max;
    }

    public static int array(int[] a) {
        int large = 0;
        if (a.length == 0) {
            return 0;
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] >= large) {
                large = a[i];
            }
        }

        return large;

    }

}
