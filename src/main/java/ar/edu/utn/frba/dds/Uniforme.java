package ar.edu.utn.frba.dds;

public class Uniforme {
    private Prenda superior;
    private Prenda inferior;
    private Prenda calzado;

    public Uniforme(confeccion cu) {

        this.superior=cu.crearParteSuperior();
        this.inferior=cu.crearParteInferior();
        this.calzado=cu.crearCalzado();

    }
    public void  mostrar() {
        System.out.println(superior.toString());
        System.out.println(inferior.toString());
        System.out.println(calzado.toString());
    }
}
