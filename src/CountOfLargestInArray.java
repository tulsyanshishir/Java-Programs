
public class CountOfLargestInArray {
	public static void main(String args[]) {
		 int arr[] = {6,5,6,5,6,4,5};
		 int largest = arr[0];
		 int count = 1;
		 for(int i = 1;i<arr.length;i++) {
			 if(largest< arr[i]) {
				 largest = arr[i];
				 count = 1;
			 }
			 else if ( arr[i] == largest)
			   count = count + 1 ;
		 }
		 System.out.println("largest element in array is " + largest + " with "+ count +" occurances");
	}
}
