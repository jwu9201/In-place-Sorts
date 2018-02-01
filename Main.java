import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*int[] list1 = {5, 3, 4, 1, 7};
		double[] list2 = {5, 3, 7, 9, 1};
		String[] list3 = {"d", "f", "t", "q", "a"};
		
		ArrayMethods1.insertionSort(list1);
		for (int x: list1) {
			System.out.println(x);
		}
	
		ArrayMethods1.selectionSort(list2);
		for (double x: list2) {
			System.out.println(x);
		}
		
		ArrayMethods1.bubbleSort(list3);
		for (String x: list3) {
			System.out.println(x);
		}*/
		
		//Testing arrays
				int [] test1 = {1,4,4,6,2,4,3,17,0};
				double [] test2 = {1.1,4.1,4.2,5.0,2.0,4.0,3.0,17.0,0.0};
				String [] test3 = {"zebra" , "tortilla" , "abba" , "foo", "bar", "aba"};
				
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

	}
}


