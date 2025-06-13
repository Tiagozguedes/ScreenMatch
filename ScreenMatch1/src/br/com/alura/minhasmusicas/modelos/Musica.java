package br.com.alura.minhasmusicas.modelos;

public class Musica extends Audio {
    private String nome;
    private String cantor;
    private String genero;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCantor() {
        return cantor;
    }

    public void setCantor(String cantor) {
        this.cantor = cantor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public int getClassificacao () {
        if(this.getTotalReproducoes() > 200){
            return 10;
        } else {
            return 7;
        }
    }
}


