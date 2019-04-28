package algorithm;

import databases.ConnectToSqlDB;

import java.util.List;
import java.util.Random;
import java.util.SortedMap;

public class Numbers {
    long executingTime = 0;
    /*
     * Show all the different kind of sorting algorithm by applying into (num array).
     * Display the execution time for each sorting.Example in below.
     *
     * Use any databases[MongoDB, Oracle or MySql] to store data and retrieve data.
     *
     * At the end. After running all the sorting algo, come to a conclusion which one is suitable on given data set.
     *
     */

    public static void main(String[] args) throws Exception {

        int[] num = new int[10];
        storeRandomNumbers(num);
        ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
        //Selection Sort
        Sort algo = new Sort();
        algo.selectionSort(num);
        long selectionSortExecutionTime = algo.executionTime;
        System.out.println("Total Execution Time of " + num.length + " numbers in Selection Sort take: " + selectionSortExecutionTime + " milli sec");
        connectToSqlDB.insertDataFromArrayToSqlTable(num, "selection_sort", "SortingNumbers");
        List<String> numbers = connectToSqlDB.readDataBase("selection_sort", "SortingNumbers");
        printValue(numbers);
        int n = num.length;
        randomize(num, n);
        //Insertion Sort
        algo.insertionSort(num);
        long insertionSortExecutionTime = algo.executionTime;
        System.out.println("Total Execution Time of " + num.length + " numbers in Insertion Sort take: " + insertionSortExecutionTime + " milli sec");

        //By following above, Continue for rest of the Sorting Algorithm....


        //Come to conclusion about which Sorting Algo is better in given data set.
        //Bubble Sort
        randomize(num, n);
        algo.bubbleSort(num);
        long bubbleSortExecutionTime = algo.executionTime;
        System.out.println("Total Execution Time of " + num.length + "numbers in bubble Sort take: " + bubbleSortExecutionTime + "milli sec");

        //Merge Sort
        randomize(num, n);
        algo.mergeSort(num, 0, n - 1);
        long mergeSortExecutionTime = algo.executionTime;
        System.out.println("Total Execution Time of " + num.length + "numbers in Merge Sort take:" + mergeSortExecutionTime + "milli sec");

        //Quick Sort
        randomize(num, n);
        algo.quickSort(num, 0, n - 1);
        long quickSortExecutionTime = algo.executionTime;
        System.out.println("Total Execution Time of" + num.length + "numbers in Quick Sort take:" + quickSortExecutionTime + "milli sec");

        // Heap Sort
        randomize(num, n);
        algo.heapSort(num, n);
        int maxValueForBucketSort = num[num.length - 1];
        long heapSortExecutionTime = algo.executionTime;
        System.out.println("Total Execution Time of" + num.length + "numbers in Heap Sort take: " + heapSortExecutionTime + "milli sec");

        // Bucket sort
        randomize(num, n);
        algo.bucketSort(num, maxValueForBucketSort);
        long bucketSortExecutionTime = algo.executionTime;
        System.out.println("Total Execution Time of " + num.length + "numbers in Bucket sort take: " + bubbleSortExecutionTime + "milli sec");


    }

    public static void storeRandomNumbers(int[] num) {
        Random rand = new Random();
        for (int i = 0; i < num.length; i++) {
            num[i] = rand.nextInt(1000000);
            Numbers numbers = new Numbers();
            numbers.numbers(num);
            System.out.println("SortedNum : ");
            for (int a = 0; a < num.length; a++) {
                System.out.println(num[a] + " ");
            }
            System.out.println();
            System.out.println("Executing Time : " + numbers.executingTime);

        }
    }

    public void numbers(int[] num) {
    }

    public static void randomize(int arr[], int n) {
        Random r = new Random();
        // Start from the last element and swap one by one. We don't
        // need to run for the first element that's why i > 0
        for (int i = n - 1; i > 0; i--) {
            int j = r.nextInt(i);
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    public static void printValue(List<String> array) {
        for (String st : array) {
            System.out.println(st);
        }
    }
}
