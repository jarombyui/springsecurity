package herencia;
/// esta es la super clase
// protected, permite que las subclases accedan a estos atributos.
public class LibraryItem {
    protected int id;
    protected String titulo;
    protected boolean disponible;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LibraryItem(int id; String titulo, boolean disponible)
    {
        this.id = id;
        this.titulo = titulo;
        this.disponible = disponible;

    }

}
