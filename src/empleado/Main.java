/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package empleado;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Ingrese el nombre del empleado: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese el salario base del empleado: ");
        double salario = scanner.nextDouble();

        System.out.print("Ingrese el genero del empleado (Masculino/Femenino): ");
        String genero = scanner.next();

        System.out.print("Ingrese la edad del empleado: ");
        int edad = scanner.nextInt();

        System.out.print("Ingrese la antiguedad del empleado (en años): ");
        int antiguedad = scanner.nextInt();

        
        Bonificacion empleado = new Bonificacion(nombre, salario, genero, edad, antiguedad);

        
        double salarioFinal = empleado.calcularSalarioFinal();
        System.out.println("\n--- Detalles del Empleado ---");
        System.out.println("Nombre del empleado: " + empleado.nombre);
        System.out.println("Salario base: " + empleado.salario);
        System.out.println("Antiguedad: " + empleado.antiguedad + " años");
        System.out.println("Salario final con bonificacion: " + salarioFinal);

        scanner.close();
    }
}

class Empleado {
    String nombre;
    double salario;
    String genero;
    int edad;

    public Empleado(String nombre, double salario, String genero, int edad) {
        this.nombre = nombre;
        this.salario = salario;
        this.genero = genero;
        this.edad = edad;
    }
}

class Bonificacion extends Empleado {
    int antiguedad;

    public Bonificacion(String nombre, double salario, String genero, int edad, int antiguedad) {
        super(nombre, salario, genero, edad);
        this.antiguedad = antiguedad;
    }

    public double calcularSalarioFinal() {
        if (salario > 45000) {
            return salario * 1.20; 
        } else if (salario > 25000 && antiguedad > 7) {
            return salario * 1.15; 
        } else if (salario > 18900 && antiguedad > 5) {
            return salario * 1.10; 
        } else {
            return salario; 
        }
    }
}