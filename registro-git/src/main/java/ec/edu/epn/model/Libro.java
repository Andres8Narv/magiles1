package ec.edu.epn.model;

public class Libro {
	private int codigo;
	private String name;
	private String category;

	public Libro(int codigo, String name, String categoria) {
		
		this.codigo = codigo;
		this.name = name;
		this.category = categoria;
	}

	public String getCategoria() {
		return category;
	}

	public void setCategoria(String categoria) {
		this.category = categoria;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setAge(int codigo) {
		this.codigo = codigo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "" + this.codigo + ". " + this.name + "\t\t\t\t Categoria: " + this.category;
	}


}
