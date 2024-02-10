import staticMethods.Usuario;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Usuario usuario = new Usuario("George", 27);

        System.out.println(Usuario.contador);

        Usuario usuario2 = new Usuario("Jose", 12);

        System.out.println(Usuario.contador);

    }
}