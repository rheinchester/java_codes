In the fourth step of development, we replace the temporary getMonthlyPayment and
getTotalPayment methods with the final version. The changes are made only to the
Loan class.The other two classes remain the same.
Here’s one possible way to define the two methods:
private double monthlyPayment;
public double getMonthlyPayment( ) {
monthlyPayment = ...;
return monthlyPayment;
}
public double getTotalPayment( ) {
return monthlyPayment * numberOfPayments;
}
The idea is to use the value of the data member monthlyPayment set by the
getMonthlyPayment method in computing the total payment. This setup is problematic
because the getTotalPayment method will not work correctly unless getMonthly-
Payment is called first. It is considered a very poor design, and generally unacceptable,
to require the client programmer to call a collection of methods in a certain order.
We must define the two methods so they can be called in any order, not necessarily in the
order of getMonthlyPayment and getTotalPayment. The correct way here is to call
getMonthlyPayment from the getTotalPayment method:
private double getTotalPayment( ) {
double totalPayment;
totalPayment = getMonthlyPayment() * numberOfPayments;
return totalPayment;
}
With this approach the data member monthlyPayment is not necessary.
Here’s the updated Loan class: