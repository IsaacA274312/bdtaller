import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class MenuCRUD {

    // Datos de conexión a la base de datos
    private static final String URL = "jdbc:mysql://localhost:3306/Dbtaller";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD)) {
            System.out.println("Conexión exitosa a la base de datos.");

            Scanner scanner = new Scanner(System.in);
            int opcion;

            do {
                System.out.println("\n--- Menú CRUD ---");
                System.out.println("1. Líneas de Investigación");
                System.out.println("2. Tipos de Proyecto");
                System.out.println("3. Profesores");
                System.out.println("4. Proyectos");
                System.out.println("5. Alumnos");
                System.out.println("6. Revisores");
                System.out.println("7. Evaluaciones");
                System.out.println("8. Áreas de Conocimiento");
                System.out.println("9. Rúbricas");
                System.out.println("0. Salir");
                System.out.print("Seleccione una opción: ");
                opcion = scanner.nextInt();
                scanner.nextLine(); // Limpiar el buffer

                switch (opcion) {
                    case 1:
                        menuLineaInvestigacion(connection, scanner);
                        break;
                    case 2:
                        menuTipoProyecto(connection, scanner);
                        break;
                    case 3:
                        menuProfesor(connection, scanner);
                        break;
                    case 4:
                        // menuProyecto(connection, scanner);
                        break;
                    case 5:
                        // menuAlumno(connection, scanner);
                        break;
                    case 6:
                        // menuRevisor(connection, scanner);
                        break;
                    case 7:
                        // menuEvaluacion(connection, scanner);
                        break;
                    case 8:
                        // menuAreaConocimiento(connection, scanner);
                        break;
                    case 9:
                        // menuRubrica(connection, scanner);
                        break;
                    case 0:
                        // System.out.println("Saliendo...");
                        break;
                    default:
                        System.out.println("Opción no válida.");
                }
            } while (opcion != 0);

        } catch (SQLException e) {
            System.out.println("Error al conectar a la base de datos: " + e.getMessage());
        }
    }

    // Menú para Líneas de Investigación
    private static void menuLineaInvestigacion(Connection connection, Scanner scanner) throws SQLException {
        System.out.println("\n--- Líneas de Investigación ---");
        System.out.println("1. Crear");
        System.out.println("2. Leer");
        System.out.println("3. Actualizar");
        System.out.println("4. Eliminar");
        System.out.print("Seleccione una opción: ");
        int opcion = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer

        switch (opcion) {
            case 1:
                System.out.print("Ingrese el nombre de la línea de investigación: ");
                String nombreLinea = scanner.nextLine();
                CRUDinvestigacion.insertarLineaInvestigacion(connection, nombreLinea);
                System.out.println("Línea de investigación creada.");
                break;
            case 2:
                System.out.println("Líneas de investigación:");
                List<String> lineas = CRUDinvestigacion.obtenerLineasInvestigacion(connection);
                for (String linea : lineas) {
                    System.out.println(linea);
                }
                break;
            case 3:
                System.out.print("Ingrese la clave de la línea de investigación a actualizar: ");
                int claveLinea = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Ingrese el nuevo nombre: ");
                String nuevoNombre = scanner.nextLine();
                CRUDinvestigacion.actualizarLineaInvestigacion(connection, claveLinea, nuevoNombre);
                System.out.println("Línea de investigación actualizada.");
                break;
            case 4:
                System.out.print("Ingrese la clave de la línea de investigación a eliminar: ");
                claveLinea = scanner.nextInt();
                CRUDinvestigacion.eliminarLineaInvestigacion(connection, claveLinea);
                System.out.println("Línea de investigación eliminada.");
                break;
            default:
                System.out.println("Opción no válida.");
        }
    }

    // Menú para Tipos de Proyecto
    private static void menuTipoProyecto(Connection connection, Scanner scanner) throws SQLException {
        System.out.println("\n--- Tipos de Proyecto ---");
        System.out.println("1. Crear");
        System.out.println("2. Leer");
        System.out.println("3. Actualizar");
        System.out.println("4. Eliminar");
        System.out.print("Seleccione una opción: ");
        int opcion = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer

        switch (opcion) {
            case 1:
                System.out.print("Ingrese el nombre del tipo de proyecto: ");
                String nombreTipo = scanner.nextLine();
                CRUDtipoproyecto.insertarTipoProyecto(connection, nombreTipo);
                System.out.println("Tipo de proyecto creado.");
                break;
            case 2:
                System.out.println("Tipos de proyecto:");
                List<String> tipos = CRUDtipoproyecto.obtenerTiposProyecto(connection);
                for (String tipo : tipos) {
                    System.out.println(tipo);
                }
                break;
            case 3:
                System.out.print("Ingrese el ID del tipo de proyecto a actualizar: ");
                int tipoProyectoID = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Ingrese el nuevo nombre: ");
                String nuevoNombre = scanner.nextLine();
                CRUDtipoproyecto.actualizarTipoProyecto(connection, tipoProyectoID, nuevoNombre);
                System.out.println("Tipo de proyecto actualizado.");
                break;
            case 4:
                System.out.print("Ingrese el ID del tipo de proyecto a eliminar: ");
                tipoProyectoID = scanner.nextInt();
                CRUDtipoproyecto.eliminarTipoProyecto(connection, tipoProyectoID);
                System.out.println("Tipo de proyecto eliminado.");
                break;
            default:
                System.out.println("Opción no válida.");
        }
    }

    // Menú para Profesores
    private static void menuProfesor(Connection connection, Scanner scanner) throws SQLException {
        System.out.println("\n--- Profesores ---");
        System.out.println("1. Crear");
        System.out.println("2. Leer");
        System.out.println("3. Actualizar");
        System.out.println("4. Eliminar");
        System.out.print("Seleccione una opción: ");
        int opcion = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer

        switch (opcion) {
            case 1:
                System.out.print("Ingrese el nombre del profesor: ");
                String nombrePro = scanner.nextLine();
                CRUDProfesor.insertarProfesor(connection, nombrePro);
                System.out.println("Profesor creado.");
                break;
            case 2:
                System.out.println("Profesores:");
                List<String> profesores = CRUDProfesor.obtenerProfesores(connection);
                for (String profesor : profesores) {
                    System.out.println(profesor);
                }
                break;
            case 3:
                System.out.print("Ingrese la clave del profesor a actualizar: ");
                int claveProfesor = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Ingrese el nuevo nombre: ");
                String nuevoNombre = scanner.nextLine();
                CRUDProfesor.actualizarProfesor(connection, claveProfesor, nuevoNombre);
                System.out.println("Profesor actualizado.");
                break;
            case 4:
                System.out.print("Ingrese la clave del profesor a eliminar: ");
                claveProfesor = scanner.nextInt();
                CRUDProfesor.eliminarProfesor(connection, claveProfesor);
                System.out.println("Profesor eliminado.");
                break;
            default:
                System.out.println("Opción no válida.");
        }
    }
}