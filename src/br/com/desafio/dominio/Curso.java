package br.com.desafio.dominio;

public class Curso {

    private String titulo;
    private String desfricao;
    private int cargaHoraria;

   /* public Curso(String titulo, String desfricao, int cargaHoraria) {
        this.titulo = titulo;
        this.desfricao = desfricao;
        this.cargaHoraria = cargaHoraria;
    }*/

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDesfricao() {
        return desfricao;
    }

    public void setDesfricao(String desfricao) {
        this.desfricao = desfricao;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + titulo + '\'' +
                ", desfricao='" + desfricao + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }
}
