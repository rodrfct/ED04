package cuentas;

/**
 * Clase principal que ejecuta la aplicación bancaria.
 * Realiza operaciones sobre una cuenta bancaria utilizando la clase CCuenta.
 * 
 * @version 1.0
 */
public class Main {

	/**
     * Método principal que inicia la ejecución del programa.
     * Llama al método operativa_cuenta con una cantidad predeterminada.
     * 
     * @param args Argumentos de la línea de comandos (no utilizados).
     */
    public static void main(String[] args) {
		operativa_cuenta(695.00f);
    }

	/**
     * Método que realiza operaciones sobre una cuenta bancaria.
     * Muestra el saldo inicial, intenta retirar dinero y luego ingresa una cantidad.
     * 
     * @param cantidad Cantidad a ingresar en la cuenta.
     */
	public static void operativa_cuenta(float cantidad) {
		CCuenta cuenta1;
		double saldoActual;

		cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
		saldoActual = cuenta1.estado();
		System.out.println("El saldo actual es"+ saldoActual );

		try {
			cuenta1.retirar(2300);
		} catch (Exception e) {
			System.out.print("Fallo al retirar");
		}
		try {
			System.out.println("Ingreso en cuenta");
			cuenta1.ingresar(cantidad);
		} catch (Exception e) {
			System.out.print("Fallo al ingresar");
		}

	}

}
