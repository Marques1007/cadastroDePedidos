package entities;

public class Pedido {

	private UUID id;
	private String nomeCliente;
	private Localdate dataPedido;
	private Double valor;
	private String descricao;

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public Localdate getDataPedido() {
		return dataPedido;
	}

	public void setDataPedido(Localdate dataPedido) {
		this.dataPedido = dataPedido;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
