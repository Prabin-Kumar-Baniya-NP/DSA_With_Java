class Practice_Program5{
	public static void mazePath(int cr, int cc, int er, int ec, String ans){
		// Positive base Case
		if(cr == er && cc == ec){
			System.out.println(ans);
			return;
		}
		// Negative Base Case
		if (cr > er || cc > ec){
			return ;
		}
		// Horizontal Move
		mazePath(cr, cc + 1, er, ec, ans + "H");
		// Vertical Move
		mazePath(cr + 1, cc, er, ec, ans + "V");
		// Diagonal Move
		mazePath(cr + 1, cc + 1, er, ec, ans + "D");
	}

	public static void main(String[] args) {
		mazePath(0,0,2,2,"");
	}
}