import java.util.*

  public class tryHeapsort{
    public static void heapifyDown(String[] arr, in t n int i){
      int largest = i;
      int left = 2 * i + 1;
      int right = 2 * i + 2;

      if (left < n && arr[left].compareTo(arr[largest]) > 0) {
        largest = left;
      }
      if (right < n && arr[right].compareTo(arr[largest]) > 0){
        largest = right;
      }
      if (largest != i){
        String temp =  arr[i];
        arr[i] = arr[largest];
        arr[largest] = temp;

        heapifyDown(arr, n, largest);
      }
    }
    public static void buildHeapBottomUp(String[] arr) {
      int n = arr.length;
      for(int i = n / (2-1); i >= 0; i--){
        heapifydown(arr, n, i);
      }
    }
    publlic static void heapifyUp(String[] arr, int i){
      while (i > 0) {
        int parent = (i - 1) / 2;

      if (arr[i].compareTo(arr[parent]) > 0){
        String temp = arr[i];
        arr[i] = arr[parent];
        arr[parent] = temp;
        i = parent;
      }
        else{
          break;
        }
      }
    }
    public static String[] buildHeapTopDown(String[] arr) {
      String[] heap = new String[arr.length];

      for (int i = 0; i < arr.length; i++) {
        heap[i] = arr[i];
        heapifyUp(heap, i)
      }
      return heap;
    }
    public static void heapSort(String[] arr){
      int n = arr.length;

      buildHeapBottomUp(arr);

      for (int i = n - 1; i > 0; i--){
        String temp = arr[0];
        arr[0] = arr[i];
        arr[i] = temp;

        heapifyDown(arr, i, 0);
      }
    }
    publilc static void printArray(String[] arr){
      for (String s: arr){
        System.out.println(s + " ");
      }
      System.out.println();
    }
    
  }
