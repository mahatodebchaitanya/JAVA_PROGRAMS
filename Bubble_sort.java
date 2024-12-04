
public class Bubble_sort {

    public static void main(String[] args) {
        int arr[] = {1, 2,18,6,7,8};
        // bubble_sort(arr);
        // printArr(arr);
        // best_case_bubble_sort(arr);
        // printArr(arr);
        // selection_sort(arr);
        // printArr(arr);
        insertion_sort(arr);
        printArr(arr);
    }

      //printing the array elements
    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            
        }
        System.out.println();
    }
   //bubble sort algorithm
    public static void bubble_sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    // best case bubble sort algorithm 
    public static void best_case_bubble_sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int count_swap=0;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    count_swap++;
                }
            }
            if(count_swap>0){
                return;
            }
        }
    }
    // Selection sort Algorithm
    // here we find the minimum value of the array and push it to the sorted array
    public static void selection_sort(int arr[]){
        for(int i=0;i<arr.length;i++){
            int min=i;
            for(int j=i+1 ; j<arr.length;j++){
                if(arr[min]>arr[j]){
                    min=j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }

    // insertion sort 
    // it is basically used liked when we make the teenpatti in a particular order like we think that we have an sorted and a unsorted array and we take card from unsorted array and find the correct position for the card in the sorted array and when we find the actual position of it we put the card there .

    public static void insertion_sort(int arr[]){
        for(int i=1;i<arr.length;i++){
            int curr=arr[i];
            int prev=i-1;
            // finding the correct position for insertion
            while(prev >= 0 && arr[prev] > curr){
                arr[prev+1]=arr[prev];
                prev--;
            }
            // insertion
            arr[prev+1] = curr;

        }
    }

}
