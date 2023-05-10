public class PersonagemRastejando extends PersonagemEstado {
    public PersonagemRastejando() { }
    private static PersonagemRastejando instance = new PersonagemRastejando();
    public static PersonagemRastejando getInstance() {
        return instance;
    }

    @Override
    public String getEstado() {
        return "Rastejando";
    }

    public boolean agachar(Personagem personagem) {
        personagem.setEstado(PersonagemAgachando.getInstance());
        return true;
    }
}
