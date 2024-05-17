class Base{
    public void fun()
    {
        System.out.println("base fun");
    }
    public void gun()
    {
        System.out.println("base gun");
    }
    public void sun()
    {
        System.out.println("base sun");
    }
}

class Derived extends Base
{
    public void fun()
    {
        System.out.println("derived fun");
    }
    public void gun()
    {
        System.out.println("derived gun");
    }
    public void run()
    {
        System.out.println("derived run");
    }
}


/**
 * Runtime
 */
public class Runtime {
    public static void main(String[] args) {
        Base bobj = new Derived(); //upcasting
        Derived dobj = new Derived(); //to access run method //No casting
        bobj.fun();
        bobj.gun();
        bobj.sun();
        dobj.run();
    }    
}

