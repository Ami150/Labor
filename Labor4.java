public class Labor4{

    private String gebäude;
    private String raum;
    private int stock;
    private boolean beamer;
    private int anzPlätze;
    
    public Labor4(String gebäude, String raum, int Stock, boolean beamer, int anzPlätze){
    setGebäude(gebäude);
    setRaum(raum);
    setStock(stock);
    setBeamer(beamer);
    setAnzPlätze(anzPlätze);
    }
    
    public Labor4(String gebäude, int stock, boolean beamer, int anzPlätze){
    setGebäude(gebäude);
    setStock(stock);
    setBeamer(beamer);
    setAnzPlätze(anzPlätze);
    }
    
    public Labor4(String gebäude, int stock, boolean beamer){
    setGebäude(gebäude);
    setStock(stock);
    setBeamer(beamer);
    setAnzPlätze(20);
    }
    
    public Labor4(String gebäude, int stock, int anzPlätze){
    setGebäude(gebäude);
    setStock(stock);
    setBeamer(true);
    setAnzPlätze(anzPlätze);
    }
    
    public Labor4(int stock){
    setGebäude("C");
    setStock(stock);
    setBeamer(true);
    setAnzPlätze(20);
    }
    
    public Labor4(){
    setGebäude("C");
    setRaum("C.03.27A");
    setStock(5);
    setBeamer(true);
    setAnzPlätze(20);
    }
    
    
    public void setGebäude(String gebäude){
    this.gebäude = gebäude;
    }
    
    public void setRaum(String raum){
    this.raum = raum;
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
    
    
    public String getZimmernummer(){
    String zimmernummer;
    int pos;
    
    pos = raum.lastIndexOf(".") +1;
    zimmernummer = raum.substring(pos); 
    
    return zimmernummer;
    }
    
    public String getLaborStock(){
    String stock;
    int pos1;
    int pos2;
    
    pos1 = raum.indexOf(".")+1;
    pos2 = raum.indexOf(".", pos1);
    stock = raum.substring(pos1, pos2);
    
    return stock;
    }
    
    public String getGebäude(){
    return gebäude;
    }
    
    public String getRaum(){
    return raum;
    }
    
    public int getStock(){
    return stock;
    }
    
    public boolean getBeamer() {
    return beamer;
    }
    
    public int getAnzPlätze(){
    return anzPlätze;
    }
}