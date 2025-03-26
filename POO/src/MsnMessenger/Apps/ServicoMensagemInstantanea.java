package MsnMessenger.Apps;
// exemplo de herança com a classe ServicoMensagemInstantanea que vai extender para as demais
public abstract class ServicoMensagemInstantanea {
    public abstract void enviarMensagem();
    public abstract void receberMensagem();

    // public void enviarMensagem(){
    //     // exemplo de encapsulamento onde não precisamos deixar certos metodos publicos
    //     validarConectadoInternet();
    //     System.out.println("Enviando mensagem");
    //     salvarHistoricoMensagem();
    // };
    // public void receberMensagem(){
    //     System.out.println("recebendo mensagem");
    // };
     protected void validarConectadoInternet(){
        System.out.println("validando se a internet está conectada");
    }
    protected void salvarHistoricoMensagem(){
        System.out.println("Salvando historico da mensagem");
    }
}
