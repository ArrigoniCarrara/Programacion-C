public class Zafiro extends Gema{
    public Zafiro() {
    }

    public String Combinar(Gema gema) {
        return gema.CombinarZafiro(this);
    }

    @Override
    public String CombinarRubi(Rubi gema){
        return  "Erupcion Volcanica";
    }

    @Override
    public String CombinarZafiro(Zafiro gema){
        return  "Inundacion";
    }

    @Override
    public String CombinarEsmeralda(Esmeralda gema){
        return  "Huracan";
    }

    @Override
    public String CombinarDiamante(Diamante gema){
        return  "Granizo Asesino";
    }
}
