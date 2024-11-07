import java.util.Scanner;

public class QuickSort {

    static int partition(int[] a, int start, int end) {
        int pivot = a[end];
        int i = (start - 1);
        for (int j = start; j <= end - 1; j++) {
            if (a[j] < pivot) {
                i++;
                int t = a[i];
                a[i] = a[j];
                a[j] = t;
            }
        }
        int t = a[i + 1];
        a[i + 1] = a[end];
        a[end] = t;
        return (i + 1);
    }

    static void quickSort(int[] a, int start, int end) {
        if (start < end) {
            int p = partition(a, start, end);
            quickSort(a, start, p - 1);
            quickSort(a, p + 1, end);
        }
    }

    static void printArray(int[] a, int n) {
        for (int i = 0; i < n; i++)
            System.out.print(a[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] a = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        System.out.println("Before sorting, array elements are:");
        printArray(a, n);
        quickSort(a, 0, n - 1);
        System.out.println("After sorting, array elements are:");
        printArray(a, n);
        scanner.close();
    }
}