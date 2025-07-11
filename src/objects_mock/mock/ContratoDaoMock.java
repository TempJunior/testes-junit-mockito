package objects_mock.mock;


import objects_mock.domain.interfaces.IContratoDao;

public class ContratoDaoMock implements IContratoDao {
    @Override
    public String salvar() {
        return "Sucess";
    }

    @Override
    public String buscar(String item) {
        return "";
    }

    @Override
    public boolean excluir(Long id) {
        return false;
    }

    @Override
    public boolean atualizar(Long id) {
        return false;
    }
}
