import dao.BD;
import model.Odontologo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import service.OdontologoService;

import java.util.ArrayList;
import java.util.List;

public class OdontologoServiceTest {
    @Test
    public void agregarOdontologo() {
        BD.crearTablas();
        OdontologoService odontologoService = new OdontologoService();

        Odontologo odontologo = new Odontologo(123, "Juan", "Palaceto");

        odontologoService.guardarOdontologo(odontologo);

        Assertions.assertTrue(odontologo.getId()!=0);
    }

    public void buscarTodos() {
        BD.crearTablas();
        OdontologoService odontologoService = new OdontologoService();

        Odontologo odontologo = new Odontologo(123, "Juan", "Palaceto");
        Odontologo odontologo1 = new Odontologo(124, "Luisa", "Valencia");
        Odontologo odontologo2 = new Odontologo(125, "Jorgito", "Pereyra");

        odontologoService.guardarOdontologo(odontologo);
        odontologoService.guardarOdontologo(odontologo1);
        odontologoService.guardarOdontologo(odontologo2);

        List<Odontologo> odontologoList = odontologoService.buscarTodos();

        Assertions.assertTrue(odontologoList.size() > 0);
    }
}

