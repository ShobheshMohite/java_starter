class Demo{
    public int iNo1;
    public int iNo2;

    public Demo(int A,int B){
        iNo1 = A;
        iNo2 = B;
    }
}

public class EqualsDemo {
    public static void main(String[] args) {
        String s1 = "Shobhesh";
        String s2 = "Shobhesh";

        System.out.println("Hashcode of S1 : "+s1.hashCode());
        System.out.println("Hashcode of S2 : "+s2.hashCode());

        if(s1.equals(s2))
        {
            System.out.println("Objects Are Same");
        } else {
            System.out.println("Objects Are Not Same");
        }
        if(s1 == s2)
        {
            System.out.println("Objects Are Same");
        }
        else {
            System.out.println("Objects Are Not Same");
        }
    }
}
