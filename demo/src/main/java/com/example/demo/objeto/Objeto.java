package com.example.demo.objeto;

public class Objeto {
    private final String nombre;
    private final Integer precio;
    private Integer cantidadEnStock;
    private final String categoria;

    public Objeto(String nombre, Integer precio, Integer cantidadEnStock, String categoria) {
        
        this.nombre = nombre;
        this.precio = precio;
        this.cantidadEnStock = cantidadEnStock;
        this.categoria = categoria;
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getPrecio() {
        return precio;
    }

    public Integer getCantidadEnStock() {
        return cantidadEnStock;
    }

    public String getCategoria() {
        return categoria;
    }

    public Integer setCantidadEnStock(int cantidadEnStock){
        this.cantidadEnStock = cantidadEnStock;
        return cantidadEnStock;
    }

    @Override
    public boolean equals(Object obj) {
        return nombre.equals(((Objeto)obj).nombre);
    }
}