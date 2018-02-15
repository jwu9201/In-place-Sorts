import java.util.Arrays;

public class ArrayMethods3 {

	public static String[] mergesSort(String[] list) {
		String[] left = new String[list.length/2];
		String[] right = new String[list.length-left.length];
		if (list.length == 1) {
			return list;
		}
		
		for (int i = 0; i < left.length;i++) {
			left[i] = list[i];
		}
		
		for (int i = 0; i < right.length; i++) {
			right[i] = list[i+left.length];
		}
		
		//String[] left = Arrays.copyOfRange(list,0,list.length/2);
		//String[] right = Arrays.copyOfRange(list,list.length/2, list.length);
		System.out.println(Arrays.toString(left));
		System.out.println(Arrays.toString(right));
		
		return (ArrayMethods2.merge(mergeSort(left),mergeSort(right)));
	}
	
	public static String[] mergeSort(String[] list) {
		String [] list2 = new String[list.length/2 ] ;
		String [] list3 = new String[list.length - list2.length ] ;
		
	
		if (list.length == 1)  
			return list ; 
		
		
		for (int i = 0 ; i < list2.length; i++) {
		list2[i] = list[i]  ;
		}
		for (int i = 0 ; i < list3.length; i++) {
			list3[i] = list[i+list2.length]  ;
		}
		
//		System.out.println(Arrays.toString(list3));
//		System.out.println(Arrays.toString(list2));
//		System.out.println(Arrays.toString(list));
		System.out.println(Arrays.toString(list2));
		System.out.println(Arrays.toString(list3));
		
		return (ArrayMethods2.merge(mergeSort(list3) ,mergeSort(list2))) ; 
	}
	
	public static int partition(int [] list1, int front, int back) {
		
	}
	
	public static void quickSort(int[] list1, int front, int back) {
		
	}
}
