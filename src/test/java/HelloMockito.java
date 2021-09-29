import br.com.alura.leilao.dao.LeilaoDao;
import br.com.alura.leilao.model.Leilao;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.List;

public class HelloMockito {

    @Test
    public void hello(){
        LeilaoDao mock = Mockito.mock(LeilaoDao.class);
        List<Leilao> leiloes = mock.buscarTodos();
        Assert.assertTrue(leiloes.isEmpty());
    }
}
