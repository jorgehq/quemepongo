package ar.edu.utn.frba.dds;

import java.util.ArrayList;
import java.util.List;

/*
* La clase atuendo tiene dos listas una para las prendas ingresadas y otra para el filtrado de estas.
* Por ahora no se ra necesario la segunda ya que no hay ningun requisito para hacer la filtracion.
* Se crearon dos clases coincidenTipoCategoria y sonNulos para verificar si tiene logica el tipo y su categoria
*  y si no se completo correctamente la informacion de una prenda.
* */
public class Atuendo {
    private List <Prenda> listaP;
    private List <Prenda> atuendoElegido;

    public Atuendo() {
        listaP=new ArrayList<Prenda>();
        atuendoElegido=new ArrayList<Prenda>();
    }

    public void addPrenda(Prenda pre){

            listaP.add(pre);

    }



    public void  mostrarListaPrendas(){

        for(Prenda p:listaP){
            System.out.println(p.toString());
        }
    }


}
