package liquidacionNomina.complejidadTemporal;

import bryan_estructuras.linkedlist.doubly.LinkedList;
import bryan_estructuras.util.iterator.Iterator;
import liquidacionNomina.empleado.Empleado;
import liquidacionNomina.liquidacion.liquidacionEmpleado;

public class CalcularComplejad {
    public static void main(String[] args) {
        System.out.println("Complejidad Calcular Salario Neto: " + "\n" + complejidadCalcularSalarioNeto());
        System.out.println("Complejidad Calcular Descuento Fondo Empleados: " + "\n" + complejidadCalcularDescuentoFondoEmpleados());
        System.out.println("Complejidad Calcular Mostrar reporte: " + "\n" + complejidadMostrarReporte());
    }

    public static String complejidadCalcularSalarioNeto(){
        int[] sizes = {10000, 20000, 30000, 40000, 50000, 60000, 70000, 80000, 90000, 100000};

        StringBuilder result = new StringBuilder(); // Usar StringBuilder para eficiencia en concatenación

        for (int size : sizes) {
            LinkedList<Empleado> empleados = new LinkedList<>();
            
            // Agregar empleados con nombres únicos y salarios aleatorios
            for (int i = 0; i < size; i++) {
                // Crear empleados con nombres y salarios aleatorios
                String nombre = "Empleado" + i;
                double salario = (Math.random() * 10_000_000) + 1_000_000; // Salarios entre 1,000,000 y 11,000,000
                boolean suscritoFondo = Math.random() > 0.5; // 50% de probabilidad de estar suscrito al fondo
                empleados.add(new Empleado(String.format("%05d", i + 1), nombre, salario, suscritoFondo));
            }

            // Medir el tiempo de ejecución para el cálculo del salario neto
            long startTime = System.nanoTime();
            Iterator<Empleado> it = empleados.iterator();
            while (it.hasNext()) {
                Empleado empleado = it.next();
                liquidacionEmpleado.calcularSalarioNeto(empleado);
            }
            long endTime = System.nanoTime();
            
            long duration = endTime - startTime;
            result.append("Tiempo de ejecución para ").append(size).append(" empleados: ").append(duration).append(" nanosegundos\n");
        }
        
        return result.toString();
    }

    public static String complejidadCalcularDescuentoFondoEmpleados() {
        int[] sizes = {10000, 20000, 30000, 40000, 50000, 60000, 70000, 80000, 90000, 100000};
    
        StringBuilder result = new StringBuilder(); // Usar StringBuilder para eficiencia en concatenación
        
        for (int size : sizes) {
            LinkedList<Empleado> empleados = new LinkedList<>();
            
            // Agregar empleados con nombres únicos y salarios aleatorios
            for (int i = 0; i < size; i++) {
                // Crear empleados con nombres y salarios aleatorios
                String nombre = "Empleado" + i;
                double salario = (Math.random() * 10_000_000) + 1_000_000; // Salarios entre 1,000,000 y 11,000,000
                boolean suscritoFondo = Math.random() > 0.5; // 50% de probabilidad de estar suscrito al fondo
                empleados.add(new Empleado(String.format("%05d", i + 1), nombre, salario, suscritoFondo));
            }

            // Medir el tiempo de ejecución para calcular el descuento del fondo de empleados
            long startTime = System.nanoTime();
            Iterator<Empleado> it = empleados.iterator();
            while (it.hasNext()) {
                Empleado empleado = it.next();
                if (empleado.isSuscrito_a_fondo_empleados()) {
                    liquidacionEmpleado.calcularSalarioConDescuentoFE(empleado.getSalario());
                }
            }
            long endTime = System.nanoTime();
            
            long duration = endTime - startTime;
            result.append("Tiempo de ejecución para ").append(size).append(" empleados: ").append(duration).append(" nanosegundos\n");
        }
        
        return result.toString();
    }

    public static String complejidadMostrarReporte() {
        int[] sizes = {10000, 20000, 30000, 40000, 50000, 60000, 70000, 80000, 90000, 100000};
    
        StringBuilder result = new StringBuilder(); // Usar StringBuilder para eficiencia en concatenación
    
        for (int size : sizes) {
            LinkedList<Empleado> empleados = new LinkedList<>();
            
            // Agregar empleados con nombres únicos y salarios aleatorios
            for (int i = 0; i < size; i++) {
                // Crear empleados con nombres y salarios aleatorios
                String nombre = "Empleado" + i;
                double salario = (Math.random() * 10_000_000) + 1_000_000; // Salarios entre 1,000,000 y 11,000,000
                boolean suscritoFondo = Math.random() > 0.5; // 50% de probabilidad de estar suscrito al fondo
                empleados.add(new Empleado(String.format("%05d", i + 1), nombre, salario, suscritoFondo));
            }
    
            // Medir el tiempo de ejecución para generar y mostrar el reporte
            long startTime = System.currentTimeMillis();
            liquidacionEmpleado.mostrarReporte(empleados);
            long endTime = System.currentTimeMillis();
            
            long duration = endTime - startTime;
            result.append("Tiempo de ejecución para ").append(size).append(" empleados: ").append(duration).append(" milisegundos\n");
        }
        
        return result.toString();
    }
    
}
