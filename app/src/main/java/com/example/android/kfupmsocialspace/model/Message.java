package com.example.android.kfupmsocialspace.model;

public class Message {


    private String MessageID;
    private String SenderID;
    private String SenderName;
    private String Message;
    private String Timestamp;
    private String Type;
    private String media;
    private String Image;
    private String Document;
    private String voice;


    public Message(){

    }

    public Message(String senderID,String senderName,String message,String timestamp, String type,  String media){
        this.MessageID = MessageID;
        this.SenderID = senderID;
        this.SenderName = senderName;
        this.Message = message;
        this.Timestamp = timestamp;
        this.Type = type;
        this.media = media;

//        this.Image = image;
//        this.Document = document;
//        this.voice = voice;

    }

  /*  public Message(String senderID,String senderName,String message,String timestamp, String type, String image){

        this.SenderID = senderID;
        this.SenderName = senderName;
        this.Message = message;
        this.Timestamp = timestamp;
        this.Type = type;
        this.Image = image;

    }*/


  //custom constructors
 /* public static Message textMessage(String senderID,String senderName,String message,String timestamp){
      Message textMsg = new Message(senderID,senderName,message,timestamp,"text",null,null,null);
      return  textMsg;

  }

  public static Message imageMessage(String senderID,String senderName,String message,String timestamp, String image ){
        Message imageMsg = new Message(senderID,senderName,message,timestamp,"image",image,null,null);
        return  imageMsg;
  }

  public static Message documentMessage(String senderID,String senderName,String message,String timestamp, String document ){
        Message documentMsg = new Message(senderID,senderName,message,timestamp,"document",null,document,null);
        return  documentMsg;
  }

  public static Message voiceMessage(String senderID,String senderName,String message,String timestamp, String voice ){
        Message voiceMsg = new Message(senderID,senderName,message,timestamp,"voice",null,null,voice);
        return  voiceMsg;
  }*/


    public String getMessageID() { return MessageID; }

    public String getSenderID() {
        return SenderID;
    }

    public String getSenderName() { return SenderName; }

    public String getMessage() { return Message; }

    public String getTimestamp() { return Timestamp; }

    public String getType() { return Type; }

    public String getMedia() { return media; }

    public String getImage() { return Image; }

    public String getDocument() { return Document; }

    public String getVoice() { return voice; }

    public void setMessageID(String messageID) { MessageID = messageID; }

    public void setSenderID(String senderID) {
        SenderID = senderID;
    }

    public void setMessage(String message) {
        Message = message;
    }

    public void setSenderName(String senderName) { SenderName = senderName; }

    public void setTimestamp(String timestamp) { Timestamp = timestamp; }

    public void setType(String type) { Type = type; }

    public void setMedia(String media) { this.media = media; }

    public void setImage(String image) { Image = image; }

    public void setDocument(String document) { Document = document; }

    public void setVoice(String voice) { this.voice = voice; }
}
