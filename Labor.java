
public class Labor
{
    private String gebäude = "C";
    private int stock = 5;    
    private boolean beamer = true;
    private int anzPlätze= 20;
    
    
    public Labor (String gebäude, int stock, boolean beamer, int anzPlätze){
        setGebäude(gebäude);
        setStock(stock);
        setBeamer(beamer);
        setAnzPlätze(anzPlätze);
    }
    
    public Labor (String neuGebäude, int neuStock, boolean neuBeamer){
        setGebäude(neuGebäude);
        setStock(neuStock);
        setBeamer(neuBeamer);
        setAnzPlätze(20);
    }
    
    public Labor (String neuGebäude, boolean neuBeamer, int neuAnzPlätze){
        setGebäude(neuGebäude);
        setBeamer(neuBeamer);
        setAnzPlätze(neuAnzPlätze);
        setStock(5);
    }
    
    public Labor (String neuGebäude, int neuStock, int neuAnzPlätze){
        setGebäude(neuGebäude);
        setStock(neuStock);
        setBeamer(true);
        setAnzPlätze(neuAnzPlätze);
    }
    
    public Labor (int neuStock){
        setGebäude("C");
        setStock(neuStock);
        setBeamer(true);
        setAnzPlätze(20);
    }
    
    public Labor (){
        setGebäude("C");
        setStock(5);
        setBeamer(true);
        setAnzPlätze(20);
    }
    
    public void setGebäude (String gebäude) {
    
        this.gebäude = gebäude;
    }
    
    
    public void setStock(int stock) {
        this.stock = stock;
    }
    
    public void setBeamer(boolean beamer){
        this.beamer = beamer;
    }
    
    public void setAnzPlätze(int anzPlätze) {
        this.anzPlätze = anzPlätze;
    }
    
    
    public String getGebäude(){
        return gebäude;
    }
    
    public int getStock(){
        return stock;
    }
    
    public boolean getBeamer(){
        return beamer;
    }
    
    public int getanzPlätze(){
        return anzPlätze;
    }
    
    public void printLabor(){
        System.out.println();
    }
}
