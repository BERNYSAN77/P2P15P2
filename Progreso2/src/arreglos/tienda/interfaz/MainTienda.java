package arreglos.tienda.interfaz;

import arreglos.tienda.modelo.Juego;

import java.util.Scanner;

public class MainTienda {
    static void main() {
        Scanner sc = new Scanner(System.in);
        String nombre;
        String categoria;
        int tamanio;
        double precio;
        int licenciasDisponibles;
        int opc;
        int cantidad;
        do{
            menu();
            opc = Integer.parseInt(sc.nextLine());
            switch (opc){
                case 1:{

                }break;
                case 2:{

                }break;
                case 3:{

                }break;
                case 4:{

                }break;
                case 5:{

                }break;
                case 6:{

                }break;
                case 7:{

                }break;
                default:
                    System.out.println("No es una opción válida");
            }

        }while(opc != 7);
    }
    public static void menu(){
        System.out.println("**********AppStore Udla**********");
        System.out.println("1. Ingresar Juego");
        System.out.println("2. Mostrar juegos");
        System.out.println("3. Buscar juego");
        System.out.println("4. Comprar");
        System.out.println("5. Vender");
        System.out.println("6. Juego más vendido");
        System.out.println("7. Salir");
        System.out.print("Ingrese una opcion: ");
    }
}
