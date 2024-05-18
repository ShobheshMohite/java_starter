class Demo{
    int iSize;
    int Arr[];
    public Demo(int iNo)
    {
        System.out.println("Inside Constructor");
        iSize = iNo;
        Arr = new int[iSize];
    }
    protected void finalize()
    {
        System.out.println("Inside Finalize Method");
        Arr = null;
    }
}

class FinalizeDemo {
    public static void main(String[] args) {
        Demo dobj = new Demo(5);
        dobj = null;
        System.gc();
    }
}