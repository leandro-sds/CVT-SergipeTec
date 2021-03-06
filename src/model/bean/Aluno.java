package model.bean;

//imports para datas
import java.time.LocalDate;

//holy moly esse classe é grande
public class Aluno extends Pessoa{
    private Responsavel responsavel;
    private Curso curso;
    private String nomePai;
    private String nomeMae;
    private int matricula;
    /*os dados do responsável só são necessário se o aluno for menor de idade*/
    private String dadosEscolaridade;
    private String dadosProfissionais;
    
    //instanciando a classe
    public Aluno(){
        
    }
    
    public Aluno(String nome, String sexo, String CPF, String RG, String CEP, String fone1, 
            String cidadeNasc, String estadoNasc, LocalDate datNasc, int numResidencia, String complemento,
            Responsavel responsavel, int matricula, String nomePai, 
            String nomeMae, String dadosEscolaridade, String dadosProfissionais, Curso curso) {
        super(nome, sexo, CPF, RG, CEP, fone1, cidadeNasc, estadoNasc, datNasc, numResidencia, complemento);
        this.responsavel = responsavel;
        this.matricula = matricula;
        this.nomePai = nomePai;
        this.nomeMae = nomeMae;
        this.dadosEscolaridade = dadosEscolaridade;
        this.dadosProfissionais = dadosProfissionais;  
        this.curso = curso;
    }

    /*Gets e Sets do Aluno*/
    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getDadosEscolaridade() {
        return dadosEscolaridade;
    }

    public void setDadosEscolaridade(String dadosEscolaridade) {
        this.dadosEscolaridade = dadosEscolaridade;
    }

    public String getDadosProfissionais() {
        return dadosProfissionais;
    }

    public void setDadosProfissionais(String dadosProfissionais) {
        this.dadosProfissionais = dadosProfissionais;
    }
    /*Termina Gets e Sets do Aluno*/
    
    /*começa gets e sets dos responsaveis*/
    public void setResponsavel(Responsavel responsavel){
        this.responsavel = responsavel;
    }
    
    public Responsavel getResponsavel(){
        return responsavel;
    }
    
    public void setNomePai(String nomePai) {
        this.nomePai = nomePai;
    }

    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }
    
    public String getNomePai(){
        return nomePai;
    }
    
    public String getNomeMae(){
        return nomeMae;
    }
    
    public String getCPFResponsavel(){
        String CPFResponsavel = responsavel.getCPF();
        return CPFResponsavel;
    }

    public void setCPFResp(String CPF){
        this.responsavel.setCPF(CPF);
    }
    
    public String getNomeResponsavel(){
        String NomeResponsavel = responsavel.getNome();
        return NomeResponsavel;
    }
    
    public String getRGResponsavel(){
        String RGResponsavel = responsavel.getRG();
        return RGResponsavel;
    }
}