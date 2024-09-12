class program10 {
    public static void main(String[] args) {
        long num = 9307922405l;

        long digit = 0l;
	long sum=0l;


        while (num != 0) {
            digit=num%10;

            sum+=digit;
            num /= 10;
        }
	System.out.println(sum);
    }
}
