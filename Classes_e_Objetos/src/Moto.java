public class Moto {

    public String marca;
    public Double potencia;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia (Double potencia) {
        this.potencia = potencia;
    }

    public Moto(String marca, Double potencia) {

        this.marca = marca;
        this.potencia = potencia;
    }}

