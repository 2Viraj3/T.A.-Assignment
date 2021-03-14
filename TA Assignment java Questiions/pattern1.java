public class pattern1
{
    public static void main(String[]args)
    {
     for(int i=0;i<9;i+=2)
       {
           for(int j=7;j>=i;j-=2)
           {
               System.out.print(" ");
            }
            for(int k=0;k<=i;k+=2)
            {
                System.out.print("*"+" ");
            }
            System.out.println();
    }
}
}

