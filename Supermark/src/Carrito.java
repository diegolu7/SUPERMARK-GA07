import java.util.ArrayList;

public class Carrito {
	private ArrayList<Producto> productosDB = new ArrayList();
	private int limite;
	private float total;
	public Carrito(ArrayList<Producto> productosDB, int limite, float total) {
		super();
		this.productosDB = productosDB;
		this.limite = limite;
		this.total = total;
	}
	public ArrayList<Producto> getProductosDB() {
		return productosDB;
	}
	public void setProductosDB(ArrayList<Producto> productosDB) {
		this.productosDB = productosDB;
	}
	public int getLimite() {
		return limite;
	}
	public void setLimite(int limite) {
		this.limite = limite;
	}
	public float getTotal() {
		return total;
	}
	public void setTotal(float total) {
		this.total = total;
	}
	public boolean agregarProducto() {	//ADD Producto
		if(limite <= 30) {	//LIMITE DE PRODUCTOS 30
			//voy a DB por el producto
			//agrego producto/id a arraylist
			//sumo a total
			//retorno TRUE
			return true;
		}else {	
			return false;
		}
	}
	public void eliminarProducto() {	//Remove Producto
			//Elimino el id del array
			//resto el total
			//retorno TRUE
	}

}

