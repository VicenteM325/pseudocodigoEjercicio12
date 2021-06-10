import java.util.Scanner;

public class Ejercicio12{
    public static void main(String[] args){
        int sumamuj= 0, sumahom = 0, sumaedad = 0, a = 0, b = 0, c = 0, altura, edad;
        double promedio1, promedio2, promedio3;
        String sexo;
        Scanner entrada = new Scanner(System.in);
        do{
            System.out.print("Ingrese su altura en centímetros: ");
            altura = entrada.nextInt();
            System.out.print("Ingrese su edad: ");
            edad = entrada.nextInt();
            System.out.print("Ingrese su sexo F/M: ");
            sexo = entrada.next();
            if(sexo.equals("F")){
                sumamuj = sumamuj + altura;
                a = a + 1;
            }
            if(sexo.equals("M")){
                sumahom = sumahom + altura;
                b = b + 1;
            }
            if(sexo.equals("F") || (sexo.equals("M"))){
                sumaedad = sumaedad + edad;
                c = c + 1;
            }

        }while(altura > 0 );
        promedio1 = sumamuj/a;
        promedio2 = sumahom/b;
        promedio3 = sumaedad/c;
        System.out.println("El promedio de la altura de las mujeres es = " + promedio1);
        System.out.println("El promedio de la altura de los hombres es = " + promedio2);
        System.out.println("El promedio general de las edades es = " + promedio3);
    }
}