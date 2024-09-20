package administracion;

public class AdiministracionLibros {

    public static void main(String[] args) {

        Libros librosUno = new Libros("Cien años de soledad","Gabriel Garcia Marquez",496,1967);
        Libros librosDos = new Libros("Padre rico padre pobre","Robert Kiyosaki",288,1997);

        System.out.println("Titulo libro uno:" + librosUno.getTitulo());
        System.out.println("Autor libro uno:" + librosUno.getAutor());
        System.out.println("Nro pag libro uno:" + librosUno.getNumeroPaginas());
        System.out.println("Año pub libro uno:" + librosUno.getAñoPublicacion());
        System.out.println("*******************************************************");
        System.out.println("Titulo libro dos:" + librosDos.getTitulo());
        System.out.println("Autor libro dos:" + librosDos.getAutor());
        System.out.println("Nro pag libro dos:" + librosDos.getNumeroPaginas());
        System.out.println("Año pub libro dos:" + librosDos.getAñoPublicacion());


        librosUno.setTitulo("Mil años de soledad");
        System.out.println("*******************************************************");
        System.out.println("Modificacion titulo libro uno:  " + librosUno.getTitulo());



    }
}

