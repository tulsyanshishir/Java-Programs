
public class MergeSort {
	

	public static int[] merge(int list1[], int list2[]) {
		int sizeList1 = list1.length;
		int sizeList2 = list2.length;
		int mergedSize = sizeList1 + sizeList2;
		int mergedList[] = new int[mergedSize];
		int i = 0, j = 0, k = 0;

		while (i < sizeList1 && j < sizeList2) {
			if (list1[i] < list2[j]) {
				mergedList[k++] = list1[i++];
			} else
				mergedList[k++] = list2[j++];
		}
		for (; i < sizeList1; i++)
			mergedList[k++] = list1[i];
		for (; j < sizeList2; j++)
			mergedList[k++] = list2[j];

		return mergedList;
	}

	public static void merge2(int arr[], int start, int mid, int end) {
		int n1 = mid-start+1;
		int n2 = end - mid;
		int leftArr[] = new int[n1];
		int rightArr[] = new int[n2];
		for (int i=0; i < n1; ++i)
			leftArr[i] = arr[start+i];

		for (int j = 0; j < n2; ++j)
			rightArr[j] = arr[mid+1+j];
        
		int i=0,j=0;
		int k =0;
		while (i < n1 && j < n2) {
			if (leftArr[i] < rightArr[j]) {
				arr[k++] = leftArr[i++];
			} else
				arr[k++] = rightArr[j++];
		}
		for (; i < n1; i++)
			arr[k++] = leftArr[i];
		for (; j < n2; j++)
			arr[k++] = rightArr[j];
	}
	
	public static void merge3(int arr[], int start, int mid, int end) {
		int temp[] = new int[end - start + 1];

		// crawlers for both intervals and for temp
		int i = start, j = mid+1, k = 0;

		// traverse both arrays and in each iteration add smaller of both elements in temp 
		while(i <= mid && j <= end) {
			if(arr[i] <= arr[j]) {
				temp[k] = arr[i];
				k += 1; i += 1;
			}
			else {
				temp[k] = arr[j];
				k += 1; j += 1;
			}
		}

		// add elements left in the first interval 
		while(i <= mid) {
			temp[k] = arr[i];
			k += 1; i += 1;
		}

		// add elements left in the second interval 
		while(j <= end) {
			temp[k] = arr[j];
			k += 1; j += 1;
		}

		// copy temp to original interval
		for(i = start; i <= end; i += 1) {
			arr[i] = temp[i - start];
		}
	}
	

	public static void mergeSort(int arr[], int start, int end) {
		if (start < end) {
			int mid = (start + end) / 2;
			mergeSort(arr, start, mid);
			mergeSort(arr, mid+1, end);
		    merge3(arr, start, mid, end);
		}

	}

	public static void main(String[] args) {
		/*
		 * int arr1[] = { 7, 8, 9, 10, 18, 19 }; int arr2[] = { 3, 7, 11, 16 };
		 * 
		 * int merger[] = merge(arr1, arr2);
		 * 
		 * for (int i = 0; i < merger.length; i++) Sys
		 Sytem.out.println(merger[i]);*/
		
		int arr[] = {6,8,1,2,7,5,4,3};
		mergeSort(arr, 0, arr.length-1);
		
		for (int i = 0; i < arr.length; i++)
			System.out.println(arr[i]);
	

	}

}
