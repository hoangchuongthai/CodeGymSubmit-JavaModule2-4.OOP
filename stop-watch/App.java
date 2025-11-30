import src.StopWatch;

import java.util.Random;

public class App {
    public static void main(String[] args) {
        int size = 100000;
        int[] arr = new int[size];

        // Sinh ngẫu nhiên 100,000 số
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt(1_000_000); // 0 .. 999999
        }

        // Tạo đồng hồ
        StopWatch stopWatch = new StopWatch();

        // Bắt đầu đo thời gian
        stopWatch.start();

        // Thuật toán selection sort
        selectionSort(arr);

        // Dừng đo thời gian
        stopWatch.stop();

        // In thời gian đã trôi qua (ms)
        System.out.println("Thoi gian sap xep (selection sort) 100,000 phan tu: "
                + stopWatch.getElapsedTime() + " ms");
    }

    // Selection sort
    public static void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            // Tìm phần tử nhỏ nhất trong đoạn [i..n-1]
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Đổi chỗ arr[i] và arr[minIndex] nếu cần
            if (minIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }
}
