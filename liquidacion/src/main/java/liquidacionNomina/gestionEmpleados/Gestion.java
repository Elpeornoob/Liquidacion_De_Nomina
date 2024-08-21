package liquidacionNomina.gestionEmpleados;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import bryan_estructuras.linkedlist.doubly.LinkedList;
import liquidacionNomina.empleado.Empleado;
import liquidacionNomina.liquidacion.liquidacionEmpleado;

public class Gestion {
    public static void main(String[] args) {
        LinkedList<Empleado> empleados = new LinkedList<>();
        
        empleados.add(new Empleado("00001", "Juan Perez", 5_000_000, true));
        empleados.add(new Empleado("00002", "Ana Gomez", 3_000_000, false));
        empleados.add(new Empleado("00003", "Carlos Ruiz", 6_500_000, true));
        empleados.add(new Empleado("00004", "Laura Hernandez", 2_800_000, false));
        empleados.add(new Empleado("00005", "Santiago Martinez", 4_200_000, true));
        empleados.add(new Empleado("00006", "Maria Fernanda Lopez", 3_100_000, true));
        empleados.add(new Empleado("00007", "Luis Rodriguez", 5_800_000, false));
        empleados.add(new Empleado("00008", "Daniela Torres", 4_000_000, true));
        empleados.add(new Empleado("00009", "Felipe Jimenez", 3_900_000, false));
        empleados.add(new Empleado("00010", "Camila Morales", 2_500_000, true));
        empleados.add(new Empleado("00011", "Julian Castro", 7_200_000, false));
        empleados.add(new Empleado("00012", "Paula Gutierrez", 3_400_000, true));
        empleados.add(new Empleado("00013", "Andres Blanco", 6_000_000, true));
        empleados.add(new Empleado("00014", "Natalia Rios", 3_700_000, false));
        empleados.add(new Empleado("00015", "Miguel Perez", 2_900_000, true));
        empleados.add(new Empleado("00016", "Sofia Diaz", 4_800_000, false));
        empleados.add(new Empleado("00017", "Oscar Cardenas", 5_300_000, true));
        empleados.add(new Empleado("00018", "Valentina Garzon", 3_000_000, true));
        empleados.add(new Empleado("00019", "Jorge Romero", 6_700_000, false));
        empleados.add(new Empleado("00020", "Carolina Ortiz", 2_600_000, true));
        empleados.add(new Empleado("00021", "Alejandro Suarez", 5_500_000, true));
        empleados.add(new Empleado("00022", "Viviana Trujillo", 3_300_000, false));
        empleados.add(new Empleado("00023", "Esteban Garcia", 4_900_000, true));
        empleados.add(new Empleado("00024", "Luisa Velasquez", 2_400_000, false));
        empleados.add(new Empleado("00025", "Fernando Salazar", 5_200_000, true));
        empleados.add(new Empleado("00026", "Gabriela Cardenas", 3_600_000, false));
        empleados.add(new Empleado("00027", "Ivan Mendoza", 6_300_000, true));
        empleados.add(new Empleado("00028", "Tatiana Pineda", 3_800_000, true));
        empleados.add(new Empleado("00029", "Ricardo Vargas", 4_500_000, false));
        empleados.add(new Empleado("00030", "Alejandra Lopez", 2_700_000, true));
        empleados.add(new Empleado("00031", "Sebastian Leon", 5_900_000, true));
        empleados.add(new Empleado("00032", "Diana Martinez", 3_200_000, false));
        empleados.add(new Empleado("00033", "Raul Garcia", 4_600_000, true));
        empleados.add(new Empleado("00034", "Isabella Reyes", 2_300_000, true));
        empleados.add(new Empleado("00035", "Mauricio Sanchez", 5_400_000, false));
        empleados.add(new Empleado("00036", "Carmen Vega", 3_500_000, true));
        empleados.add(new Empleado("00037", "Andres Muñoz", 6_100_000, false));
        empleados.add(new Empleado("00038", "Margarita Ortiz", 2_900_000, true));
        empleados.add(new Empleado("00039", "Gustavo Alvarez", 4_100_000, true));
        empleados.add(new Empleado("00040", "Natalia Guerrero", 3_700_000, false));
        empleados.add(new Empleado("00041", "Camilo Castillo", 5_600_000, true));
        empleados.add(new Empleado("00042", "Lorena Romero", 2_600_000, true));
        empleados.add(new Empleado("00043", "Diego Ramirez", 4_300_000, false));
        empleados.add(new Empleado("00044", "Adriana Castro", 3_400_000, true));
        empleados.add(new Empleado("00045", "Javier Molina", 6_800_000, true));
        empleados.add(new Empleado("00046", "Carolina Restrepo", 2_500_000, false));
        empleados.add(new Empleado("00047", "Carlos Vallejo", 4_700_000, true));
        empleados.add(new Empleado("00048", "Elena Prieto", 3_800_000, true));
        empleados.add(new Empleado("00049", "Juan Valdez", 2_900_000, false));

        JFrame frame = new JFrame("Liquidación de Nómina");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        JButton btnMostrarReporte = new JButton("Mosstrar reporte de liquidacion");
        btnMostrarReporte.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                liquidacionEmpleado.mostrarListaReportes(empleados);
            }
        });

        // Añadir botón a la ventana
        frame.getContentPane().add(btnMostrarReporte);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
