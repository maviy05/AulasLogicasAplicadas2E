public class Main {

        public static void main (String[] args) {
            //Aula introdutoria de orientação a objeto
           // Aula introdutória de Orientação à Objetos
           Pessoa adao = new Pessoa();
          //Declaração de objeto
           Pessoa qualquer;
         // Instanciação de objeto
        qualquer = new Pessoa();
        // Definição do formato da pessoa qualquer
        qualquer.nome = "Rita";
        qualquer.sobrenome = "Lee";
        qualquer.falar();

       //criar novos objetos
      // declarar objetos
      Pessoa rainha ;
      // instaciar objetos
       rainha = new Pessoa();
     // definir forma   de objeto
     rainha.nome = "Tina";
     rainha.sobrenome = "Turner";
     //definir comportamento do objeto
      rainha.falar();
      System.out.println(rainha.falar("alto"));
      rainha.comer();

    }

    }


