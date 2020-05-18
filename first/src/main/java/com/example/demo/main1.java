package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.stereotype.Controller;
import org.telegram.telegrambots.ApiContextInitializer;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

@Controller
public class main1 {

	public static void main(String[] args) {
		//SpringApplication.run(AioobbotApplication.class, args);
        ApiContextInitializer.init();
        TelegramBotsApi telegramBotsApi = new TelegramBotsApi();
        try {
            telegramBotsApi.registerBot(new gs_bot());
            
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
	
}
}
