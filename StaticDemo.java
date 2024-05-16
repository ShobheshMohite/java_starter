
class StaticDemo
{
    static 
    {
        System.out.println("Inside Static Block of static Demo class which contain main");
    }
    public StaticDemo(){
        System.out.println("Inside Static Demo class constructor");
    }
    public static void main(String[] args) {
        System.out.println("Inside main method of static Demo class");
        System.out.println("Value of static No3:"+Demo.No3);
        System.out.println("Value of static No4:"+Demo.No4);

        Demo.gun();
        Demo obj1 = new Demo();
        Demo obj2 = new Demo();

        obj1.fun();
    }
}

class Demo
{
    public int No1;
    public int No2;

    public static int No3;
    public static int No4;

    static
    {
        System.out.println("Inside static block of Demo Class");
        No3 = 51;
        No4 = 101;
    }
    public Demo(){
        System.out.println("Inside Constructor");
        No1 = 11;
        No2 = 21;
    }
    public void fun(){
        System.out.println("Inside fun method of Demo class");
        System.out.println("Value Of No1:"+this.No1);
        System.out.println("Value Of No2:"+this.No2);
        System.out.println("Value Of No3:"+this.No3);
        System.out.println("Value Of No4:"+this.No4);
    }
    public static void gun(){
        System.out.println("Inside gun method of Demo class");
        System.out.println("Value Of No3:"+No3);
        System.out.println("Value Of No4:"+No4);
        // System.out.println("Value Of No1:"+this.No3); NA
        // System.out.println("Value Of No1:"+this.No4); NA
    }

}