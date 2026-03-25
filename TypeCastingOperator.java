public class TypeCastingOperator {
    public static void main(String[] args) {
        double d=9.78;
        //explicit
        int num=(int)d;
        System.out.println("Double value before conversion:"+d);
        System.out.println("Double value after conversion:"+num);
        //implicit
        int  a=10;
        double f=a;
        System.out.println("int value before conversion:"+a);
        System.out.println("int value after conversion:"+f);
    }
}
