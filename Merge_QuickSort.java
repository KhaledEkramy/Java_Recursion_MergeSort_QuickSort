/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package javafiles.recursionsource;



/**
 *
 * @author Khaled
 */
public class Merge_QuickSort {
    
    public static void main(String[] args) {
        
        DArray obj = new DArray(5) ;
        
        obj.insert(4);
        obj.insert(-1);
        obj.insert(3);
        obj.insert(9);
        obj.insert(3);
        obj.insert(5); // to test the indexOutOfBoundException .
        
        System.out.println("Before : ");
        obj.display();
        System.out.println("After : ");
        
        obj.merge();
        obj.display() ;
        
        DArray object = new DArray(5) ;
        object.insert(4);
        object.insert(2);
        object.insert(6);
        object.insert(-1);
        object.insert(9);
        object.insert(0); // to test the indexOutOfBoundException .
        
        System.out.println("Before : ");
        object.display();
        
        object.quickSort();
        
        System.out.println("After : ");
        
        object.display();
        
        

        
    }
    
    
    
    
}
