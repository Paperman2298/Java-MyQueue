import java.util.NoSuchElementException;

public class MyQueue<E> {
	private ListaEnlazada<E> cola;
	
	public MyQueue() {
		this.cola = new ListaEnlazada<E>();
	}
	
	public int size() {
		return this.cola.size();
	}
	
	public boolean isEmpty() {
		return this.cola.isEmpty();
	}
	
	public void flush() {
		this.cola=new ListaEnlazada<E>();
		System.gc();
	}
	
	public void enqueue(E valor) {//Inserta el siguiente elemento en la cola
		this.cola.insertarFin(valor);
	}
	
	public E dequeue() {//Borra o saca el siguiente elemento en la cola
		try {
			return this.cola.borrarInicio();
		}catch(NoSuchElementException ex) {
			throw new NoSuchElementException("No se puede borrar de una cola vacía");
		}
		
	}
	
	public E next() {//Regresa el siguiente elemento en salir
		try {
			return this.cola.inicio();
		}catch(NoSuchElementException ex) {
			throw new NoSuchElementException("No se puede obtener el siguiente elemento de una cola vacía");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyQueue<String> cola = new MyQueue<String>();
		cola.enqueue("J");
		cola.enqueue("o");
		cola.enqueue("e");
		cola.enqueue("l");
	
		while(!cola.isEmpty()) {
			System.out.print(cola.dequeue());
			
		}
	}
}
