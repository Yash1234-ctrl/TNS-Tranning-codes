package com.construct;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 4; i++) {
            TicketBooking booking = new TicketBooking();
            String event = sc.next();
            String customer = sc.next();
            int seats = sc.nextInt();
            int method = sc.nextInt();
            double amount = sc.nextDouble();
            booking.setDetails(event, customer, seats, amount);

            switch (method) {
                case 1:
                    booking.makePayment(amount);
                    booking.printReceipt(method);
                    break;
                case 2:
                    String walletId = sc.next();
                    booking.makePayment(amount, walletId);
                    booking.printReceipt(method);
                    break;
                case 3:
                    String cardName = sc.next();
                    String cardNumber = sc.next();
                    booking.makePayment(amount, cardName, cardNumber, customer);
                    booking.printReceipt(method);
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }

        sc.close();
    }
}
