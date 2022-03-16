public class HomeWork2 {
    public static void main(String[] args) {

    }
    public static boolean SumNumber(int a, int b){
        return 10 <= a + b && a + b <= 20;
    }

    public static void PosOrNeg() {
        int a = 10;
        if(a >= 0) {
            System.out.println("Положительное");
        } else{
            System.out.println("Отрицательное");
        }
    }

    public static boolean Check(int a){
        if(a < 0) {
            return true;
        } else{
            return false;
        }
    }

    public static void PrintLine(String line, int numb){
        for (int a = 0; a < numb; a++) {
            System.out.println(line);
        }
    }
}
