package clases;

import java.util.Comparator;

public class Libro implements Comparable<Libro>, Comparator<Libro> {

	private String titulo;
	private String isbn;
	private Genero genero;
	private String autor;
	private Integer paginas;

	public Libro() {

	}

	public Libro(String titulo, String isbn, Genero genero, String autor, Integer paginas) {
		super();
		this.titulo = titulo;
		this.isbn = isbn;
		this.genero = genero;
		this.autor = autor;
		this.paginas = paginas;
	}

	/**
	 * @return the titulo
	 */
	public String getTitulo() {
		return titulo;
	}

	/**
	 * @param titulo the titulo to set
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	/**
	 * @return the isbn
	 */
	public String getIsbn() {
		return isbn;
	}

	/**
	 * @param isbn the isbn to set
	 */
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	/**
	 * @return the genero
	 */
	public Genero getGenero() {
		return genero;
	}

	/**
	 * @param genero the genero to set
	 */
	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	/**
	 * @return the autor
	 */
	public String getAutor() {
		return autor;
	}

	/**
	 * @param autor the autor to set
	 */
	public void setAutor(String autor) {
		this.autor = autor;
	}

	/**
	 * @return the paginas
	 */
	public Integer getPaginas() {
		return paginas;
	}

	/**
	 * @param paginas the paginas to set
	 */
	public void setPaginas(Integer paginas) {
		this.paginas = paginas;
	}

	@Override
	/**Metodo toString de la clase Libro que muestra los datos de los libros.
	 * @return retorno
	 */
	public String toString() {
		String retorno;
		retorno = "Titulo: " + titulo + "\n";
		retorno = retorno + "isbn: " + isbn + "\n";
		retorno = retorno + "Genero: " + genero + "\n";
		retorno = retorno + "Autor: " + autor + "\n";
		retorno = retorno + "Paginas: " + paginas + "\n";
		return retorno;
	}

	/**
	 * @param o
	 * @return b
	 */
	public boolean equals(Object o) {

		//El objeto o se transforma en libro.
		Libro l = (Libro) o;
		//Variable booleana falsa.
		boolean b = false;
		//si el objeto o es igual al libro o, b es verdadero.
		if (this == o) {
			b = true;
		} else {
			if (this.isbn.equalsIgnoreCase(l.isbn)) {
				b = true;
			}
		}
		return b;
	}


	@Override
	/**Metodo compareTo que compara los titulos de los libros por orden natural.
	 * @param libroOrdenar
	 */
    public int compareTo(Libro libroOrdenar) {
        return titulo.compareToIgnoreCase(libroOrdenar.getTitulo());
	}

	@Override
	/**Metodo compare que compara las paginas de los libros por orden no natural.
	 * @param o1
	 * @param o2
	 */
	public int compare(Libro o1, Libro o2) {

		return  new Integer(o1.getPaginas()).compareTo(new Integer(o2.getPaginas()));	
	}
}