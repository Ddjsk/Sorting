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
            steps+=3;
            if(list.get(i) > list.get(j)){
                k = list.get(i);
                list.set(i, list.get(j));
                list.set(j,k);
                steps+=4;
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
                steps+=3;
                if(list.get(j) < list.get(minimum))  {                //finds the minimum element
                minimum = j ;
                }
             }
          // putting minimum element on its proper position.
          k = list.get(minimum);
          list.set(minimum, list.get(i));
          list.set(i, k);
          steps+=4;
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
    for( int i = 0 ;i < list.size() ; i++ ) {
    /*storing current element whose left side is checked for its 
             correct position .*/

      int temp = list.get(i);    
      int j = i;
      steps+=2;
       /* check whether the adjacent element in left side is greater or
            less than the current element. */

          while(  j > 0  && temp < list.get(j-1)) {

           // moving the left side element to one position forward.
                list.set(j, list.get(j-1));   
                j= j - 1;
                steps+=2;
           }
         // moving current element to its  correct position.
           list.set(j, temp);   
           steps+=1;
     }  
    System.out.println();
    System.out.println("Insertion Sort");
    System.out.println();
  }
 public void mergeSort(ArrayList <Integer> list, int low, int high) {
        // check if low is smaller than high, if not then the array is sorted
        if( low < high) {
            // Get the index of the element which is in the middle
            int middle = low + (high - low) / 2;
            //System.out.print ("low " + low + "middle " + middle + " high " + high);
            // Sort the left side of the array
            mergeSort(list, low, middle);
            // Sort the right side of the array
            mergeSort(list, middle + 1, high);
            // Combine them both
            merge(list, low, middle, high);
        }
    }

    private void merge(ArrayList <Integer> list, int low, int middle, int high) {
        ArrayList <Integer> helper = new ArrayList <Integer> ();

        int i = low;
        int j = middle + 1;
        // Copy the smallest values from either the left or the right side
        // to the helper
        
        while (i <= middle || j <= high) {
            
            if (i > middle) {
                helper.add(list.get(j));
                j++;
                steps+=2;
            }
            else if (j > high){
                helper.add(list.get(i));
                i++;
                steps+=2;
            }
            else if (list.get(i) <= list.get(j)) {
                helper.add(list.get(i));
                i++;
                steps+=5;
            } else {
                helper.add(list.get(j));
                j++;
                steps+=2;
            }
        }
        int m = low;
        // Copy the merged part back into the original list from low to high index
        for(int l = 0; l < helper.size(); l++) {
            list.set(m, helper.get(l));
            m++;
            steps+=2;
        }
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