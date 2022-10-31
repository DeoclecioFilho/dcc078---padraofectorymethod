import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class ServicoAlinhamentoTest {

    @Test
    void deveExecutarRevisao() {
        IServico servico = ServicoFactory.obterServico("Alinhamento");
        assertEquals("Alinhamento efetivado", servico.executar());
    }

    @Test
    void deveCancelarRevisao() {
        IServico servico = ServicoFactory.obterServico("Alinhamento");
        assertEquals("Alinhamento cancelado", servico.cancelar());
    }


}
