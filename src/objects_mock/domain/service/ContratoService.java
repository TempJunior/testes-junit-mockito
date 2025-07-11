package objects_mock.domain.service;


import objects_mock.domain.interfaces.IContratoDao;

public class ContratoService {
    IContratoDao cliente;

    public ContratoService(IContratoDao cliente){
        this.cliente = cliente;
    }

    public String salvar(){
        cliente.salvar();
        return "Sucess save";
    }

    public String buscar(String nome){
        return cliente.buscar(nome);
    }

    public boolean excluir(Long id){
        return cliente.excluir(id);
    }

    public boolean atualizar(Long id){
        return cliente.atualizar(id);
    }
}
