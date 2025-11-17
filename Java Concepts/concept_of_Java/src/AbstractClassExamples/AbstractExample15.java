package AbstractClassExamples;

/* 
 * 15) Is the below program written correctly? If yes, what will be the output?
 * 
 * 1 2 5 3 4
 */
 
abstract class XYZ
{
    {
        System.out.println(1);
    }
     
    public XYZ()
    {
        System.out.println(2);
         
        abstractMethod();
    }
     
    abstract void abstractMethod();
}
 
class PQR extends XYZ
{
    {
        System.out.println(3);
    }
     
    public PQR()
    {
        System.out.println(4);
    }
     
    @Override
    void abstractMethod()
    {
        System.out.println(5);  
    }
}


public class AbstractExample15 {
	
	public static void main(String [] args)
	{
		PQR pqr = new PQR();  //1 2 5 3 4
	}
}

