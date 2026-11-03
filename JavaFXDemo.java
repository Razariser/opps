import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class JavaFXDemo extends Application {
    public static void main(String[] args) { launch(args); }

    public void start(Stage st) {
        TextField t = new TextField();
        Button b = new Button("Click");
        Label l = new Label();
        b.setOnAction(e -> l.setText("Hello " + t.getText()));

        Menu m = new Menu("File");
        MenuItem ex = new MenuItem("Exit");
        ex.setOnAction(e -> st.close());
        m.getItems().add(ex);

        VBox box = new VBox(10, new MenuBar(m), t, b, l);
        st.setScene(new Scene(box, 300, 200));
        st.show();
    }
}
