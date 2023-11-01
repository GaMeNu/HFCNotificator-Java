package me.gamenu.hfcnotificator;

import java.awt.*;


public class BackgroundTask {

    public static void main(String[] args) {

        if(SystemTray.isSupported()) {
            Image icon = Toolkit.getDefaultToolkit().getImage("icon.png");

            SystemTray systemTray = SystemTray.getSystemTray();

            PopupMenu popup = new PopupMenu();
            MenuItem menuItem = new MenuItem("Exit");

            menuItem.addActionListener(e -> System.exit(0));

            popup.add(menuItem);

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

        backgroundThread.setDaemon(true);

        backgroundThread.start();
    }
}
