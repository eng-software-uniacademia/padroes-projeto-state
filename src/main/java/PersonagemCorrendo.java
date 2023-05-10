public class PersonagemCorrendo extends PersonagemEstado {
    public PersonagemCorrendo() { }
    private static PersonagemCorrendo instance = new PersonagemCorrendo();
    public static PersonagemCorrendo getInstance() {
        return instance;
    }

    @Override
    public String getEstado() {
        return "Correndo";
    }

    public boolean andar(Personagem personagem) {
        personagem.setEstado(PersonagemAndando.getInstance());
        return true;
    }

    public boolean pular(Personagem personagem) {
        personagem.setEstado(PersonagemPulando.getInstance());
        return true;
    }

    public boolean agachar(Personagem personagem) {
        personagem.setEstado(PersonagemAgachando.getInstance());
        return true;
    }
}
