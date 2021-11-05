/*Copyright [2021] [Juan Cordero]
  Licensed under the Apache License, Version 2.0 (the "License");
  you may not use this file except in compliance with the License.
  You may obtain a copy of the License at
http://www.apache.org/licenses/LICENSE-2.0
Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.*/

/**
 * Es la clase Principal del programa que procesará una petición
 *
 * @author Juan Cordero
 * @version 1.0 02/11/21
 */
package aplicacion;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args){
        //Ejercicio 49-50
        String nombre= "No vueles como las aves de corral cuando puedes subir como las águilas";

        //1
        String a= nombre.substring(0,2);
        //2
        char ch2 =nombre.charAt(4);
        //3
        int posicion = nombre.indexOf("puedes");
        //4
        String reemplazar = nombre.replaceAll("aves de corral", "gallinas");

        System.out.println("El resultado de coger el 1 y 2 caracter es: " + a);
        System.out.println("El quinto caracter de la frase es: " + ch2);
        System.out.println("La posicion de la palabra puedes es: " + posicion);
        System.out.println("La frase nueva sería: " + reemplazar);


        //Ejercicio 51
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca una palabra");
        String b = sc.next();
        System.out.println("Introduzca otra palabra");
        String c = sc.next();

        if(b.equalsIgnoreCase(c)){
            System.out.println("Son iguales");
        }else{
            System.out.println("Son diferentes");
        }
    }
}