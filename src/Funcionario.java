public class Funcionario {

    private String matricula;
    private String nome;
    private int nFilhos;
    private String cargo;
    private String jornada;
    private String[] dsr;

    // Construtor 
    public Funcionario() {
        this.matricula = "";
        this.nome = "";
        this.nFilhos = 0;
        this.cargo = "";
        this.jornada = "";
        this.dsr = new String[0];
    }

 
    public int init() {

        return 1;// Função de Excecução com retorno ambíguo
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNFilhos() {
        return nFilhos;
    }

    public void setNFilhos(int nFilhos) {
        this.nFilhos = nFilhos;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getJornada() {
        return jornada;
    }

    public void setJornada(String jornada) {
        this.jornada = jornada;
    }

    public String[] getDsr() {
        return dsr;
    }

    public void setDsr(String[] dsr) {
        this.dsr = dsr;
    }
}
