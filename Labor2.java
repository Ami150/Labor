
public class Labor2
{
    private String gebäude = "C";
    private int stock = 5;
    private boolean beamer = true;
    private int anzPlätze = 20;
    
    
    public Labor2(String gebäude, int stock, boolean beamer, int anzPlätze){
    setGebäude(gebäude);
    setStock(stock);
    setBeamer(beamer);
    setAnzPlätze(anzPlätze);
    }
    
    public Labor2(String gebäude, int stock, boolean beamer){
    setGebäude(gebäude);
    setStock(stock);
    setBeamer(beamer);
    setAnzPlätze(20);
    }
    
    public Labor2(String gebäude, int stock, int anzPlätze){
    setGebäude(gebäude);
    setStock(stock);
    setAnzPlätze(anzPlätze);
    setBeamer(true);
    }
    
    public Labor2(int Stock){
    setStock(stock);
    setGebäude("C");
    setAnzPlätze(20);
    setBeamer(true);
    }
    
    public Labor2(){
    setStock(5);
    setGebäude("C");
    setAnzPlätze(20);
    setBeamer(true);
    }
    
    public void setGebäude(String gebäude) {
    this.gebäude = gebäude; 
    }
    
    public void setStock(int stock){
    this.stock = stock;
    }
    
    public void setBeamer(boolean beamer){
    this.beamer = beamer;
    }
    
    public void setAnzPlätze(int anzPlätze){
    this.anzPlätze = anzPlätze;
    }
    
    
    public String getGebäude() {
    return gebäude;
    }
    
    public int getStock(){
    return stock;
    }
    
    public boolean getbeamer(){
    return beamer;
    }
    
    public int getAnzplätze(){
    return anzPlätze;
    }
    
    public void printLabor2(){
    System.out.println("Gebäude: " + gebäude + ".");
    System.out.println("Stock: " + stock + ".");
    System.out.println("Beamer: " + beamer + ".");
    System.out.println("Anzahl der Plätze: " + anzPlätze + ".");
    }
    
}
