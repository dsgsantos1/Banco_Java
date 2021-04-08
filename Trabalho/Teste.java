package Trabalho;

import java.util.Scanner;

public class Teste {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
	
		Cliente fabin = new Cliente();		
		Cliente luscas = new Cliente();
		
		Banco bank = new Banco();
		Banco bank2 = new Banco();
		
		System.out.println("Por favor,\nDigite o número da conta e agência do Cliente 1");
		Conta conta = new Conta(ler.nextLine(), ler.nextLine(), fabin);
		
		System.out.println("");
		
		System.out.println("Por favor,\ndigite o número da conta e agência do Cliente 2");
		Conta conta2 = new Conta(ler.nextLine(), ler.nextLine(), luscas);
		
		System.out.println("");
		
		double quantidade;
		
		conta.setCliente(fabin);
		conta2.setCliente(luscas);
		
		conta.setBanco(bank);
		conta2.setBanco(bank2);
		
		System.out.printf("==== Cliente 1 =====\n");
		
		System.out.println("Nome:");
		fabin.setNome(ler.nextLine());
		System.out.println("CPF:");
		fabin.setCpf(ler.nextLine());
//		System.out.println("Agência: ");
//		conta.setAgencia(ler.nextLine());
//		System.out.println("Número da Conta:");
//		conta.setnConta(ler.nextLine());
		System.out.println("Saldo:");
		conta.setSaldo(ler.nextDouble());
		ler.nextLine();
		System.out.println("Nome do Banco:");
		bank.setNome(ler.nextLine());
		System.out.println("Número do Banco:");
		bank.setNum(ler.nextLine());
		
		System.out.println("");
		
		System.out.println("==== Cliente 2 =====");
//		ler.nextLine();
		System.out.println("Nome:");
		luscas.setNome(ler.nextLine());
		System.out.println("CPF:");
		luscas.setCpf(ler.nextLine());
//		System.out.println("Agência: ");
//		conta2.setAgencia(ler.nextLine());
//		System.out.println("Número da Conta:");
//		conta2.setnConta(ler.nextLine());
		System.out.println("Saldo:");
		conta2.setSaldo(ler.nextDouble());
		ler.nextLine();
		System.out.println("Nome do Banco:");
		bank2.setNome(ler.nextLine());
		System.out.println("Número do Banco:");
		bank2.setNum(ler.nextLine());
		
		System.out.println("");
		System.out.println("");
		
		
		System.out.println("==== Cliente 1 =====");
		System.out.println("Nome: " + conta.getCliente().getNome());
		System.out.println("CPF: " + conta.getCliente().getCpf());
		System.out.println("Agência: " + conta.getAgencia());
		System.out.println("Número da Conta: " + conta.getnConta());
		System.out.printf("Nome Banco: %s\nNúmero Banco: %s\n", conta.getBanco().getNome(), conta.getBanco().getNum());
		conta.consultadarSaldo();
		System.out.println();
		
		System.out.println("==== Cliente 2 =====");
		System.out.println("Nome: " + conta2.getCliente().getNome());
		System.out.println("CPF: " + conta2.getCliente().getCpf());
		System.out.println("Agência: " + conta2.getAgencia());
		System.out.println("Número da Conta: " + conta2.getnConta());
		System.out.printf("Nome Banco: %s\nNúmero Banco: %s\n", conta2.getBanco().getNome(), conta2.getBanco().getNum());
		conta2.consultadarSaldo();	
		
		System.out.println("");
		System.out.println("");
		System.out.println("");
		
		System.out.printf("%s\n", conta.getCliente().getNome());
		System.out.println("Digite a quantia que deseja sacar: ");
		quantidade = ler.nextDouble();
		conta.sacar(quantidade);
		conta.consultadarSaldo();
		
		System.out.println("");
		
		System.out.printf("%s\n", conta2.getCliente().getNome());
		System.out.printf("Digite a quantia que deseja transferir para %s\n", conta.getCliente().getNome());
		quantidade = ler.nextDouble();
		conta2.transferir(conta, quantidade);
		
		System.out.println("");
		
		System.out.println("" + conta2.getCliente().getNome());
		conta2.consultadarSaldo();
		
		System.out.println(""+ conta.getCliente().getNome());
		conta.consultadarSaldo();
		
		System.out.println("");
		System.out.println("");
		
		System.out.println("Senhor " + conta.getCliente().getNome() + ", digite a quantia que deseja depositar:");
		quantidade = ler.nextDouble();
		conta.depositar(quantidade);
		conta.consultadarSaldo();
		ler.close();
		
		
		
	}
	
}
