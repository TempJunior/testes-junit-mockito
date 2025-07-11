package mock;


import objects_mock.domain.dao.ContratoDao;
import objects_mock.domain.interfaces.IContratoDao;
import objects_mock.mock.ContratoDaoMock;
import org.junit.Assert;
import org.junit.Test;

public class ContratoDaoTest {

    @Test
    public void salvarComSucesso(){
        IContratoDao dao = new ContratoDaoMock();

        String retorno = dao.salvar();
        Assert.assertEquals("Sucess", retorno);
    }

    @Test(expected = RuntimeException.class)
    public void lancaRuntimeException(){
        IContratoDao dao = new ContratoDao();

        String retorno = dao.salvar();
        Assert.assertEquals("Sucess", retorno);
    }

    @Test
    public void retornaMesmoNome(){
        IContratoDao dao = new ContratoDao();

        String nome = "Junior";

        String retur = dao.buscar(nome);

        Assert.assertEquals(nome,retur);
    }

    @Test
    public void retornaTrueNaExclusao(){
        Long id = 12L;
        IContratoDao dao = new ContratoDao();

        boolean retorno = dao.excluir(id);
        Assert.assertTrue(retorno);
    }

    @Test
    public void retornaTrueNaAtualizacao(){
        Long id = 12L;
        IContratoDao dao = new ContratoDao();

        boolean retorno = dao.atualizar(id);
        Assert.assertTrue(retorno);
    }
}
