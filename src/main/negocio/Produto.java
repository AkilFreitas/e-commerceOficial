
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import negocio.Categoria;
import negocio.Tamanho;
import negocio.Fornecedor;
@Entity
public class Produto {
    
    @Id
    @GeneratedValue
    private int id;
    @Column(length = 20)
    private String nome;
    @Column(length = 20)
    private String marca;
    @Column(length = 20)
    Categoria categoria;
    @Column(length = 20)
    private String descricao;
    @Column(length = 20)
    private float preco;
    @Column(length = 20)
    private String imagem;
    @Column(length = 20)
    Tamanho tamanho;
    @Column(length = 20)
    private Boolean disponivel;
    @Column(length = 20)
    private boolean promocao;
    @Column(length = 20)
    Fornecedor fornecedor;

    public Produto() {
    }
}