
public class ArrayMethods2 {
	
	public static int[] merge(int[] list1,int[] list2) {
		int [] merge = new int[list1.length+list2.length];
		int left = 0;
		int right = 0;
		for (int i = 0; i < list1.length + list2.length;i++) {
			if (left == list1.length) {
				merge[i] = list2[right];
				continue;
			}
			if (right == list2.length) {
				merge[i] = list2[left];
				continue;
			}
			if (list1[left] > list2[right]) {
				merge[i] = list2[right];
				right++;
			}
			else {
				merge[i] = list1[left];
				left++;
			}
		}
		return merge;
	}
	public static String[] merge(String[] list1,String[] list2) {
		String [] merge = new String[list1.length+list2.length];
		int left = 0;
		int right = 0;
		for (int i = 0; i < list1.length + list2.length;i++) {
			if (left == list1.length) {
				merge[i] = list2[right];
				continue;
			}
			if (right == list2.length) {
				merge[i] = list2[left];
				continue;
			}
			if (list1[left].compareTo(list2[right]) > 0) {
				merge[i] = list2[right];
				right++;
			}
			else {
				merge[i] = list1[left];
				left++;
			}
		}
		return merge;
	}
	
	public static int partition(int[] list) {
		int pivot = 0;
		for (int i = list.length-1; i > pivot; i--) {
			if (list[i] < list[pivot]) {
				Swap(list,pivot,pivot+1);
				Swap(list,pivot,i);
				pivot++;
			}
		}
		return pivot;
	}
	

	public static void Swap(int[] arr, int index1, int index2) {
		int x = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = x;
	}
}
