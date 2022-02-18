import java.util.ArrayList;

public class Sort
{
  // Part A.  Which Sort is Which?

  public static void selectionSort(int[] elements)
  {
    int times = 0;
    for (int j = 0; j < elements.length - 1; j++)
    {
      int minIndex = j;
      for (int k = j + 1; k < elements.length; k++)
      {      
        if (elements[k] < elements[minIndex])
        {
          minIndex = k;
        }
        times++;
      }
      int temp = elements[j];
      elements[j] = elements[minIndex];
      elements[minIndex] = temp;
    }
    System.out.println(times);
  }

  // Part A.  Which Sort is Which?
  public static void insertionSort(int[] elements)
  { 
    int times = 0;
    for (int j = 1; j < elements.length; j++)
    {
      int temp = elements[j];
      int possibleIndex = j;
      while (possibleIndex > 0 && temp < elements[possibleIndex - 1])
      {     
        elements[possibleIndex] = elements[possibleIndex - 1];
        possibleIndex--;
        times++;
      }
      elements[possibleIndex] = temp;
    }
    System.out.println(times);
  }
  // Part C.  Sorting a 1000-word list!
  public static void selectionSortWordList(ArrayList<String> words)
  {
    int times = 0;
    for (int i = 0; i < words.size() - 1; i++)
    {
      int index = i;
      for (int j = i + 1; j < words.size(); j++)
      {
        times++;
        if (words.get(j).compareTo(words.get(index)) < 0)
        {
          index = j;
        }
      }
      String temp = words.get(i);
      words.set(i, words.get(index));
      words.set(index, temp);
    }
    System.out.println("Selection Sort iterations: " + times);
  }

  // Part C.  Sorting a 1000-word list!
  public static void insertionSortWordList(ArrayList<String> words)
  {
    int iterations = 0;
    for (int i = 1; i < words.size(); i++)
    {
      int times = i;
      while (times > 0 && words.get(times).compareTo(words.get(times - 1)) < 0)
      {
        iterations++;
        words.add(times - 1, words.remove(times));
        times--;
      }
    }
    System.out.println("Selection Sort iterations: " + iterations);
  }
}