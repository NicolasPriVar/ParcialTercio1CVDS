package com.example.demo.tienda;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertNull;
import org.junit.jupiter.api.Test;

import java.util.Map;

import com.example.demo.Tienda;
import com.example.demo.objeto.Objeto;
import java.beans.Transient;
import java.time.LocalDateTime;

public class TiendaTest {
    private Tienda tienda;

    @BeforeEach
    public void setUp(){
        tienda = new Tienda();
    }

    @Test
    public void testAddObjeto(){
        String nombre1 = "Nevera Challenger MK1";
        Integer precio1 = 1599900;
        Integer cantidadEnStock1 = 10;
        String categoria1 = "Electrodomesticos";

        Objeto objeto1 = new Objeto(nombre1, precio1, cantidadEnStock1, categoria1);
        
        assertTrue(tienda.addObjeto(objeto1));
    }

    @Test
    public void testAddObjetoRepetido(){
        String nombre1 = "Nevera Challenger MK1";
        Integer precio1 = 1599900;
        Integer cantidadEnStock1 = 10;
        String categoria1 = "Electrodomesticos";

        String nombre2 = "Nevera Challenger MK1";
        Integer precio2 = 1500;
        Integer cantidadEnStock2 = 1;
        String categoria2 = "Electrodomesticos";

        Objeto objeto1 = new Objeto(nombre1, precio1, cantidadEnStock1, categoria1);
        Objeto objeto2 = new Objeto(nombre2, precio2, cantidadEnStock2, categoria2);
        
        tienda.addObjeto(objeto1);

        assertFalse(tienda.addObjeto(objeto2));
    }

    @Test
    public void testAddDosObjetosDiferentes(){
        String nombre1 = "Nevera Challenger MK1";
        Integer precio1 = 1599900;
        Integer cantidadEnStock1 = 10;
        String categoria1 = "Electrodomesticos";

        String nombre2 = "Pintura para madera";
        Integer precio2 = 65500;
        Integer cantidadEnStock2 = 20;
        String categoria2 = "Hogar";
        
        Objeto objeto1 = new Objeto(nombre1, precio1, cantidadEnStock1, categoria1);
        Objeto objeto2 = new Objeto(nombre2, precio2, cantidadEnStock2, categoria2);
        
        tienda.addObjeto(objeto1);

        assertTrue(tienda.addObjeto(objeto2));
    }

    @Test
public void testModificarExistenciasConCantidadNegativa() {
    String nombre = "Nevera Challenger MK1";
    Integer precio = 1599900;
    Integer cantidadEnStock = 10;
    String categoria = "Electrodomesticos";

    Objeto objeto = new Objeto(nombre, precio, cantidadEnStock, categoria);
    tienda.addObjeto(objeto);

    int resultado = tienda.modificarExistencias(objeto, -1);
    assertEquals(-1, resultado);
}

@Test
public void testModificarExistenciasConBajoStock() {
    String nombre = "Nevera Challenger MK1";
    Integer precio = 1599900;
    Integer cantidadEnStock = 10;
    String categoria = "Electrodomesticos";

    Objeto objeto = new Objeto(nombre, precio, cantidadEnStock, categoria);
    tienda.addObjeto(objeto);

    objeto.setCantidadEnStock(2);
    int resultado = tienda.modificarExistencias(objeto, 3);
    assertEquals(3, resultado);
}

@Test
public void testModificarExistenciasConCantidadSuficiente() {
    String nombre = "Nevera Challenger MK1";
    Integer precio = 1599900;
    Integer cantidadEnStock = 10;
    String categoria = "Electrodomesticos";

    Objeto objeto = new Objeto(nombre, precio, cantidadEnStock, categoria);
    tienda.addObjeto(objeto);

    objeto.setCantidadEnStock(10);
    int resultado = tienda.modificarExistencias(objeto, 7);
    assertEquals(7, resultado);
}

@Test
public void testModificarExistenciasConCero() {
    String nombre = "Nevera Challenger MK1";
    Integer precio = 1599900;
    Integer cantidadEnStock = 10;
    String categoria = "Electrodomesticos";

    Objeto objeto = new Objeto(nombre, precio, cantidadEnStock, categoria);
    tienda.addObjeto(objeto);

    int resultado = tienda.modificarExistencias(objeto, 0);
    assertEquals(0, resultado);
}

}