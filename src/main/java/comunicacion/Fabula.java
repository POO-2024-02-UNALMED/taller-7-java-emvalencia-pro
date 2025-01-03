package comunicacion;
public class Fabula extends Escrito{
    private String ensenanza;
    private String interpretacion;

    public Fabula(String origen,String titulo,String autor,int paginas,String ensenanzas,String interpretacion){
        super(origen,titulo,autor,paginas);
        this.ensenanza=ensenanzas;
        this.interpretacion=interpretacion;
    }

    public String getEnsenanza(){
        return ensenanza;
    }

    public void setEnsenanza(String ens){
        this.ensenanza=ens;
    }

    public void setInterpretacion(String inter){
        this.interpretacion=inter;
    }

    public int palabrasTotales(int palabrasPagina){
        return getPaginas()*palabrasPagina*1;
    }

    public String interpretacion(){
        return interpretacion;
    }

    public String toString(){
        return getOrigen() + "\n" + getTitulo() + "\n" + getAutor() + "\n" + getPaginas() + "\n" + ensenanza;
    }
}
