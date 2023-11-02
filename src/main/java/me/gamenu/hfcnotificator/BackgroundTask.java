package me.gamenu.hfcnotificator;

import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.awt.*;
import java.awt.event.ActionListener;
import java.io.IOException;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.SwingUtilities;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;



public class BackgroundTask {

    Stage stage;

    public void setStage(Stage stage) {
        this.stage = stage;
    }

    public Thread create() {

        if(SystemTray.isSupported()) {
            Image icon = Toolkit.getDefaultToolkit().getImage("icon.png");

            SystemTray systemTray = SystemTray.getSystemTray();

            PopupMenu popup = new PopupMenu();
            MenuItem exitItem = new MenuItem("Exit");

            exitItem.addActionListener(e -> System.exit(0));

            MenuItem settingsItem = new MenuItem("Settings");
            MenuItem mainViewItem = new MenuItem("Open");

            mainViewItem.addActionListener(e -> onMainViewOpen());

            settingsItem.addActionListener(e -> onSettingsViewOpen());

            //TODO need to add open settings
            //settingsItem.addActionListener(e -> );

            popup.add(mainViewItem);
            popup.add(settingsItem);
            popup.add(new MenuItem("-"));
            popup.add(exitItem);

            TrayIcon trayIcon = new TrayIcon(icon, "HFC Notificator", popup);
            trayIcon.addActionListener(e -> onMainViewOpen());

            try {
                systemTray.add(trayIcon);
            }
            catch (AWTException e) {
                e.printStackTrace();
            }
        }

        Thread backgroundThread = new Thread(() -> {
            while (true) {
                System.out.println("היישום רץ ברקע");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });


        backgroundThread.setDaemon(false);

        backgroundThread.start();

        return backgroundThread;

    }

    private static void onSettingsViewOpen() {

    }

    private void onMainViewOpen() {
        /*
        MainView.getMainScene()
        */
        try {
            MainView view = new MainView(this.stage);
        }
        catch (Exception e) {
            Stage stage = new Stage();
            FXMLLoader settingsView = new FXMLLoader(MainController.class.getResource("settings-view.fxml"));


            Scene settingsScene = null;
            try {
                settingsScene = new Scene(settingsView.load());
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }

            stage.setScene(settingsScene);
            stage.setTitle("Settings");
            stage.setMaximized(true);

        }

    }
}
