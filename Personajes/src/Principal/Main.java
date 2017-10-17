package Principal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import Factory.*;
import AbstractFactory.*;
import Builder.*;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		  int opcion = 0;
		  Creador elCreador;//nuevo creador
		 
		  AbstractFactory fabrica;
		  Arma a;
		  Escudo e;
           
		  //builder
		
		  
		
		   BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		  
		do{
			 
			 
	        System.out.println("Seleccione el personaje que quiere crear");
	        System.out.println("1. Crear un Orco");
	        System.out.println("2. Crear un Mago");
	        System.out.println("3. Crear un Humano");
	        System.out.println("4. Crear un Hobbit");

	        
	        
	        
	        opcion = Integer.parseInt(in.readLine());
	     

	        
	        switch (opcion) {
	        
	       
	            case 1:
	            	
	                System.out.println("Has seleccionado: Orco");
	                 elCreador = new CreadorOrco();
	   			     Personaje per = elCreador.factorymethod();
	                 per.operacion();
	                 
	                 
	                 fabrica = new FabricaOrco();
	                 a = fabrica.crearArmas();
	                 e = fabrica.crearEscudos();
	                    
	                   
	                    System.out.println("Creando:"+a.operacionar()+"...");
	                    System.out.println("Creando:"+e.operacionesc()+"...");
	                    System.out.println("Armaste un Orco con "+a.operacionar()+" y con un "+e.operacionesc());
	                    
	                    
	                    //builder 
	                    Director dir = new Director();
	                    dir.setPersonajesbuilder(new BuilderOrco());
	                    dir.construirPersonaje();
	                    
	                    PersonajeArmado ar = dir.getPersonajeArmado();
	                    
	                    System.out.println(ar.getArma());
	                    System.out.println(ar.getEscudo());
	                    
	                     break;
	                

	            case 2:
	            	System.out.println("Has seleccionado: Mago");
	            	elCreador = new CreadorMago();
	            	Personaje pers = elCreador.factorymethod();
		            pers.operacion();
		            
		            fabrica = new FabricaMago();
	            	 a = fabrica.crearArmas();
	                 e = fabrica.crearEscudos();
		            
	                 System.out.println("Creando:"+a.operacionar()+"...");
	                 System.out.println("Creando:"+e.operacionesc()+"...");
	                 System.out.println("Armaste un Mago con "+a.operacionar()+" y con un "+e.operacionesc());
	                
	                 //builder 
	                 Director dir1 = new Director();
	                    dir1.setPersonajesbuilder(new BuilderMago());
	                    dir1.construirPersonaje();
	                    
	                    PersonajeArmado ar1 = dir1.getPersonajeArmado();
	                    System.out.println(ar1.getArma());
	                    System.out.println(ar1.getEscudo());
	                    
	                break;

	            case 3:
	            	System.out.println("Has seleccionado: Humano");
	            	 elCreador = new CreadorHumano();
	            	 Personaje perso = elCreador.factorymethod();
		             perso.operacion();
		                
		                
			            fabrica = new FabricaHumano();
		            	 a = fabrica.crearArmas();
		                 e = fabrica.crearEscudos();
		                 
		                 
		          
		                 System.out.println("Creando un "+a.operacionar()+"...");
		                 System.out.println("Creando un "+e.operacionesc()+"...");
		                 System.out.println("Armaste un Humano con "+a.operacionar()+" y con un "+e.operacionesc());
		                 
		                
		                 //builder 
		                    Director direc = new Director();
		                    direc.setPersonajesbuilder(new BuilderHumano());
		                    direc.construirPersonaje();
		                    
		                    PersonajeArmado asdf = direc.getPersonajeArmado();
		                    
		                    System.out.println(asdf.getArma());
		                    System.out.println(asdf.getEscudo());
	                break;

	            case 4:
	            	System.out.println("Has seleccionado: Hobbit");
	                elCreador = new CreadorHobbit();
	                Personaje person = elCreador.factorymethod();
		            person.operacion();
		            
		            fabrica = new FabricaHobbit();
	            	 a = fabrica.crearArmas();
	                 e = fabrica.crearEscudos();
	                 
	                 
	                 System.out.println("Creando un "+a.operacionar()+"...");
	                 System.out.println("Creando un "+e.operacionesc()+"...");
	                 System.out.println("Armaste un Hobbit con "+a.operacionar()+" y con un "+e.operacionesc());
	                
	                 
	               //builder 
	                    Director direct = new Director();
	                    direct.setPersonajesbuilder(new BuilderHobbit());
	                    direct.construirPersonaje();
	                    
	                    PersonajeArmado asdfg = direct.getPersonajeArmado();
	                    
	                    System.out.println(asdfg.getArma());
	                    System.out.println(asdfg.getEscudo());
	                break;

	           
	                
	            default:
	                System.out.println("Dato Incorrecto");
	                break;
	        }
	         
	        }while(opcion != 1 && opcion !=2 && opcion != 3 && opcion !=4);
	        
	       

	}

}
