import java.util.Arrays;

public class Main {

	public static void main(String[] args) {		
		//Testing arrays
				int [] test1 = {1,4,4,6,2,4,3,17,0};
				double [] test2 = {1.1,4.1,4.2,5.0,2.0,4.0,3.0,17.0,0.0};
				String [] test3 = {"zebra" , "tortilla" , "abba" , "foo", "bar", "aba"};
				String [] test4 = {"A", "H", "J", "M", "W", "Y"};
				String [] test5 = {"E", "G", "Z", "Z", "Z"};
				int[] test6 = {3, 7, 8, 5, 2, 1, 9, 5, 4};
				String[] test7 = {"Z", "B", "Y", "H", "M", "O", "C", "D"};
				
				//Insertion Sort Test
				long start = System.nanoTime();
				ArrayMethods1.insertionSort(test1);
				long end = System.nanoTime();
				long time = end -start; 
				System.out.println("Test1 took: " + time + "nanoseconds");
				System.out.println(Arrays.toString(test1));
				
				//Selection Sort Test
				start = System.nanoTime();
				ArrayMethods1.selectionSort(test2);
				end = System.nanoTime();
				time = end - start ; 
				System.out.println("Test2 took: " + time + "nanoseconds");
				System.out.println(Arrays.toString(test2));
				
				//Bubble Sort Test
				start = System.nanoTime();
				ArrayMethods1.bubbleSort(test3);
				end = System.nanoTime();
				time = end - start ; 
				System.out.println("Test3 took: " + time + "nanoseconds");
				System.out.println(Arrays.toString(test3));
				
				//Merge Sort (2 Arrays) Test	
				start = System.nanoTime();
				ArrayMethods2.merge(test4, test5);
				end = System.nanoTime();
				time = end -start; 
				System.out.println("Test1 took: " + time + "nanoseconds");
				System.out.println(Arrays.toString(ArrayMethods2.merge(test4, test5)));
				
				//Partition? Test
				start = System.nanoTime();
				ArrayMethods2.partition(test6);
				end = System.nanoTime();
				time = end -start; 
				System.out.println("Test1 took: " + time + "nanoseconds");
				System.out.println(Arrays.toString(test6));
				System.out.println(ArrayMethods2.partition(test6));
				
				//Merge Sort (1 Array) Test
				start = System.nanoTime();
				ArrayMethods3.mergeSort(test7);
				end = System.nanoTime();
				time = end -start; 
				System.out.println("Test1 took: " + time + "nanoseconds");
				System.out.println(Arrays.toString(ArrayMethods3.mergeSort(test7)));

				
	}
}


