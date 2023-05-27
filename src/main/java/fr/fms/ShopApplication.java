package fr.fms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import fr.fms.dao.ArticleRepository;
import fr.fms.entities.Article;

@SpringBootApplication
public class ShopApplication implements CommandLineRunner{
	
	@Autowired
	ArticleRepository articleRepository;

	public static void main(String[] args) {
		SpringApplication.run(ShopApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		articleRepository.save(new Article(null,"samsoule S8",230));
		articleRepository.save(new Article(null,"samsoule s9",270));
		articleRepository.save(new Article(null,"samsoule s10",320));
		articleRepository.save(new Article(null,"Aphone1",500));
		articleRepository.save(new Article(null,"Aphone2",560));
		articleRepository.save(new Article(null,"Aphone3",740));
		articleRepository.save(new Article(null,"Goonies Pixel 1",560));
		articleRepository.save(new Article(null,"Goonies Pixel @1",540));
		articleRepository.save(new Article(null,"Goonies Pixel @5",860));
		articleRepository.save(new Article(null,"Sony Adv1",450));
		articleRepository.save(new Article(null,"Sony Adv@",470));
		articleRepository.save(new Article(null,"Sony Verant1",360));
		articleRepository.save(new Article(null,"Sony verant@",280));
		articleRepository.save(new Article(null,"Sony Verant@1",370));
		articleRepository.findAll().forEach(a -> System.out.println(a));
		
	}

}
