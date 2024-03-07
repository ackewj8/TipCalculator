module williamcsc325.tipcalculator {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens williamcsc325.tipcalculator to javafx.fxml;
    exports williamcsc325.tipcalculator;
}