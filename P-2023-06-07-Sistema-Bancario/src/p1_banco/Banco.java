//Fonte: https://github.com/falvojr/lab-banco-digital-oo/tree/master

package p1_banco;

import java.util.List;

public class Banco {

        private String nome;
        private List<Conta> contas;

        public String getNome() {
            System.out.println("Nome dentro da classe Banco: " + nome);
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public List<Conta> getContas() {
            return contas;
        }

        public void setContas(List<Conta> contas) {
            this.contas = contas;
        }


}
