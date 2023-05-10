public class PersonagemAgachando extends PersonagemEstado {
    public PersonagemAgachando() { }
    private static PersonagemAgachando instance = new PersonagemAgachando();
    public static PersonagemAgachando getInstance() {
        return instance;
    }

    @Override
    public String getEstado() {
        return "Agachando";
    }

    public boolean andar(Personagem personagem) {
        personagem.setEstado(PersonagemAndando.getInstance());
        return true;
    }

    public boolean correr(Personagem personagem) {
        personagem.setEstado(PersonagemCorrendo.getInstance());
        return true;
    }

    public boolean pular(Personagem personagem) {
        personagem.setEstado(PersonagemPulando.getInstance());
        return true;
    }

    public boolean rastejar(Personagem personagem) {
        personagem.setEstado(PersonagemRastejando.getInstance());
        return true;
    }
}
