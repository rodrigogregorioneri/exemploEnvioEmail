package mail;

import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

/**
 * Classe que representa ...
 * 
 * @author Rodrigo Gregorio Neri
 * @version 1.0
 * @since 2016-12-08
 *
 */

public class EnviaEmail {
  
  
  
  public static void main(String args[]){
    EnviaEmail envia = new EnviaEmail();
    try{
      envia.sendEmail();
    }catch(Exception e){
      System.out.println(e);
    }
    
  }
  
  

	public void sendEmail() throws EmailException {

		SimpleEmail email = new SimpleEmail();
		//Utilize o hostname do seu provedor de email
		System.out.println("alterando hostname...");
		email.setHostName("smtp.gmail.com");
		//Quando a porta utilizada não é a padrão (gmail = 465)
		email.setSmtpPort(465);
		//Adicione os destinatários
		email.addTo("rodrigogregorioneri@hotmail.com", "Rodrigo");
		//Configure o seu email do qual enviará
		email.setFrom("testertechne4@gmail.com", "teste");
		//Adicione um assunto
		email.setSubject("Rodrigo");
		//Adicione a mensagem do email
		email.setMsg("Teste2");
		//Para autenticar no servidor é necessário chamar os dois métodos abaixo
		System.out.println("autenticando...");
		email.setSSL(true);
		email.setTLS(true);
		email.setAuthentication("testertechne4@gmail.com", "Testeiro84");
		System.out.println("enviando...");
		email.send();
		System.out.println("Email enviado!");

	}
}
