package Core;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.awt.*;
import javafx.scene.Parent;
import javafx.stage.WindowEvent;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Gui extends Application {

  private static Model model;
  private final int PORT = 1594;
  @Override
  public void start(Stage primaryStage) throws Exception {
    Parent root = FXMLLoader.load(getClass().getResource("trial.fxml"));
    primaryStage.setTitle("Simulator");
    primaryStage.setScene(new Scene(root, 540, 324));
    primaryStage.show();

    primaryStage.setOnCloseRequest(new EventHandler<WindowEvent>() {
      @Override
      public void handle(WindowEvent event) {
        Platform.exit();
        System.exit(0);
      }
    });

  }

//
//
//  protected JLabel labelPublishPort;
//  private final JButton buttonConnect = new JButton("run");
//  private final JButton agreement = new JButton("Agreement");
//  private final JButton concentrating = new JButton("Concentrating");
//  private final JButton disagreement = new JButton("Disagreement");
//  private final JButton interested = new JButton("Interested");
//  private final JButton thinking = new JButton("Thinking");
//  private final JButton unsure = new JButton("Unsure");
//  private JLabel textLabelAgree;
//  private JLabel textLabelConcentrate;
//
//
//  private Component createPanelSouth() {
//
//    JPanel labels = new JPanel();
//    labels.setBackground(Color.GRAY);
//    labels.add(new JLabel("  Publishing at port: "));
//    labelPublishPort = new JLabel("" + PORT);
//    labels.add(labelPublishPort);
//    JPanel panel = new JPanel(new BorderLayout());
//    panel.setBackground(Color.CYAN);
//    panel.add(labels, BorderLayout.WEST);
//    panel.add(buttonConnect, BorderLayout.EAST);
//    buttonConnect.addActionListener(this);
//    buttonConnect.setEnabled(true);
//    return panel;
//  }
//
//  private Component createPanelLine_Start(){
//    JPanel labels = new JPanel();
//    labels.setLayout(new GridBagLayout());
//    GridBagConstraints gbc = new GridBagConstraints();
//    textLabelAgree  = new JLabel();
//    textLabelAgree.setText("Agreement");
//    textLabelAgree.setBounds(0,0,20,10);
//    labels.add(textLabelAgree);
//    textLabelConcentrate = new JLabel();
//    textLabelConcentrate.setText("Concentrate");
//    textLabelConcentrate.setBounds(0,5,20,10);
//    labels.add(textLabelConcentrate);
////    labels.add((new JLabel("Agreement")),gbc);
////    labels.add((new JLabel("Concentrating")),gbc);
////    labels.add((new JLabel("Disagreement")),gbc);
////    labels.add((new JLabel("Interested")),gbc);
////    labels.add((new JLabel("Thinking")),gbc);
////    labels.add((new JLabel("Unsure"));
//
//    labels.setBackground(Color.GRAY);
////    GridPane grid = new GridPane();
////    grid.setPadding(new Insets(10,10,10,10));
////    grid.setVgap(8);
////    grid.setHgap(10);
////    javafx.scene.control.Label agree = new javafx.scene.control.Label("Agreement");
////    GridPane.setConstraints(agree,0,0);
//      JPanel panel = new JPanel(new BorderLayout());
//      panel.add(labels,BorderLayout.WEST);
//      return panel;
//  //    panel.setBackground(Color.BLACK);
////    panel.add(labels,BorderLayout.CENTER);
////    return panel;
//  }
//
//
//
//  public Gui() {
//
//    model = new Model(new DataGenerator(), new Publisher(PORT));
//    this.setBackground(Color.WHITE);
//    this.setLayout(new BorderLayout());
//    this.add(createPanelSouth(), BorderLayout.SOUTH);
//    this.add(createPanelLine_Start());
//    Dimension screen = getToolkit().getScreenSize();
//    this.setSize(screen.width / 2, 3 * screen.height / 4);
//    this.setLocation((screen.width - getSize().width) / 2, (screen.height - getSize().height) / 2);
//    System.out.println("gui done");
//  }
//
//  @Override
//  public void actionPerformed(ActionEvent e) {
//    System.out.println("listener trigger");
//    if (e.getSource() == buttonConnect) {
//      if (buttonConnect.getText().compareTo("run") == 0) {
//            System.out.println("start");
//        model.start();
//        buttonConnect.setText("stop");
//      } else if (buttonConnect.getText().compareTo("stop") == 0) {
//                    System.out.println("stop");
//        model.stop();
//        buttonConnect.setText("run");
//      }
//    }
//  }

  public static void main(String[] args) {
    launch();


  }

//    JFrame frame = new JFrame("Simulator");
//    frame.setLayout(new GridLayout(1, 1));
//    frame.add(new Gui());
//    frame.addWindowListener(new java.awt.event.WindowAdapter() {
//      @Override
//      public void windowClosing(java.awt.event.WindowEvent e) {
//        model.shutdown();
//        System.exit(0);
//      }
//    });
//    frame.pack();
//    frame.setSize(500, 300);
//    frame.setVisible(true);
//  }

}