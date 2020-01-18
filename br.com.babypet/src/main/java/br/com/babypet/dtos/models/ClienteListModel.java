package br.com.babypet.dtos.models;

import java.util.List;
import java.util.stream.Collectors;

import br.com.babypet.domain.Cliente;

public class ClienteListModel {
  
  private String idCliente;
  private String nomeCliente;
  private String cpfCliente;
  
  
  public String getIdCliente( ) {
    return idCliente;
  }
  public String getNomeCliente( ) {
    return nomeCliente;
  }
  public String getCpfCliente( ) {
    return cpfCliente;
  }
  
  private static ClienteListModel of (Cliente cliente ) {
    
    ClienteListModel model = new ClienteListModel( );
    
    model.idCliente = cliente.getId( );
    model.nomeCliente = cliente.getNome( );
    model.cpfCliente = cliente.getCpf( );
    
    return model;
    }
  
  public static List<ClienteListModel> ofList (List<Cliente> clientes){
    
    return clientes.stream( ).map( cliente -> of(cliente) ).collect(Collectors.toList( ));
    
  }
  
}
