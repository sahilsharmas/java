class functionoverloading{
   // public static void main (String args[]){
  final float pi = 3.14f;
        int area (int a) 
        {
        return a*a;
        }
        public int area (int a, int b ){
            return a*b;
            
        }
        public float area (float a)
        {
            return (pi*a);
        }
    
    public static void main (String args[])
    {
    functionoverloading fo = new functionoverloading();
    
           System.out.println(fo.area (7));
          System.out.println(fo.area(6,8));
           System.out.print(fo.area(9.0f));

}}