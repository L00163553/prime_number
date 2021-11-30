package prime_number;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/prime_number/prime")
public class FirstController {
	
	@PostMapping
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
		return "<html>\n" + "<header><title>Welcome</title></header>\n" +
        "<body>\n<h1>" + result + "</h1></body>\n" + "</html>";
		}    
	}  