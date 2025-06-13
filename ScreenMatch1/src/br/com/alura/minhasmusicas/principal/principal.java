package br.com.alura.minhasmusicas.principal;

import br.com.alura.minhasmusicas.modelos.MinhasPreferidas;
import br.com.alura.minhasmusicas.modelos.Musica;
import br.com.alura.minhasmusicas.modelos.Podcast;

public class principal {
    public static void main(String[] args) {
        Musica minhamusica = new Musica();
        minhamusica.setTitulo("Forever");
        minhamusica.setCantor("Kiss");

        for (int i = 0; i < 1000; i++){
            minhamusica.reproduz();
        }

        for (int i = 0; i < 50; i++){
            minhamusica.curte();
        }

        Podcast meuPodcast = new Podcast();
        meuPodcast.setTitulo("BolhaDev");
        meuPodcast.setApresentador("Marcos Mendes");

        for (int i = 0; i < 5000; i++) {
            meuPodcast.reproduz();
        }

        for (int i =0; i <1000; i++){
            meuPodcast.curte();
        }

        MinhasPreferidas preferidas = new Minhaspreferidas();
        preferidas.inclui(meuPodcast);
        preferidas.inclui(minhamusica);

    }
}
