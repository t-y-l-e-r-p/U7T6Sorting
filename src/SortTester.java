import java.util.Arrays;

public class SortTester
{
  public static void main(String[] args)
  {
    /* --- SELECTION SORT --- */
    int[] arr1 = {6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 3, 86, -20, 14, 45};
    Sort.selectionSort(arr1);
    System.out.println(Arrays.toString(arr1));
 
    /* --- INSERTION SORT --- */ 
    int[] arr2 = {6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 3, 86, -20, 14, 45};
    Sort.insertionSort(arr2);
    System.out.println(Arrays.toString(arr2));
  }
}
