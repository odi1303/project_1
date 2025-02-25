module ac.il.haifa.cs.sweng.project_1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ac.il.haifa.cs.sweng.project_1 to javafx.fxml;
    exports ac.il.haifa.cs.sweng.project_1;
}