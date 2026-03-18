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
    
  }
