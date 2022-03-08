public class Prova{
    public static void main(String[] args)
    {
        Supermercato coop = new Supermercato();

        coop.setMaxClienti(20);
        // ad ogni istanza aumenta il rischio potenziale
        // ( possiamo immaginarlo come le persone in attesa fuori dal supermercato)
        Cliente a = new Cliente();
        Cliente b = new Cliente();
        Cliente c = new Cliente();
        Cliente d = new Cliente();
        Cliente e = new Cliente();
        Cliente f = new Cliente();
        Cliente g = new Cliente();
        Cliente h = new Cliente();
        Cliente i = new Cliente();
        Cliente l = new Cliente();
        Cliente m = new Cliente();
        Cliente n = new Cliente();
        // stampa non coerente perchè il supermercato conta gli inseriti
        // mentre il cliente ha la percezione delle istanze generate ( come in fila di attesa...)
        System.out.println("Il rischio interno INIZIALE del supermercato ( persone entrate) "+ coop.getRischioInterno());
        System.out.println("Il rischio covid INIZIALE percepito dal cliente ancora prima di entrare " + a.getRischio(coop.getMaxClienti()));
        // adesso inzia l'entrata al supermercato. La coop registra le entrate e modifica il suo colore di rischio
        coop.getMaxClienti();
        coop.addClienti(a);
        coop.addClienti(b);
        coop.addClienti(c);
        coop.addClienti(d);
        System.out.println("Il rischio interno INTERMEDIO  del supermercato ( persone entrate) "+ coop.getRischioInterno());
        System.out.println("Il rischio covid INTERMEDIO  percepito dal cliente ancora prima di entrare " + a.getRischio(coop.getMaxClienti()));
        coop.addClienti(e);
        coop.addClienti(f);
        coop.addClienti(g);
        coop.addClienti(h);
        coop.addClienti(i);
        coop.addClienti(l);
        coop.addClienti(m);
        coop.addClienti(n);
        // stampe finali e valutazione per due clienti diversi del funzionamento della variabile di classe
        System.out.println("Il rischio interno FINALE del supermercato ( persone entrate) "+ coop.getRischioInterno());
        System.out.println("Il rischio covid FINALE percepito dal cliente ancora prima di entrare " + a.getRischio(coop.getMaxClienti()));
        System.out.println("Il rischio covid FINALE percepito da un altro cliente ancora prima di entrare " + c.getRischio(coop.getMaxClienti()));
    }
}
