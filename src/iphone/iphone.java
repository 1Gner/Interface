package iphone;

public class iphone implements NavegadorInternet, AparelhoTelefonico, ReprodutorMusical {

	public static void main(String[] args) {
		
	}

	@Override
	public void tocar() {
		System.out.println("Tocar Musica");
	}

	@Override
	public void pausar() {
		System.out.println("Parar Musica");
		
	}

	@Override
	public void selecionarMusica(String musica) {
		System.out.println("Selecionar Musica: " + musica);
		
	}

	@Override
	public void ligar(String numero) {
		System.out.println("Ligar para: " + numero);
		
	}

	@Override
	public void atender() {
		System.out.println("Atender");
		
	}

	@Override
	public void iniciarCorreioDeVoz() {
		System.out.println("Iniciar Correio");
		
	}

	@Override
	public void exibirPagina(String url) {
		System.out.println("Exibir pagina: www."+url+ ".com");
		
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Adicionar nova aba");
		
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Atualizar pagina");
		
	}

}
