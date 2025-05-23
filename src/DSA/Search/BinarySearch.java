package DSA.Search;

public class BinarySearch {
	public static void main(String[] args) {
		
		int nums[]= {5,8,10,13,16};
		int target = 5;
		
		int result=binarySearch(nums,target);
		
		if(result == -1)
			System.out.println("Element not found");
		else
			System.out.println("Element found at index:"+result);
		
	}
	
	public static int binarySearch(int nums[],int target) {
		
		int left=0;
		int right=nums.length-1;
		
		while(left<right) {
			int mid = (left + right)/2;
			if(nums[mid] == target) {
				return mid;
			}
			else if(nums[mid]<target) {
				left = mid+1;
			}
			else {
				right=mid-1;
			}
		}
		return -1;
	}
}
