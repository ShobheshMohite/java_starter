//Single level inheritance

class Base {
    public int A,B;
    public Base(){
        System.out.println("base constructor");;
        this.A = 10;
        this.B = 20;
    }
    public void fun()
    {
        System.out.println("Inside base fun");
    }
    public void gun(){
        System.out.println("Inside base gun");
    }
    public void fun(int No) //overloaded Defination
    {
        System.out.println("Inside Base fun with integer");
    }
}

class Derived extends Base //class Derived : public Base
{
    public int X,Y;
    public Derived()
    {
        System.out.println("Inside Derived Constructor");
        this.X = 30;
        this.Y = 40;
    }
    public void sun(){
        System.out.println("Inside sun");
    }
    public void gun(){
        System.out.println("Inside Derived gun");
    }
}

/**
 * Single
 */
class Single {
    public static void main(String[] args) {
        Base bobj = new Derived(); //Upcasting
        
        bobj.fun();
        bobj.fun(11);
        bobj.gun(); 
    }

    
}