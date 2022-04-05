package Day5;

public class Continue {
	public static void main(String[] args) {
		int[] nums= {35,60,72,83,95};
		for(int i=0;i<nums.length;i++) {
			if(nums[i]%3==0) {
			continue;
			
		}

		System.out.println(nums[i]);
	}

}
}
