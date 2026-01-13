class Demo
{
    public int i;
    public static int j;

    static
    {
        j=21;
    }
    public Demo()
    {
        this.i=11;               //First use
        System.out.println("Inside Default");
    }
    public Demo(int a)
    {
        this();          //Second USe
        System.out.println("Inside Parametrised");
    }

    public void Dispaly()
    {
        System.out.println("Inside Display"+this.i);      //This USe
    }
}


class ThisDemo
{
    public static void main(String A[])
    {
        Demo dobj=new Demo(51);
        dobj.Dispaly();
    }
}