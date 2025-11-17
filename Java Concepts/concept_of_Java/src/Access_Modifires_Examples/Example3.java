package Access_Modifires_Examples;

class X
{
    protected int i = 1221;
     
    void methodOfX()
    {
        System.out.println(i);
    }
}
 
public class Example3
{
    public static void main(String[] args)
    {
        X x = new X();
         
        System.out.println(x.i);
         
        x.methodOfX();
    }
}


/* OUTPUT
 * 
 * 	1221
 *	1221
 *
 * */

