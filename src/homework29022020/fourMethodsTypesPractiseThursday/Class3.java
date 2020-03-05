package homework29022020.fourMethodsTypesPractiseThursday;

public class Class3 {


    public static void main(String[] args) {
        Class5 ins = new Class5();
        noReturnNoPara();
        ins.noReturnWithPara(10,20);
        returnNoPara();
        ins.returnWithPara("Prime",30);

    }

    public static void noReturnNoPara() {
        String a = "noReturnNoPara";
        System.out.println(a);
    }
    public void noReturnWithPara(int a, int b) {
        int sum = a+b;
        System.out.println(sum);
    }
    public static int returnNoPara() {
        int a = 1 , b = 1;
        int sum = a + b;
        System.out.println(sum);
        return sum;
    }
    public String returnWithPara(String c, int d) {
        c = "returnWithPara";
        System.out.println(c);
        return c;
    }
}
