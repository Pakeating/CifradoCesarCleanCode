
package com.prog.cifradocesarcleancode;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *Autor: Francisco Linares Santamaria.
 * La aplicacion realiza dos labores: Cifrar y descifrar mensajes mediante el metodo Cesar.
 */
public class CifradoCesarCleanCode {

    public static void main(String[] args) {
        
        String cadena;
        int desplazamiento;
        System.out.println("Bienvenido al programa de cifrado/descifrado césar");
        System.out.println("Introduzca 0 para cifrar o 1 para descifrar");
        Scanner entrada = new Scanner(System.in);
        int menu =entrada.nextInt();
        entrada.nextLine();
        
        if(menu==0){
            System.out.println("Introduce la cadena de texto a cifrar: ");
            cadena=entrada.nextLine().toUpperCase();
            System.out.println("Introduce el numero de desplazamientos entre 1 y 27");
            desplazamiento=entrada.nextInt();
            entrada.nextLine();
            System.out.println("El texto cifrado es el siguiente: ");
            System.out.println(cifrar(cadena, desplazamiento));
        }
        else if (menu==1){
            System.out.println("Introduce la cadena de texto a descifrar: ");
            cadena=entrada.nextLine().toUpperCase();
            System.out.println("Introduce el numero de desplazamientos con los que se cifró (entre 1 y 27):");
            desplazamiento=entrada.nextInt();
            entrada.nextLine();
            System.out.println("El texto descifrado es el siguiente: ");
            System.out.println(descifrar(cadena, desplazamiento));
        }
        else {
            System.out.println("Opción no válida, debes introducir un cero o un uno");
        }
        
        
    }
    
    public static String cifrar(String cadena, int desplazamiento){
        char caracterAnalizado;
        String cadenaCifrada="";
        for (int i=0; i<cadena.length();i++){
        caracterAnalizado=cadena.charAt(i);
        if(caracterAnalizado!=' ')
        {
            caracterAnalizado=(char)(caracterAnalizado+desplazamiento);
            if (caracterAnalizado>'Z'){
                char correccion=(char)(caracterAnalizado-'Z');
                caracterAnalizado=(char)('A'+correccion);
            }
        }
        cadenaCifrada+=caracterAnalizado;
        
        }
        return cadenaCifrada;
    }
    public static String descifrar (String cadena, int desplazamiento){
        char caracterAnalizado;
        String cadenaDescifrada="";
        for (int i=0; i<cadena.length();i++){
        caracterAnalizado=cadena.charAt(i);
        if(caracterAnalizado!=' ')
        {
            caracterAnalizado=(char)(caracterAnalizado-desplazamiento);
            if (caracterAnalizado<'A'){
                char correccion=(char)('A'-caracterAnalizado);
                caracterAnalizado=(char)('Z'-correccion);
            }
        }
        cadenaDescifrada+=caracterAnalizado;
    }return cadenaDescifrada;
    }
    
}
