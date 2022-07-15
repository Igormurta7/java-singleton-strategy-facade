package onedigitalinnovationgof;

import onedigitalinnovationgof.facade.Facade;
import onedigitalinnovationgof.singleton.SingletonEager;
import onedigitalinnovationgof.singleton.SingletonLazy;
import onedigitalinnovationgof.singleton.SingletonLazyHolder;
import onedigitalinnovationgof.strategy.Comportamento;
import onedigitalinnovationgof.strategy.ComportamentoAgressivo;
import onedigitalinnovationgof.strategy.ComportamentoDefensivo;
import onedigitalinnovationgof.strategy.ComportamentoNormal;
import onedigitalinnovationgof.strategy.Robo;

public class Test {

    public static void main(String[] args) {
        
        // Singleton

        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        eager = SingletonEager.getInstancia();
        System.out.println(eager);
        
        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);

        // Strategy 

        Comportamento normal = new ComportamentoNormal();
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);

        robo.mover();
        robo.mover();

        robo.setComportamento(defensivo);

        robo.mover();
        robo.mover();

        robo.setComportamento(agressivo);

        robo.mover();
        robo.mover();

        // Facade 

        Facade facade = new Facade();
        facade.migrarCliente("Igor", "30380752");
    }
    
}
