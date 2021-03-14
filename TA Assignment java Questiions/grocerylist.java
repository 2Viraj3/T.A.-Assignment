import java.util.*;
public class grocerylist
{
    public static void main(String[]args)
    {
        Scanner obj= new Scanner(System.in);
        System.out.println("Enter your Budget : ");
        int n=obj.nextInt();
        String a="",b="";
        int c=0,m=0,f=0,i=0,neew=0,z=0,y=0;
        ArrayList<ArrayList<String>> grocery = new ArrayList();
        ArrayList<String> Productlist = new ArrayList();
        ArrayList<String> Quantity= new ArrayList();
        ArrayList<String> Price= new ArrayList();
        while(n>0)
        {
        System.out.println("1.Add an Item");
        System.out.println("2.Exit");
        System.out.println("Enter your choice : ");
        m=obj.nextInt();
        i++;
            if(m==1)
            {
                obj.nextLine();
                System.out.println("Enter Product : ");
                 a=obj.nextLine();
                System.out.println("Enter quantity : ");
                b=obj.nextLine();
                System.out.println("Enter Price : ");
                c=obj.nextInt();
                if(c>n)
                {
                    System.out.println();
                    System.out.println("Cant Buy the Product :- Out of Budget");
                    System.out.println();
                    i=0;
                    continue;
                }
                else
                {
                 for(int k=0;k<Productlist.size();k++)
                    {
                        if(a.equals(Productlist.get(k)))
                        {
                            z=1;
                            y=k;
                        }
                     }
                    if(z>0)
                    {
                        if(c>n)
                        {
                            System.out.println();
                            System.out.println("Cant Buy the Product :- Out of Budget");
                            System.out.println();
                            i=0;
                            continue;
                       }
                       else
                       {
                         neew=Integer.parseInt(grocery.get(2).get(y));
                         grocery.get(0).set(y,a);
                         grocery.get(1).set(y,b);
                         grocery.get(2).set(y,String.valueOf(c));
                         n=n+neew;
                         neew=0;
                         n=n-c;
                         System.out.println();
                         System.out.println("Amount Left :"+n);
                         System.out.println();
                        }
                    }
                 else
                    {
                    n=n-c;
                    System.out.println();
                    System.out.println("Amount Left :"+n);
                    System.out.println();
                    Productlist.add(a);
                    grocery.add(Productlist);
                    Quantity.add(b);
                    grocery.add(Quantity);
                    Price.add(String.valueOf(c));
                    grocery.add(Price);
                }
                 z=0;
            }
            }
            else if(m==2){
                f=1;
                break;
        }
        else{
            System.out.println();
             System.out.println("Invalid Input PLease enter Again");
             System.out.println();
        }
    }   
    
    if(f>0 && i==1)
    {
        System.out.println("you havent added anything the list is empty");
    }
    else
    {
        System.out.println();
        if(i>1 && m==2 && n>0)
        {
            System.out.println();
            System.out.print("The left Amount can buy you ");
            for(int k=0;k<Price.size();k++)
                    {
                        if(n>=(Integer.parseInt(Price.get(k))))
                        {
                            System.out.print(Productlist.get(k)+" ");
                        }
                     }
             System.out.println();
        }
        if(n==0)
        {
            System.out.println();
            System.out.println("You cannot add any more item");
            System.out.println();
        }
        System.out.println("GROCERY LIST is: ");
        System.out.println("Product name\tQuantity\tPrice");
        for(i=0;i<Price.size();i++)
        {
        System.out.println(Productlist.get(i)+"\t"+"\t"+Quantity.get(i)+"\t"+"\t"+Price.get(i));
    }
    }
    /*for(i=0;i<grocery.size()/2;i++)
        {
            for(int j=0;j<grocery.get(i).size();j++)
            {
                System.out.println(grocery.get(i).get(j));
    }
    System.out.println();
}*/
}
}