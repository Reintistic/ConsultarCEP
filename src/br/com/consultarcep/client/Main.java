package br.com.consultarcep.client;

import br.com.consultarcep.domain.Address;
import br.com.consultarcep.viacep.ServiceOfCep;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)throws Exception{
        System.out.print("CEP: ");
        String cep = new Scanner(System.in).nextLine();
        Address address = ServiceOfCep.searchAddressBy(cep);

        System.out.println("Logadouro: " + address.getLogradouro());
        System.out.println("Bairro: " + address.getBairro());
        System.out.println("Localidade: " + address.getLocalidade());
    }
}
