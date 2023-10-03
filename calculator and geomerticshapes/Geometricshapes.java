class Geometricshapes
{
    double area (float a)
    {
System.out.println("Area of the Sqaure is:"+Math.pow(a,2)+"sq units");
        return Math.pow(a,2);
    }
int area (int x,int y)
{
    System.out.println("area of the rectangle is :"+(x*y)+"sq units");
    return (x*y);}
double area (double r)
{
    double  s=3.14*Math.pow(r,2);
    System.out.println("the area of the circle is"+s+"sq units");
    return s;
}
double area(float d,float h)
{
    float t=((1.5f*d)*h);
    System.out.println("the area of the circle is:"+t+"squnits");
    return t;
}
public static void main(String[] args)
{
    Geometricshapes obj= new Geometricshapes();
    obj.area(45f);
    obj.area(41,12);
    obj.area(10.45);
    obj.area(14f,45f);
}
}