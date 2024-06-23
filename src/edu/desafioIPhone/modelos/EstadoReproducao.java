package edu.desafioIPhone.modelos;

import edu.desafioIPhone.aplicativos.Reprodutor;

public enum  EstadoReproducao implements Reprodutor {
    PARADO() {
        @Override
        public void tocar() {
            System.out.println("Iniciando reprodução...");
        }

        @Override
        public void pausar() {
            throw new IllegalStateException("Não é possível pausar quando parado.");
        }

        public void parar() {
            System.out.println("Reprodução parada.");
        }

        @Override
        public boolean isReproduzindo() {
            return false;
        }

        @Override
        public void proximo() {
          System.out.println("Iniciando reprodução do proximo elemento");
        }

        @Override
        public void anterior() {
          System.out.println("Iniciando reprodução do elemento anterior");
        }

        @Override
        public void selecionarTempo() {
          System.out.println("Selecionando o tempo para posicionar a faixa da reprodução");
        }
    },
    REPRODUZINDO() {
        @Override
        public void tocar() {
            System.out.println("A reprodução já está em andamento.");
        }

        @Override
        public void pausar() {
            System.out.println("Reprodução pausada.");
        }

        public void parar() {
            System.out.println("Reprodução parada.");
        }

        @Override
        public boolean isReproduzindo() {
            return true;
        }
        @Override
        public void proximo() {
          System.out.println("Iniciando reprodução do proximo elemento");
        }

        @Override
        public void anterior() {
          System.out.println("Iniciando reprodução do elemento anterior");
        }

        @Override
        public void selecionarTempo() {
          System.out.println("Selecionando o tempo para posicionar a faixa da reprodução");
        }
    },
    PAUSADO() {
        @Override
        public void tocar() {
            System.out.println("Retomando a reprodução...");
        }

        @Override
        public void pausar() {
            System.out.println("Reprodução já está pausada.");
        }

        @Override
        public boolean isReproduzindo() {
            return false;
        }

        @Override
        public void proximo() {
          System.out.println("Iniciando reprodução do proximo elemento");
        }

        @Override
        public void anterior() {
          System.out.println("Iniciando reprodução do elemento anterior");
        }

        @Override
        public void selecionarTempo() {
          System.out.println("Selecionando o tempo para posicionar a faixa da reprodução");
        }
      };

      public abstract void tocar();
      public abstract boolean isReproduzindo();
}