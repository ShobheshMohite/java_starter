class Demo
{
    public int iNo1;
    public final int iNo2 = 11;
    public final int iNo3;
    public Demo(){
        iNo1 = 0;
        iNo3 = 21;
    }
}

class Final
{
    public static void main(String[] args){
        final int i = 51; //final char
        Demo obj = new Demo();
        obj.iNo1++; 
        // obj.iNo3++; // NA deu to Final Keyword // constant in C++
    }
}