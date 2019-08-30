class CheckPrimes{
    public boolean primeIterative(int n){
        if(n<2)
        {
            return false;
        }
        for(int i=2; i<n; i++)
        {
            if(n % i == 0)
            {
                return false;
            }
        }
        return true;
    }

    public boolean primeUpIterate(int n){
        if(n<2)
        {
            return false;
        }
        int sqrt = (int)Math.sqrt(n);
        for(int i=2; i <= sqrt; i++)
        {
            if(n%i == 0)
            {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Hello Primality Test for Java");
        System.out.println(" ");

        CheckPrimes checkPrimes = new CheckPrimes();

        int input11 = 11;
        int input22 = 22;

        if(checkPrimes.primeIterative(input11))
        {
            System.out.println("true for Iterative.");
        }
        else
        {
            System.out.println("false for Iterative.");
        }
        if(checkPrimes.primeIterative(input22))
        {
            System.out.println("true for Iterative.");
        }
        else
        {
            System.out.println("false for Iterative.");
        }

        if(checkPrimes.primeUpIterate(input11))
        {
            System.out.println("true for Iterative.");
        }
        else
        {
            System.out.println("false for UpIterate.");
        }
        if(checkPrimes.primeUpIterate(input22))
        {
            System.out.println("true for Iterative.");
        }
        else
        {
            System.out.println("false for UpIterate.");
        }
    }
}