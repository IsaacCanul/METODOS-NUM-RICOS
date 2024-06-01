import java.util.Arrays;
import java.util.Scanner;
public class seidel1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double[][] matriz = new double[3][4];
        double[] vi = new double[3];
        

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Ingrese el elemento en la posición [" + i + "][" + j + "]: ");
                matriz[i][j] = teclado.nextDouble();
            }
        }
        System.out.println();
        for (int i = 0; i < 3; i++) {
                System.out.print("Ingrese los valores iniciales de la incógnita[" + i + "]: ");
                vi[i] = teclado.nextDouble();
           
        }
        System.out.println();
        System.out.println("Ingresa el máximo de iteraciones: ");
        int maxiter = teclado.nextInt();
        System.out.println();
        System.out.println("Ingresa la tolerancia para la convergencia: ");
        double tolerancia = teclado.nextDouble();

        solve(matriz, vi, maxiter, tolerancia);


        

        
       
    }
    public static void solve(double[][] matriz, double[] vi, int maxiter, double tolerancia) {

        int n = matriz.length;

        double[] x =Arrays.copyOf(vi, n);
        double [] prevX = new double[n];

        int iteracion = 0; //contador de iteraciones
        
        while (iteracion < maxiter) {
            System.arraycopy(x, 0, prevX, 0, n);//copia los valores actuales de x a prevX
            
            for(int i=0; i<n; i++ ){
                double sum=matriz[i][n];

                for(int j=0; j<n; j++ ){
                    if (j!=i){
                        sum-=matriz[i][j]* x[j];//Resta los coeficientes de las otra incognitas
                    }
                }

                x[i]= sum / matriz [i][i]; //divide por el coeficiente de la incongnita acutual
    
            }
            iteracion++;
            //muestra los valores de x en esta iteracion
            System.out.println("Iteracion "+ iteracion+ ": ");
            for (int i=0; i<n; i++){
                System.out.println(x[i]+"");

            }
            System.out.println();
            //comprueba la convergencia comparando los valores actuales con los previos
            boolean convergencia = true;
            for (int i=0; i<n; i++){
                if(Math.abs(x[i]-prevX[i])>tolerancia){
                    convergencia = false;
                    break;
                }
            }
            if (convergencia){
                break; //La solucion han convergido
            }
        }

        System.out.println("Numero total de iteraciones: "+iteracion);

        if (iteracion >= maxiter){
            System.out.println("La solucion no converge despues de "+ maxiter+ "iteraciones.");

        }else{
            System.out.println("La solucion convergio a una tolerancia de"+ tolerancia+".");
        }
        
    }
}
