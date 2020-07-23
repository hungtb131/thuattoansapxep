package selectionSort;

public class SelectionSort {
    void sort(int arr[]){
        int n = arr.length;
        for (int i = 0; i < n - 1; i ++ ){
            int minIndex = i;
            for (int j = i + 1; j < n; j ++){
                if (arr[j] < arr[minIndex]){
                    minIndex = j;
                }
                int temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;
            }
        }
    }

    public static void main(String[] args) {
        SelectionSort sort = new SelectionSort();
        int[] array = {12,23,34,45,56,67,65,54,42,342,5,3};
        sort.sort(array);

        for (Integer i : array)
            System.out.print(i + " ");
    }
}
