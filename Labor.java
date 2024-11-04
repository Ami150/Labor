
public class Labor
{
    private String gebäude = "C";
    private int stock = 5;    
    private boolean beamer = true;
    private int anzPlätze= 20;
    
    
    public Labor (String neuGebäude, int neuStock, boolean neuBeamer, int neuAnzPlätze){
        setGebäude(neuGebäude);
        setStock(neuStock);
        setBeamer(neuBeamer);
        setAnzPlätze(neuAnzPlätze);
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
    
    public void setGebäude (String neuGebäude) {
    
        gebäude = neuGebäude;
    }
    
    
    public void setStock(int neuStock) {
        stock = neuStock;
    }
    
    public void setBeamer(boolean neuBeamer){
        beamer = neuBeamer;
    }
    
    public void setAnzPlätze(int neuAnzPlätze) {
        anzPlätze = neuAnzPlätze;
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
