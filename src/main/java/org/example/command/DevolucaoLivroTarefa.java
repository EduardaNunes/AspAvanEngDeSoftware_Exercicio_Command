package org.example.command;

public class DevolucaoLivroTarefa implements Tarefa {

    private Livro livro;

    public DevolucaoLivroTarefa(Livro livro) {
        this.livro = livro;
    }

    public void executar() {
        this.livro.devolverLivro();
    }

    public void cancelar() {
        this.livro.emprestarLivro();
    }
}
