package aplicacion;

import personal.Personal;

/**
 *
 * @author jaimg
 */
public class Academia {

    public int numReferencia;
    public static int referencia=2020;
    private String nombre;
    private float nota;
    private Personal alum = new Personal();

    public Academia() {
    }

    public Academia(String nome, float nota, Personal alum) {
        numReferencia = referencia;
        this.nombre = nome;
        this.nota = nota;
        this.alum=alum;
        referencia++;
    }

    public int getNumReferencia() {
        return numReferencia;
    }

    public void setNumReferencia(int numReferencia) {
        this.numReferencia = numReferencia;
    }

    public static int getReferencia() {
        return referencia;
    }

    public static void setReferencia(int referencia) {
        Academia.referencia = referencia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    public Personal getAlum() {
        return alum;
    }

    public void setAlum(Personal alum) {
        this.alum = alum;
    }
    
    @Override
    public String toString() {
        return "Academia:" + " con numReferencia: " + numReferencia + ", de nombre: " + nombre + ", con una nota de: " + nota;
    }

}







