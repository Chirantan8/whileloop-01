class program7 {
    public static void main(String[] args) {
        int num = 93079224; // The number for which we want to count digits

        int count = 0;

        while (num != 0) {
            count++;
            num /= 10;
        }

        System.out.println("The total number of digits in is: " + count);
    }
}




/* class program7 {
	public static void main(String args[]) {
		int count=0;

		for(int num=93079224; num!=0; num/=10) {
			count++;
		}
		System.out.println("The total number of digits in given number is : "+count);
	}
}

*/
