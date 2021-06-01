package view;

import java.io.IOException;

import controller.FoodController;
import controller.IFoodController;

public class Principal {

	public static void main(String[] args) {
		IFoodController LerArq = new FoodController();
		String dir = "C:\\Windows\\Temp";
		
		try {
			LerArq.readFile(dir, "generic_food.csv");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
