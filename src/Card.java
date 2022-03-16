public class Card {

    public String Color;
    public String Palo;
    public int Valor;

    public Card(String palo, int valor, String color){
        Color = color;
        Palo = palo;
        Valor = valor;
    }

    public String getCardValue(){
        if (Valor==1) return "A";
        if (Valor>=2 && Valor <= 10) return Integer.toString(Valor);
        if (Valor==11) return "J";
        if (Valor==12) return "Q";
        if (Valor==13) return "K";
        return "";
    }

    public String ToString(){
        return "Palo: " + Palo + ", Color: " + Color + ", Valor: " + getCardValue();
    }
}
