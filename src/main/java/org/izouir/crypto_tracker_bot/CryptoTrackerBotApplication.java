package org.izouir.crypto_tracker_bot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class CryptoTrackerBotApplication {

    public static void main(final String[] args) {
        SpringApplication.run(CryptoTrackerBotApplication.class, args);
    }

}
