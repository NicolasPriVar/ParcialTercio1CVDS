package test.java.com.example.demo.objeto;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertNull;
import org.junit.jupiter.api.Test;
import java.util.Map;
import com.example.demo.Tienda;
import com.example.demo.objeto.Objeto;

class ObjetoTest {
    @Test
    void testGetNombre() {
        Objeto objeto = new Objeto("Nevera", 123, 4, "Casa");
        assertEquals("Nevera", objeto.getNombre());
    }

    @Test
    void testGetPrecio() {
        Objeto objeto = new Objeto("Nevera", 123, 4, "Casa");
        assertEquals(123, objeto.getPrecio());
    }

    @Test
    void testGetCantidadEnStock() {
        Objeto objeto = new Objeto("Nevera", 123, 4, "Casa");
        assertEquals(4, objeto.getCantidadEnStock());
    }

    @Test
    void testGetCategoria() {
        Objeto objeto = new Objeto("Nevera", 123, 4, "Casa");
        assertEquals("Casa", objeto.getCategoria());
    }

    @Test
    void testEqualsSameNombre() {
        Objeto objeto = new Objeto("Nevera", 123, 4, "Casa");
        Objeto objeto2 = new Objeto("Nevera", 124343, 54, "N/A");
        assertTrue(objeto.equals(objeto2));
    }
}

