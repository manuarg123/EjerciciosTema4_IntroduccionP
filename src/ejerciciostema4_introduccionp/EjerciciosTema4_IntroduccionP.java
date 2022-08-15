/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciostema4_introduccionp;

/**
 *
 * @author MANUEL RIVAS GAUNA
 */
public class EjerciciosTema4_IntroduccionP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //1) Usando un if, crear una condición que compare si la variable numeroIf es positivo, negativo, o 0
            System.out.println("Ejercicio 1 IF:");
            int numeroIf;
            numeroIf = 6;
            if (numeroIf < 0) {
                    System.out.println(numeroIf + " Es Negativo");
            }else  if(numeroIf != 0){
                    System.out.println(numeroIf + " Es Positivo");
            }else{
                     System.out.println(numeroIf + " Es Cero");
            }
        //2)Crea un bucle While:
            System.out.println("Ejercicio 2 WHILE:");
            int numeroWhile;
            numeroWhile = -5;
            
            while(numeroWhile < 3){
                numeroWhile = numeroWhile + 1;
                System.out.println(numeroWhile);
            }            
        //3) Bucle Do While:
            int numeroDoWhile;
            numeroDoWhile = 5;
            System.out.println("Ejercicio 3 DO WHILE:");
            
            do {
                System.out.println("El numeroDoWhile es " + numeroDoWhile);
            } while (numeroWhile < 3);

        //4) Bucle For:
            System.out.println("Ejercicio 4 FOR:");
            
            for (int numeroFor = 0; numeroFor <= 3 ; numeroFor++) {
                System.out.println(numeroFor);
            }
        //5) Switch:
            System.out.println("Ejercicio 5 SWITCH: ");
            
            String estacion;
            estacion = "Invierno";
            
            switch(estacion){
                case "Verano":
                        System.out.println("La estacion es " + estacion);
                        break;
                case "Otoño":
                        System.out.println("La estacion es " + estacion);
                        break;
                case "Invierno":
                        System.out.println("La estacion es " + estacion);
                        break;
                case "Primavera":
                        System.out.println("La estacion es " + estacion);
                        break;
                default:
                     System.out.println("No se ingreso una estación ");
                     break;
                 
            }
    }
    
}
