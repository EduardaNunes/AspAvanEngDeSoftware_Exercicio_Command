package command;

import org.example.command.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BibliotecaTest {

    Biblioteca biblioteca;
    Livro livro;

    @BeforeEach
    void setUp() {
        biblioteca = new Biblioteca();
        livro = new Livro("Padrões de Projeto", "Erich Gamma");
    }

    @Test
    void deveEmprestarLivro() {
        Tarefa emprestimoLivro = new EmprestimoLivroTarefa(livro);
        biblioteca.executarTarefa(emprestimoLivro);

        assertEquals("Livro emprestado", livro.getSituacao());
    }

    @Test
    void deveDevolverLivro() {
        Tarefa devolucaoLivro = new DevolucaoLivroTarefa(livro);
        biblioteca.executarTarefa(devolucaoLivro);

        assertEquals("Livro disponível", livro.getSituacao());
    }

    @Test
    void deveCancelarDevolucaoLivro() {
        Tarefa emprestimoLivro = new EmprestimoLivroTarefa(livro);
        Tarefa devolucaoLivro = new DevolucaoLivroTarefa(livro);

        biblioteca.executarTarefa(emprestimoLivro);
        biblioteca.executarTarefa(devolucaoLivro);

        biblioteca.cancelarUltimaTarefa();

        assertEquals("Livro emprestado", livro.getSituacao());
    }

}
