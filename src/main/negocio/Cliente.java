
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import negocio.Endereco;
//import negocio.Usuario;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author 20151d12gr0316
 */
@Entity
public class Cliente {

    @Id
    @GeneratedValue
    private int id;
    @Column(length = 20)
    private int idade;
    @Column(length = 20)
    private int rg;
    @Column(length = 20)
    private String cpf;
    @Column(length = 20)
    private String telefone;
    @Column(length = 20)
    private String nome;
    @Column(length = 20)
    private String email;
    @Column(length = 20)
    private String dataDeNascimento;
    @Column(length = 20)
    private String sexo;
    @Column(length = 20)
    Endereco endereco;
    @Column(length = 20)
    Usuario login;

    public Cliente() {
    }

    public Cliente(int id, int idade, int rg, String cpf, String telefone, String nome, String email, String dataDeNascimento, String sexo, Endereco endereco, Usuario login) {
        this.id = id;
        this.idade = idade;
        this.rg = rg;
        this.cpf = cpf;
        this.telefone = telefone;
        this.nome = nome;
        this.email = email;
        this.dataDeNascimento = dataDeNascimento;
        this.sexo = sexo;
        this.endereco = endereco;
        this.login = login;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getRg() {
        return rg;
    }

    public void setRg(int rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Usuario getLogin() {
        return login;
    }

    public void setLogin(Usuario login) {
        this.login = login;
    }

    public void manterCliente() {

    }

    public void efetuaLogin() {

    }

    public void efetuaCompra() {

    }

}
