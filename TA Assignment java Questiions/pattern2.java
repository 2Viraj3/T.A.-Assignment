public class pattern2
{
    public static void main(String[]args)
    {
         String alpa[]={"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O"};
         int n=0;
        for(int j=0;j<=10;j+=2)
        {
            for(int i=8;i>j;i--)
            {
                System.out.print(" ");
            }
            for(int k=0;k<=j;k+=2)
            {
                if(n==15)
               {
                   break;
            }
               System.out.print(alpa[n]+" ");
               n++;
        }
            System.out.println();
    }
}
}
