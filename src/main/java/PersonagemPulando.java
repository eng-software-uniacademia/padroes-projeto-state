public class PersonagemPulando extends PersonagemEstado {
    public PersonagemPulando() { }
    private static PersonagemPulando instance = new PersonagemPulando();
    public static PersonagemPulando getInstance() {
        return instance;
    }

    @Override
    public String getEstado() {
        return "Pulando";
    }

    public boolean andar(Personagem personagem) {
        personagem.setEstado(PersonagemAndando.getInstance());
        return true;
    }

    public boolean correr(Personagem personagem) {
        personagem.setEstado(PersonagemCorrendo.getInstance());
        return true;
    }
}
