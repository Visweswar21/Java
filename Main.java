package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {
        try {
            Label namelabel = new Label("Name:");
            TextField nameField = new TextField();

            Label phonelabel = new Label("Phone number:");
            TextField phonefield = new TextField();

            Label emaillabel = new Label("Email:");
            TextField emailfield = new TextField();

            Button submitButton = new Button("Submit");
            Label messagelabel = new Label();

            submitButton.setOnAction(e -> {
                String name = nameField.getText();
                String phone = phonefield.getText();
                String email = emailfield.getText();
                messagelabel.setText("Submitted: " + name + " | " + phone + " | " + email);
            });

            GridPane grid = new GridPane();
            grid.setPadding(new Insets(15));
            grid.setVgap(10);
            grid.setHgap(10);

            grid.add(namelabel, 0, 0);
            grid.add(nameField, 1, 0);
            grid.add(phonelabel, 0, 1);
            grid.add(phonefield, 1, 1);
            grid.add(emaillabel, 0, 2);
            grid.add(emailfield, 1, 2);
            grid.add(submitButton, 1, 3);
            grid.add(messagelabel, 1, 4);

            Scene scene = new Scene(grid, 400, 250);
            primaryStage.setScene(scene);
            primaryStage.setTitle("User Form");
            primaryStage.show();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
