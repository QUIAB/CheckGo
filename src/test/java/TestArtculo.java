import DAO.DaoArticulo;
import org.junit.Assert;
import Modelos.Inventario.Articulo;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestArtculo {

    static Articulo articuloNew;

    @BeforeClass
    public static void initializeVariables(){
        articuloNew = new Articulo("Ivan");
    }

    @Test
    public void get(){
        int savedId = DaoArticulo.save(articuloNew);
        System.out.println(savedId);
        Articulo selectedAnimal = DaoArticulo.getById(savedId);
        Assert.assertEquals(articuloNew.getName(), selectedAnimal.getName());
    }
}
