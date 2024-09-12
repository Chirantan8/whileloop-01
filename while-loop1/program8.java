class puja8 {
    public static void main(String[] args) {
        int num = 216985; // The number for which we want to count digits

        int digit = 0;
        

        while (num != 0) {
            digit=num%10;
	    
	    if(digit % 2 == 1) {
		System.out.print(digit +" ");
	    }
            num /= 10;
        }
	System.out.println();
    }
}

