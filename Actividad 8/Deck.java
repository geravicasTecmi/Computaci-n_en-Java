import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Deck {

    private List<Card> card;
    private Integer numCard = 52;

    public List<Card> getCard() {
        return card;
    }

    public void setCard(List<Card> card) {
        this.card = card;
    }

    public Integer getNumCard() {
        return numCard;
    }

    public void setNumCard(Integer numCard) {
        this.numCard = numCard;
    }

    public String mezclar() {
        Collections.shuffle(card);
        return "mezclando...";
    }

    public void removeCard(int pos){
        this.card.remove(pos);
    }

    public void head(){
        Card card= getCard().get(0);
        System.out.println("{" +card.getPalo() +"},{" +card.getColor() +"},{" +card.getValor() +"}");
        removeCard(0);
        System.out.println("Quedan:" +getCard().size());
    }

    public void pick(){
        Random numRandom = new Random();
        int num = numRandom.nextInt(getCard().size());
        Card card = getCard().get(num);
        System.out.println("{" +card.getPalo() +"},{" +card.getColor() +"},{" +card.getValor() +"}");
        removeCard(num);
        System.out.println("Quedan:" +getCard().size());
    }

    public void hand(){
        for (int i=0; i<5; i++){
            Random numRandom = new Random();
            int num = numRandom.nextInt(getCard().size());
            Card card = getCard().get(num);
            System.out.println("{" +card.getPalo() +"},{" +card.getColor() +"},{" +card.getValor() +"}");
            removeCard(num);
        }
        System.out.println("Quedan:" +getCard().size());
    }

    public void imprimir(){
        for (int n=0; n<getCard().size(); n++){
            Card card = getCard().get(n);
            System.out.println("{" +card.getPalo() +"},{" +card.getColor() +"},{" +card.getValor() +"}");
        }
    }
}