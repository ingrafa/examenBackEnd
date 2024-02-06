package ec.ups.edu.ec.examenang;

//Recarga.java
public class Recargas {
 private String numeroTelefono;
 private String operador;
 private int monto;
public String getNumeroTelefono() {
	return numeroTelefono;
}
public void setNumeroTelefono(String numeroTelefono) {
	this.numeroTelefono = numeroTelefono;
}
public String getOperador() {
	return operador;
}
public void setOperador(String operador) {
	this.operador = operador;
}
public int getMonto() {
	return monto;
}
public void setMonto(int monto) {
	this.monto = monto;
}
@Override
public String toString() {
	return "Recargas [numeroTelefono=" + numeroTelefono + ", operador=" + operador + ", monto=" + monto + "]";
}

}

