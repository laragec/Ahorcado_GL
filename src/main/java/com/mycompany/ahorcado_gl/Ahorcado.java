package com.mycompany.ahorcado_gl;

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class Ahorcado {
    public static void main(String[] args) {
        //Objetos y variables:
        Scanner sc = new Scanner(System.in);
        String respuesta;
        /*A continuación se encuentra la matriz que almacenará las palabras y las pistas. La matriz al principio 
        solo tiene "_" en los lugares donde van las letras ya que en cada respuesta correcta se cambia el "_" por la letra correspondiente*/
        String [][] palabras= new String [2][6]; 
        palabras [0][0]= "_";
        palabras [0][1]= "_";
        palabras [0][2]= "_";
        palabras [0][3]= "_";
        palabras [0][4]= "_";
        palabras [0][5]= "Está relacionado con el agua.";
        palabras [1][0]= "_";
        palabras [1][1]= "_";
        palabras [1][2]= "_";
        palabras [1][3]= "_";
        palabras [1][4]= "_";
        palabras [1][5]="Es un verbo";
        Random rnd= new Random();//Para que el programa escoja aleatoriamente que palabra utilizar.
        int a=rnd.nextInt(2);
        //int a=1; <== Variable de prueba. 
        
        //Si "a=0" se jugará con la letra de la primera fila de la matriz, en este caso la palabra es "ROCIO"
        if(a==0){
            System.out.println("La palabra posee 5 letras.\nLa pista para resolver la siguiente palabra es: "+palabras[0][5]+"\n");
            //Este for es para la cantidad de intentos que tiene el jugador
            for(int i=0;i<10;i++){
                //Este for es para que se imprima lo que contiene la amtriz en la primera fila.
                for (int j = 0; j < 5; j++) {
                    System.out.print(palabras[0][j]);
                }
                System.out.println("\n\nInserte una letra:");
                respuesta=sc.nextLine();
                System.out.println("");
                //Si la respuesta del jugador corresponde a alguna de las letras de la palabra, esa letra se alamcena en la matriz y se cambian los "_" en la palabra.
                if (respuesta.equalsIgnoreCase("r")||respuesta.equalsIgnoreCase("O")||respuesta.equalsIgnoreCase("C")||respuesta.equalsIgnoreCase("I")){
                    if (respuesta.equalsIgnoreCase("r")) {
                        if(palabras [0][0]== "R"){//Este if es para alertar al jugador que esa letra ya ha sido utilizada. Cada letra de la palabra contiene este if. 
                            System.out.println("Esa letra ya la has utilizado. Inténtalo nuevamente");
                        }
                        palabras [0][0]= "R";
                    }
                    if (respuesta.equalsIgnoreCase("o")) {
                        if(palabras [0][1]== "O"){
                            System.out.println("Esa letra ya la has utilizado. Inténtalo nuevamente");
                        }
                        palabras [0][1]= "O";
                        palabras [0][4]= "O";
                    }
                    if (respuesta.equalsIgnoreCase("c")) {
                        if(palabras [0][2]== "C"){
                            System.out.println("Esa letra ya la has utilizado. Inténtalo nuevamente");
                        }
                        palabras [0][2]= "C";
                    }
                    if (respuesta.equalsIgnoreCase("i")) {
                        if(palabras [0][3]== "I"){
                            System.out.println("Esa letra ya la has utilizado. Inténtalo nuevamente");
                        }
                        palabras [0][3]= "I";
                    }
                }else{ //Si la respuesta no ha sido correcta la matriz no cambia y se peirde un turno.
                    System.out.println("La letra \""+respuesta.toUpperCase()+"\" no está en la palabra. Inténtalo nuevamente");
                }
                //Si la palabra se completa dentro de la matriz, se finaliza el juego y se ceunta el número de intentos.
                if ("R".equals(palabras [0][0])&&"O".equals(palabras [0][1])&&"C".equals(palabras [0][2])&&"I".equals(palabras [0][3])&&"O".equals(palabras [0][4])) {
                    for (int k = 0; k < 5; k++) {
                        System.out.print(palabras[0][k]);
                    }
                    System.out.println("\n\n¡Correcto! Has acertado. Nº de intentos: "+(i+1));
                    i=10;//Esto e spara detener al for una vez s ehaya ganado.
                }
                //Si es el último intento y no se ha acertado la palabra. El programa le da un mesnaje al jugador de que ha perdido y ya no tiene más intentos. El for se detiene.
                if (i==9) {
                    System.out.println("\n¡Mala suerte! Has superado el número de intentos permitido :/ La palabra era: ROCIO.");
                }
            }
        }
        
        //Si "a=1" se jugará con la letra de la segunda fila de la matriz, en este caso la palabra es "MIRAR". Ocurre exactamente lo mismo que en la palabra anterior.
        if(a==1){
            System.out.println("La palabra posee 5 letras.\nLa pista para resolver la siguiente palabra es: "+palabras[1][5]+"\n");
            for(int i=0;i<10;i++){
                for (int j = 0; j < 5; j++) {
                    System.out.print(palabras[1][j]);
                }
                System.out.println("\n\nInserte una letra:");
                respuesta=sc.nextLine();
                System.out.println("");
                if (respuesta.equalsIgnoreCase("M")||respuesta.equalsIgnoreCase("I")||respuesta.equalsIgnoreCase("R")||respuesta.equalsIgnoreCase("A")){
                    if (respuesta.equalsIgnoreCase("M")) {
                        if(palabras [1][0]== "M"){
                            System.out.println("Esa letra ya la has utilizado. Inténtalo nuevamente");
                        }
                        palabras [1][0]= "M";
                    }
                    if (respuesta.equalsIgnoreCase("R")) {
                        if(palabras [1][2]== "R"){
                            System.out.println("Esa letra ya la has utilizado. Inténtalo nuevamente");
                        }
                        palabras [1][2]= "R";
                        palabras [1][4]= "R";
                    }
                    if (respuesta.equalsIgnoreCase("I")) {
                        if(palabras [1][1]== "I"){
                            System.out.println("Esa letra ya la has utilizado. Inténtalo nuevamente");
                        }
                        palabras [1][1]= "I";
                    }
                    if (respuesta.equalsIgnoreCase("A")) {
                        if(palabras [1][3]== "A"){
                            System.out.println("Esa letra ya la has utilizado. Inténtalo nuevamente");
                        }
                        palabras [1][3]= "A";
                    }
                }else{
                    System.out.println("La letra \""+respuesta.toUpperCase()+"\" no está en la palabra. Inténtalo nuevamente");
                }
                if ("M".equals(palabras [1][0])&&"I".equals(palabras [1][1])&&"R".equals(palabras [1][2])&&"A".equals(palabras [1][3])&&"R".equals(palabras [1][4])) {
                    for (int k = 0; k < 5; k++) {
                        System.out.print(palabras[1][k]);
                    }
                    System.out.println("\n\n¡Correcto! Has acertado. Nº de intentos: "+(i+1));
                    i=10;
                }
                if (i==9) {
                    System.out.println("\n¡Mala suerte! Has superado el número de intentos permitido :/ La palabra era: MIRAR.");
                }
            }
        }
    }
}
