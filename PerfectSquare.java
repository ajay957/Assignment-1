import java.util.Scanner;

    public class PerfectSquare
    {
        public static void main(String[] args)
        {
            Scanner sc=new Scanner(System.in);
            int fnumber,enumber,i;
            System.out.println("Enter the First Number: ");
            fnumber=sc.nextInt();
            System.out.println("Enter the last Number:");
            enumber=sc.nextInt();
            System.out.println("Perfect square numbers between "+fnumber+" and "+enumber+"are:");
            for (i=fnumber;i<=enumber;i++)
            {
                double sqr=Math.sqrt(i);
                if(sqr-Math.floor(sqr)==0)
                    System.out.println(i+" ");
            }
        }
    }