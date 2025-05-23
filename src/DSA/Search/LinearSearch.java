package DSA.Search;

public class LinearSearch {
	public static void main(String[] args) {
		int nums[]= {5,8,10,13,16};
		int target = 90;
		
		int result=linearSearch(nums,target);
		
		if(result == -1)
			System.out.println("Element not found");
		else
			System.out.println("Element found at index:"+result);
	}
	
	public static int linearSearch(int nums[],int target) {
		for (int i=0;i<nums.length;i++) {
			if(nums[i] == target)
				return i;
		}
		return -1;
	}
}
