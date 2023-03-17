/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
@author asier

 */



import java.util.Scanner;
public class calculadora {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int num1 = getInt();
        int num2 = getInt();
        char operation = getOperation();
        int result = calc(num1,num2,operation);
        System.out.println("El resultado de la operación: "+result);
    }
    
    /**
 * Te hace introducir un numero y comprueba de que sea un numero si no los es tendras que introducirlo otra vez
 * 
 * @return num */
    public static int getInt(){
        System.out.println("Introduzca un número:");
        int num;
        if(scanner.hasNextInt()){
            num = scanner.nextInt();
        } else {
            System.out.println("Te has equivocado al introducir el número. Inténtalo de nuevo.");
            scanner.next();//recursividad
            num = getInt();
        }
        return num;
    }
    /**
 * Te hace introducir el signo que necesitas para hacer la operacion
 * 
 * @return operation */
    public static char getOperation(){
        System.out.println("Introduzca la operación:");
        char operation;
        if(scanner.hasNext()){
            operation = scanner.next().charAt(0);
        } else {
            System.out.println("Ha cometido un error al entrar en la operación. Inténtalo de nuevo.");
            scanner.next();//recursividad
            operation = getOperation();
        }
        return operation;
    }
 /**
 * Metodo que calcula los numeros 
 * 
 * @return result
 * @param operation signo que realizara la operacion
 * @param num segundo numero introducido
 * @param num1 primer numero introducido*/

    public static int calc(int num1, int num2, char operation){
        int result;
        switch (operation){
            case '+':
                result = num1+num2;
                break;
            case '-':
                result = num1-num2;
                break;
            case '*':
                result = num1*num2;
                break;
            case '/':
                result = num1/num2;
                break;
            default:
                System.out.println("La operación no se reconoce. Repite la entrada.");
                result = calc(num1, num2, getOperation());
        }
        return result;
    }
}