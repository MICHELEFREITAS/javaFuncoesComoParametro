import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Product;
import model.services.ProductService;

public class Program {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("TV", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		
        ProductService ps = new ProductService();
        
        //chamando o ProductService e passando a lista e também um predicado (lambda p ->...) de como
        // quero filtrar a lista e guardando na variável sum
        //Função mais flexível que posso colocar a condição que quero filtrar para fazer a soma
        double sum = ps.filteredSum(list, p -> p.getPrice() < 100);
        
        System.out.println("Sum = " + String.format("%.2f", sum));
	
	}

}
