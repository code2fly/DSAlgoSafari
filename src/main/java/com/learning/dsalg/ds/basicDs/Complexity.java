package com.learning.dsalg.ds.basicDs;

/**
 * O(1) > O(log n) > O(n) > O(nLog n) > O(n^2) > O(2^n) > O(n!)
 */
public class Complexity {

    // complexity of O(1)
    public void printFirstElementOfArray(int[] marksArray) {
        System.out.println(marksArray[0]);
    }

    // complexity of O(log n)
    public void findElementInSortedArray(int[] sortArrayOfMarks) {
        int n = sortArrayOfMarks.length;
        int elementTofind = 20;
        for(int i=0; i < n; i++) {
            if(elementTofind == sortArrayOfMarks[n/2]) {
                System.out.println("element found ");
                return;
            }
            else if(elementTofind >= sortArrayOfMarks[n/2]) {
                i = n/2;
                System.out.println("array to search halved");
            } else {
                n = n/2;
                System.out.println("array to search is halved");
            }
        }
    }


    // complexity of O(n)
    public void printAllElementsOfArray(int[] marksArray) {
        for(int marks: marksArray) {
            System.out.println(marks);
        }
    }


    // complexity of O(n^2)
    public void printSortedData(int[] unsortedArray) {
        for(int i=0; i< unsortedArray.length; i++) {
            for(int j = 0 ; j < unsortedArray.length; j++) {
                // sorting logic
            }
        }
    }


}
