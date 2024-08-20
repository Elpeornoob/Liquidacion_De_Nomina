package liquidacionNomina.empleado;

public class Empleado {
    private String nombre;
    private double salario;
    private boolean suscrito_a_fondo_empleados;
    private String id;
    
    public Empleado(String id, String nombre, double salario, boolean suscrito_a_fondo_empleados) {
        this.nombre = nombre;
        this.salario = salario;
        this.suscrito_a_fondo_empleados = suscrito_a_fondo_empleados;
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public boolean isSuscrito_a_fondo_empleados() {
        return suscrito_a_fondo_empleados;
    }

    public void setSuscrito_a_fondo_empleados(boolean suscrito_a_fondo_empleados) {
        this.suscrito_a_fondo_empleados = suscrito_a_fondo_empleados;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
 
}
