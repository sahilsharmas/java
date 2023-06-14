class Testvarilescope
{
    int a=0;
    static int b=0;
    public void increment(){
        a++;
        b++;
        System.out.print ("a="+a+"b="+b);

    }
    public static void main (){
        Testvariblescope tvs =new Testvariblescope();
        tvs.increment();
    }
}