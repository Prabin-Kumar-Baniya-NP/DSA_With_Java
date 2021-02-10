class Practice_Program3{
	public void climbingStairs(int number, int current, String ans){
		// positive base case
		if (current == number){
			System.out.println(ans);
			return ;
		}
		// negative base case
		if (current > number){
			return ;
		}

		climbingStairs(number, current + 1, ans + "1");
		climbingStairs(number, current + 2, ans + "2");
		climbingStairs(number, current + 3, ans + "3");
	}

	public static void main(String[] args) {
		Practice_Program3 obj = new Practice_Program3();
		obj.climbingStairs(5, 0, "");	
	}
}