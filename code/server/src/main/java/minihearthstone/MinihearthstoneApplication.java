package minihearthstone;

import minihearthstone.entities.cards.*;
import minihearthstone.entities.cards.effects.ChargeEffect;
import minihearthstone.entities.cards.effects.LifeStealEffect;
import minihearthstone.entities.cards.effects.ProvocationEffect;
import minihearthstone.entities.deck.Deck;
import minihearthstone.entities.deck.DeckRepository;
import minihearthstone.entities.heroes.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.SpringVersion;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
@SpringBootApplication
public class MinihearthstoneApplication {

	private static final Logger log = LoggerFactory.getLogger(MinihearthstoneApplication.class);

	@RequestMapping("/")
	@ResponseBody
	String home() {
		return "Minihearthstone server";
	}

	public static void main(final String[] args) {
		log.info("version: " + SpringVersion.getVersion());
		SpringApplication.run(MinihearthstoneApplication.class, args);
		
	}

	@Bean
	public CommandLineRunner demo(
		final CardRepository cardRepository, 
		final HeroRepository heroRepository, 
		final DeckRepository deckRepository) 
	{
		return (args) -> {
			// Define card lists
			final List<Card> commonCards = new ArrayList<>();
			final List<Card> paladinSpecificCards = new ArrayList<>();
			final List<Card> warriorSpecificCards = new ArrayList<>();
			final List<Card> mageSpecificCards = new ArrayList<>();
			String common = "common";
			String paladinstr = "paladin";
			String warriorstr = "warrior";
			String magestr = "mage";
			String servantstr = "servant";
			String spellstr = "spell";


			// Store the common cards
			commonCards.add(new BasicCard("Stonetusk Boar", 1, 1, 1, common, servantstr, null, null,"Common servant", "Click on this card to summon the servant."));
			commonCards.add(new BasicCard("Goldshire Footman", 1, 1, 2, common,servantstr,new ProvocationEffect(), null,"Provocation", "Click on this card to summon the servant. Provocation effect forces enemies to attack it first."));
			commonCards.add(new BasicCard("Wolfrider", 3, 3, 1, common,servantstr, new ChargeEffect(), null,"Charge","Click on this card to summon the servant. Charge effect allows this servant to attack immediately once drawn."));
			commonCards.add(new BasicCard("Raid leader", 3, 2, 2, common,servantstr, null, new ChefDeRaid(),"Common servant","Click on this card to summon the servant."));
			commonCards.add(new BasicCard("Chillwind Yeti", 4, 4, 5, common,servantstr, null, null,"Common servant","Click on this card to summon the servant."));

			// Paladin specific cardsapplyPreActionEffect
			paladinSpecificCards.add(new BasicCard("Chillblade Champion", 4, 3, 2, paladinstr,servantstr, new LifeStealEffect(), null,"Life steal","Click on this card to summon the servant. Life steal effect restores as much life as damage inflicted."));
			paladinSpecificCards.add(new BasicCard("Blessing of Might", 1, 3, 0, paladinstr,"targetedSpell", null, new BenedictionDePuissance(),"Targeted spell","Click on this card, then click on one of your servants in the fighting ground to give them a bonus of +3 damage."));
			paladinSpecificCards.add(new BasicCard("Consecration", 4, 2, 0, paladinstr,spellstr, null, new Consecration(),"Spell","Clicking on this card, inflicts 2 damage points to every enemy servant."));

			// Warrior specific cards
			warriorSpecificCards.add(new BasicCard("Whirlwind", 1, 1, 0, "warriorstr",spellstr, null, new Tourbillon(),"Spell", "Clicking on this spell, inflicts -1 on all servants in the fighting zone, including your own."));
			warriorSpecificCards.add(new BasicCard("Public Defender", 2, 0, 7, "warriorstr",servantstr, new ProvocationEffect(), null,"Provocation", "Click on this card to summon the servant. Provocation effect forces enemies to attack it first."));
			warriorSpecificCards.add(new BasicCard("Shield Block", 3, 0, 0, "warriorstr",spellstr,null, new MaitriseDuBlocage(),"Spell","Clicking on this card, gives you 5 armour points and picks a new card."));

			// Mage specific cards
			mageSpecificCards.add(new BasicCard("Mirror Image", 1, 0, 2, magestr,spellstr, new ProvocationEffect(), new ImageMirroir(),"Provocation", "Click on this card to summon 2 servants, each having provocation effect which forces all enemies to attack them first."));
			mageSpecificCards.add(new BasicCard("Arcane Explosion", 2, 1, 0, magestr,spellstr, null, new ExplosionDesArcanes(),"Spell","Clicking on this card deals 1 damage point to all enemy servants."));
			mageSpecificCards.add(new BasicCard("Polymorph", 4, 0, 0, magestr,"targetedSpell", null, new Metamorphose(),"Targeted spell", "Click on this card, then click on an enemy servant to turn them into a weak card with 1 damage 1 hit point."));

			// Store the heroes
			final Hero paladin = new BasicHero("Uther", paladinstr, "self", new Paladin(), "Spell: reinforce, summons the servant 'silverhand recruit' 1/1.");
			final Hero warrior =  new BasicHero("Garrosh", warriorstr, "self", new Warrior(), "Spell: armour, +2 defence points on self");
			final Hero mage = new BasicHero("Jaina", magestr, "targeted",new Mage(), "Spell: ball of fire, inflicts 1 damage point to the ennemy (servant or hero).");

			heroRepository.save(paladin);
			heroRepository.save(warrior);
			heroRepository.save(mage);

			// Initialize deck of each hero

			final Deck paladinDeck = new Deck(paladin, commonCards, paladinSpecificCards);
			final Deck warriorDeck = new Deck(warrior, commonCards, warriorSpecificCards);
			final Deck mageDeck = new Deck(mage, commonCards, mageSpecificCards);

			
			// Store the decks in JPA
			deckRepository.save(paladinDeck);
			deckRepository.save(warriorDeck);
			deckRepository.save(mageDeck);

			//Affichage test
			
			log.info("CardRepository :");
			log.info("-------------------------------------------------");
			for (final Card card : cardRepository.findAll()) {
				log.info(card.toString());
			}

			log.info("HeroRepository :");
			log.info("-------------------------------------------------");
			for (final Hero hero : heroRepository.findAll()) {
				log.info(hero.toString());
			}

			log.info("commonCards :");
			log.info("-------------------------------------------------");
			for (final Card card : commonCards) {
				log.info(card.toString());
			}

			log.info("paladinSpecificCards :");
			log.info("-------------------------------------------------");
			for (final Card card : paladinSpecificCards) {
				log.info(card.toString());
			}

			log.info("DeckRepository :");
			log.info("-------------------------------------------------");
			for (final Deck deck : deckRepository.findAll()) {
				log.info(deck.toString());
			}

			log.info("-------------------------------------------------");
			/*Deck paladinDeckJPA = deckRepository.findByHeroId(paladin.getId());
			log.info(paladinDeckJPA.toString());*/

			
			// log.info(paladinDeck.randomHand(3).toString());

		};
	}
}
