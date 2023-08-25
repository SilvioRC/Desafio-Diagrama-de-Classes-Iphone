package comportamento_usuario_iphone;

public class Usuario {

	public static void main(String[] args) {
		Iphone usarIphone = new Iphone();
		
		System.out.println("Iniciando chamada para o número (XX) X-XXXX-XXXX");
		usarIphone.ligar();
		usarIphone.atender();
		usarIphone.iniciarCorreioVoz();
		System.out.println("Finalizando chamada do número (XX) X-XXXX-XXXX" + "\n" );
		
		
		System.out.println("Navegação na Web");
		usarIphone.exibirPagina();
		usarIphone.adicionarNovaAba();
		usarIphone.atualizarPagina();
		System.out.println("Finalizando Navegação na Web" + "\n");
		
		
		System.out.println("Iniciando Reprodução Musical");
		usarIphone.tocar();
		usarIphone.pausar();
		usarIphone.selecionarMusica();
		System.out.println("Finalizando Reprodução Musical");
		
		
	
		

	}

}
