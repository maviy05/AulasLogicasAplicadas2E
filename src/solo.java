public class solo {

    // Atributos

    String tiposSolo;
    String cor;
    boolean fertil;

    //Metodos

    public Planta gerarPlanta(Semente s1){
        Planta p1 = new Planta(s1);
        return p1;
    }
}
