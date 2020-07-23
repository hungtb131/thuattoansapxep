package selectionSort;

public class SectionSort {
    static double[] list = {1.2,1.13,34,5,3,2,6,7.99};

    public static void selectionSort(double[] list){
        for (int i = 0; i < list.length -1;i ++){
            double currentMin = list[i];
            int currentMinIndex = i;

            for (int j = i + 1; j < list.length; j ++){
                if (currentMin > list[j]){
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }

            if (currentMinIndex != i){
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }

        }

    }

    public static void main(String[] args) {
        selectionSort(list);
        for (double d: list)
            System.out.print(d + "\t");
    }
}
