import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class ServicoBalanceamentoTest {

    @Test
    void deveExecutarBalanceamento() {
        IServico servico = ServicoFactory.obterServico("Balanceamento");
        assertEquals("Balanceamento efetivado", servico.executar());
    }

    @Test
    void deveCancelarBalanceamento() {
        IServico servico = ServicoFactory.obterServico("Balanceamento");
        assertEquals("Balanceamento cancelado", servico.cancelar());
    }
}
