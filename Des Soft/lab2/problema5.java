class Problema5 {
    private int a,b;

    public void asignarValores(int a1, int b1){
        a=a1;
        b=b1;
    }
    public double dividirExacto(){
        double e=a%b;
        return e;
    }
    public double dividirExacto2(){
        double f=b%a;
        return f;
    }
}

class ProResol{
    public static void main(String[] args) {
       Problema5 obj=new Problema5();
       double x,y;
       obj.asignarValores(100, 300);
       x=obj.dividirExacto();
       y=obj.dividirExacto2();
       if(x==0){
        System.out.println("La division de A=100 y B=300 es igual a 0");
       }
       if(y==0){
        System.out.println("La division de B=300 y A=100 es una division exacta"+" "+"300/100");
       }
    }
}