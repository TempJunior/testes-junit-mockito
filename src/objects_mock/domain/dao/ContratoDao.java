package objects_mock.domain.dao;


import objects_mock.domain.interfaces.IContratoDao;

public class ContratoDao implements IContratoDao {
    @Override
    public String salvar() {
        throw new RuntimeException("Exception throwed");
        //return "Sucess";
    }

    @Override
    public String buscar(String item) {
        return item;
    }

    @Override
    public boolean excluir(Long id) {
        System.out.println("Usuario com id: " + id + " excluido! ");
        return true;
    }

    @Override
    public boolean atualizar(Long id) {
        System.out.println("Usuario com id: " + id + " atualizado! ");
        return true;
    }
}
