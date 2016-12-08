package api.rest.events.views.logged;

import java.util.Map;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import mail.EnviaEmail;

@RestController
@RequestMapping(value = "/api/rest/events/TesteEventREST")
public class TesteEventREST {

  @RequestMapping(method = RequestMethod.POST, value = "/testebutton631192ngclick")
  public Boolean TesteButton631192NgClick(@RequestBody Map<String, Object> object) throws Exception {
    
    
  EnviaEmail envia = new EnviaEmail();
    try{
      envia.sendEmail();
    }catch(Exception e){
      System.out.println(e);
    }
    
    return object.get("echoServer").equals("OK");
  }
}
