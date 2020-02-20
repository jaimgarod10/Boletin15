package personal;

/**
 *
 * @author jaimg
 */
public class Personal {
    private String telefono;
    private String correo;

    public Personal() {
    }

    public Personal(String telefono, String correo) {
        this.telefono = telefono;
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String toString() {
        return  ("El numero de telefono es: " + telefono + " y el ncorreo es: " + correo);
    }
}








