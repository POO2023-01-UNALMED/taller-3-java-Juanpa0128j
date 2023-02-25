package taller3.televisores;

public class TV {
	private Marca marca;
	Control control;
	private boolean estado;
	int canal = 1; 
	private int precio = 500; 
	int volumen = 1;
	private static int numTV = 0;
	
	public TV(Marca marca, boolean estado){
		this.marca = marca;
		this.estado = estado;
		TV.numTV++;
	}
	
	public void canalUp() {
		if(estado == true && canal < 120) {
			canal++;
		}

	}
	
	public void canalDown() {
		if(estado == true && canal > 1) {
			canal--;
		}
	}
	
	public void volumenUp() {
		if(estado == true && volumen < 7) {
			volumen++;
		}
	}
	
	public void volumenDown() {
		if(estado == true && volumen > 0) {
			volumen--;
		}
	}
	
	public void turnOn() {
		estado = true;
		
	}
	
	public void turnOff() {
		estado = false;
		
	}
	
	public void setCanal(int canal) {
		if(estado == true && 1 < canal && canal < 120) {
			this.canal = canal;
		}
			
	}
	
	public boolean getEstado() {
		return estado;
		
	}
	
	public static int getNumTV() {
		return TV.numTV;
		
	}
	
	public static void setNumTV(int numTV) {
		return;
		
	}
	
	public int getPrecio() {
		return precio;
		
	}
	
	public void setPrecio(int precio) {
		this.precio = precio;
		
	}
	
	public int getVolumen() {
		return volumen;
		
	}
	
	public void setVolumen(int volumen) {
		if(estado == true && 0 < volumen && volumen < 7) {
			this.volumen = volumen;
		}
		
	}
	
	public int getCanal() {
		return canal;
		
	}
	
	public Marca getMarca() {
		return marca;
		
	}
	
	public void setMarca(Marca marca) {
		this.marca = marca;
		
	}
	
	public Control getControl() {
		return control;
		
	}
	
	public void setControl(Control control) {
		this.control = control;
		
	}
	
}
