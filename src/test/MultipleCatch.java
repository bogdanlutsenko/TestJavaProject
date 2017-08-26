package test;

public class MultipleCatch {
	public static void main(String[] args) {

		
		int[] nums={43,2,154,23};
		try{
		System.out.println(nums[1]/0);
		}catch(NullPointerException e){
			System.out.println("Catch block");
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Catch block due to index");
		}catch(ArithmeticException e){
			System.out.println("Catch block due to /0");
		}catch(Exception e){
			System.out.println("Catch block due to unnown");
		}
		
		System.out.println("After TRY Catch ! ! !");
		
		
		
		
		
	}
}
