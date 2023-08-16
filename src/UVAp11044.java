import java.util.Scanner;

public class UVAp11044 
{    
    public static void main(String[] args) throws Exception 
    {
        Scanner sc=new Scanner(System.in);
        int iteration=sc.nextInt();  
        String input;
        int i=0;                  
        while((input=sc.nextLine())!=null)
        {
            i++;
            System.out.println(input);
            if (i==iteration+1)
            {
                break;
            }            
        } 
    }    
}
