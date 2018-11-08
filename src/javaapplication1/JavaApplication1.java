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
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          
        Integer[] a = {1,2,3,-5};
        System.out.println(maxElement(a));


    }
    
    public static Integer maxElement(Integer[] a)
    {
        if (a==null || a.length==0) return null;
        
        Integer max = Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++)
        {
            if (max<a[i]) max = a[i];
        }
        
        for (int i : a)
        {
            if(max<i) max = i;
        }
        
        return max;
    }
    
}
