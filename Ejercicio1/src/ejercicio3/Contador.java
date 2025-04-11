package ejercicio3;

public class Contador {
private String nom;
private static int cant= 0, s=0;
private double sueldo;
public Contador(String nom,double sueldo) {
	this.nom = nom;
	this.sueldo = sueldo;
	s += sueldo;
	cant ++;
}

public int cantidad() {
	return cant;
}
public int c() {
	return s;
}
}
