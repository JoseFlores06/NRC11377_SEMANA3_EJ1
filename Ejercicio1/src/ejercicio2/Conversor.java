package ejercicio2;

public class Conversor {
private double celcius;
private int km, seg;
public Conversor(double celcius) {
	this.celcius = celcius;
}
public Conversor(int km) {
	this.km = km;
}
public Conversor(int seg,boolean flag) {
	this.seg = seg;
}

public double Convertir(double celcius) {
	return celcius * 9/5 + 32;
}
public double Convertir(int km) {
	return km *0.621371;
}
public String Convertir(int seg,boolean abc) {
	int min = seg/60;//minutos
	int residuo=seg%60;//Lo que queda, seg
	return min + " minuto(s) " + " y " + residuo + " segundo(s)."; 
}

}
