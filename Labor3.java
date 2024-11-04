public class Labor3{

private String gebäude = "C";
private int stock = 5;
private boolean beamer = true;
private int anzPlätze = 20; 

public Labor3(String gebäude, int stock, boolean beamer, int anzPlätze){
setGebäude(gebäude);
setStock(stock);
setBeamer(beamer);
setAnzPlätze(anzPlätze);
}

public Labor3(String gebäude, int stock, boolean beamer){
setGebäude(gebäude);
setStock(stock);
setBeamer(beamer);
setAnzPlätze(20);
}

public Labor3(String gebäude, int stock, int anzPlätze){
setGebäude(gebäude);
setStock(stock);
setAnzPlätze(anzPlätze);
setBeamer(true);
}

public Labor3(int Stock){
setStock(stock);
setGebäude("C");
setAnzPlätze(20);
setBeamer(true);
}

public Labor3(){
setGebäude("C");
setStock(5);
setAnzPlätze(20);
setBeamer(true);
}

public void setGebäude(String gebäude){
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

public String getGebäude(){
return gebäude;
}

public int getStock() {
return stock;
}

public boolean getBeamer() {
return beamer;
}

public int getAnzPlätze(){
return anzPlätze;
}

public void printLabor3(){
if(beamer == false ) {
System.out.println("Beamer - " + gebäude + ("Gebäude " + stock + ". Stock - " + anzPlätze + " Plätze" ));
} else 
System.out.println("Kein Beamer - " + gebäude + (" Gebäude " + stock + ". Stock - " + anzPlätze + " Plätze" ));
}

}