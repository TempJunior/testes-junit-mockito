package objects_mock.domain.interfaces;

public interface IContratoDao {
    String salvar();
    String buscar(String item);
    boolean excluir(Long id);
    boolean atualizar(Long id);
}
