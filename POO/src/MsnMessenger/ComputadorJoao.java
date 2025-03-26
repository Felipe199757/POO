package MsnMessenger;

import MsnMessenger.Apps.FacebookMessenger;
import MsnMessenger.Apps.MsnMessenger;
import MsnMessenger.Apps.ServicoMensagemInstantanea;
import MsnMessenger.Apps.Telegram;

public class ComputadorJoao {
    public static void main(String[] args) {
      ServicoMensagemInstantanea smi = null;
      
      String appEscolhido = "tlg";
        //exemplo de polimorfismo onde a classe pai é abstrata passando a função de enviar e receber mensagem
        // para cada classe filha como o exemplo de abstração de classes
      if(appEscolhido.equals("msn"))
      smi = new MsnMessenger();
      else if (appEscolhido.equals("fbm"))
      smi = new FacebookMessenger();
      else if(appEscolhido.equals("tlg"))
      smi = new Telegram();

      smi.enviarMensagem();
      smi.receberMensagem();
    }
}
