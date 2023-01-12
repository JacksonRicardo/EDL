public class Item {
  private int chave;
  private Object elemento;
  public Item(int k, Object o) {
    setChave(k);
    setElemento(o);
}

  public int getChave() {
    return chave;
}
  
  public void setChave(int chave) {
    this.chave = chave;
}
  
  public Object getElemento() {
    return elemento;
}
  
  public void setElemento(Object elemento) {
    this.elemento = elemento;
  }
}