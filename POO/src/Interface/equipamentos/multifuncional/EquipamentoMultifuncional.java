package Interface.equipamentos.multifuncional;

import Interface.equipamentos.copiadora.Copiadora;
import Interface.equipamentos.digitalizadora.Digitalizadora;
import Interface.equipamentos.impressora.Impressora;

public class EquipamentoMultifuncional implements Copiadora, Impressora, Digitalizadora{

   
    public void digitalizar() {
      System.out.println("Digitalizando via equipamento multifuncional");
    }
    
    public void imprimir() {
        System.out.println("Imprimindo via equipamento multifuncional");
    }
    public void copiar() {
        System.out.println("Copiando via equipamento multifuncional");
    }
    
}
