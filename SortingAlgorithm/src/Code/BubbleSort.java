package Code;
public class BubbleSort {

	public static boolean bubbleSort(int [] arr) {
		int count=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					count++;
				}	
			}
			if(count==0) {
				return false;
			}
			}
			System.out.println("Count : "+count);
		return true;
	}
	public static void main(String[] args) {
//		int [] arr= {19,86,37,55,20,21,89,34};
		int [] arr= {10,90,20,30,40,50,60,70,80};

		
		bubbleSort(arr);
//		System.out.println("Total No of comparisons : "+count);
		System.out.print("Bubble Sorting : ");
		for(int i:arr) {
			System.out.print(i+ " ");
		}
	}

}
