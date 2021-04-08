package Trabalho;

public class Conta {
	
	private String agencia, nConta;
	private Cliente cliente;
	private Banco banco;
	private double saldo = 0;
	
	public Conta(String nConta, String agencia, Cliente cliente) {
		this.nConta = nConta;
		this.agencia = agencia;
		this.cliente = cliente;
	}
	
	public String getAgencia() {
		return agencia;
	}
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	public String getnConta() {
		return nConta;
	}
	public void setnConta(String nConta) {
		this.nConta = nConta;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Banco getBanco() {
		return banco;
	}
	public void setBanco(Banco banco) {
		this.banco = banco;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = (saldo > 0) ? saldo: 0;
	}
	
	public void consultadarSaldo() {
		System.out.printf("Saldo: R$%.2f\n", this.saldo);
	}
	
	public void transferir(Conta conta2, double quantidade) {
		if(quantidade <= this.saldo && quantidade > 0) {
			this.saldo -= quantidade;
			conta2.setSaldo(conta2.getSaldo()+ quantidade);
		}
	}
	
	public void sacar(double quantidade) {
		if(quantidade <= this.saldo && quantidade > 0) {
			this.saldo -= quantidade;
		}
	}
	
	public void depositar(double quantidade) {
		this.saldo += (quantidade > 0) ? quantidade: 0;
	}
	
	
}
