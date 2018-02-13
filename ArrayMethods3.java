import java.util.Arrays;

public class ArrayMethods3 {

	public static String[] mergeSort(String[] list) {
		String[] left = Arrays.copyOfRange(list,0,list.length/2);
		String[] right = Arrays.copyOfRange(list,list.length/2, list.length);
		if (list.length == 1) {
			return list;
		}
		System.out.println(Arrays.toString(list));
		return (ArrayMethods2.merge(mergeSort(left),mergeSort(right)));
	}
	
	public static int partition(int [] list1, int front, int back) {
		
	}
	
	public static void quickSort(int[] list1, int front, int back) {
		
	}
}
