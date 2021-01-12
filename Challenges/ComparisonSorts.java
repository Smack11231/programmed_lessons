public class ComparisonSorts{
    public static void main(String[] args){
        int[] list = {8,3,9,6,1};
        selectionSort(list);
        printArray(list);

        int[] listt = {4,7,5,2};
        insertionSort(listt);
        printArray(listt);

        int[] listtt = {1,0,1,2,2,0,0,4};
        bubbleSort(listtt);
        printArray(listtt);
    }

    public static void printArray(int[] nums) {
        for (int n : nums) {
            System.out.print(n);
        }
        System.out.println("\n");
    }

    public static void selectionSort(int[] data){
        for (int i = 0; i < data.length - 1; i++){
            int test = i;
            for (int j = i + 1; j < data.length; j++){
                if (data[j] < data[test]){
                    int save = data[j];
                    data[j] = data[i];
                    data[i] = save;
                }
            }
        }
    }

    public static void insertionSort(int[] data){
        for (int i = 1; i < data.length; i++) {
            int save = data[i];
            int j = i - 1;
            while (j >= 0 && data[j] > save) {
                data[j + 1] = data[j];
                j--;
            }
            data[j + 1] = save;
        }
    }
    
    public static void bubbleSort(int[] data){
        for (int i = 0; i < data.length - 1; i++){
            for (int j = 0; j < data.length - 2; j++){
                if (data[j+1] < data[j]){
                    int save = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = save;
                }
            }
        }
    }
}
