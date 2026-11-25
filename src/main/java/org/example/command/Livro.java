package org.example.command;

public class Livro {

    private String titulo;
    private String autor;
    private String situacao;

    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getSituacao() {
        return situacao;
    }

    public void emprestarLivro() {
        this.situacao = "Livro emprestado";
    }

    public void devolverLivro() {
        this.situacao = "Livro disponível";
    }
}
