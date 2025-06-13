package br.com.alura.minhasmusicas.principal;

import br.com.alura.minhasmusicas.modelos.Audio;
import br.com.alura.minhasmusicas.modelos.MinhasPreferidas;

public class Minhaspreferidas extends MinhasPreferidas {
    public class MinhasPreferidas {

        public void inclui(Audio audio) {
            if(audio.getClassificacao() >= 9){
                System.out.println(audio.getTitulo() + " é considerado sucesso absoluto e preferido por todos");
            } else {
                System.out.println(audio.getTitulo() + " também é um dos que todo mundo está curtindo");
            }
        }
    }
}
