package org.example.csc_311_module_3_hw;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import java.io.IOException;

// Loan Calculator Application
public class LoanCalculator extends Application {

    // setting all textFields
    protected TextField tfAnnualInterestRate = new TextField();
    protected TextField tfNumberOfYears = new TextField();
    protected TextField tfLoanAmount = new TextField();
    protected TextField tfMonthlyPayment = new TextField();
    protected TextField tfTotalPayment = new TextField();
    protected Button btCalculate = new Button("Calculate");

    //stage to set all coordinates and elements for Stage
    @Override
    public void start(Stage primaryStage) throws Exception {

        GridPane gridPane = new GridPane();
        gridPane.setHgap(4); gridPane.setVgap(4);
        gridPane.add(new Label("Annual Interest Rate:"), 0, 0);

        gridPane.add(tfAnnualInterestRate, 1, 0);
        gridPane.add(new Label("Number of Years:"), 0, 1);

        gridPane.add(tfNumberOfYears, 1, 1);
        gridPane.add(new Label("Loan Amount:"), 0, 2);

        gridPane.add(tfLoanAmount, 1, 2);
        gridPane.add(new Label("Monthly Payment"), 0, 3);

        gridPane.add(tfMonthlyPayment, 1, 3);
        gridPane.add(new Label("Total Payment"), 0, 4);

        gridPane.add(tfTotalPayment, 1, 4);
        gridPane.add(btCalculate, 1, 5);

        // setting orientations for all variables in Stage
        GridPane.setHalignment(btCalculate, HPos.CENTER);
        gridPane.setAlignment(Pos.CENTER);
        tfAnnualInterestRate.setAlignment(Pos.BOTTOM_RIGHT);
        tfNumberOfYears.setAlignment(Pos.BOTTOM_RIGHT);
        tfLoanAmount.setAlignment(Pos.BOTTOM_RIGHT);
        tfMonthlyPayment.setAlignment(Pos.BOTTOM_RIGHT);
        tfTotalPayment.setAlignment(Pos.BOTTOM_RIGHT);
        tfMonthlyPayment.setEditable(false);
        tfTotalPayment.setEditable(false);

        // setting Scene to put gridPane in to display data
        Scene scene = new Scene(gridPane, 400, 300);
        primaryStage.setTitle("The Loan Calculator"); // Set title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage
    }

    // settes and getters
    public TextField getTfMonthlyPayment() {
        return tfMonthlyPayment;
    }

    public void setTfMonthlyPayment(TextField tfMonthlyPayment) {
        this.tfMonthlyPayment = tfMonthlyPayment;
    }

    public TextField getTfTotalPayment() {
        return tfTotalPayment;
    }

    public void setTfTotalPayment(TextField tfTotalPayment) {
        this.tfTotalPayment = tfTotalPayment;
    }

    public static void main(String[] args) {
        Application.launch(args);
    }

    // to get calculations for Loan Payment
    private void calculateLoanPayment() {

        double interest = Double.parseDouble(tfAnnualInterestRate.getText());
        int year = Integer.parseInt(tfNumberOfYears.getText());
        double loanAmount = Double.parseDouble(tfLoanAmount.getText());

        Loan loan = new Loan(interest, year, loanAmount);

        System.out.printf("Monthly Payment: $%.2f%n", loan.getMonthlyPayment());
        System.out.printf("Total Payment: $%.2f%n", loan.getTotalPayment());
    }

}
