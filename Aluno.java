public class Aluno {

    String nome;
    String curso;

    public void apresentar() {
        System.out.println("Meu nome é " + nome);
        System.out.println("Curso: " + curso);
    }

    public static void main(String[] args) {

        Aluno aluno1 = new Aluno();

        aluno1.nome = "Amanda";
        aluno1.curso = "Desenvolvimento de Sistemas";

        aluno1.apresentar();
    }
}