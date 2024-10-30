import javax.swing.JOptionPane;
import java.io.*;
class Verificar
{
	private int codigo;
	 Verificar(int c)
	{
	 codigo=c;
	}
		
	int validarDato()throws IOException
	{
		String input; 
		do
	    {
	       if ((codigo < 1 )|| (codigo >3)&&(codigo !=4))
	        {
			input = JOptionPane.showInputDialog(null, "\ttValor Incorrecto\n Pulse un nuevo numero.............>", "Mi programa en Java", JOptionPane.QUESTION_MESSAGE);
	        codigo= Integer.parseInt(input); 
	    	System.out.println();
	        System.out.println();
	        }
	     }while ((codigo <1) || (codigo >3));
	     return codigo;
	 }
	
	int procesarValor(int num)
	{ 	
		int resp=0;
		switch(codigo)
		{
			case 1: resp=calcularFactorial(num);
			        break;
			case 2: resp=calcularCuadrado(num);
			        break;
			case 3: resp=calcularSumatoria(num);
			        break;
		}
		
		return resp;
	}
		
	int calcularFactorial(int n)
	{
		int fact=1;
		for(int i=1; i<=n;i++)
		    fact =fact*i;
		return fact;
	}
		
	int calcularCuadrado(int n)
	{
		
		return n*n;
	}	
	
	int calcularSumatoria(int n)
	{
	   int resul =0;
		for(int i=1; i<=n;i++)
		    resul= resul + i;
		return resul;
	}
	
}



class Procesos
{
   public static void main(String arg[]) throws IOException
   {
	int cod, numero,respuesta;
	String input;
	input = JOptionPane.showInputDialog(null, "Introduzca el codigo:\n"+"1. Factorial del Numero:\n"+"2. Cuadrado del Numero:\n"+"3. Suma del Numero de 1 a N:\n"+"4. Salir"+"Teclear el valor a procesar", "Insertar valor", JOptionPane.QUESTION_MESSAGE);
	cod=Integer.parseInt(input);
	//Crear Objeto
	Verificar obj = new Verificar(cod);
	//Validar los valores de entrada
	cod=obj.validarDato();
	System.out.print("Pulse el numero.............>");
	numero= Integer.parseInt(JOptionPane.showInputDialog(null, "Pulse el numero.............>", "Mi programa en Java", JOptionPane.QUESTION_MESSAGE)); 
	respuesta=obj.procesarValor(numero);
	if (cod== 1)
			JOptionPane.showMessageDialog(null,"El factorial de "+numero+" es: "+respuesta,"RESULTADO",JOptionPane.INFORMATION_MESSAGE);
	else
		if (cod == 2)
			JOptionPane.showMessageDialog(null,"El cuadrado del numero: "+ numero + " es "+respuesta,"RESULTADO",JOptionPane.INFORMATION_MESSAGE);
				else
				JOptionPane.showMessageDialog(null,"La sumatoria del numero: "+ numero + " es "+respuesta,"RESULTADO",JOptionPane.INFORMATION_MESSAGE);
	}
   }
