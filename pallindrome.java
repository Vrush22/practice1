class pallindrome {
    public static void main(String[] args) {
        int a=545 , temp=a;
        int rev , rem=0;
        while(a>0)
        {
            rev=a%10;
            rem=rem*10+rev;
            a=a/10;
        }
        if(temp==rem)
        {
            System.out.println("number is pallindrome " + rem);
        }
        else
        {
            System.out.println("number is not pallindrom " + rem);
        }
    }
}