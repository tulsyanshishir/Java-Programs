
public class QuickSort {

	static int[] arr;
	static int temp;
	static int pivotPos;

	public static void swap(int i, int j) {
		temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static int partision2(int begin, int end) {
		 int pivot = arr[end];
		    int i = (begin-1);
		
for (int j = begin; j < end; j++) {
		if (arr[j] <= pivot) {
		i++;
		
		int swapTemp = arr[i];
		arr[i] = arr[j];
		arr[j] = swapTemp;
		}
		}
		
		int swapTemp = arr[i+1];
		arr[i+1] = arr[end];
		arr[end] = swapTemp;
	
return i+1;
	}

	public static int partision(int low, int high) {

		int pivot = arr[low];
		int i = low;
		int j = high;
		while (i < j) {
			// System.out.print(i + " " + j);
			// System.out.println(" ");
			while (arr[i] <= pivot && i < arr.length - 1) {
				// System.out.print( " i " + i +" " + arr[i] );
				i++;
			}
			;
			// System.out.println(" ");
			while (arr[j] > pivot && j >= 0) {
				// System.out.print(" j " + j + " " + arr[j] );
				j--;
			}
			;
			if (i < j)
				swap(i, j);
			// System.out.println(" ");
		}
		;
		swap(low, j);
		return j;

	}

	public static void quickSort(int low, int high) {
		if (low < high) {
			pivotPos = partision(low, high);
			// System.out.println("pivotPos " + pivotPos);
			quickSort(low, pivotPos-1);
			quickSort(pivotPos + 1, high);
		}
	}

	public static void main(String[] args) {
		int[] localArr = { 20, 8, 2, 19, 5,19, 3, 10, 4, 30, 18 };
		arr = localArr;
		quickSort(0, arr.length - 1);
		for (int i = 0; i < arr.length; i++)
			System.out.print(" " + arr[i]);
	}

}
