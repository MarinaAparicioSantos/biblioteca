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
	public String toString() {
		String retorno;
		retorno = "Titulo: " + titulo + "\n";
		retorno = retorno + "isbn: " + isbn + "\n";
		retorno = retorno + "Genero: " + genero + "\n";
		retorno = retorno + "Autor: " + autor + "\n";
		retorno = retorno + "Paginas: " + paginas + "\n";
		return retorno;
	}

	public boolean equals(Object o) {

		Libro l = (Libro) o;
		boolean b = false;

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
    public int compareTo(Libro libroOrdenar) {
        return titulo.compareToIgnoreCase(libroOrdenar.getTitulo());
		//return libroOrdenar.getTitulo().compareToIgnoreCase(this.titulo); al reves
		
	}

	@Override
	public int compare(Libro o1, Libro o2) {

		return  new Integer(o1.getPaginas()).compareTo(new Integer(o2.getPaginas()));
		//return  new Integer(o2.getPaginas()).compareTo(new Integer(o1.getPaginas())); al reves
		
	}
	

	// IMPORTANTE
//	@Override
//	public int compareTo(Libro l) {
//		int salida;
//
//		if (l.getTitulo().compareToIgnoreCase(this.titulo) == 0) {
//			if (l.getAutor().compareToIgnoreCase(this.autor) > 0) {
//				salida = -1;
//			} else if (l.getAutor().compareToIgnoreCase(this.autor) < 0) {
//				salida = 1;
//			} else {
//				salida = 0;
//			}
//		} else if (l.getTitulo().compareToIgnoreCase(this.titulo) > 0) {
//			salida = -1;
//		} else {
//			salida = 1;
//		}
//		return salida;
//	}

	//////////////////////////////////////////////////////

//	@Override
//	public int compare(Object obj1, Object obj2) {
//		Persona per1 = (Persona)obj1;
//		Persona per2 = (Persona)obj2;
//		
//		return per1.getNombre().compareTo(per2.getNombre());
//		
//	}
//	/////////////////////

//	@Override
//	public int compare(Libro per1, Libro per2) {
//		int rpta = 0;
//		if (per1.getPaginas() > per2.getPaginas()) {
//			rpta = 1;
//		} else if (per1.getPaginas() < per2.getPaginas()) {
//			rpta = -1;
//		} else {
//			rpta = 0;
//
//			if (rpta == 0) {
//				if (per1.getTitulo().compareToIgnoreCase(per2.getTitulo()) > 0) {
//					rpta = 1;
//				} else if (per1.getTitulo().compareToIgnoreCase(per2.getTitulo()) < 0) {
//					rpta = -1;
//				} else {
//					rpta = 0;
//				}
//			}
//
//		}
//		return rpta;
//	}

	//////////////////////

	///////////////////////////////////////////////

//    @Override
//    public int compareTo(Libr o) {
//        if (paginas < o.paginas) {
//            return -1;
//        }
//        if (paginas > o.paginas) {
//            return 1;
//        }
//        return 0;
//    }

//	class OrderNums implements Comparator<Integer> {
//	    public int compare(Integer a, Integer b) {
//	        return b - a;
//	    }
//	}	

//	public int compare(Libro a, Libro b) {
//          return a.paginas.compareTo(b.paginas);
//      }

}

//
//Por filas y columnas
//public class RecorrerMatrizPorFilasYColumnas {
//	public static void main(String[] args) {
//		int[][] matriz = new int[50][100]; // Matriz de números enteros que supondremos llena.
//						   // 50 filas y 100 columnas.
//	
//		for (int i = 0; i < 50; i++)		// El primer índice recorre las filas.
//			for (int j = 0; j < 100; j++){	// El segundo índice recorre las columnas.
//				// Procesamos cada elemento de la matriz.
//				System.out.println(matriz[i][j]);
//			}
//	}
//}
//Por columnas y filas
//public class RecorrerMatrizPorColumnasYFilas {
//	public static void main(String[] args) {
//		int[][] matriz = new int[50][100]; // Matriz de números enteros que supondremos llena.
//						   // 50 filas y 100 columnas.
//	
//		for (int i = 0; i < 100; i++)		// El primer índice recorre las columnas.
//			for (int j = 0; j < 50; j++){	// El segundo índice recorre las filas.
//				// Procesamos cada elemento de la matriz.
//				System.out.println(matriz[j][i]);	// ¡Índices cambiados de orden!
//			}
//	}
//}
//Por filas y columnas al revés
//public class RecorrerMatrizPorFilasYColumnasAlReves {
//	public static void main(String[] args) {
//		int[][] matriz = new int[50][100]; // Matriz de números enteros que supondremos llena.
//						   // 50 filas y 100 columnas.
//	
//		for (int i = 49; i > 0; i--)		// El primer índice recorre las filas.
//			for (int j = 99; j > 0; j--){	// El segundo índice recorre las columnas.
//				// Procesamos cada elemento de la matriz.
//				System.out.println(matriz[i][j]);
//			}
//	}
//}
//O sin cambiar los índices:
//
//public class RecorrerMatrizPorFilasYColumnasAlReves2 {
//	public static void main(String[] args) {
//		int[][] matriz = new int[50][100]; // Matriz de números enteros que supondremos llena.
//						   // 50 filas y 100 columnas.
//	
//		for (int i = 0; i < 50; i++)		// El primer índice recorre las filas.
//			for (int j = 0; j < 100; j++){	// El segundo índice recorre las columnas.
//				// Procesamos cada elemento de la matriz.
//				System.out.println(matriz[49 - i][99 - j]);
//			}
//	}
//}