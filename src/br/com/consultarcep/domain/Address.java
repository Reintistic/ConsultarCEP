package br.com.consultarcep.domain;

public class Address {
    String logradouro;
    String bairro;
    String localidade;

    public String getLogradouro(){
        return logradouro;
    }

    public String getBairro(){
        return bairro;
    }

    public String getLocalidade(){
        return localidade;
    }

    @Override
    public String toString(){
        return "Address{" + "logadouro=" + logradouro + ", bairro=" + bairro + ", localidade=";
    }
}
