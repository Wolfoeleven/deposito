package cuentas;

/**
 * Esta clase contiene los atributos y metodos necesarios para gestionar la
 * cuenta bancaria de una persona
 *
 * @author Iván Morán DíazLobo
 * @version 1.0
 */

public class CCuenta {

    /**
     * Métodos get (obtener) y set (establecer) para los atributos de la clase
     */
    /**
     * @return nombre devuelve el nombre del cliente
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre establece el nombre del cliente
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return cuenta devuelve el número de cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * @param cuenta establece el número de cuenta
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * @return saldo devuelve el saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo establece el saldo
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * @return tipoInterés devuelve el tipo de interés
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * @param tipoInterés establece el tipo de interés
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
    /**
     * Se declaranl as variables
     */
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    /**
     * Metodo constructor por defecto
     */
    public CCuenta() {
    }

    /**
     * Metodo constructor parametrizado
     *
     * @param nom Nombre del cliente
     * @param cue Número de cuenta
     * @param sal Saldo actual de la cuenta referenciada
     * @param tipo Tipo de interés actual
     */
    public CCuenta(String nom, String cue, double sal, double tipo) {
        nombre = nom;
        cuenta = cue;
        saldo = sal;
    }

    /**
     * Método para obtener el estado de la cuenta
     * @return devuelve el saldo actual de la cuenta
     */
    public double estado() {
        return getSaldo();
    }

    /**
     * Método para ingresar dinero en la cuenta
     *
     * @param cantidad cantidad a ingresar
     * @throws Exception se asegura de que la cantidad a ingresar sea una
     * cifra válida
     */
    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0) {
            throw new Exception("No se puede ingresar una cantidad negativa");
        }
        setSaldo(getSaldo() + cantidad);
    }
/**
 * Método para retirar dinero de la cuenta
 * @param cantidad cantidad a retirar
 * @throws Exception se asegura de que la cantidad a retirar sea una
     * cifra válida
 */
    public void retirar(double cantidad) throws Exception {
        if (cantidad <= 0) {
            throw new Exception("No se puede retirar una cantidad negativa");
        }
        if (estado() < cantidad) {
            throw new Exception("No se hay suficiente saldo");
        }
        setSaldo(getSaldo() - cantidad);
    }
}
