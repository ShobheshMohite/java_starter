class Demo
{
    public int iNo1;
    public int iNo2;

    public Demo(int a,int b){
        iNo1= a;
        iNo2 = b;
    }
}

public class HashCodeDemo {
    public static void main(String[] args) {
        
    Demo obj  = new Demo(11, 21);
    System.out.println("Hascode For Obj is : "+ obj.hashCode());
    }
}
