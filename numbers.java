import java.util.Scanner;

public class numbers {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a,b,c,choice,i,flag=0,k,j,r,s=0;
        System.out.println("Enter 1-To find largest of 3 numbers \n 2-To find smallest of 3 numbers \n 3-Prime or not\n 4-Even or not\n 5-Reverse of a number\n6-Exit\n Enter your choice: ");
    choice=sc.nextInt();
    switch (choice) {
        case 1:
            System.out.println("Enter 3 numbers: ");
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();
            if (a > b && a > c)
                System.out.println(a + " is larger");
            else if (b > a && b > c)
                System.out.println(b + " is larger");
            else System.out.println(c + " is larger");
            break;
        case 2:
            System.out.println("Enter 3 numbers: ");
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();
            if (a < b && a < c)
                System.out.println(a + " is smaller");
            else if (b < a && b < c)
                System.out.println(b + " is smaller");
            else System.out.println(c + " is smaller");
            break;
        case 3:
            System.out.println("Enter the number:");
            a = sc.nextInt();
            k=a/2;
            if (a == 0 || a == 1)
                System.out.println(a + " is not prime");
            else
            {
                for(i=2;i<=k;i++) {
                    if (a%i==0) {
                        System.out.println(a + " is not a prime number");
                        flag=1;
                        break;
                    }
                }
            if (flag==0)
                System.out.println(a + " is a prime number");
            }
            break;
        case 4:
            System.out.println("Enter a number: ");
            a= sc.nextInt();
            if(a%2==0)
                System.out.println(a+ " is an even number");
            else System.out.println(a+ " is not an even number");
            break;
        case 5:
            System.out.println("Enter a number: ");
            a= sc.nextInt();
            j=a;
            while (j>0)
            {
                r=j%10;
                s=s*10+r;
                j=j/10;
            }
            System.out.println("Reverse of "+a+"is: "+s);
            break;
        case 5: System.exit(0);
        }
    }
}
