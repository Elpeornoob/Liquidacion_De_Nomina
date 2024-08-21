package liquidacionNomina.liquidacion;

import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import bryan_estructuras.linkedlist.doubly.LinkedList;
import bryan_estructuras.util.iterator.Iterator;
import liquidacionNomina.empleado.Empleado;

public class liquidacionEmpleado {
    // Constantes para los porcentajes de deducciones
    private static final double PORCENTAJE_SALUD = 0.08;
    private static final double PORCENTAJE_PENSION = 0.08;
    private static final double RETENCION_FUENTE = 0.05;
    private static final double DESCUENTO_FONDO_EMPLEADOS = 0.03;
    private static final double SMMLV = 1300000;

    // Calcula el salario neto de un empleado
    public static double calcularSalarioNeto(Empleado empleado) {
        double salario_neto = empleado.getSalario();
        if (empleado.isSuscrito_a_fondo_empleados()) {
            calcularSalarioConDescuentoFE(salario_neto); // Aplica descuento de fondo de empleados
        }
        salario_neto -= salario_neto * PORCENTAJE_SALUD; // Aplica descuento de salud
        salario_neto -= salario_neto * PORCENTAJE_PENSION; // Aplica descuento de pensión
        if (salario_neto > (SMMLV * 4)) {
            salario_neto -= salario_neto * RETENCION_FUENTE; // Aplica retención en la fuente si el salario es mayor a 4 SMMLV
        }
        return salario_neto;
    }

    // Aplica descuento de fondo de empleados al salario
    public static double calcularSalarioConDescuentoFE(double salario) {
        return salario - (salario * DESCUENTO_FONDO_EMPLEADOS);
    }

    // Genera un reporte de liquidación de nómina para todos los empleados
    public static String mostrarReporte(LinkedList<Empleado> empleados) {
        StringBuilder reporte = new StringBuilder();
        reporte.append("Reporte de Liquidación de Nómina:\n");
        reporte.append("=================================\n");
        Iterator<Empleado> it = empleados.iterator();
        while (it.hasNext()) {
            Empleado empleado = it.next();
            double salarioBruto = empleado.getSalario();
            double salarioNeto = calcularSalarioNeto(empleado);

            double descuentoSalud = salarioBruto * PORCENTAJE_SALUD; // Calcula descuento de salud
            double descuentoPension = salarioBruto * PORCENTAJE_PENSION; // Calcula descuento de pensión
            double salarioDespuesDescuentos = salarioBruto - descuentoSalud - descuentoPension;
            double descuentoRetencion = 0;
            if (salarioDespuesDescuentos > 4 * SMMLV) {
                descuentoRetencion = salarioDespuesDescuentos * RETENCION_FUENTE; // Calcula retención en la fuente si aplica
            }
            double descuentoFondoEmpleados = empleado.isSuscrito_a_fondo_empleados()
                    ? salarioBruto * DESCUENTO_FONDO_EMPLEADOS
                    : 0; // Calcula descuento de fondo de empleados si aplica

            // Construye el reporte con los detalles de cada empleado
            reporte.append("Empleado: ").append(empleado.getNombre()).append("\n");
            reporte.append("Salario Bruto: $").append(salarioBruto).append("\n");
            reporte.append("Descuento Salud: $").append(descuentoSalud).append("\n");
            reporte.append("Descuento Pensión: $").append(descuentoPension).append("\n");
            if (descuentoRetencion > 0) {
                reporte.append("Descuento Retención en la Fuente: $").append(descuentoRetencion).append("\n");
            }
            if (empleado.isSuscrito_a_fondo_empleados()) {
                reporte.append("Descuento Fondo de Empleados: $").append(descuentoFondoEmpleados).append("\n");
            }
            reporte.append("Salario Neto: $").append(salarioNeto).append("\n");
            reporte.append("---------------------------------\n");
        }
        return reporte.toString();
    }

    // Muestra el reporte de nómina en una ventana gráfica
    public static void mostrarListaReportes(LinkedList<Empleado> empleados) {
        String reporte = mostrarReporte(empleados);
        JTextArea textArea = new JTextArea(reporte.toString());
        textArea.setColumns(40);
        textArea.setRows(20);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        textArea.setEditable(false);

        JScrollPane scrollPane = new JScrollPane(textArea);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

        JOptionPane.showMessageDialog(null, scrollPane, "Reporte de Nómina", JOptionPane.INFORMATION_MESSAGE);
    }
}
