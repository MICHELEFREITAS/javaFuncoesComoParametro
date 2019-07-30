package model.services;

import java.util.List;
import java.util.function.Predicate;

import entities.Product;

public class ProductService {
	//melhorando função para receber predicate como parametro com nome critério
	//função que recebe outra função lambda como argumento
	public double filteredSum(List<Product> list, Predicate<Product> criteria) {
		double sum =0.0;
		for (Product p : list) {
			//faz um teste genérico de qualquer predicado que for recebido como parâmetro
			if(criteria.test(p)) {
				sum += p.getPrice();				
			}
		}
		return sum;
		
	}

}
