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
        int c=1;
        String res=letras[0]+", ";
        while(c+1 != letras.length) {
            res+=letras[c]+", ";
            c++;
        }
        if(c+1 == letras.length) {
            res+=letras[c];
        }
        return res;
    }
}
