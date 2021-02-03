
public class Libro {

	String nombre;
	int numpag;
	String disponible;
	
	Libro(){
		this.nombre=null;
		this.numpag=0;
		this.disponible="no";
	}
	
	Libro(String no, int np, String dis){
		this.nombre=no;
		this.numpag=np;
		this.disponible=dis;
	}

	public String toString() {
		return ("El libro "+this.nombre+" de "+this.numpag+" pag esta disponible: "+this.disponible);
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumpag() {
		return this.numpag;
	}

	public void setNumpag(int numpag) {
		this.numpag = numpag;
	}

	public String getDisponible() {
		return this.disponible;
	}

	public void setDisponible(String disponible) {
		this.disponible = disponible;
	}
	
	public String prestamo(String nomb) {
		String texto;
		if (this.nombre.equals(nomb) && this.disponible.equals("si")) {
			texto="aqui esta el libro";
			this.disponible="no";
		}else {
			texto="el libro no esta disponible";
		}
		return texto;
	}
	
	public String devolucion(String nomb) {
		String texto;
		if (this.nombre.equals(nomb)) {
			texto="gracias, vuelva pronto";
		}else {
			texto="no reconozco ese libro";
		}
		return texto;
	}
	
	
}

	
