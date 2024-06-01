import java.util.Arrays;
import java.util.Scanner;
import java.text.DecimalFormat;
public class trapecio {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
       
        System.out.println("Elige la funció que deseas: ");
        System.out.println("\n  1. Funcion f(x) = 70/(1+x´2)dx \n");
        System.out.println("\n  2. Funcion f(x) = 1/(1+x)´2dx \n");
        System.out.println("\n  3. Funcion f(x) = 4/(2+x)´2dx \n");
        int c=t.nextInt();

        switch (c) {
            case 1:  System.out.println("Regla del trapecio");

            //Funcion 
    
            System.out.println("\n Funcion f(x) = 70/(1+x´2)dx \n");
    
            
            DecimalFormat dec = new DecimalFormat("#.000");
    
            float a,b,n, funcion, h, dimen, A;
    
            A=0;
    
            //total de iteraciones (trapecios)
    
            System.out.println("Ingresa el total de iteraciones [n]: ");
            n=t.nextFloat();
    
            //limites de la integral
    
            System.out.println("Ingresa limite superior: ");
            b=t.nextFloat();
            System.out.println("Ingresa limite inferior: ");
            a=t.nextFloat();
            
            //valor de h
            h= (b-a)/n;
            A=a;
    
    
            System.out.println("El valor de h es: "+h);
    
            //valores de x
    
            int v= (int) n;
            v = v+1;
    
            float dimension [] = new float[v];
            
            for (int i=1; i<(v-1); i++){
                a= a+h;
                dimension[i]=a;
            }
            //Le damos valores a x0 y xn
    
            dimension[0]=A;
            dimension[v-1]=b;
    
            System.out.println("\n");
    
            for (int i=0; i<v; i++){
                System.out.println("El valor de x es: "+i+"="+dec.format(dimension[i]));
    
            }
            //remplazamos los nuevos valores de x en la funcion f[x]...
    
            
            float fi, fa, fb, sum, resultado, multi;
            sum=0;
    
            //Integral
    
            for (int i=0; i<v; i++){
                fi = 70/(1+(dimension[i]*dimension[i]));
                dimension[i]= fi;
            }
    
            fa = dimension[0];
            fb = dimension[v-1];
            // 
    
            for (int i=1; i<(v-1); i++){
                multi = dimension [i]*2;
    
                //se suman los resultados
    
                sum=sum+multi;
    
            }
            System.out.println("\n");
    
            //Se muestran los resultados
            resultado = ((h/2)*(sum + fa+ fb));
            System.out.println("El resultado es: "+resultado);
                
                break;
            case 2:
            System.out.println("Regla del trapecio");

            //Funcion 
    
            System.out.println("\n Funcion f(x) = 1/(1+x´2)dx \n");
    
            
            DecimalFormat dec1 = new DecimalFormat("#.000");
    
            float a1,b1,n1, funcion1, h1, dimen1, A1;
    
            A=0;
    
            //total de iteraciones (trapecios)
    
            System.out.println("Ingresa el total de iteraciones [n]: ");
            n=t.nextFloat();
    
            //limites de la integral
    
            System.out.println("Ingresa limite superior: ");
            b=t.nextFloat();
            System.out.println("Ingresa limite inferior: ");
            a=t.nextFloat();
            
            //valor de h
            h1= (b-a)/n;
            A1=a;
    
    
            System.out.println("El valor de h es: "+h1);
    
            //valores de x
    
            int v1= (int) n;
            v1 = v1+1;
    
            float dimension1 [] = new float[v1];
            
            for (int i=1; i<(v1-1); i++){
                a= a+h1;
                dimension1[i]=a;
            }
            //Le damos valores a x0 y xn
    
            dimension1[0]=A;
            dimension1[v1-1]=b;
    
            System.out.println("\n");
    
            for (int i=0; i<v1; i++){
                System.out.println("El valor de x es: "+i+"="+dec1.format(dimension1[i]));
    
            }
            //remplazamos los nuevos valores de x en la funcion f[x]...
    
            
            float fi1, fa1, fb1, sum1, resultado1, multi1;
            sum1=0;
    
            //Integral
    
            for (int i=0; i<v1; i++){
                fi = 1/(1+(dimension1[i]*dimension1[i]));
                dimension1[i]= fi;
            }
    
            fa = dimension1[0];
            fb = dimension1[v1-1];
            // 
    
            for (int i=1; i<(v1-1); i++){
                multi = dimension1 [i]*2;
    
                //se suman los resultados
    
                sum1=sum1+multi;
    
            }
            System.out.println("\n");
    
            //Se muestran los resultados
            resultado = ((h1/2)*(sum1 + fa+ fb));
            System.out.println("El resultado es: "+resultado);
            break;

        case 3: 
        System.out.println("Regla del trapecio");

            //Funcion 
    
            System.out.println("\n Funcion f(x) = 4/(2+x´2)dx \n");
    
            
            DecimalFormat dec2 = new DecimalFormat("#.000");
    
            float a2,b2,n2, funcion2, h2, dimen2, A2;
    
            A2=0;
    
            //total de iteraciones (trapecios)
    
            System.out.println("Ingresa el total de iteraciones [n]: ");
            n=t.nextFloat();
    
            //limites de la integral
    
            System.out.println("Ingresa limite superior: ");
            b2=t.nextFloat();
            System.out.println("Ingresa limite inferior: ");
            a2=t.nextFloat();
            
            //valor de h
            h2= (b2-a2)/n;
            A2=a2;
    
    
            System.out.println("El valor de h es: "+h2);
    
            //valores de x
    
            int v2= (int) n;
            v2 = v2+1;
    
            float dimension2 [] = new float[v2];
            
            for (int i=1; i<(v2-1); i++){
                a2= a2+h2;
                dimension2[i]=a2;
            }
            //Le damos valores a x0 y xn
    
            dimension2[0]=A2;
            dimension2[v2-1]=b2;
    
            System.out.println("\n");
    
            for (int i=0; i<v2; i++){
                System.out.println("El valor de x es: "+i+"="+dec2.format(dimension2[i]));
    
            }
            //remplazamos los nuevos valores de x en la funcion f[x]...
    
            
            float fi2, fa2=0, fb2=0, sum2, resultado2, multi2;
            sum2=0;
    
            //Integral
    
            for (int i=0; i<v2; i++){
                fi = 4/(2+dimension2[i]*dimension2[i]);
                dimension2[i]= fi;
            }
    
            fa = dimension2[0];
            fb = dimension2[v2-1];
            // 
    
            for (int i=1; i<(v2-1); i++){
                multi2 = dimension2 [i]*2;
    
                //se suman los resultados
    
                sum1=sum2+multi2;
    
            }
            System.out.println("\n");
    
            //Se muestran los resultados
            resultado2 = ((h2/2)*(sum2 + fa+ fb));
            System.out.println("El resultado es: "+resultado2);
           
        break;
        
     
        
            default:


                break;
        }


            
        

        

        
       












    }
}
