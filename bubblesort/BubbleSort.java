package bubblesort;

public class BubbleSort {
    void bubbleSort(int[] array){
        int length = array.length;
        for (int i = 0; i < length -1; i ++){
            for (int j = 0; j < length - i - 1; j ++){
                if (array[j] > array[j + 1]){
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        BubbleSort ob = new BubbleSort();
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        ob.bubbleSort(arr);
        for (Integer i: arr){
            System.out.print(i + " ");
        }
    }
}
