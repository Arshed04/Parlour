import java.util.Scanner;
class Customer
{
    String name;
    Boolean mem_ship;
    int discount=0;
    String mem_type;
public Customer(String s,Boolean a,String b)
{
    name=s;
    mem_ship=a;
    mem_type=b;
}

}
class Calculate_dis extends Customer
{
    
    public Calculate_dis(int x,int y,String s,Boolean a, String b)
    {
        super(s,a,b);
        super.discount=10;
        if(a)
        {
  
            if(super.mem_type.equals("Platinum"))
                super.discount+=20;
            else if(super.mem_type.equals("Gold"))
            {
                super.discount+=15;
            }
            else if(super.mem_type.equals("Silver"))
                super.discount+=10;
            
        }
        
    }
    public void invoice()
    {
    System.out.println("Invoice\n")   ;
    System.out.println("Customer Name:"+super.name);
    System.out.println("Is Customer a Member:"+super.mem_ship);
    System.out.println("Member_ship_type:"+super.mem_type);
    System.out.println("Total Discount:"+super.discount);
    
    }
    
}
public class Main
{
	public static void main(String[] args) {
	     Scanner in=new Scanner(System.in);
        System.out.print("Enter Number of Products:");
        int x=in.nextInt();
        System.out.println("Enter Number of Services");
        int y=in.nextInt();
        System.out.println("Enter Customer Name");
        String s=in.next();
        System.out.println("Enter Member Or Not(True/False(0/1)");
        Boolean a=in.nextBoolean();
      
        System.out.println("Enter Member Type");
        String b=in.next();
 
        
        Calculate_dis obj=new Calculate_dis(x,y,s,a,b);
        obj.invoice();
	}
}
