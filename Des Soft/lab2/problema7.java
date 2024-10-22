public class problema7 {
    private double hora, sueldo;
    String nombre;

    public void asignarValores(double h1, double s1, String nombre1){
        hora=h1;
        sueldo=s1;
        nombre = nombre1;
    }
    public double calcularSueldoHora(){
        double sueldoTt=0;
        if(hora <=40){
            sueldoTt=sueldo*hora;
        }
        else{
            sueldoTt=40*sueldo*hora*1.5;
        }
        return sueldoTt;
    }
}
class SueldoPorHora{
    public static void main(String[] args) {
        problema7 obj = new problema7();
        String nombre = "Juan Perez";
        obj.asignarValores(45, 50.75, nombre);
        obj.calcularSueldoHora();
        System.out.println("El saldo de " + nombre + " es de "+ obj.calcularSueldoHora());
    }
}