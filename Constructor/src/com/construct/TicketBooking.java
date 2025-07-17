package com.construct;

class TicketBooking {
    private String eventName;
    private String customerName;
    private int numberOfSeats;
    private double amount;
    private String paymentDetails;

    public void setDetails(String eventName, String customerName, int numberOfSeats, double amount) {
        this.eventName = eventName;
        this.customerName = customerName;
        this.numberOfSeats = numberOfSeats;
        this.amount = amount;
    }

    public void makePayment(double amount) {
        paymentDetails = "Amount " + amount + " paid in cash";
    }

    public void makePayment(double amount, String walletId) {
        paymentDetails = "Amount " + amount + " paid using wallet number " + walletId;
    }

    public void makePayment(double amount, String cardName, String cardNumber, String holderName) {
        paymentDetails = "Customer " + holderName +
                "\nNumber of seats: " + numberOfSeats +
                "\nHolder name: " + holderName +
                "\nAmount " + amount + " paid using " + cardName + " card" +
                "\nCCV: " + cardNumber;
    }

    public void printReceipt(int method) {
        if (method == 3) {
            System.out.println("Stage event: " + eventName);
            System.out.println(paymentDetails);
        } else {
            System.out.println("Stage event: " + eventName +
                    " | Customer: " + customerName +
                    " | Number of seats: " + numberOfSeats +
                    " | " + paymentDetails);
        }
    }
}
