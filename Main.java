
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] list1 = {5, 3, 4, 1, 7};
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
		}

	}
}


