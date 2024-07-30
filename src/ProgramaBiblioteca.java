import entity.Filme;
import entity.Livro;
import entity.Publicacao;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;

public class ProgramaBiblioteca {
    public static void main(String[] args) {

        LocalDateTime dateTime = LocalDateTime.ofInstant(Instant.now(), ZoneId.systemDefault());
        List<Publicacao> list = new ArrayList<>();

        Livro livro = new Livro(
                "titulo-livro",
                "autor-livro",
                dateTime.getYear(),
                "genero-livro",
                "editora-livro",
                10,
                "edicao-livro",
                "121-1313-323231"
        );

        Filme filme = new Filme(
                "titulo-filme",
                "autor-filme",
                dateTime.getYear(),
                "genero-filme",
                "editora-filme",
                20,
                "diretor-filme",
                "ator-filme",
                "sinopse-filme",
                100
        );


        list.add(livro);
        list.add(filme);


        for (Publicacao publi : list) {
            publi.imprimirDados();
            System.out.println("\n");
        }

/*
        V.	Explique com suas palavras porque foi possível adiciona no array de publicação
         um objeto do tipo Filme e um objeto tipo Livro?

         PORQUE FILME E LIVRO É UMA PUBLICAÇÃO, LOGO É FEITO O CAST (OCULTO) QUE PERMITE
         ADCIONAR NO ARRAY PUBLICAÇÃO OS OBJETOS DE LIVRO E FILME


        VI.	Se método imprime dados é abstrato na classe Publicação,
         como é possível imprimir os dados do Livro e do Filme quando o loop é executado

        QUANDO O LOOP É EXECUTADO ELE CHAMA O METODO IMPRIMIR DADOS DE CADA OBJETO
        DA LISTA (filme, livro). e assim como são sobreescritos (override), respondem de forma
        especificas de sua classe.

*/

    }
}