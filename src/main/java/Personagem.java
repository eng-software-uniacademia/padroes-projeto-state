public class Personagem {
    private String nome;
    private PersonagemEstado personagemEstado;

    public Personagem(String nome) {
        this.nome = nome;
        this.personagemEstado = PersonagemAndando.getInstance();
    }

    public boolean andar() {
        return personagemEstado.andar(this);
    }

    public boolean correr() {
        return personagemEstado.correr(this);
    }

    public boolean pular() {
        return personagemEstado.pular(this);
    }

    public boolean atacar() {
        return personagemEstado.atacar(this);
    }

    public boolean rastejar() {
        return personagemEstado.rastejar(this);
    }

    public boolean agachar() {
        return personagemEstado.agachar(this);
    }

    public void setEstado(PersonagemEstado personagemEstado) {
        this.personagemEstado = personagemEstado;
    }

    public String getNome() {
        return nome;
    }

    public PersonagemEstado getEstado() {
        return personagemEstado;
    }

    public String getEstadoNome() {
        return personagemEstado.getEstado();
    }
}
