package piyush.mathur.project;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.piyush.MorseCodeGenerator.App;

@RestController
@RequestMapping("/api")
public class controller {

    private String storedValue = "default value"; // Default value

    @GetMapping("/value")
    public String getValue() throws FileNotFoundException, IOException, ParseException {
    	App.methodConverter();
        return storedValue;
    }
    
    @GetMapping("/testApi")
    public String testApi() {
        return "testApi";
    }
    
	@PostMapping(value = "/product")
	public String newPage() {
		return "this is a page";
	}
}