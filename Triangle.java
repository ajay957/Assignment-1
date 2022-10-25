import java.util.Scanner;

public class Triangle {

    public static void main(String[] args) {

        System.out.println("enter the size:");
        Scanner sc=new Scanner(System.in);
        int s = sc.nextInt();

        int i,j;

        for(i=1;i<=s;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.println(i+"");
            }
            System.out.println();
        }

    }
}
