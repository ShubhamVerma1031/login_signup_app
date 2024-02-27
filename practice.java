import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        // int a = 20;
        // int b = 84;
        // int c = a + b;
        // System.out.println(c);
        // float d = b / a;

        // System.out.println(d);
        // int g = -5 + 10 * 2;
        // System.out.println(g);
       
        // System.out.print("Enter Your first number : ");
        // int num1 = sc.nextInt();
        // System.out.print("Enter Your Second Number : ");
        // int num2 = sc.nextInt();
        // System.out.print(num1 + " + " + num2 + " = " );
        // System.out.println( num1+num2);
        // System.out.print(num1 + "-" + num2 + " = ");
        // System.out.println(num1 - num2);
        // System.out.println(num1 + " X " + num2 + " = " + num1 * num2);
        // System.out.println(num1 + " / " + num2 + " = " + num1 / num2);

        // System.out.print("Enter The Number : ");
        // int num = sc.nextInt();
        // for (int i = 1; i < 11; i++) {
        //     System.out.println(num + " x " + (i) + " = " + (num * i));
        // }
        // System.out.println("   J     a      v       v     a");
        // System.out.println("   J    a a      v     v     a a");    
        // System.out.println("J  J   aaaaa       v  v     aaaaa");   
        // System.out.println(" JJ   a     a        v     a     a"); 
        // double q = ((25.5*3.5-3.5*3.5)/(40.5-4.5));
        // System.out.println(q);
        // double q2 = 4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11));
        // System.out.println(q2);

        // Average of thrre number
        // System.out.print("Enter The First Number : ");
        // int a= sc.nextInt();
        // System.out.print("Enter The Second Number : ");
        // int b= sc.nextInt();
        // System.out.print("Enter The Third Number : ");
        // int c= sc.nextInt();
        // System.out.println("Average Of "+a+" , "+b+" , "+c+" , "+ " = "+(a+b+c)/3);

        // *************** Swap two Numbers using third variable  *******************
    //     int a,b,temp;
    //     a=34;
    //     b=56;
    //     System.out.println("Before Swapping : "+ a +" , "+ b);
    //    temp = a;
    //    a = b;
    //    b = temp;
    //     System.out.println("After Swapping : "+ a +" , "+ b);

    // ******************* Without using third variable *****************

  //   int a = 20;
  //   int b= 30;
  //     System.out.println("Before Swapping : "+ a +" , "+ b);
  //   a = a+b;
  //   b = a-b;
  //   a = a-b;
  // System.out.println("After Swapping : "+ a +" , "+ b);

 //   *********************    Write a Java program to print the area and perimeter of a rectangle.**********************

// System.out.print("Enter The Length Of The Rectangle : ");
// float a = sc.nextFloat();
// System.out.print("Enter The Width Of The Rectangle : ");
// float b = sc.nextFloat();
// float area = a*b;
// float perimeter = 2*(a+b);

// System.out.println("Area of the rectangle is : "+area);
// System.out.println("Perimetr of the rectangle is : "+perimeter);

// ********************** Add Two Binary Number  *************************

long Binary1,Binary2;
int i = 0 , remainder = 0;
int sum[] = new int[20];

System.out.print("Enter The First Binary Number : ");
Binary1 = sc.nextLong();
System.out.print("Enter The Second Binary Number : ");
Binary2 = sc.nextLong();
// Perform binary addition while there are digits in the binary numbers
while (Binary1 !=0  || Binary2 != 0) {
  // calculate the sum of binary digits and update the remainder
sum[i++] = (int)(((Binary1 % 10) * (Binary2%10) + remainder)%2);
remainder = (int)(((Binary1 %10) * (Binary2%10) + remainder)/2);
Binary1 = Binary1 / 10;
Binary2 = Binary2 / 10;  
}

// if there is a remaining carry , add to the sum
if (remainder != 0){
  sum[i++] = remainder;

}
// Decrement the index to prepare for printing
--i;
// Display the sum of two binary number
while (i >=0) {
  System.out.print(sum[i--]);
}
System.out.println("\n");





    }
}
