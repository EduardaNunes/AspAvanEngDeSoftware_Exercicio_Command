package org.example.command;

public class EmprestimoLivroTarefa implements Tarefa{

    private Livro livro;

    public EmprestimoLivroTarefa(Livro livro) {
        this.livro = livro;
    }

    public void executar() {
        this.livro.emprestarLivro();
    }

    public void cancelar() {
        this.livro.devolverLivro();
    }
}
