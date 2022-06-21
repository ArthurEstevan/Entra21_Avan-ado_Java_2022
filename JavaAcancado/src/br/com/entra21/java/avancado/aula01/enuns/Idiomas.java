package br.com.entra21.java.avancado.aula01.enuns;

public enum Idiomas { 
		BRASIL("Portugu�s"), EUA("Ingl�s")  , ALEMANHA("Alem�o") , ARGENTINA("Espanhol");
		

        private final String valor;
        
        private Idiomas(String valor) {
            this.valor = valor;
        }
 
        public String getValor() {
            return this.valor;
        } 
}
