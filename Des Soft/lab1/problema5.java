class circunferencia
{
    	public static void main(String argumentos[])
	{
		//varibles del metodo main
        double r, resultadoArea, resultadoVol, resultadoCircunferencia;
		r=7.5;
        resultadoCircunferencia= 2*Math.PI * r;
		resultadoArea= Math.PI * (r*r);
        resultadoVol= (4* Math.PI *(r*r*r))/3;
		System.out.println("El resultado del Area de este circulo es"+""+" pi*(r*r)= "+resultadoArea);
        System.out.println("El resultado del volumen de este circulo es"+""+" 4*pi*(r^3)/3= "+resultadoVol);
        System.out.println("El resultado del volumen de este circulo es"+""+" 2*pi*r= "+resultadoCircunferencia);
	}//fin main
}//fin class