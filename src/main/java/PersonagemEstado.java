public abstract class PersonagemEstado {
    public abstract String getEstado();

    public boolean andar(Personagem personagem) {
        return false;
    }

    public boolean correr(Personagem personagem) {
        return false;
    }

    public boolean pular(Personagem personagem) {
        return false;
    }

    public boolean atacar(Personagem personagem) {
        return false;
    }

    public boolean rastejar(Personagem personagem) {
        return false;
    }

    public boolean agachar(Personagem personagem) {
        return false;
    }
}
