/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package merge;
import java.util.ArrayList;
import static merge.MergeSortExample.fillArray;
import static merge.MergeSortExample.mergeSort;
import static merge.MergeSortExample.print;

/**
 *
 * @author Lenovo
 */
public class mergeClass {
    
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        fillArray(arr);
        mergeSort(arr, 0, arr.size() - 1);
        print(arr);
    }
    
}
