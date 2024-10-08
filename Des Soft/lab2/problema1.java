class Metodo               //SE CREA LA CLASE Metodo
{
//METODO DE SUMA RECIBE DOS FLOTANTES COMO PARAMETROS
     private float x, y;

  public void asignarValores(float x1, float y1 )       	
     	{
		x=x1; 
      y=y1; 
      }

   public  double calcularSuma( )       	
      {
	double s;
	s=x+y;
	return s; 
      }
//METODO RESTA RECIBE DOS ENTEROS COMO PARAMETROS
public  float calcularResta() 			
   {
	float r;
	r=x-y;
	return r;
    }
//METODO RESIDUO RECIBE DOS ENTEROS COMO PARAMETROS
   public  float calcularResiduo()			
   {
	float z;
	z=x%y;
	return z;
   }
}    //FIN DE LA CLASE Metodo

class PasoValores       //CLASE PRINCIPAL
{			
      public static void main(String args[])
       { 
         Metodo obj = new Metodo();		//CREACION DEL OBJETO
         float x,z;
         double y;
         System.out.println("Suma Resta Residuo"+"\n");
//LLAMADA AL METODO LLEVANDOME COMO PARÁMETROS    //FLOTANTES
         obj.asignarValores(65831.12f,3523.15f);
         y=obj.calcularSuma();		
	System.out.println("Suma: "+ y+"\n");
     obj.asignarValores(30,10);
	x=obj.calcularResta();			//LLAMADO AL METODO RESTA
	System.out.println("Resta: "+x+"\n");
     obj.asignarValores(40,6);
	z=obj.calcularResiduo();		//LLAMADO AL METODO RESIDUO
	System.out.println("Residuo: "+z+"\n");
    }
}
