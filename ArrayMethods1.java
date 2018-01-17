
public class ArrayMethods1 {
	
	public static void insertionSort(int[] list1) {
		for (int i = 0; i < list1.length-2; i++) {
			Swap(list1, list1[i], list1[i+1]);
		}
	}
	
	public static void selectionSort(double[] list1) {
		
	}
	
	public static void bubbleSort(String[] list1) {
		
	}
	
	public static void Swap(int[] arr, int index1, int index2) {
		int x = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = arr[x];
	}

}
