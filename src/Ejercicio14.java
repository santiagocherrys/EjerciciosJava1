import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio14 {

        static ArrayList<String[]> empleados = new ArrayList<>();

        public static void main(String[] args){
            //Ejercicio 14
            boolean ciclo = true;
            int cont = 0;
            Scanner scanner = new Scanner(System.in);

            while(ciclo) {
                switch (menu()) {
                    case "1":
                        //Ingresar estudiante con promedio
                        String[] empleado ={"Nombre_Empleado", "Puesto_Empleado", "Salario_Empleado"};
                        System.out.println("Ingrese nombre del empleado");
                        empleado[0] = scanner.nextLine();
                        System.out.println("Ingrese puesto del empleado");
                        empleado[1] = scanner.nextLine();
                        System.out.println("Ingrese salario del empleado");
                        empleado[2] = scanner.nextLine();

                        break;
                    case "2":
                        //Buscar por nombre
                        System.out.println("Ingrese el nombre del estudiante");
                        String nombre = scanner.nextLine();
                        for(String[] student : estudiantes){
                            if(student[0].equals(nombre)){
                                System.out.println("El promedio de " + nombre + " es: " + student[1]);
                                break;
                            }
                        }
                        break;
                    case "3":
                        //Mostrar todos los estudiantes
                        showEstudiantes();
                        break;
                    case "4":
                        //salir
                        System.out.println("Se sale del programa ");
                        ciclo =  false;
                        break;
                    default:
                        System.out.println("Opcion no valida");
                }
            }

        }

        public static String menu(){
            System.out.println("--------------------------------------");
            System.out.println("|                 MENU               |");
            System.out.println("|1. Ingresar estudiante con promedio |");
            System.out.println("|2. Buscar por nombre                |");
            System.out.println("|3. Mostrar estudiantes              |");
            System.out.println("|4. Salir                            |");
            System.out.println("--------------------------------------");

            Scanner scanner = new Scanner(System.in);

            System.out.println("Entry option");
            return scanner.nextLine();

        }

        public static void showEstudiantes(){
            for (String[] estudiante : estudiantes){
                System.out.println("NOMBRE ESTUDIANTE: " + estudiante[0] + " PROMEDIO: " + estudiante[1] );
            }
        }
    }
}
