import java.util.*;

public class Sorts{
  private long steps;

  /**
   *  Description of Constructor
   *
   * @param  list  Description of Parameter
   */
  public Sorts(){
    steps = 0;
  }

  /**
   *  Description of the Method
   *
   * @param  list  reference to an array of integers to be sorted
   */
  public void bubbleSort(ArrayList <Integer> list){
      int k = 0;
    for (int i = 0; i < list.size()-1; i++){
        for (int j = i+1; j < list.size(); j++){
            if(list.get(i) > list.get(j)){
                k = list.get(i);
                list.set(i, list.get(j));
                list.set(j,k);
           }
       }
    System.out.println();
    System.out.println("Bubble Sort");
    System.out.println();
  }
}
  /**
   *  Description of the Method
   *
   * @param  list  reference to an array of integers to be sorted
   */
  public void selectionSort(ArrayList <Integer> list){
      int minimum;
      int k;
    //replace these lint minimum;        
        // reduces the effective size of the array by one in  each iteration.

        for(int i = 0; i < list.size()-1 ; i++)  {

           // assuming the first element to be the minimum of the unsorted array .
             minimum = i ;

          // gives the effective size of the unsorted  array .

            for(int j = i+1; j < list.size() ; j++ ) {
                if(list.get(j) < list.get( minimum))  {                //finds the minimum element
                minimum = j ;
                }
             }
          // putting minimum element on its proper position.
          k = list.get(minimum);
          list.set(minimum, list.get(i));
          list.set(i, list.get(minimum));
        }
    //lines with your code
    System.out.println();
    System.out.println("Selection Sort");
    System.out.println();
  }

  /**
   *  Description of the Method
   *
   * @param  list  reference to an array of integers to be sorted
   */
  public void insertionSort(ArrayList <Integer> list){
    //replace these lines with your code
    System.out.println();
    System.out.println("Insertion Sort");
    System.out.println();
  }
 
  /**
   *  Accessor method to return the current value of steps
   *
   */
  public long getStepCount(){
    return steps;
  }

  /**
   *  Modifier method to set or reset the step count. Usually called
   *  prior to invocation of a sort method.
   *
   * @param  stepCount   value assigned to steps
   */
  public void setStepCount(long stepCount){
    steps = stepCount;
  }
}