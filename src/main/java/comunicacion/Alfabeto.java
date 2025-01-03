package comunicacion;
public class Alfabeto extends Pictograma{
    private String[] letras;
    private String interpretacion;

    public Alfabeto(String origen,String[] letras,String interpretacion){
        super(origen);
        this.letras=letras;
        this.interpretacion=interpretacion;
    }

    public String[] getLetras() {
        return letras;
    }

    public void setLetras(String[] letras) {
        this.letras = letras;
    }

    public void setInterpretacion(String interpretacion) {
        this.interpretacion = interpretacion;
    }

    public String interpretacion() {
        return interpretacion;
    }

    public int cantidadLetras(){
        return letras.length;
    }

    public String toString(){
        int c=0;
        String res=null;
        while(c != letras.length) {
            res+=letras[c]+", ";
        }
        if(c == letras.length) {
            res+=letras[c];
        }
        return res;
    }
}
