class MethodOverloading{
    static int number(int t){
        t = 12345;
        return t;
    }
    static void number(int a, double u){
        a = 123;
        String vidu = new String("abc");
        System.out.println(a + " and " + vidu);
    }
    static void number(int b, String c){
        c = "54abcd";
        System.out.println(c);
    }
    static void number(double d){
        d = 3.89;
        System.out.println(d);
    }
    public static void main(String[] args) {
        System.out.println(number(2));
        number(2, 0.5);
        number(5, "vidu");
        number(5.2);
    }
}