class Practice_Program4{
	public void stringPermutation(String question, String ans){
		if (question.length() == 0){
			System.out.println(ans);
			return ;
		}
		for (int i = 0; i < question.length(); i++){
			String new_question = question.substring(0,i) + question.substring(i+1);
			stringPermutation(new_question, ans + question.charAt(i));
		}
	}
	public static void main(String[] args) {
		Practice_Program4 obj = new Practice_Program4();
		obj.stringPermutation("abcd", "");
	}
}