class Problema6 {
    private int tipo1;

    public void asignarValores(int x1)
    {
        tipo1=x1;
    }
    public double incrementoSueldo(){
        double s=0;
        switch (tipo1) {
            case 1:
                s=0.05;
                break;
            case 2:
                s=0.07;
                break;
            case 3:
                s=0.09;
                break;
            case 4:
                s=0.12;
                break;
            case 5:
                s=0.15;
                break;
            default:
                System.err.println("Error.");
                System.exit(0);;
        }
        return s;
    }
}

class Salario{
    public static void main(String[] args) {
        Problema6 obj = new Problema6();
        double i;
        double money=1500.00;
        obj.asignarValores(5);
        i=obj.incrementoSueldo();
        money = money + (money * i);
        System.out.println("El salario del empleado es"+" "+money+"\n");
    }
}