package static_intializer;

class EDemo 
{	
    static
	{   
		i = 100;	
		//sSystem.out.println(i); //invalid
	}

    static int i;
}

public class ErrorDemo
{
    public static void main(String[] args) 
	{
        System.out.println(EDemo.i);
	}
}
