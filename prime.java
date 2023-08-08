class prime {
    public static void main(String[] args) {
        int a=7 , count=0;
        for(int i=1;i<=a-1;i++)
        {
            if(a%i==0)
            {
                count=count+1;
            }
        }
        if(count!=0)
        {
            System.out.println("number is prime " + a);
        }
        else
        {
            System.out.println("number is not prime " +a);
        }
        
    }
}