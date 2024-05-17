interface Circle
{
    float PI = 3.14f;
    float Area(float radius);
    float Circumference(float radius);
}

class Marvellous implements Circle
{
    public float Area(float radius)
    {
        return PI * radius * radius;
    }
    public float Circumference(float radius)
    {
        return 2 * PI * radius;
    }
}

public class Inteface1 {
    public static void main(String[] args) {
        System.out.println("Value of PI : "+Circle.PI); // To demonstrate public
        // Circle.PI = 7.12; //TO demonstrate final
        Circle cobj = new Marvellous();
        float fret = 0.0f;
        fret = cobj.Area(10.5f);
        System.out.println("Area of circle : "+fret);
        fret = cobj.Circumference(10.f);
        System.out.println("Circumference of circle : "+fret);
    }
}
