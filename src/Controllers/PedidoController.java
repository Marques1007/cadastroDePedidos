package Controllers;

import java.time.LocalDate;
import java.util.Scanner;
import java.util.UUID;

import Repositories.PedidoRepositoryImpl;
import entities.Pedido;

public class PedidoController {
	
	//atributos da classe
	private Scanner scanner = new Scanner(System.in);
	
	/*
	 * metodo para realizar o cadastro de um pedido
	 */
	public void realizarCadastro() {
		
		System.out.println("\nCADASTRO DE PEDIDOS:\n");
		
		var pedido = new Pedido(); //criando um objeto da classe pedido
		pedido.setId(UUID.randomUUID()); // gerando um id unico
		pedido.setDataPedido(LocalDate.now()); //data atual do sistema
		
		System.out.println("NOME DO CLIENTE.......: ");
		pedido.setNomeCliente(scanner.nextLine());
        
		System.out.println("VALOR DO PEDIDO.......: ");
		pedido.setValor(Double.parseDouble(scanner.nextLine()));
		
		System.out.println("DESCRICAO DO PEDIDO.......: ");
		pedido.setDescricao(scanner.nextLine());
		
		//enviar para o banco de dados
		var pedidoRepository = new PedidoRepositoryImpl();
		pedidoRepository.inserir(pedido);
		
	}

}
