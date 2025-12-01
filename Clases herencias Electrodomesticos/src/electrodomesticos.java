public enum Color {
        BLANCO, NEGRO, ROJO, AZUL, GRIS;
    }

    protected double precio = 100;
    protected Color color = Color.BLANCO;
    protected String consumoEnergetico = "A";
    protected double peso = 10;

    public electrodomesticos(Color color, String consumoEnergetico, double peso, double precio) {
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
        this.precio = precio;
        this.consumoEnergetico = comprobarConsumoEnergetico(consumoEnergetico);

    }

    public electrodomesticos() {
    }

    public Color getColor() {
        return color;
    }

    public String getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public double getPeso() {
        return peso;
    }

    public double getPrecio() {
        return precio;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setConsumoEnergetico(String consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    private String comprobarConsumoEnergetico(String letra) {
        letra = letra.toUpperCase();

        if (letra.equals("A") ||
                letra.equals("B") ||
                letra.equals("C") ||
                letra.equals("D") ||
                letra.equals("A+") ||
                letra.equals("E") ||
                letra.equals("F")) {

            return letra;
        } else {
            return "A";  // valor por defecto
        }
    }
    @Override
    public String toString() {
        return "Precio: " + precio + "€" +
                "Consumo energético: " + consumoEnergetico + "" +
                "Peso: " + peso + " kg";
    }
    public double precioFinal() {
        double precioFinal = this.precio;
        String consumoEnergetico = this.consumoEnergetico;

        if (consumoEnergetico.equals("A+")) {
            precioFinal += 120;
        } else if (consumoEnergetico.equals("A")) {
            precioFinal += 100;
        } else if (consumoEnergetico.equals("B")) {
            precioFinal += 80;
        } else if (consumoEnergetico.equals("C")) {
            precioFinal += 60;
        } else if (consumoEnergetico.equals("D")) {
            precioFinal += 50;
        } else if (consumoEnergetico.equals("E")) {
            precioFinal += 30;
        } else if (consumoEnergetico.equals("F")) {
            precioFinal += 10;
        }
        if (peso > 0 && peso <= 19) {
            precioFinal += 10;
        } else if (peso >=20 && peso <=49) {
            precioFinal += 30;
        }else if (peso >=50 && peso <=79) {
            precioFinal += 50;
        }else if (peso >=80) {
            precioFinal += 100;
        }

        return precioFinal;
    }

}




