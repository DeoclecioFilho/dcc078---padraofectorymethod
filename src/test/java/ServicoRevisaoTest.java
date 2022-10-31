import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class ServicoRevisaoTest {

    @Test
    void deveExecutarRevisao() {
        IServico servico = ServicoFactory.obterServico("Revisao");
        assertEquals("Revisao efetivada", servico.executar());
    }

    @Test
    void deveCancelarRevisao() {
        IServico servico = ServicoFactory.obterServico("Revisao");
        assertEquals("Revisao cancelada", servico.cancelar());
    }
}
