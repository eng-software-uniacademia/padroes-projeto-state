public class PersonagemAtacando extends PersonagemEstado {
    public PersonagemAtacando() { }
    private static PersonagemAtacando instance = new PersonagemAtacando();
    public static PersonagemAtacando getInstance() {
        return instance;
    }

    @Override
    public String getEstado() {
        return "Atacando";
    }

    public boolean andar(Personagem personagem) {
        personagem.setEstado(PersonagemAndando.getInstance());
        return true;
    }

    public boolean correr(Personagem personagem) {
        personagem.setEstado(PersonagemCorrendo.getInstance());
        return true;
    }

    public boolean agachar(Personagem personagem) {
        personagem.setEstado(PersonagemAgachando.getInstance());
        return true;
    }

    public boolean pular(Personagem personagem) {
        personagem.setEstado(PersonagemPulando.getInstance());
        return true;
    }
}
