class Demo{
    public void fun()
    {
        System.out.println("Inside fun");
    }
    public void fun(int No)
    {
        System.out.println("Inside fun with one integer");
    }
    public void fun(int iNo1,int iNo2)
    {
        System.out.println("Inside Fun with 2 integers");
    }
}

class OverLoading {
    public static void main(String[] args) {
        Demo obj = new Demo();
        obj.fun();
        obj.fun(11);
        obj.fun(11,21);
    }
}
