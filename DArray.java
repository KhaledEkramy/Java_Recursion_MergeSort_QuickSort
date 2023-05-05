/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javafiles.recursionsource;

/**
 *
 * @author Khaled
 */
public class DArray {
    
    private int[] arr ;
    private int nElems ;
    
    public DArray(int max ){
        this.arr = new int[max] ;
        this.nElems = 0 ;
    }
    
    public void insert(int val){
        if(nElems < arr.length){
            arr[nElems++] = val ;
        }
    }
    
    public void merge(){
        
        int[] inputArray = new int[nElems] ;
        
        for (int i = 0; i < inputArray.length; i++) {
            inputArray[i] = arr[i] ;
        }
        
        recMerge(inputArray) ;
        
        for (int i = 0; i < nElems; i++) {
            arr[i] = inputArray[i] ;
        }
    }
   
    public void recMerge(int []inputArray){
        
        int numOfElem = inputArray.length ;
        
        if(numOfElem < 2)
            return ;
        
        int mid = numOfElem / 2 ;
        
        int leftArr[] = new int[mid] ;
        int rightArr[] = new int[numOfElem - mid] ;
        
        for (int i = 0; i < mid; i++) {
            leftArr[i] = inputArray[i] ;
        }
        
        for (int i = mid; i < numOfElem; i++) {
            rightArr[i - mid] = inputArray[i] ;
        }
        
        recMerge(leftArr) ;
        recMerge(rightArr) ;
        
        merging(inputArray,leftArr , rightArr) ;
    }
    
    public void merging(int input[] ,int left[] , int right[]){
        
        int leftSize = left.length ;
        int rightSize = right.length ;
        int i = 0 , j = 0 , m = 0 ;
        
        while(i < leftSize && j < rightSize){
            
            if(left[i] <= right[j])
                input[m++] = left[i++] ;
            else
                input[m++] = right[j++] ;
            
        }
        
        while(i < leftSize)
            input[m++] = left[i++] ;
        
        while(j < rightSize)
            input[m++] = right[j++] ;
    }
    
    public void quickSort(){
        recQuickSort( 0, nElems -1) ;
    }
    
    public void recQuickSort( int lowIndex , int highIndex){
        
        if( lowIndex >= highIndex )
            return ;
        
        int pivot = highIndex ;
        int leftPointer = partition(lowIndex , highIndex , pivot) ;
        
        recQuickSort( lowIndex , leftPointer -1) ;
        recQuickSort( leftPointer +1 , highIndex) ;
    }
    
    public int partition(int lowIndex , int highIndex , int pivot ){
        
        int leftPointer = lowIndex ;
        int rightPointer = highIndex ;
        
        while(leftPointer < rightPointer){
            
            while(arr[leftPointer] <= arr[pivot] && leftPointer < rightPointer)
                leftPointer++ ;
            while(arr[rightPointer] >= arr[pivot] && rightPointer > leftPointer)
                rightPointer-- ;
                
            swap(leftPointer , rightPointer) ;
        }
        
        swap(leftPointer, pivot) ;
        
        display() ; // only for follwing the algorithm .
        
        return leftPointer ;
    
    }
    
    public void swap(int index1 , int index2){
        int temp = arr[index1] ;
        arr[index1] = arr[index2] ;
        arr[index2] = temp ;
    }
    public void display(){
        for (int i = 0; i < nElems; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }
    
    
}
