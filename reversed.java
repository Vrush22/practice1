class reversed {
    public static void main(String[] args) {
        int a=1234;
        int rev=0 , rem;
        while(a>0)
        {
            rem=a%10;
            rev=rev*10+rem;
            a=a/10;
        }
        System.out.println("The reversed number is " + rev);
    }
}