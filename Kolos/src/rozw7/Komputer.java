package rozw7;

public class Komputer {
	private String czestProcesora;
	private String wielkoscRAM;
	private String producent;
	
	public String getCzestProcesora() {
		return czestProcesora;
	}
	public void setCzestProcesora(String czestProcesora) {
		this.czestProcesora = czestProcesora;
	}
	public String getWielkoscRAM() {
		return wielkoscRAM;
	}
	public void setWielkoscRAM(String wielkoscRAM) {
		this.wielkoscRAM = wielkoscRAM;
	}
	public String getProducent() {
		return producent;
	}
	public void setProducent(String producent) {
		this.producent = producent;
	}
	
	public Komputer(String czestProcesora, String wielkoscRAM, String producent) {
		super();
		this.czestProcesora = czestProcesora;
		this.wielkoscRAM = wielkoscRAM;
		this.producent = producent;
	}
	
	public static void main(String args[]){
	String test = new String("lalala");
	
	System.out.println(test.toUpperCase());
	
	String test2 = new String("k");
	
	System.out.println(test2.replaceAll("k", "kkkkkkkkkkkkkk"));
}
}
