
package main;

import java.util.Scanner;

/**
 * Vending Machine
 * 
 * 04/30/2019
 * 
 * @author Yudong Wu
 *
 */

public class Drive {

	// parameter define
	private static int p, v, n, user_input;
	private static float fp, fv, x;
	private static Scanner sc;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sc = new Scanner(System.in);

		// Main Menu
		System.out.println("============= VENDING MACHINE =============");
		System.out.println("============= Welcome =============");
		System.out.println("Please select your VENDING MACHINE:");
		System.out.println("For tea & chocolate: press 1");
		System.out.println("For coffee: press 2");
		System.out.print("Please input here:");
		String temp = sc.next();
		while (!isInteger(temp)) {// error input handle
			System.out.print("Please input here:");
			temp = sc.next();
		}
		user_input = Integer.valueOf(temp);
		while (user_input != 1 && user_input != 2) {// error input handle
			System.out.println("INVAILD_INPUT!");
			System.out.println("Please input 1 or 2");
			System.out.print("Please input here:");
			temp = sc.next();
			if (isInteger(temp)) {
				user_input = Integer.valueOf(temp);
			} else {
				continue;
			}
		}

		if (user_input == 1) {// to Vending Machine #1
			System.out.println("Vending Machine 1 selected!");
			VM_1 vm1 = new VM_1();// create new VM_1 class;
			showMenu1(vm1);
		} else if (user_input == 2) {// to Vending Machine #2
			System.out.println("Vending Machine 2 selected!");
			VM_2 vm2 = new VM_2();// create new VM_2 class;
			showMenu2(vm2);
		}

	}

	// show VM_1 menu
	private static void showMenu1(VM_1 vm1) {
		sc = new Scanner(System.in);
		String temp;

		// while start here
		while (user_input != 9) {
			System.out.print("\n");
			System.out.println("============= VENDING_MACHINE #1 =============");
			System.out.println("Please select your operation:");
			System.out.println(
					"0-create, 1-coin, 2-sugar, 3-tea, 4-chocolate, 5-insert_cups, 6-set_price, 7-cancel, 8-card, 9-Quit, -1-showStatus");
			System.out.print("Please input here:");

			temp = sc.next();
			if (isInteger(temp)) {// error input handle
				user_input = Integer.valueOf(temp);
			} else {
				System.out.println("INVAILD_INPUT!");
				continue;
			}

			// switch start here
			switch (user_input) {
			case 0:// create function
				System.out.println("******* Operation Create *******");
				System.out.print("Please Input Price:");
				temp = sc.next();
				if (isInteger(temp)) {
					p = Integer.valueOf(temp);
					vm1.create(p);
				} else {
					System.out.println("INVAILD_INPUT!");
				}
				break;
			case 1:// coin function
				System.out.println("******* Operation Coin *******");
				System.out.print("Please insert coin:");
				temp = sc.next();
				if (isInteger(temp)) {
					v = Integer.valueOf(temp);
					vm1.coin(v);
				} else {
					System.out.println("INVAILD_INPUT!");
				}
				break;
			case 2:// sugar function
				System.out.println("******* Operation Sugar *******");
				vm1.sugar();
				break;
			case 3:// tea function
				System.out.println("******* Operation Tea *******");
				vm1.tea();
				break;
			case 4:// chocolate function
				System.out.println("******* Operation Chocolate *******");
				vm1.chocolate();
				break;
			case 5:// insert_cup function
				System.out.println("******* Operation Insert Cups *******");
				System.out.print("Please insert number of cups:");
				temp = sc.next();
				if (isInteger(temp)) {
					n = Integer.valueOf(temp);
					vm1.insert_cups(n);
				} else {
					System.out.println("INVAILD_INPUT!");
				}
				break;
			case 6:// set_price function
				System.out.println("******* Operation Set Price *******");
				System.out.print("Please Input New Price:");
				temp = sc.next();
				if (isInteger(temp)) {
					p = Integer.valueOf(temp);
					vm1.set_price(p);
				} else {
					System.out.println("INVAILD_INPUT!");
				}
				break;
			case 7:// cancel function
				System.out.println("******* Operation Cancel *******");
				vm1.cancel();
				break;
			case 8:// card function
				System.out.println("******* Operation Card *******");
				System.out.print("Please input your card funds:");
				temp = sc.next();
				if (isFloat(temp) || isInteger(temp)) {
					x = Float.valueOf(temp);
					vm1.card(x);
				} else {
					System.out.println("INVAILD_INPUT!");
				}
				break;
			case 9:// quit function
				break;
			case -1:
				vm1.getStatus();
				break;
			default:
				System.out.println("Please input within 0 ~ 9");
				break;
			}
			// end of switch
		}
		// end of while

		System.out.println("Thank you for your use!");
	}

	// Menu for Vending Machine 2
	private static void showMenu2(VM_2 vm2) {
		sc = new Scanner(System.in);
		String temp;

		// while start here
		while (user_input != 7) {
			System.out.print("\n");
			System.out.println("============= VENDING_MACHINE #2 =============");
			System.out.println("Please your operation:");
			System.out.println(
					"0-create, 1-coin, 2-cream, 3-coffee, 4-insert_cups, 5-set_price, 6-cancel, 7-Quit, -1-showStatus");
			System.out.print("Please input here:");

			temp = sc.next();
			if (isInteger(temp)) {// error input handle
				user_input = Integer.valueOf(temp);
			} else {
				System.out.println("INVAILD_INPUT!");
				continue;
			}

			// switch start here
			switch (user_input) {
			case 0:// create function
				System.out.println("******* Operation Create *******");
				System.out.print("Please Input Price:");
				temp = sc.next();
				if (isFloat(temp)) {
					fp = Float.valueOf(temp);
					vm2.create(fp);
				} else {
					System.out.println("INVAILD_INPUT!");
				}
				break;
			case 1:// coin function
				System.out.println("******* Operation Coin *******");
				System.out.print("Please insert coin:");
				temp = sc.next();
				if (isFloat(temp)) {
					fv = Float.valueOf(temp);
					vm2.coin(fv);
				} else {
					System.out.println("INVAILD_INPUT!");
				}
				break;
			case 2:// cream function
				System.out.println("******* Operation Cream *******");
				vm2.cream();
				break;
			case 3:// coffee function
				System.out.println("******* Operation Coffee *******");
				vm2.coffee();
				break;

			case 4:// insert_cup function
				System.out.println("******* Operation Insert Cups *******");
				System.out.print("Please insert number of cups:");
				temp = sc.next();
				if (isInteger(temp)) {
					n = Integer.valueOf(temp);
					vm2.insert_cups(n);
				} else {
					System.out.println("INVAILD_INPUT!");
				}
				break;
			case 5:// set_price function
				System.out.println("******* Operation Set Price *******");
				System.out.print("Please Input New Price:");
				temp = sc.next();
				if (isFloat(temp)) {
					fp = Float.valueOf(temp);
					vm2.set_price(fp);
				} else {
					System.out.println("INVAILD_INPUT!");
				}
				break;
			case 6:// cancel function
				System.out.println("******* Operation Cancel *******");
				vm2.cancel();
				break;

			case 7:// quit function
				break;
			case -1:
				vm2.getStatus();
				break;
			default:
				System.out.println("Please input within 0 ~ 7");
				break;
			}
			// end of switch
		}
		// end of while

		System.out.println("Thank you for your use!");
	}

	/******* helper functions *********/

	private static boolean isInteger(String s) {
		try {
			Integer.parseInt(s);
			return true;
		} catch (NumberFormatException e) {
			System.out.println("Please input digits");
			return false;
		}
	}

	private static boolean isFloat(String s) {
		try {
			Float.parseFloat(s);
			return true;
		} catch (NumberFormatException e) {
			System.out.println("Please input digits");
			return false;
		}
	}

}
