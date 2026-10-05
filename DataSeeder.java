package com.hackathon.decor.config;

import com.hackathon.decor.model.Decorator;
import com.hackathon.decor.repository.DecoratorRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataSeeder {

    @Bean
    CommandLineRunner seedData(DecoratorRepository repository) {
        return args -> {
            if (repository.count() > 0) return;

            repository.save(new Decorator(
                    "Royal Bloom Events", "Arjun Kumar", "Tirupati",
                    "Decoration & Floral", "Wedding,Birthday,Reception,Engagement",
                    25000.0, 4.9, "9876543210", "royalbloom@example.com",
                    "https://example.com/royal-bloom", true,
                    "Premium floral stages, mandap decoration and elegant event themes.",
                    "https://images.unsplash.com/photo-1519167758481-83f550bb49b3?auto=format&fit=crop&w=900&q=80"
            ));

            repository.save(new Decorator(
                    "Petal Paradise", "Meena Reddy", "Nellore",
                    "Floral", "Wedding,Engagement,Birthday",
                    18000.0, 4.8, "9876543211", "petal@example.com",
                    "https://example.com/petal-paradise", true,
                    "Fresh flower walls, bouquets, entrance decoration and table florals.",
                    "https://images.unsplash.com/photo-1523438885200-e635ba2c371e?auto=format&fit=crop&w=900&q=80"
            ));

            repository.save(new Decorator(
                    "Dreamy Decor Studio", "Rahul Varma", "Hyderabad",
                    "Decoration", "Wedding,Birthday,Corporate,Reception",
                    35000.0, 4.7, "9876543212", "dreamy@example.com",
                    "https://example.com/dreamy-decor", true,
                    "Modern stage design, LED themes, balloon decor and complete event setup.",
                    "https://images.unsplash.com/photo-1507504031003-b417219a0fde?auto=format&fit=crop&w=900&q=80"
            ));

            repository.save(new Decorator(
                    "Green Leaf Celebrations", "Priya Rao", "Vijayawada",
                    "Decoration & Floral", "Wedding,Birthday,Engagement",
                    22000.0, 4.6, "9876543213", "greenleaf@example.com",
                    "https://example.com/green-leaf", true,
                    "Budget-friendly natural floral themes and traditional decorations.",
                    "https://images.unsplash.com/photo-1519225421980-715cb0215aed?auto=format&fit=crop&w=900&q=80"
            ));

            repository.save(new Decorator(
                    "Golden Garland", "Kiran Singh", "Chennai",
                    "Floral", "Wedding,Reception,Engagement",
                    30000.0, 4.9, "9876543214", "golden@example.com",
                    "https://example.com/golden-garland", true,
                    "Luxury garlands, flower arches and premium reception styling.",
                    "https://images.unsplash.com/photo-1478146896981-b80fe463b330?auto=format&fit=crop&w=900&q=80"
            ));

            repository.save(new Decorator(
                    "Happy Moments Decor", "Sneha Devi", "Tirupati",
                    "Decoration", "Birthday,Wedding,Corporate",
                    12000.0, 4.5, "9876543215", "happy@example.com",
                    "https://example.com/happy-moments", true,
                    "Affordable event decoration packages for memorable celebrations.",
                    "https://images.unsplash.com/photo-1492684223066-81342ee5ff30?auto=format&fit=crop&w=900&q=80"
            ));
        };
    }
}
