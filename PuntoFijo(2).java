public class Main {
    public static double g(double x) {
        return Math.exp(-x);
    }

    public static double f(double x){
        return Math.exp(-x)-x;
    }

    public static void main(String[] args){
        int iter = 0;
        double x = 0;
        while(Math.abs(f(x))>1e-8 && iter<=1000000){
            x = Main.g(x);
            iter++;
        }
        if (Math.abs(f(x))<1e-8){
            System.out.println("e^(-x)-x");
            System.out.println("Raiz estimada = " + x);
        }
        else {
            System.out.println("No se pudo obtener una raiz");
        }
    }

}
