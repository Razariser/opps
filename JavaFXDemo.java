import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class JavaFXDemo extends Application {

    @Override
    public void start(Stage stage) {
        // Controls
        Label nameLbl = new Label("Name:");
        TextField nameTf = new TextField();
        nameTf.setPromptText("Enter your name");

        RadioButton male = new RadioButton("Male");
        RadioButton female = new RadioButton("Female");
        ToggleGroup tg = new ToggleGroup();
        male.setToggleGroup(tg);
        female.setToggleGroup(tg);

        CheckBox java = new CheckBox("Java");
        CheckBox python = new CheckBox("Python");

        ComboBox<String> course = new ComboBox<>();
        course.getItems().addAll("B.E. CSE", "B.Tech IT", "B.Sc CS");
        course.setValue("B.E. CSE");

        Button submit = new Button("Submit");
        Label result = new Label();

        submit.setOnAction(e -> {
            String gender = male.isSelected() ? "Male" : female.isSelected() ? "Female" : "Not selected";
            String langs = (java.isSelected() ? "Java " : "") + (python.isSelected() ? "Python" : "");
            result.setText("Name: " + nameTf.getText() + "\nGender: " + gender
                    + "\nLanguages: " + langs + "\nCourse: " + course.getValue());
        });

        // Layout: GridPane for the form
        GridPane grid = new GridPane();
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(15));
        grid.add(nameLbl, 0, 0);
        grid.add(nameTf, 1, 0);
        grid.add(new Label("Gender:"), 0, 1);
        grid.add(new HBox(10, male, female), 1, 1);
        grid.add(new Label("Languages:"), 0, 2);
        grid.add(new HBox(10, java, python), 1, 2);
        grid.add(new Label("Course:"), 0, 3);
        grid.add(course, 1, 3);
        grid.add(submit, 1, 4);

        // Menus
        Menu fileMenu = new Menu("File");
        MenuItem clear = new MenuItem("Clear");
        MenuItem exit = new MenuItem("Exit");
        fileMenu.getItems().addAll(clear, new SeparatorMenuItem(), exit);

        Menu helpMenu = new Menu("Help");
        MenuItem about = new MenuItem("About");
        helpMenu.getItems().add(about);

        clear.setOnAction(e -> {
            nameTf.clear();
            tg.selectToggle(null);
            java.setSelected(false);
            python.setSelected(false);
            result.setText("");
        });
        exit.setOnAction(e -> stage.close());
        about.setOnAction(e -> {
            Alert a = new Alert(Alert.AlertType.INFORMATION, "JavaFX Controls, Layouts and Menus demo");
            a.setHeaderText("About");
            a.showAndWait();
        });

        MenuBar menuBar = new MenuBar(fileMenu, helpMenu);

        // Root layout: BorderPane
        BorderPane root = new BorderPane();
        root.setTop(menuBar);
        root.setCenter(grid);
        VBox bottom = new VBox(result);
        bottom.setPadding(new Insets(10));
        root.setBottom(bottom);

        stage.setTitle("JavaFX Demo");
        stage.setScene(new Scene(root, 400, 380));
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
