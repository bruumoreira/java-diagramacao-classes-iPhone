package src;

public interface ReprodutorMusical {
    public void tocar();
    public void pausar();
    public void selecionarMusica();

    void tocar(String musicaAtual);

    void pausar(String musicaAtual);

    void selecionarMusica(String musicaAtual);
}
