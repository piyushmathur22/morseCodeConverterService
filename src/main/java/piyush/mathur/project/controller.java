package piyush.mathur.project;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.springframework.web.bind.annotation.*;

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
    
	@PostMapping(value = "/product")
	public String newPage() {
		return "this is a page";
	}
}