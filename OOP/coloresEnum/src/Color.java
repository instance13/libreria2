public enum Color {
  ROJO("#FF0000"),
  AMARILLO(
      "#FFFF00"),
  AZUL("#0000FF");

  private String valorHexadecimal;

  private Color(String valorHexadecimal) { // interesante
    this.valorHexadecimal = valorHexadecimal;
  }

  public String getValorHexadecimal() {
    return this.valorHexadecimal;
  }

  public static Color fromHexadecimal(String valorHexadecimal) {
    for (Color color : Color.values()) {
      if (color.getValorHexadecimal().equals(valorHexadecimal)) {
        return color;
      }
    }
    return null;
  }
}