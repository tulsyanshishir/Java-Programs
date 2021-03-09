
public class medianOfTwoSortedArray {
	 public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
	        int arr1Length = nums1.length;
	        int arr2Length = nums2.length;
	        int mergeLength = arr1Length + arr2Length;
	        int[] merge = new int[mergeLength];
	        int i =0,j=0,k=0;
	        while( i<arr1Length &&  j<arr2Length){
	            if(nums1[i]<nums2[j])
	                merge[k++]=nums1[i++];
	            else
	                merge[k++]=nums2[j++];            
	        }
	        while(i<arr1Length)
	            merge[k++]=nums1[i++];
	        while(j<arr2Length)
	            merge[k++]=nums2[j++];    
	          if(mergeLength%2==0){
	        	  System.out.println(mergeLength);
	              int index = (mergeLength-1)/2;
	              System.out.println(index);
	              System.out.println(merge[index]);
	              System.out.println(merge[index+1]);              
	              return (merge[index]+merge[index+1])/(double)2 ;
	          }
	            
	          else
	            return merge[(mergeLength-1)/2];
	    }

	public static void main(String[] args) {
		int[] arr1 = {1,2};
		int[] arr2 = {3,4};
		double med = findMedianSortedArrays(arr1,arr2);
		System.out.println(med);

	}

}
