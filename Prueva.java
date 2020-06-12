
public class Prueva {
	public static void main(String args []) {
		Arbol bonsai = new Arbol();
		bonsai.insertar(new Nodo(10));
		if(bonsai.buscar(new Nodo(10))){
			System.out.println("El 10 si se encuentra");
		}
		/////////////////////////////////////
		Nodo ab;
		////////////////////////////////
		ab=new Nodo(0);
		if(bonsai.buscar(ab)){ 
			System.out.println("El "+ab+" si se encuentra");
		}else {
			System.out.println("El "+ab+" no se encuentra");
		}
		//////////////////////////////////////////////////
		ab=new Nodo(5);
		bonsai.insertar(ab);
		if(bonsai.buscar(ab)){ 
			System.out.println("El "+ab+" si se encuentra");
		}else {
			System.out.println("El "+ab+" no se encuentra");
		}
		//////////////////////////////////////////////////
		ab=new Nodo(15);
		bonsai.insertar(ab);
		if(bonsai.buscar(ab)){ 
			System.out.println("El "+ab+" si se encuentra");
		}else {
			System.out.println("El "+ab+" no se encuentra");
		}
		//////////////////////////////////////////////////
		ab=new Nodo(4);
		bonsai.insertar(ab);
		if(bonsai.buscar(ab)){ 
			System.out.println("El "+ab+" si se encuentra");
		}else {
			System.out.println("El "+ab+" no se encuentra");
		}
		//////////////////////////////////////////////////
		ab=new Nodo(16);
		bonsai.insertar(ab);
		if(bonsai.buscar(ab)){ 
			System.out.println("El "+ab+" si se encuentra");
		}else {
			System.out.println("El "+ab+" no se encuentra");
		}
		//////////////////////////////////////////////////
		ab=new Nodo(8);
		bonsai.insertar(ab);
		if(bonsai.buscar(ab)){ 
			System.out.println("El "+ab+" si se encuentra");
		}else {
			System.out.println("El "+ab+" no se encuentra");
		}
		//////////////////////////////////////////////////
		ab=new Nodo(11);
		bonsai.insertar(ab);
		if(bonsai.buscar(ab)){ 
			System.out.println("El "+ab+" si se encuentra");
		}else {
			System.out.println("El "+ab+" no se encuentra");
		}
		//////////////////////////////////////////////////
		ab=new Nodo(11111);
		
		if(bonsai.buscar(ab)){ 
			System.out.println("El "+ab+" si se encuentra");
		}else {
			System.out.println("El "+ab+" no se encuentra");
		}
	}
}
