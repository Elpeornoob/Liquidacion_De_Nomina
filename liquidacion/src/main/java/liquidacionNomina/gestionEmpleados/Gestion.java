package liquidacionNomina.gestionEmpleados;

import bryan_estructuras.linkedlist.doubly.LinkedList;
import liquidacionNomina.empleado.Empleado;
import liquidacionNomina.liquidacion.liquidacionEmpleado;

public class Gestion {
    public static void main(String[] args) {
        LinkedList<Empleado> empleados = new LinkedList<>();
        empleados.add(new Empleado("Juan Perez", 5_000_000, true));
        empleados.add(new Empleado("Ana Gomez", 3_000_000, false));
        empleados.add(new Empleado("Carlos Ruiz", 6_500_000, true));
        empleados.add(new Empleado("Laura Hernandez", 2_800_000, false));
        empleados.add(new Empleado("Santiago Martinez", 4_200_000, true));
        empleados.add(new Empleado("Maria Fernanda Lopez", 3_100_000, true));
        empleados.add(new Empleado("Luis Rodriguez", 5_800_000, false));
        empleados.add(new Empleado("Daniela Torres", 4_000_000, true));
        empleados.add(new Empleado("Felipe Jimenez", 3_900_000, false));
        empleados.add(new Empleado("Camila Morales", 2_500_000, true));
        empleados.add(new Empleado("Julian Castro", 7_200_000, false));
        empleados.add(new Empleado("Paula Gutierrez", 3_400_000, true));
        empleados.add(new Empleado("Andres Blanco", 6_000_000, true));
        empleados.add(new Empleado("Natalia Rios", 3_700_000, false));
        empleados.add(new Empleado("Miguel Perez", 2_900_000, true));
        empleados.add(new Empleado("Sofia Diaz", 4_800_000, false));
        empleados.add(new Empleado("Oscar Cardenas", 5_300_000, true));
        empleados.add(new Empleado("Valentina Garzon", 3_000_000, true));
        empleados.add(new Empleado("Jorge Romero", 6_700_000, false));
        empleados.add(new Empleado("Carolina Ortiz", 2_600_000, true));
        empleados.add(new Empleado("Alejandro Suarez", 5_500_000, true));
        empleados.add(new Empleado("Viviana Trujillo", 3_300_000, false));
        empleados.add(new Empleado("Esteban Garcia", 4_900_000, true));
        empleados.add(new Empleado("Luisa Velasquez", 2_400_000, false));
        empleados.add(new Empleado("Fernando Salazar", 5_200_000, true));
        empleados.add(new Empleado("Gabriela Cardenas", 3_600_000, false));
        empleados.add(new Empleado("Ivan Mendoza", 6_300_000, true));
        empleados.add(new Empleado("Tatiana Pineda", 3_800_000, true));
        empleados.add(new Empleado("Ricardo Vargas", 4_500_000, false));
        empleados.add(new Empleado("Alejandra Lopez", 2_700_000, true));
        empleados.add(new Empleado("Sebastian Leon", 5_900_000, true));
        empleados.add(new Empleado("Diana Martinez", 3_200_000, false));
        empleados.add(new Empleado("Raul Garcia", 4_600_000, true));
        empleados.add(new Empleado("Isabella Reyes", 2_300_000, true));
        empleados.add(new Empleado("Mauricio Sanchez", 5_400_000, false));
        empleados.add(new Empleado("Carmen Vega", 3_500_000, true));
        empleados.add(new Empleado("Andres Muñoz", 6_100_000, false));
        empleados.add(new Empleado("Margarita Ortiz", 2_900_000, true));
        empleados.add(new Empleado("Gustavo Alvarez", 4_100_000, true));
        empleados.add(new Empleado("Natalia Guerrero", 3_700_000, false));
        empleados.add(new Empleado("Camilo Castillo", 5_600_000, true));
        empleados.add(new Empleado("Lorena Romero", 2_600_000, true));
        empleados.add(new Empleado("Diego Ramirez", 4_300_000, false));
        empleados.add(new Empleado("Adriana Castro", 3_400_000, true));
        empleados.add(new Empleado("Javier Molina", 6_800_000, true));
        empleados.add(new Empleado("Carolina Restrepo", 2_500_000, false));
        empleados.add(new Empleado("Carlos Vallejo", 4_700_000, true));
        empleados.add(new Empleado("Elena Prieto", 3_800_000, true));

        liquidacionEmpleado.mostrarReporte(empleados);
    }
}
