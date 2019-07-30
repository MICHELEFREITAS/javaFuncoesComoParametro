package model.services;

import java.util.List;
import java.util.function.Predicate;

import entities.Product;

public class ProductService {
	//melhorando fun��o para receber predicate como parametro com nome crit�rio
	//fun��o que recebe outra fun��o lambda como argumento
	public double filteredSum(List<Product> list, Predicate<Product> criteria) {
		double sum =0.0;
		for (Product p : list) {
			//faz um teste gen�rico de qualquer predicado que for recebido como par�metro
			if(criteria.test(p)) {
				sum += p.getPrice();				
			}
		}
		return sum;
		
	}

}
