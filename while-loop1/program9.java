class program9 {
    public static void main(String[] args) {
        int num = 214367689;

        int digit = 0;
	int counteven=0;
	int countodd=0;


        while (num != 0) {
            digit=num%10;

            if(digit % 2 == 1) {
		countodd++;
                
            }
	    else {
		    counteven++;
		
	    }
            num /= 10;
        }
	System.out.println("Odd count :"+counteven);
	System.out.println("Odd count :"+countodd);
    }
}
