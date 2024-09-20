package administracion;

public class Libros {

    String Titulo;
    String Autor;
    int NumeroPaginas;
    int AñoPublicacion;


    public Libros (String Titulo, String Autor, int NumeroPaginas, int AñoPublicacion) {
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.NumeroPaginas = NumeroPaginas;
        this.AñoPublicacion = AñoPublicacion;
    }



        public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
       this.Titulo = Titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public int getNumeroPaginas() {
        return NumeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.NumeroPaginas = numeroPaginas;
    }

    public int getAñoPublicacion() {
        return AñoPublicacion;
    }

    public void setAñoPublicacion(int añoPublicacion) {
        this.AñoPublicacion = añoPublicacion;
    }




}


