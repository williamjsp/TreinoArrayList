public class TreinoFuncionario {
    private int id;
    private String nome;
    private double salario;

    public TreinoFuncionario() {
    }

    public TreinoFuncionario(int id, String nome, double salario) {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    private void setSalario(double salario) {
        this.salario = salario;
    }

    public double porcentagemAumentoSalario(double aumento){
        setSalario(salario += salario * (aumento/100));
        return getSalario();
    }

    public String toString(){
        return getId()+ ", "+ getNome()+ ", "+ getSalario();
    }

}
