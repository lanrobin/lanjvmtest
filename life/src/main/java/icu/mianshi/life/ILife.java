package icu.mianshi.life;


public interface ILife {
    boolean isAlive();
    Kingdom getKingdom();

    public enum Kingdom {
        Animalia,
        Plantae,
        Fungi,
        Protista
    }
}
