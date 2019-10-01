
package punto5;


public class Productos {
    String pro;
    Float prec;
    int cant;
    double iva;

    public void setCant(int cant) {
        this.cant = cant;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public void setPrec(Float prec) {
        this.prec = prec;
    }

    public void setPro(String pro) {
        this.pro = pro;
    }

    public int getCant() {
        return cant;
    }

    public double getIva() {
        return iva;
    }

    public Float getPrec() {
        return prec;
    }

    public String getPro() {
        return pro;
    }

    
    
    
    
}
