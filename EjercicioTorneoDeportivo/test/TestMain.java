package test;

import java.util.Scanner;

import clases.Torneo;

public class TestMain {
    public static void main(String[] args) {
        Torneo torneo = new Torneo();
        Scanner sc = new Scanner(System.in);
        int opcion;

        do{
            System.out.println("\n ....:::: Menú del Torneo Deportivo Universitario ::::.... ");
            System.out.println("1. Crear jugador ");
            System.out.println("2. Mostrar jugadores por deporte ");
            System.out.println("3. Contar jugadores en cada disciplina ");
            System.out.println("4. Fusionar equipos ");
            System.out.println("5. Ver jugadores en común ");
            System.out.println("6. Transferir un jugador de un deporte a otro ");
            System.out.println("7. Mostrar jugadores ordenados por nombre ");
            System.out.println("8. Mostrar jugadores en orden de inscripción ");
            System.out.println("9. Mostrar ranking de jugadores por ID ");
            System.out.println("10. Salir ");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("ID del Jugador ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Nombre del Jugador ");
                    String nombre = sc.nextLine();
                    System.out.print("Disciplina (Futbol/Basquetbol/Voleibol): ");
                    String deporte = sc.nextLine();
                    if (torneo.registrarJugador(id, nombre, deporte)) {
                        System.out.println("Jugador registrado con éxito.");
                    }else{
                        System.out.println("Jugador ya registrado.");
                    }
                    break;
                case 2:
                    System.out.print("Disciplina (futbol/basquetbol/voleibol): ");
                    String deporteMostrar = sc.nextLine();
                    System.out.print("Tipo de Set (HashSet): ");
                    String tipoSet = sc.nextLine();
                    torneo.mostrarJugadores(deporteMostrar, tipoSet);
                    break;
                case 3:
                    torneo.contarJugadores();
                    break;
                case 4:
                    System.out.print(" Primera disciplina a fusionar: ");
                    String d1 = sc.nextLine().toLowerCase();
                    System.out.print(" Segunda disciplina a fusionar: ");
                    String d2 = sc.nextLine().toLowerCase();
                    torneo.fusionarEquipos(d1, d2);
                    break;
                case 5:
                    System.out.print("Primera disciplina: ");
                    String c1 = sc.nextLine().toLowerCase();
                    System.out.print("Segunda disciplina: ");
                    String c2 = sc.nextLine().toLowerCase();
                    torneo.jugadoresComunes(c1, c2);
                    break;
                case 6:
                    System.out.print("ID del jugador a transferir: ");
                    int idTransfer = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Nombre del jugador: ");
                    String nombreTransfer = sc.nextLine();
                    System.out.print("Deporte origen: ");
                    String deporteOrigen = sc.nextLine();
                    System.out.print("Deporte destino: ");
                    String deporteDestino = sc.nextLine();
                    torneo.transferirJugador(idTransfer, nombreTransfer, deporteOrigen, deporteDestino);
                    break;
                case 7:
                    System.out.println("Jugadores ordenados por nombre:");
                    torneo.mostrarOrdenadosPorNombre();
                    break;
                case 8:
                    System.out.println("Jugadores en orden de inscripción:");
                    torneo.mostrarPorOrdenInscripcion();
                    break;
                case 9:
                    System.out.println("Ranking de jugadores por ID:");
                    torneo.mostrarRankingPorId();
                    break;
                case 10:
                    System.out.println("Saliendo del sistema...!!!");
                    break;
                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
                    break;
            }
        } while (opcion != 10);
        sc.close();
    }
}
