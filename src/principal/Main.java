package principal;

import Controllers.PedidoController;

public class Main {

	public static void main(String[] args) {

		//instanciando a classe de controle
		var pedidoController = new PedidoController();
		
		//executando o cadastro do pedido
		pedidoController.realizarCadastro();
		
		
	}

}
