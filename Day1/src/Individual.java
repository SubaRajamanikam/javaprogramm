
public class Individual {
public static void main(String args[]) {
	int []nums=new int[9];
	int count=35;
	for(int i=0;i<nums.length;i++) {
		nums [i]=count;
		count=count+10;
		System.out.println(nums[i]);
	}
}
} 
