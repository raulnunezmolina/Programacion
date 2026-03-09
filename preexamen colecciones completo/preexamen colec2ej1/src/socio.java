public class socio {
    String nombre="";
    String dni="";
    int edad=0;
    String fechaInscripcion="";
    boolean activo=false;

    public socio(boolean activo, String dni, int edad, String fechaInscripcion, String nombre) {
        this.activo = activo;
        this.dni = dni;
        this.edad = edad;
        this.fechaInscripcion = fechaInscripcion;
        this.nombre = nombre;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getFechaInscripcion() {
        return fechaInscripcion;
    }

    public void setFechaInscripcion(String fechaInscripcion) {
        this.fechaInscripcion = fechaInscripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "socio{" +
                "activo=" + activo +
                ", nombre='" + nombre + '\'' +
                ", dni='" + dni + '\'' +
                ", edad=" + edad +
                ", fechaInscripcion='" + fechaInscripcion + '\'' +
                '}';
    }
}
