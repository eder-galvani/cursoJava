package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioMap {

	public static void main(String[] args) {
		
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		
		//1. Número para string binária... 6 => "110"
		Function<Integer, String> sBin = n -> n.toBinaryString(n);
		
		//2. Inverter a string... "110" => "011"
		UnaryOperator<String> inverter = 
				invert -> new StringBuilder(invert).reverse().toString();
				
		//3. Converter de volta para inteiro => "011" => 3
		Function<String, Integer> bParaInt = t -> Integer.parseInt(t, 2);
		
		
		nums.stream()
		.map(sBin)
		//.map(Integer::toBinaryString) resposta professor
		.map(inverter)
		.map(bParaInt)
		.forEach(System.out::println);
		
		
		
		
	}
}
