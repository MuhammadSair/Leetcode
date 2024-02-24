public class App {
    public static void main(String[] args) throws Exception {
        SelectionSort sr = new SelectionSort();
        int arr[] = { 1, 4, 5, 6, 3, 2 };
        // sr.printArr(arr);
        sr.sort(arr);
        sr.printArr(arr);
        System.out.println("Hello, World!");
    }
}

class SelectionSort {
    void sort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minindex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minindex]) {
                    minindex = j;

                    int temp = arr[minindex];
                    arr[minindex] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }

    void printArr(int ar[]) {
        for (int i = 0; i < ar.length; i++) {
            System.out.println(ar[i] + "");
        }
    }
}