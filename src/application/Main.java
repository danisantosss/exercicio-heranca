package application;

import entities.Administrador;
import entities.Empregado;
import entities.Fornecedor;
import entities.Operario;
import entities.Vendedor;

public class Main {
    public static void main(String[] args) {
        Fornecedor fornecedor = new Fornecedor("Tiago Lopes", "Rua 123", "1234567-89", 100, 50);
        StringBuilder sbFornecedor = new StringBuilder();
        sbFornecedor.append("\nInformações do Fornecedor:\n");
        sbFornecedor.append("\nNome: ").append(fornecedor.getNome()).append("\n");
        sbFornecedor.append("Endereço: ").append(fornecedor.getEndereco()).append("\n");
        sbFornecedor.append("Telefone: ").append(fornecedor.getTelefone()).append("\n");
        sbFornecedor.append("Valor de crédito: R$").append(fornecedor.getValorCredito()).append("\n");
        sbFornecedor.append("Valor da dívida: R$").append(fornecedor.getValorDivida()).append("\n");
        sbFornecedor.append("Saldo total: R$").append(fornecedor.obterSaldo()).append("\n");
        System.out.println(sbFornecedor.toString());

        Empregado empregado = new Empregado("Marcus", "Rua 321", "9876543-21", 1, 1000, 50);
        StringBuilder sbEmpregado = new StringBuilder();
        sbEmpregado.append("\nInformações do Empregado:\n");
        sbEmpregado.append("\nNome: ").append(empregado.getNome()).append("\n");
        sbEmpregado.append("Endereço: ").append(empregado.getEndereco()).append("\n");
        sbEmpregado.append("Telefone: ").append(empregado.getTelefone()).append("\n");
        sbEmpregado.append("Código do setor: ").append(empregado.getCodigoSetor()).append("\n");
        sbEmpregado.append("Salário Base: R$").append(empregado.getSalarioBase()).append("\n");
        sbEmpregado.append("Imposto: ").append(empregado.getImposto()).append("%").append("\n");
        sbEmpregado.append("Salário total: R$").append(empregado.calcularSalario()).append("\n");
        System.out.println(sbEmpregado.toString());

        Administrador administrador = new Administrador("Fernanda", "Rua 111", "1234561-23", 2, 1000, 50, 250);
        StringBuilder sbAdministrador = new StringBuilder();
        sbAdministrador.append("\nInformações do Administrador:\n");
        sbAdministrador.append("\nNome: ").append(administrador.getNome()).append("\n");
        sbAdministrador.append("Endereço: ").append(administrador.getEndereco()).append("\n");
        sbAdministrador.append("Telefone: ").append(administrador.getTelefone()).append("\n");
        sbAdministrador.append("Código do setor: ").append(administrador.getCodigoSetor()).append("\n");
        sbAdministrador.append("Salário base: R$").append(administrador.getSalarioBase()).append("\n");
        sbAdministrador.append("Imposto: ").append(administrador.getImposto()).append("%").append("\n");
        sbAdministrador.append("Ajuda de custo: $").append(administrador.getAjudaDeCusto()).append("\n");
        sbAdministrador.append("Salário total: R$").append(administrador.calcularSalario()).append("\n");
        System.out.println(sbAdministrador.toString());

        Operario operario = new Operario("Tiago Santos", "Rua 222", "9871234-56", 3, 1000, 50, 250, 10);
        StringBuilder sbOperario = new StringBuilder();
        sbOperario.append("\nInformações do Operário:\n");
        sbOperario.append("\nNome: ").append(operario.getNome()).append("\n");
        sbOperario.append("Endereço: ").append(operario.getEndereco()).append("\n");
        sbOperario.append("Telefone: ").append(operario.getTelefone()).append("\n");
        sbOperario.append("Código do setor: ").append(operario.getCodigoSetor()).append("\n");
        sbOperario.append("Salário base: R$").append(operario.getSalarioBase()).append("\n");
        sbOperario.append("Imposto: ").append(operario.getImposto()).append("%").append("\n");
        sbOperario.append("Valor de produção: $").append(operario.getValorProducao()).append("\n");
        sbOperario.append("Comissão: ").append(operario.getComissao()).append("%").append("\n");
        sbOperario.append("Salário total: R$").append(operario.calcularSalario()).append("\n");
        System.out.println(sbOperario.toString());

        Vendedor vendedor = new Vendedor("Mavis", "Rua 333", "5432167-89", 4, 1000, 50, 250, 10);
        StringBuilder sbVendedor = new StringBuilder();

        sbVendedor.append("\nInformações do Vendedor:\n");
        sbVendedor.append("\nNome: ").append(vendedor.getNome()).append("\n");
        sbVendedor.append("Endereço: ").append(vendedor.getEndereco()).append("\n");
        sbVendedor.append("Telefone: ").append(vendedor.getTelefone()).append("\n");
        sbVendedor.append("Código do setor: ").append(vendedor.getCodigoSetor()).append("\n");
        sbVendedor.append("Salário base: R$").append(vendedor.getSalarioBase()).append("\n");
        sbVendedor.append("Imposto: ").append(vendedor.getImposto()).append("%").append("\n");
        sbVendedor.append("Valor de vendas: $").append(vendedor.getValorVendas()).append("\n");
        sbVendedor.append("Comissão: ").append(vendedor.getComissao()).append("%").append("\n");
        sbVendedor.append("Salário total: R$").append(vendedor.calcularSalario()).append("\n");
        System.out.println(sbVendedor.toString());
    }
}