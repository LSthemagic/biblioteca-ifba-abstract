package entity;

public class Filme extends Publicacao{

    private String diretor, atorPrincipal, sinopse;
    private int tempoDuracao;

    public Filme(String titulo, String autor, Integer anoPublicacao, String genero, String editora, Integer quantidadeDisponivel, String diretor, String atorPrincipal, String sinopse, int tempoDuracao) {
        super(titulo, autor, anoPublicacao, genero, editora, quantidadeDisponivel);
        this.diretor = diretor;
        this.atorPrincipal = atorPrincipal;
        this.sinopse = sinopse;
        this.tempoDuracao = tempoDuracao;
    }

    @Override
    public void imprimirDados() {

        System.out.println(super.dadosComuns()+", " +
                "diretor='" + diretor + '\'' +
                ", atorPrincipal='" + atorPrincipal + '\'' +
                ", sinopse='" + sinopse + '\'' +
                ", tempoDuracao=" + tempoDuracao +" }");

    }
}
