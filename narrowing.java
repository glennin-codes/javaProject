public class narrowing{
    private static void add(){ 
        byte a =10;
        byte b = 10;
        byte c= (byte)(a+b);
        System.out.println(c);
    }
    public static void main(String[] args){
        double a=10;
        int b=(int)a;
        System.out.println(a);
        System.out.println(b);
       add();
    }
}