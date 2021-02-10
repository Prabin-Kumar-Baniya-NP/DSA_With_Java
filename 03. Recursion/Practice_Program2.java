class Practice_Program2{
	public void coinToss (int number, String ans)
	{
		if (number == 0){
			System.out.println(ans);
			return ;
		}
		coinToss(number - 1, ans + "H");
		coinToss(number - 1, ans + "T");
	}
	public static void main(String[] args) {
		Practice_Program2 obj = new Practice_Program2();
		obj.coinToss(4, "");
	}
}