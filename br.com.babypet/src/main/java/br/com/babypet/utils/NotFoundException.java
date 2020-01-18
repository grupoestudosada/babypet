package br.com.babypet.utils;

public class NotFoundException extends RuntimeException {
  
  private static final long serialVersionUID = 1L;
  
  public NotFoundException( ) {
    super( "Not Found!!!!!!!!!!!!" );
  }
  
  public NotFoundException( String message ) {
    super( message );
    
  }
}
