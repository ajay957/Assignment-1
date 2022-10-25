public class Fibonacci {
    public static int recursion(int n)
    {
        if(n == 0)
        {
            return 0;
        }
        if (n == 1 || n == 2)
        {
            return 1;
        }
        return recursion(n-2) + recursion(n-1);
    }
    public static void main(String args[])
    {
        int maxNumber = 9;
        System.out.println("Fibonacci Series of "+maxNumber+ " numbers: ");
        for (int i = 0;i<maxNumber;i++)
        {
            System.out.println(recursion(i) + " ");
        }
    }
}
