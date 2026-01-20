package edu.luis.vidal.actividad2.calculadora.ui;

import edu.luis.vidal.actividad2.calculadora.process.*;

import  java.util.Scanner;
public class CLI {
    public static void showMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("elige una opcion");
        System.out.println("1. suma");
        System.out.println("2. resta");
        System.out.println("3. multiplicacion");
        System.out.println("4. division");
        System.out.println("5. modulo");
        System.out.println("6. potencia");
        System.out.println("7. logaritmo");
        System.out.println("8. raíz");
        System.out.println("9. salir");
        int opcion = scanner.nextInt();
        int op1 =0;
        int op2 =0;

        switch (opcion) {
            case 1:

                System.out.println("Introduce el operando 1");
                op1 = scanner.nextInt();
                System.out.println("Introduce el operando 2");
                op2 = scanner.nextInt();
                System.out.printf("El resultado de la operacion %d %s %d es: %d", op1, "+", op2, Suma.realizarOperacion(op1, op2));
                break;
            case 2:
                System.out.println("Introduce el operando 1");
                op1 = scanner.nextInt();
                System.out.println("Introduce el operando 2");
                op2 = scanner.nextInt();
                System.out.printf("El resultado de la operacion %d %s %d es: %d", op1, "-", op2, Resta.realizarOperacion(op1, op2));
                break;
            case 3:
                System.out.println("Introduce el operando 1");
                op1 = scanner.nextInt();
                System.out.println("Introduce el operando 2");
                op2 = scanner.nextInt();
                System.out.printf("El resultado de la operacion %d %s %d es: %d", op1, "*", op2, Multiplicacion.realizarOperacion(op1, op2));
                break;
            case 4:
                System.out.println("Introduce el operando 1");
                op1 = scanner.nextInt();
                System.out.println("Introduce el operando 2");
                op2 = scanner.nextInt();
                System.out.printf("El resultado de la operacion %d %s %d es: %d", op1, "/", op2, Division.realizarOperacion(op1, op2));
                break;
            case 5:
                System.out.println("Introduce el operando 1");
                op1 = scanner.nextInt();
                System.out.println("Introduce el operando 2");
                op2 = scanner.nextInt();
                System.out.printf("El resultado de la operacion %d %s %d es: %d", op1, "%", op2, Modulo.realizarOperacion(op1, op2));
                break;
            case 6:
                System.out.println("Introduce el operando 1");
                op1 = scanner.nextInt();
                System.out.println("Introduce el operando 2");
                op2 = scanner.nextInt();
                System.out.printf("El resultado de la operacion %d %s %d es: %d", op1, "^", op2, Potencia.realizarOperacion(op1, op2));
                break;
            case 7:
                System.out.println("Introduce la base");
                op1 = scanner.nextInt();
                System.out.println("Introduce el argumento");
                op2 = scanner.nextInt();
                System.out.printf("El resultado de la operacion %d %s %d es: %d", op1, "log", op2, Logaritmo.realizarOperacion(op1, op2));
                break;
            case 8:
                System.out.println("Introduce el radical");
                op1 = scanner.nextInt();
                System.out.println("Introduce el radicando");
                op2 = scanner.nextInt();
                System.out.printf("El resultado de la operacion %d %s %d es: %d", op1, "√", op2, Raiz.realizarOperacion(op1, op2));
                break;
            case 9:
                System.out.println("Adios");
                break;
            default:
                System.out.println("Esa opcion no existe, elige una opcion valida");
        }

    }
}
