package Code;

public class SelectionSort {

	public static void selectionSort(int [] arr) {
		for(int i=0;i<arr.length-1;i++) {
			int min=i;
			for(int j=min+1;j<arr.length;j++) {
				if(arr[j]<arr[min]) {
					min=j;
				}
			}if(min!=i) {
				int temp=arr[i];
				arr[i]=arr[min];
				arr[min]=temp;
			}
		}
		
	}
	public static void main(String[] args) {
		int [] arr= {20,58,48,99,78,27,56};
		
		selectionSort(arr);
		System.out.print(" Using Selection Sort : ");
		for(int i:arr) {
			System.out.print(i+ " ");
		}
	}

}
