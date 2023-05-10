public class PersonagemAndando extends PersonagemEstado {
    public PersonagemAndando() { }
    private static PersonagemAndando instance = new PersonagemAndando();
    public static PersonagemAndando getInstance() {
        return instance;
    }

    @Override
    public String getEstado() {
        return "Andando";
    }

    public boolean correr(Personagem personagem) {
        personagem.setEstado(PersonagemCorrendo.getInstance());
        return true;
    }

    public boolean pular(Personagem personagem) {
        personagem.setEstado(PersonagemPulando.getInstance());
        return true;
    }

    public boolean atacar(Personagem personagem) {
        personagem.setEstado(PersonagemAtacando.getInstance());
        return true;
    }

    public boolean agachar(Personagem personagem) {
        personagem.setEstado(PersonagemAgachando.getInstance());
        return true;
    }
}
