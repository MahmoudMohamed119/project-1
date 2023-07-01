import java.util.Scanner;

public class methods {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

       /* دول بتوع sum
        int m,n;
        System.out.println("input two number to sum");
        m= input.nextInt();
        n= input.nextInt();
        sum(m,n);

        */
        int a=3 , b=4 , c=2 ;
        char x='a' , y='b';
        System.out.println(larger(a,b));
        System.out.println(larger(a,b,c));
        System.out.println(larger(x,y));




    }
  /*  public static void sum(int i, int j){
        System.out.println(i+j);
    }

   */

    public static int larger(int n1, int n2){
        if (n1>n2)
            return n1;
            else
                return n2;
    }
    public static int larger(int n1, int n2,int n3){
        if (n1>n2&&n1>n3)
            return n1;
        else if (n2>n1&&n2>n3)
            return n2;
        else
            return n3;

    }
    public static int larger(char c1, char c2){
        if (c1>c2)
            return c1;
        else
            return c2;
    }

}
