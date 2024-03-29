package collection;

import java.io.IOException;
import java.net.URL;
import java.util.Map;
import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class EX09 {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws StreamReadException, DatabindException, IOException {
		URL	url=new URL("https://dummy.restapiexample.com/api/v1/employee/3");
		
		ObjectMapper om=new ObjectMapper();
		
		Map<String, Object> map;
		map=om.readValue(url, new TypeReference<Map<String, Object>>(){});
		map=(Map<String, Object>) map.get("data");
		
		map.forEach((String k, Object v)->System.out.printf("%s: %s\n", k, v));
	}
}