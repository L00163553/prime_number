package prime_number;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application extends SpringBootServletInitializer{
	
	public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
	
	@PostMapping("/prime_number/prime")
	public String getPrime(@RequestParam("number") String number, ModelMap modelMap) {
		int i,m=0,flag=0;   
		String result = " ";
		int n = Integer.parseInt(number);
		System.out.println(n);
		  m=n/2;      
		  if(n==0||n==1){  
		   result = (n+" is not a prime number");      
		  }else{  
		   for(i=2;i<=m;i++){      
		    if(n%i==0){      
		        
		     flag=1;      
		     result = (n+" is not a prime number");       
		    }      
		   }      
		   if(flag==0)  { result = (n+" is a prime number"); }  
		  }
		return result;
		}    
}
