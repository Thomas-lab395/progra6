/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empleado;


import java.util.Scanner;

public class libro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Ingrese el titulo del libro: ");
        String titulo = scanner.nextLine();

        System.out.print("Ingrese el autor del libro: ");
        String autor = scanner.nextLine();

        System.out.print("Ingrese el ISBN del libro: ");
        String ISBN = scanner.nextLine();

        System.out.print("Ingrese el precio del libro: ");
        double precio = scanner.nextDouble();
        scanner.nextLine();

        
        System.out.println("\n--- Detalles del libro ---");
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("ISBN: " + ISBN);
        System.out.println("Precio: " + precio);

        
        System.out.print("\nEl cliente es mayor de edad? (Si/No): ");
        String respuesta = scanner.nextLine().trim().toLowerCase();

       
        boolean mayorDeEdad = respuesta.equals("si");

        
        double precioFinal;
        if (mayorDeEdad) {
            precioFinal = precio * 0.75; 
        } else {
            precioFinal = precio * 0.90; 
        }

        System.out.println("Precio final con descuento: " + precioFinal);
    }
}