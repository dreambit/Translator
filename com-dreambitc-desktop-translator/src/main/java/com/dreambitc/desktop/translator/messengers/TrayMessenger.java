package com.dreambitc.desktop.translator.messengers;

import java.awt.SystemTray;
import java.awt.TrayIcon;

public class TrayMessenger implements Messenger {

    /**
     * {@inheritDoc}
     */
    @Override
    public void showMessage(String message) {
        TrayIcon trayIcon = SystemTray.getSystemTray().getTrayIcons()[0];
        trayIcon.displayMessage("Tranlsation", message, TrayIcon.MessageType.NONE);
    }

}
