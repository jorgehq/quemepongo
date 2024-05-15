package ar.edu.utn.frba.dds;


import ar.edu.utn.frba.dds.Enum.material;
import ar.edu.utn.frba.dds.Enum.tipoEstilo;
import ar.edu.utn.frba.dds.Enum.tipoPrenda;
import ar.edu.utn.frba.dds.Enum.trama;
import ar.edu.utn.frba.dds.Sugerencias.Sugerencia;

import java.util.List;

public class main {
    public static void main(String[] args) {
        Usuario u= new Usuario(30,new CombinadorDePrendas(new ConfigNoHacerNada()));
        Color c=new Color(50,50,50);
        u.crearGuardaropa("Mis ropas");
        u.getGuardaropa("Mis ropas").add(new Prenda(tipoPrenda.CAMISA, material.ALGODON,c, trama.ESTAMPADO, tipoEstilo.FORMAL));
        u.getGuardaropa("Mis ropas").add(new Prenda(tipoPrenda.PANTALON, material.LANA,c, trama.LISA, tipoEstilo.FORMAL));
        u.getGuardaropa("Mis ropas").add(new Prenda(tipoPrenda.ZAPATOS, material.CUERO,c, trama.CON_LUNARES, tipoEstilo.INFORMAL));
        u.getGuardaropa("Mis ropas").add(new Prenda(tipoPrenda.CAMPERA, material.LYCRA,c, trama.ESTAMPADO, tipoEstilo.FORMAL));
        u.getGuardaropa("Mis ropas").add(new Prenda(tipoPrenda.ZAPATOS, material.ALGODON,c, trama.CON_LUNARES, tipoEstilo.FORMAL));
        u.getGuardaropa("Mis ropas").add(new Prenda(tipoPrenda.PANTALON, material.ALGODON,c, trama.ESTAMPADO, tipoEstilo.FORMAL));
        u.getGuardaropa("Mis ropas").stream().forEach(prenda -> prenda.mostrar());
        List<Sugerencia> ls=u.realizarCombinacion("Mis ropas");
        int i=1;
        for(Sugerencia s:ls){
            s.mostrar(i);
            i++;
        }
    }

}
