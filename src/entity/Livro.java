package entity;

public class Livro extends Publicacao{

    private String edicao;
    private String isbn;



    public Livro(String titulo, String autor, Integer anoPublicacao, String genero, String editora, Integer quantidadeDisponivel, String edicao, String isbn) {
        super(titulo, autor, anoPublicacao, genero, editora, quantidadeDisponivel);
        this.edicao = edicao;
        this.isbn = isbn;
    }

    @Override
    public void imprimirDados() {
        System.out.println(super.dadosComuns()+", " +
                "edicao='" + edicao + '\'' +
                ", isbn='" + isbn + '\'' +" }");
    }
}
