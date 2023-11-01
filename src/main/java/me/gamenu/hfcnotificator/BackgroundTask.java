package me.gamenu.hfcnotificator;

import java.awt.*;


public class BackgroundTask {

    public static void main(String[] args) {

        if(SystemTray.isSupported()) {
            Image icon = Toolkit.getDefaultToolkit().getImage("icon.png");

            SystemTray systemTray = SystemTray.getSystemTray();

            PopupMenu popup = new PopupMenu();
            MenuItem exitItem = new MenuItem("Exit");

            exitItem.addActionListener(e -> System.exit(0));

            MenuItem settingsItem = new MenuItem("Settings");

            //TODO need to add open settings
            //settingsItem.addActionListener(e -> );

            popup.add(settingsItem);
            popup.add(exitItem);

            TrayIcon trayIcon = new TrayIcon(icon, "HFC Notificator", popup);

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
    }
}
