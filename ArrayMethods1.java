
public class ArrayMethods1 {
	
	public static void insertionSort(int[] list1) {
		
	}
	
	public static void selectionSort(double[] list1) {
		for (int j = 0; j < list1.length;j++) {
			int pos = j;
			for (int i = 0+j; i < list1.length; i++) {
				double x = list1[j];
				if (x > list1[i]) {
					x = list1[i];
					pos = i;
				}
			}
			System.out.println(pos);
			Swap(list1, pos , j);
		}
		
	}
	
	public static void bubbleSort(String[] list1) {
		for (int j = 0; j < list1.length;j++) {
			for (int i = 0; i < list1.length-1; i++) {
				Swap(list1, i, i+1);
			}
		}
	}
	
	public static void Swap(int[] arr, int index1, int index2) {
		if (arr[index1] > arr[index2]) {
			int x = arr[index1];
			arr[index1] = arr[index2];
			arr[index2] = x;
		}
	}
	
	public static void Swap(double[] arr,int index1, int index2) {
		double x = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = x;
	}
	
	
	
	public static void Swap(String[] arr,int index1, int index2) {
		if ((arr[index1].compareTo(arr[index2]) > 0)) {
			String x = arr[index1];
			arr[index1] = arr[index2];
			arr[index2] = x;
		}
	}
}
