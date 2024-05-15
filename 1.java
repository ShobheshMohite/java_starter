import java.util.*;

class Maths
{
    public int iNo1;
    public int iNo2;

    public Maths()
    {
        System.out.println("Inside Default Constructor");
        iNo1 = 0;
        iNo2 = 0;
    }
    public Maths(int a,int b)
    {
        System.out.println("Inside Parameterised Constructor");
        iNo1 = a;
        iNo2 = b;
    }
    public int Addition()
    {
        int iAns = 0;
        iAns = iNo1 + iNo2;
        return iAns;
    }
    public int Substraction()
    {
        int iAns = 0;
        iAns = iNo1 - iNo2;
        return iAns;
    }
}

class Demo
{
    int iRet = 0;   

    public static void main(String[] args) {
        System.out.println("Inside main");       
        Demo demo = new Demo(); // create an instance of Demo
        demo.run(); // call the run method
    }

    public void run() {
        Maths mobj1 = new Maths();
        Maths mobj2 = new Maths(10,11);

        int iAns = mobj1.Addition();
        System.out.println("Addition is: " + iAns);

        iRet = 0;
        iRet = mobj2.Addition();
        System.out.println("Addition is: " + iRet);
    }
}
