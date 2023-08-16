import java.util.Scanner;

public class Main 
{    
    public static void main(String[] args) throws Exception 
    {
        Scanner sc=new Scanner(System.in);
        int iteration=sc.nextInt();  
        String input;
        int i=0; 
        for(i=0;i<=iteration;i++)
        {
            input=sc.nextLine();
            if(i!=0)
            {
                String[] inputarr=input.split("\\s");
                int n=Integer.parseInt(inputarr[0]);
                int m=Integer.parseInt(inputarr[1]);
                int minR=new Main().minRow(n);
                int minC=new Main().minRow(m);
                System.out.println(minR*minC);  

            }
        } 
    } 
    public int minRow(int row)
    {
        if((row-2)%3==0)
        {
            return (row-2)/3;
        }
        else
        {
            return ((row-2)/3)+1;
        }
    }   
}
