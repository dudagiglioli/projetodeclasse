public class classe {

    //cliente
    String nomecompleto, email, cel;

    public String getNomecompleto() {
        String Nomecompleto = nomecompleto;
        return nomecompleto;
    }

    public String getEmail(){
        String Email = email;
        return Email;
    }

    public String getCel(){
        String Cel = cel;
        return Cel;
    }

    //produto

    String nome1, nome2;
    double p1, p2, total;
    int qtde1, qtde2;

    public String getNome1(){
        String Nome1 = nome1;
        return Nome1;
    }

    public String getNome2(){
        String Nome2 = nome2;
        return Nome2;
    }

    public double getP1(){
        double P1 = p1;
        return P1;
    }

    public double getP2(){
     double P2 = p2;
        return P2;
    }

    public int getQtde1(){
        int Qtde1 = qtde1;
        return Qtde1;
    }

    public int getQtde2(){
        int Qtde2 = qtde2;
        return Qtde2;
    }

    public double getTotal(){
        double Total = (p1 * qtde1) + (p2 * qtde2);
        return Total;
    }

    //vendedor

    String nome;
    double comissao;

    public String getNome() {
        String Nome = nome;
        return Nome;
    }

    public double getComissao(){
        double Comissao = getTotal() * 0.1;
        return Comissao;
    }
}
