package taller3.televisores;

public class Control {
	TV tv;
	
	public void enlazar(TV tv) {
		this.tv = tv;
		tv.control = this;
		
	}
	
	public TV getTV() {
		return tv;
	}
	
	public void setTV(TV tv) {
		this.tv = tv;
	}
	
	private void canalUp() {
		tv.canalUp();

	}
	
	private void canalDown() {
		tv.canalDown();
	}
	
	private void volumeUp() {
		tv.volumeUp();
	}
	
	private void volumeDown() {
		tv.volumeDown();
	}
	
	private void turnOn() {
		tv.turnOn();
		
	}
	
	private void turnOff() {
		tv.turnOff();	
		
	}
	
	private void setCanal(int canal) {
		tv.setCanal(canal);
		
	}

}
