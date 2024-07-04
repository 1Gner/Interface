package iphone;

public class main {

	public static void main(String[] args) {
		iphone celular = new iphone();
		celular.atender();
		celular.adicionarNovaAba();
		celular.atualizarPagina();
		celular.exibirPagina("youtube");
		celular.iniciarCorreioDeVoz();
		celular.ligar("0800");
		celular.pausar();
		celular.selecionarMusica("Human");
		celular.tocar();
	}

}
