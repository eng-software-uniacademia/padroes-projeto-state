import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PersonagemTest {
    @Test
    void andandoDeveCorrer() {
        var personagem = new Personagem("Player 1");
        assertTrue(personagem.correr());
    }

    @Test
    void andandoDevePular() {
        var personagem = new Personagem("Player 1");
        assertTrue(personagem.pular());
    }

    @Test
    void andandoDeveAtacar() {
        var personagem = new Personagem("Player 1");
        assertTrue(personagem.atacar());
    }

    @Test
    void andandoNaoDeveRastejar() {
        var personagem = new Personagem("Player 1");
        assertFalse(personagem.rastejar());
    }

    @Test
    void andandoDeveAgachar() {
        var personagem = new Personagem("Player 1");
        assertTrue(personagem.agachar());
    }

    @Test
    void correndoDeveAndar() {
        var personagem = new Personagem("Player 1");
        personagem.setEstado(PersonagemCorrendo.getInstance());
        assertTrue(personagem.andar());
    }

    @Test
    void correndoDevePular() {
        var personagem = new Personagem("Player 1");
        personagem.setEstado(PersonagemCorrendo.getInstance());
        assertTrue(personagem.pular());
    }

    @Test
    void correndoNaoDeveAtacar() {
        var personagem = new Personagem("Player 1");
        personagem.setEstado(PersonagemCorrendo.getInstance());
        assertFalse(personagem.atacar());
    }

    @Test
    void correndoNaoDeveRastejar() {
        var personagem = new Personagem("Player 1");
        personagem.setEstado(PersonagemCorrendo.getInstance());
        assertFalse(personagem.rastejar());
    }

    @Test
    void correndoDeveAgachar() {
        var personagem = new Personagem("Player 1");
        personagem.setEstado(PersonagemCorrendo.getInstance());
        assertTrue(personagem.agachar());
    }

    @Test
    void pulandoDeveAndar() {
        var personagem = new Personagem("Player 1");
        personagem.setEstado(PersonagemPulando.getInstance());
        assertTrue(personagem.andar());
    }

    @Test
    void pulandoDeveCorrer() {
        var personagem = new Personagem("Player 1");
        personagem.setEstado(PersonagemPulando.getInstance());
        assertTrue(personagem.correr());
    }

    @Test
    void pulandoNaoDeveAtacar() {
        var personagem = new Personagem("Player 1");
        personagem.setEstado(PersonagemPulando.getInstance());
        assertFalse(personagem.atacar());
    }

    @Test
    void pulandoNaoDeveRastejar() {
        var personagem = new Personagem("Player 1");
        personagem.setEstado(PersonagemPulando.getInstance());
        assertFalse(personagem.rastejar());
    }

    @Test
    void pulandoNaoDeveAgachar() {
        var personagem = new Personagem("Player 1");
        personagem.setEstado(PersonagemPulando.getInstance());
        assertFalse(personagem.agachar());
    }

    @Test
    void atacandoDeveAndar() {
        var personagem = new Personagem("Player 1");
        personagem.setEstado(PersonagemAtacando.getInstance());
        assertTrue(personagem.andar());
    }

    @Test
    void atacandoDeveCorrer() {
        var personagem = new Personagem("Player 1");
        personagem.setEstado(PersonagemAtacando.getInstance());
        assertTrue(personagem.correr());
    }

    @Test
    void atacandoDevePular() {
        var personagem = new Personagem("Player 1");
        personagem.setEstado(PersonagemAtacando.getInstance());
        assertTrue(personagem.pular());
    }

    @Test
    void atacandoNaoDeveRastejar() {
        var personagem = new Personagem("Player 1");
        personagem.setEstado(PersonagemAtacando.getInstance());
        assertFalse(personagem.rastejar());
    }

    @Test
    void atacandoDeveAgachar() {
        var personagem = new Personagem("Player 1");
        personagem.setEstado(PersonagemAtacando.getInstance());
        assertTrue(personagem.agachar());
    }

    @Test
    void rastejandoNaoDeveAndar() {
        var personagem = new Personagem("Player 1");
        personagem.setEstado(PersonagemRastejando.getInstance());
        assertFalse(personagem.andar());
    }

    @Test
    void rastejandoNaoDeveCorrer() {
        var personagem = new Personagem("Player 1");
        personagem.setEstado(PersonagemRastejando.getInstance());
        assertFalse(personagem.correr());
    }

    @Test
    void rastejandoNaoDevePular() {
        var personagem = new Personagem("Player 1");
        personagem.setEstado(PersonagemRastejando.getInstance());
        assertFalse(personagem.pular());
    }

    @Test
    void rastejandoNaoDeveAtacar() {
        var personagem = new Personagem("Player 1");
        personagem.setEstado(PersonagemRastejando.getInstance());
        assertFalse(personagem.atacar());
    }

    @Test
    void rastejandoDeveAgachar() {
        var personagem = new Personagem("Player 1");
        personagem.setEstado(PersonagemRastejando.getInstance());
        assertTrue(personagem.agachar());
    }

    @Test
    void agacharDeveAndar() {
        var personagem = new Personagem("Player 1");
        personagem.setEstado(PersonagemAgachando.getInstance());
        assertTrue(personagem.andar());
    }

    @Test
    void agacharDeveCorrer() {
        var personagem = new Personagem("Player 1");
        personagem.setEstado(PersonagemAgachando.getInstance());
        assertTrue(personagem.correr());
    }

    @Test
    void agacharDevePular() {
        var personagem = new Personagem("Player 1");
        personagem.setEstado(PersonagemAgachando.getInstance());
        assertTrue(personagem.pular());
    }

    @Test
    void agacharNaoDeveAtacar() {
        var personagem = new Personagem("Player 1");
        personagem.setEstado(PersonagemAgachando.getInstance());
        assertFalse(personagem.atacar());
    }

    @Test
    void agacharDeveRastejar() {
        var personagem = new Personagem("Player 1");
        personagem.setEstado(PersonagemAgachando.getInstance());
        assertTrue(personagem.rastejar());
    }
}
