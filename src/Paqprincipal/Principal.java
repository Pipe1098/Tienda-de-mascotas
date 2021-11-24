package Paqprincipal;

import java.util.Scanner;
public class Principal {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            Gestion store = new Gestion(100);
            Atencion at= new Atencion();

            System.out.print ("Por favor, asigne un nombre a su tienda de mascotas:");
            store.setName(input.nextLine());
            System.out.println ("¡Hola!" + store.getName () + "\t ¡Bienvenido a usar el sistema de administración de la tienda de mascotas!");

            String choice = "1";

            while(!choice.equals("0")) {
                System.out.println ("========== Sistema de gestión de la tienda de mascotas ==========");
                System.out.println ("1. Verificar inventario \n" + "2. Agregar mascotas \n" + "3. Vender mascotas \n" + "4. Verificar ganancias \n" + "5. Registros de ventas \n" + "6. Atencion \n "+"0. Salir del programa");
                System.out.println("===================================");
                System.out.print ("Introduzca su elección:");
                choice = input.next();

                switch(choice) {
                    case "1":
                        store.print();
                        System.out.println ("¿Qué otro servicio necesita?");
                        break;

                    case "2":
                        String choice1;
                        do {
                            store.add();
                            System.out.println ("¿Desea continuar agregando? \n" + "1. Sí 2. No");
                            choice1 = input.next();
                        } while(choice1.equals("1"));
                        System.out.println ("¿Qué otro servicio necesita?");
                        break;

                    case "3":
                        String choice2;
                        do {
                            store.sell();
                            System.out.println ("¿Quieres seguir vendiendo? \n" + "1. Sí 2. No");
                            choice2 = input.next();
                        } while(choice2.equals("1"));
                        System.out.println ("¿Qué otro servicio necesita?");
                        break;

                    case "4":
                        store.profitNote();
                        System.out.println ("¿Qué otro servicio necesita?");
                        break;

                    case "5":
                        store.note();
                        System.out.println ("¿Qué otro servicio necesita?");
                        break;

                    case "6":
                        int choice3,c=0;

                        System.out.println (" la mascota esta enferma \n"+ "1. Sí  2. No");
                        choice3=input.nextInt();
                        if (choice3 == 1) {
                            at.Atencio(1);
                        }
                        else if (choice3 == 2) {
                                at.Atencio(2);
                            }

                        else{
                                    break;
                                }

                        break;
                    case "0":
                        System.out.println ("Gracias por su uso y bienvenido a volver la próxima vez! \n" + "********** Pulse cualquier tecla para finalizar el programa ******* *** ");
                        break;

                    default:
                        System.out.println ("Entrada incorrecta, vuelva a introducirla");
                        break;
                }

            }
        }


}
