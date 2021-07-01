public class Code {
    public static void main(String[] args) {
        String[] Words = {"Hello", "Hekko", "Heppo"};
        for (String w: Words) {
            if (w.startsWith("He")) {
                System.out.println(w + "starts with He");
            }
            if (w.endsWith("llo")) {
                System.out.println(w.trim() + "ends with llo");
            }
        }
        Factorial fact = new Factorial(8);
        System.out.println(fact.computeFactorial());
    }
}

class Factorial {
    int num;
    public Factorial(int num) {
        this.num = num;
    }
    public static void main() {
}
    public int computeFactorial() {
        int result = 1;
        System.out.println(1);
        for (int i = 1; i <= this.num; i++) {
            result = result * i;
        }
        return result;
    }
}