import java.util.Scanner;

public class numbers {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a,b,c,choice;
        System.out.println("Enter 1-Largest of 3 numbers \n 2-Smallest of 3 numbers \n 3-Prime or not\n 4-Even or not\n 5-Reverse of a number\n6-Exit\n Enter your choice: ");
    choice=sc.nextInt();
    switch (choice)
    {
        case 1:
            System.out.println("Enter 3 numbers: ");
            a= sc.nextInt();
            b= sc.nextInt();
            c= sc.nextInt();
            if (a>b && a>c)
                System.out.println(a+" is larger");
            else if (b>a && b>c )
                System.out.println(b+ " is larger");
            else System.out.println(c+ " is larger");
            break;
        case 2:
            System.out.println("Enter 3 numbers: ");
            a= sc.nextInt();
            b= sc.nextInt();
            c= sc.nextInt();
            if (a<b && a<c)
                System.out.println(a+" is smaller");
            else if (b<a && b<c )
                System.out.println(b+ " is smaller");
            else System.out.println(c+ " is smaller");
            break;

    }
    }




}
