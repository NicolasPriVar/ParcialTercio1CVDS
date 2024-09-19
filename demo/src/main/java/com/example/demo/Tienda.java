package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.objeto.Objeto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.time.LocalDateTime;

@SpringBootApplication
public class Tienda {

    private final Map<Objeto, String> objetos = new HashMap<>();

    public boolean addObjeto(Objeto objeto) {
        if (objeto == null) {
        return false;
        }
        
        for (Objeto existingObjeto : objetos.keySet()) {
            if (existingObjeto.getNombre().equals(objeto.getNombre())) {
                return false;
            }
        }

        

        objetos.put(objeto, "1");
        return true;
    }


    public Integer modificarExistencias(Objeto objeto, int cantidad) {
    int nuevaCantidad = cantidad;
    if (nuevaCantidad < 0) {
        System.out.println("Prodcto:" + objeto.getNombre() + "->" + nuevaCantidad + "unidades disponibles");
        return nuevaCantidad;
    }else if (nuevaCantidad < 5 && nuevaCantidad >= 0) {
        objeto.setCantidadEnStock(nuevaCantidad);
        System.out.println("ALERTA!!! El stock del producto" + objeto.getNombre() + "es muy bajo, solo quedan" + nuevaCantidad + "unidades.");
        return nuevaCantidad;
    }
    return nuevaCantidad;
}

    
    public Map<Objeto, String> getObjetos() {
    return new HashMap<>(objetos); 
    }

}

