package ar.edu.utn.frba.dds.Sugerencias;

import ar.edu.utn.frba.dds.Prenda;

public class Sugerencia {
  private Prenda superior;
  private Prenda inferior;
  private Prenda calzado;

  public Sugerencia(Prenda superior, Prenda inferior, Prenda calzado) {
    this.superior = superior;
    this.inferior = inferior;
    this.calzado = calzado;
  }
  public void mostrar(int i){
    System.out.println("Conjunto Sugerencia "+ i);
    superior.mostrar();
    inferior.mostrar();
    calzado.mostrar();
    System.out.println("--------------------------------");
  }
}
