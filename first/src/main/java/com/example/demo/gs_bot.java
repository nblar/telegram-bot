package com.example.demo;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class gs_bot extends TelegramLongPollingBot {

	@Override
	public void onUpdateReceived(Update update) {
		 String cmd=update.getMessage().getText();
	        SendMessage msg=new SendMessage();
	        
	        if(cmd.equals("/creator"))
	         {
	             msg.setText("Nikhil Bhatnagar");
	         }
	         if (cmd.equals("/aboutus"))
	         {
	             msg.setText("We are the team of GirlScript Bangalore");
	         }
	        if (cmd.equals("/menu"))
	        {
	            msg.setText("Press 1 for Our History\n press 2 for our leader name\n 3- For the Chapter that created it ");
	        }

	        if(cmd.equals("1"))
	        {
	            msg.setText("Gs was Designed for thrill and fun and obvisouly to learn");
	        }
	        if(cmd.equals("2"))
	        {
	            msg.setText("Anubhava");
	        }
	        if (cmd.equals("3"))
	        {
	            msg.setText("We the coolest of all! Girlscript Bangalore");
	        }
	        msg.setChatId(update.getMessage().getChatId());
	        try {
	            execute(msg);
	        } catch (TelegramApiException e) {
	            e.printStackTrace();
	        }
		
	}

	@Override
	public String getBotUsername() {
		// TODO Auto-generated method stub
		return "emerald28Bot";
	}

	@Override
	public String getBotToken() {
		// TODO Auto-generated method stub
		return "1070075151:AAFkUobe8aRsczt5u0qbDhNEnCIgmvywhkc";
	}

}
