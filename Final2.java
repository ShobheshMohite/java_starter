//explanation of final method in java

class Demo
{
    public void fun()
    {
        System.out.println("Base Fun");
    }
    public final void gun(){
        System.out.println("Base gun");
    }
}

class Derived extends Demo{
    public void fun()
    {
        System.out.println("Derived Fun");
    }
    public void gun() //error ; we can't override the final method
    {
        System.out.println("Derived Gun");
    }
}

class Final2
{
    public static void main(String[] args){
        Demo dobj = new Derived();
    }
}

//same for final class -> we cant inherit final class