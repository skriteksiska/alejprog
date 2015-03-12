public class SloupcovyGraf {
    public static void main(String args[]) {
        
        KreslicGrafu kreslic;
        
        if ((args.length > 0 ) && (args[0] == "s")) {
			kreslic = new SloupcovyGrafDoSvg();
		}
		else {
			kreslic = new SloupcovyGrafNaObrazovku();
		}
        
        kreslic.polozka(0); //:D
    }
}