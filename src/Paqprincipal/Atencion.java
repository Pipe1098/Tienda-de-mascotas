package Paqprincipal;

import java.util.Scanner;

public class Atencion {
    int eleccion;

    public  Atencion (){

    }

    public void Atencio(int n) {
        if (n == 1) {
            Scanner IN = new Scanner(System.in);
            String input;
            System.out.println("Ingrese los sintomas de su mascota");
            input = IN.next();
            if (input.equals("fiebre")) {
                System.out.println("su medico asignado es x");
            } else {
                System.out.println("no hay medicos para atender ese sintoma");
            }


        } else if (n == 2) {
            System.out.println("Espera tu turno");
        } else {
            System.out.println("hasta pronto");
        }

    }
}
