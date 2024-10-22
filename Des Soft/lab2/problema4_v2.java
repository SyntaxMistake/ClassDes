class Metodo_1{
    private float x;

    public void asignarValores(float x1){
        x=x1;
    }
    public float calcularCel( ){
        float c= ((x-32)*(5f/9f));
        return c;
    }
    public float calcularRank(){
        float r=x+460;
        return r;
    }
    public float calcularKel(){
        float k=x+273;
        return k;
    }
}
class Ejecucion{
    public static void main(String[] args) {
        Metodo_1 obj=new Metodo_1();
        float x,y,z;
        obj.asignarValores(73.45f);
        x=obj.calcularCel();
        y=obj.calcularRank();
        obj.asignarValores(x);
        z=obj.calcularKel();
        System.out.println("Temperatura en Celcius: "+x+"\n"+"Temperatura en Rankine: "+y+"\n"+"Temperatura en Kelvin: " +z+"\n");
    }
}