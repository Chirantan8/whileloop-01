/* class program6 {
    public static void main(String[] args) {
        int num = 9307;
        int revNum = 0;
	

        while(num != 0) {
            int digit = num % 10;
	    
            revNum = revNum * 10 + digit;
            num /= 10;
	    
        }
        System.out.println(revNum);
	
    }
} 

*/



class program6 {
    public static void main(String[] args) {
        int num = 9307; // Change this number to whatever you want to separate digits from
	int digit=0;
        while (num != 0) {
            digit = num % 10;
            System.out.println(digit);
            num /= 10;    //num=num/10 = 930
        }
    }
}


