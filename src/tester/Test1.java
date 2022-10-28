package tester;

import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

import com.app.core.Vehicle;
//how to use import static , to directly access sdf ?
import static com.app.core.Vehicle.sdf;

public class Test1 {

	public static void main(String[] args) /* throws ParseException */ {

		// create vehicle instance , by accepting all i/ps from user
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the number of vehicle in showroom.");
			int size = sc.nextInt();
			Vehicle[] vehicles = new Vehicle[size];

			for (int i = 0; i < vehicles.length; i++) {
				System.out.println("Enter vehicle details : chasisNo,  color,  basePrice,  manufactureDate,  company");
				vehicles[i] = new Vehicle(sc.next(), sc.next(), sc.nextDouble(), sdf.parse(sc.next()), sc.next());
				System.out.println(vehicles);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("main over...");

	}

}
