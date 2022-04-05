
public class LoopFor {
public static void main(String args[]) {
	int nums[]= {55,70,62,83,92,90,54};
for(int i=0;i<nums.length;i++) {
	if(nums[i]%5==0) {
		System.out.println("divisable of 5");
	}
	else if(nums[i]%2==0) {
		System.out.println("divisable of 2");
	}
	else if(nums[i]%3==0) {
		System.out.println("divisable of 3");
	}
	else {
		System.out.println("invisiable");
	}
}
	for(int i=0;i<nums.length;i++) {
		if((nums[i]%5==0)&&(nums[i]%2==0)){
			System.out.println("divisable5&&2");
		}
}
	for(int i=0;i<nums.length;i++) {
		if((nums[i]%5==0)&&(nums[i]%3==0)){
			System.out.println("divisable5&&3");
	
}
	}
}
}
