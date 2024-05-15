package ar.edu.utn.frba.dds.Sugerencias;

import ar.edu.utn.frba.dds.Borrador;
import ar.edu.utn.frba.dds.Enum.*;
import ar.edu.utn.frba.dds.Prenda;
import ar.edu.utn.frba.dds.confeccion;

public class UInstitutoJonhson  extends confeccion {

    public Prenda crearParteSuperior(){
        Borrador b=new Borrador();
        b.setTipo(tipoPrenda.CAMISA);
        b.setColorS(100,100,100);
        b.setM(material.PIQUE);
        return b.crearPrenda();
    };

    public Prenda crearParteInferior(){
        Borrador b=new Borrador();
        b.setTipo(tipoPrenda.PANTALON);
        b.setColorS(0,0,0);
        b.setM(material.ACETATO);
        return b.crearPrenda();

    }
    public Prenda crearCalzado(){
        Borrador b=new Borrador();
        b.setTipo(tipoPrenda.ZAPATOS);
        b.setColorS(0,0,0);
        b.setM(material.CUERO);
        return b.crearPrenda();
    }

}
