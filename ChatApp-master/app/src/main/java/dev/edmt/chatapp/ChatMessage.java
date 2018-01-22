package dev.edmt.chatapp;

import android.graphics.Bitmap;

import java.util.Date;

/**
 * Created by reale on 18/11/2016.
 */

public class ChatMessage {
    private String messageText;
    private String messageUser;
    private long messageTime;
    private String bitmapString;

    public ChatMessage(String messageText, String messageUser) {
        this.messageText = messageText;
        this.messageUser = messageUser;

        messageTime = new Date().getTime();
    }

    public ChatMessage(String bitmapString, String messageText, String messageUser) {
        this.messageText = messageText;
        this.messageUser = messageUser;
        this.bitmapString = bitmapString;
        messageTime = new Date().getTime();
    }

    public ChatMessage() {
    }

    public String getMessageText() {
        return messageText;
    }

    public void setMessageText(String messageText) {
        this.messageText = messageText;
    }

    public String getMessageUser() {
        return messageUser;
    }

    public void setMessageUser(String messageUser) {
        this.messageUser = messageUser;
    }

    public long getMessageTime() {
        return messageTime;
    }

    public void setMessageTime(long messageTime) {
        this.messageTime = messageTime;
    }

    public String getBitmapString() {
        return bitmapString;
    }
}
