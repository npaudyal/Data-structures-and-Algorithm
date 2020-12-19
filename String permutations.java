Class Solution {
	
	public static void main(String [] args) {

			permute(str, "");

	}

	public void permute(String ques, String asf) {

		if(ques.length ==0) {
				System.out.println(asf);
				return;
		}

		for(int i=0; i<ques.length(); i++){

			char ch = ques.charAt(i);
			rof = ques.substring(0, i) + ques.substring(i+1);
			permute(rof, asf+ch);

		}

	}

}
