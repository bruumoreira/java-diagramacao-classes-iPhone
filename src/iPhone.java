package src;

public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {


    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para: " + numero);
    }

    @Override
    public void atender(String numero) {
        System.out.println("Atendendo chamada de: " + numero);
    }

    @Override
    public void iniciarCorreioVoz(String mensagem, String destinatario) {
        System.out.println("Iniciando correio de voz para " + destinatario + ": " + mensagem);
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);
    }

    @Override
    public void adicionarNovaAba(String url) {
        System.out.println("Abrindo nova aba com a página: " + url);
    }

    @Override
    public void atualizarPagina() {
        //Implementação aqui
    }

    @Override
    public void tocar() {

    }

    @Override
    public void pausar() {

    }

    @Override
    public void selecionarMusica() {

    }

    @Override
    public void tocar(String musicaAtual) {
        System.out.println("Reproduzindo música: " + musicaAtual);
    }

    @Override
    public void pausar(String musicaAtual) {
        System.out.println("Pausando música: " + musicaAtual);
    }

    @Override
    public void selecionarMusica(String musicaAtual) {
        System.out.println("Selecionando música: " + musicaAtual);
    }
}
