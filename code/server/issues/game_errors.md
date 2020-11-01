# Logs for bug correction

## Issue : extra cards given to player because the cards were given to the wrong player

2019-07-27 16:06:55.233  INFO 8884 --- [           main] j.LocalContainerEntityManagerFactoryBean : Initialized JPA EntityManagerFactory for persistence unit 'default'
2019-07-27 16:06:56.274  INFO 8884 --- [           main] o.s.s.concurrent.ThreadPoolTaskExecutor  : Initializing ExecutorService 'clientInboundChannelExecutor'
2019-07-27 16:06:56.285  INFO 8884 --- [           main] o.s.s.concurrent.ThreadPoolTaskExecutor  : Initializing ExecutorService 'clientOutboundChannelExecutor'
2019-07-27 16:06:56.301  INFO 8884 --- [           main] o.s.s.c.ThreadPoolTaskScheduler          : Initializing ExecutorService 'messageBrokerTaskScheduler'
2019-07-27 16:06:56.365  INFO 8884 --- [           main] o.s.s.concurrent.ThreadPoolTaskExecutor  : Initializing ExecutorService 'brokerChannelExecutor'
2019-07-27 16:06:56.785  WARN 8884 --- [           main] aWebConfiguration$JpaWebMvcConfiguration : spring.jpa.open-in-view is enabled by default. Therefore, database queries may be performed during view rendering. Explicitly configure spring.jpa.open-in-view to disable this warning
2019-07-27 16:06:57.388  INFO 8884 --- [           main] o.s.m.s.b.SimpleBrokerMessageHandler     : Starting...
2019-07-27 16:06:57.390  INFO 8884 --- [           main] o.s.m.s.b.SimpleBrokerMessageHandler     : BrokerAvailabilityEvent[available=true, SimpleBrokerMessageHandler [DefaultSubscriptionRegistry[cache[0 destination(s)], registry[0 sessions]]]]
2019-07-27 16:06:57.390  INFO 8884 --- [           main] o.s.m.s.b.SimpleBrokerMessageHandler     : Started.
2019-07-27 16:06:57.435  INFO 8884 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port(s): 8090 (http) with context path ''
2019-07-27 16:06:57.437  INFO 8884 --- [           main] m.MinihearthstoneApplication             : Started MinihearthstoneApplication in 7.301 seconds (JVM running for 8.081)
2019-07-27 16:06:57.513  INFO 8884 --- [nio-8090-exec-2] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring DispatcherServlet 'dispatcherServlet'
2019-07-27 16:06:57.514  INFO 8884 --- [nio-8090-exec-2] o.s.web.servlet.DispatcherServlet        : Initializing Servlet 'dispatcherServlet'
2019-07-27 16:06:57.539  INFO 8884 --- [nio-8090-exec-2] o.s.web.servlet.DispatcherServlet        : Completed initialization in 25 ms
2019-07-27 16:06:57.589  INFO 8884 --- [           main] m.MinihearthstoneApplication             : CardRepository :
2019-07-27 16:06:57.589  INFO 8884 --- [           main] m.MinihearthstoneApplication             : -------------------------------------------------
2019-07-27 16:06:57.620  INFO 8884 --- [           main] o.h.h.i.QueryTranslatorFactoryInitiator  : HHH000397: Using ASTQueryTranslatorFactory
2019-07-27 16:06:57.813  INFO 8884 --- [           main] m.MinihearthstoneApplication             : Card[id=5, uniqueId='Sanglier brocheroc1564236417525887422117', name='Sanglier brocheroc', manacost=1, damage=1, lifepoints=1, nature='servant', canAttack=false, currentTargetUniqueId='Sanglier brocheroc1564236417525887422117', effect='null', specificCard='null']
2019-07-27 16:06:57.813  INFO 8884 --- [           main] m.MinihearthstoneApplication             : Card[id=6, uniqueId='Soldat du comtÚ-de-l'or156423641752557665884', name='Soldat du comtÚ-de-l'or', manacost=1, damage=1, lifepoints=2, nature='servant', canAttack=false, currentTargetUniqueId='Soldat du comtÚ-de-l'or156423641752557665884', effect='ProvocationEffect', specificCard='null']
2019-07-27 16:06:57.813  INFO 8884 --- [           main] m.MinihearthstoneApplication             : Card[id=7, uniqueId='Chevaucheur de loup1564236417525823102047', name='Chevaucheur de loup', manacost=3, damage=3, lifepoints=1, nature='servant', canAttack=false, currentTargetUniqueId='Chevaucheur de loup1564236417525823102047', effect='ChargeEffect', specificCard='null']
2019-07-27 16:06:57.813  INFO 8884 --- [           main] m.MinihearthstoneApplication             : Card[id=8, uniqueId='Chef de Raid15642364175251335406193', name='Chef de Raid', manacost=3, damage=2, lifepoints=2, nature='servant', canAttack=false, currentTargetUniqueId='Chef de Raid15642364175251335406193', effect='null', specificCard='ChefDeRaid']
2019-07-27 16:06:57.814  INFO 8884 --- [           main] m.MinihearthstoneApplication             : Card[id=9, uniqueId='YÚti noroit15642364175251555476022', name='YÚti noroit', manacost=4, damage=4, lifepoints=5, nature='servant', canAttack=false, currentTargetUniqueId='YÚti noroit15642364175251555476022', effect='null', specificCard='null']
2019-07-27 16:06:57.814  INFO 8884 --- [           main] m.MinihearthstoneApplication             : Card[id=10, uniqueId='Champion frisselame1564236417525551849655', name='Champion frisselame', manacost=4, damage=3, lifepoints=2, nature='servant', canAttack=false, currentTargetUniqueId='Champion frisselame1564236417525551849655', effect='LifeStealEffect', specificCard='null']
2019-07-27 16:06:57.814  INFO 8884 --- [           main] m.MinihearthstoneApplication             : Card[id=11, uniqueId='BÚnÚdiction de puissance15642364175251836480833', name='BÚnÚdiction de puissance', manacost=1, damage=3, lifepoints=0, nature='targetedSpell', canAttack=false, currentTargetUniqueId='BÚnÚdiction de puissance15642364175251836480833', effect='null', specificCard='BenedictionDePuissance']
2019-07-27 16:06:57.814  INFO 8884 --- [           main] m.MinihearthstoneApplication             : Card[id=12, uniqueId='ConsÚcration15642364175251728427882', name='ConsÚcration', manacost=4, damage=2, lifepoints=0, nature='spell', canAttack=false, currentTargetUniqueId='ConsÚcration15642364175251728427882', effect='null', specificCard='Consecration']
2019-07-27 16:06:57.814  INFO 8884 --- [           main] m.MinihearthstoneApplication             : Card[id=14, uniqueId='Sanglier brocheroc1564236417525235191108', name='Sanglier brocheroc', manacost=1, damage=1, lifepoints=1, nature='servant', canAttack=false, currentTargetUniqueId='Sanglier brocheroc1564236417525235191108', effect='null', specificCard='null']
2019-07-27 16:06:57.814  INFO 8884 --- [           main] m.MinihearthstoneApplication             : Card[id=15, uniqueId='Soldat du comtÚ-de-l'or1564236417525177712132', name='Soldat du comtÚ-de-l'or', manacost=1, damage=1, lifepoints=2, nature='servant', canAttack=false, currentTargetUniqueId='Soldat du comtÚ-de-l'or1564236417525177712132', effect='ProvocationEffect', specificCard='null']
2019-07-27 16:06:57.815  INFO 8884 --- [           main] m.MinihearthstoneApplication             : Card[id=16, uniqueId='Chevaucheur de loup15642364175251409402679', name='Chevaucheur de loup', manacost=3, damage=3, lifepoints=1, nature='servant', canAttack=false, currentTargetUniqueId='Chevaucheur de loup15642364175251409402679', effect='ChargeEffect', specificCard='null']
2019-07-27 16:06:57.815  INFO 8884 --- [           main] m.MinihearthstoneApplication             : Card[id=17, uniqueId='Chef de Raid1564236417525519425609', name='Chef de Raid', manacost=3, damage=2, lifepoints=2, nature='servant', canAttack=false, currentTargetUniqueId='Chef de Raid1564236417525519425609', effect='null', specificCard='ChefDeRaid']
2019-07-27 16:06:57.815  INFO 8884 --- [           main] m.MinihearthstoneApplication             : Card[id=18, uniqueId='YÚti noroit1564236417525899655750', name='YÚti noroit', manacost=4, damage=4, lifepoints=5, nature='servant', canAttack=false, currentTargetUniqueId='YÚti noroit1564236417525899655750', effect='null', specificCard='null']
2019-07-27 16:06:57.815  INFO 8884 --- [           main] m.MinihearthstoneApplication             : Card[id=19, uniqueId='Tourbillon156423641752541645466', name='Tourbillon', manacost=1, damage=1, lifepoints=0, nature='spell', canAttack=false, currentTargetUniqueId='Tourbillon156423641752541645466', effect='null', specificCard='Tourbillon']
2019-07-27 16:06:57.815  INFO 8884 --- [           main] m.MinihearthstoneApplication             : Card[id=20, uniqueId='Avocat commis d'office15642364175251486210029', name='Avocat commis d'office', manacost=2, damage=0, lifepoints=7, nature='servant', canAttack=false, currentTargetUniqueId='Avocat commis d'office15642364175251486210029', effect='ProvocationEffect', specificCard='null']
2019-07-27 16:06:57.815  INFO 8884 --- [           main] m.MinihearthstoneApplication             : Card[id=21, uniqueId='Ma¯trise du blocage15642364175251749003787', name='Ma¯trise du blocage', manacost=3, damage=0, lifepoints=0, nature='spell', canAttack=false, currentTargetUniqueId='Ma¯trise du blocage15642364175251749003787', effect='null', specificCard='MaitriseDuBlocage']
2019-07-27 16:06:57.816  INFO 8884 --- [           main] m.MinihearthstoneApplication             : Card[id=23, uniqueId='Sanglier brocheroc1564236417525542221107', name='Sanglier brocheroc', manacost=1, damage=1, lifepoints=1, nature='servant', canAttack=false, currentTargetUniqueId='Sanglier brocheroc1564236417525542221107', effect='null', specificCard='null']
2019-07-27 16:06:57.816  INFO 8884 --- [           main] m.MinihearthstoneApplication             : Card[id=24, uniqueId='Soldat du comtÚ-de-l'or15642364175252036539675', name='Soldat du comtÚ-de-l'or', manacost=1, damage=1, lifepoints=2, nature='servant', canAttack=false, currentTargetUniqueId='Soldat du comtÚ-de-l'or15642364175252036539675', effect='ProvocationEffect', specificCard='null']
2019-07-27 16:06:57.816  INFO 8884 --- [           main] m.MinihearthstoneApplication             : Card[id=25, uniqueId='Chevaucheur de loup1564236417525260275289', name='Chevaucheur de loup', manacost=3, damage=3, lifepoints=1, nature='servant', canAttack=false, currentTargetUniqueId='Chevaucheur de loup1564236417525260275289', effect='ChargeEffect', specificCard='null']
2019-07-27 16:06:57.816  INFO 8884 --- [           main] m.MinihearthstoneApplication             : Card[id=26, uniqueId='Chef de Raid1564236417525449474681', name='Chef de Raid', manacost=3, damage=2, lifepoints=2, nature='servant', canAttack=false, currentTargetUniqueId='Chef de Raid1564236417525449474681', effect='null', specificCard='ChefDeRaid']
2019-07-27 16:06:57.816  INFO 8884 --- [           main] m.MinihearthstoneApplication             : Card[id=27, uniqueId='YÚti noroit1564236417525926018526', name='YÚti noroit', manacost=4, damage=4, lifepoints=5, nature='servant', canAttack=false, currentTargetUniqueId='YÚti noroit1564236417525926018526', effect='null', specificCard='null']
2019-07-27 16:06:57.816  INFO 8884 --- [           main] m.MinihearthstoneApplication             : Card[id=28, uniqueId='Image mirroir15642364175251449066253', name='Image mirroir', manacost=1, damage=0, lifepoints=2, nature='spell', canAttack=false, currentTargetUniqueId='Image mirroir15642364175251449066253', effect='ProvocationEffect', specificCard='ImageMirroir']
2019-07-27 16:06:57.817  INFO 8884 --- [           main] m.MinihearthstoneApplication             : Card[id=29, uniqueId='Explosion des arcanes15642364175251118400685', name='Explosion des arcanes', manacost=2, damage=1, lifepoints=0, nature='spell', canAttack=false, currentTargetUniqueId='Explosion des arcanes15642364175251118400685', effect='null', specificCard='ExplosionDesArcanes']
2019-07-27 16:06:57.817  INFO 8884 --- [           main] m.MinihearthstoneApplication             : Card[id=30, uniqueId='MÚtamorphose1564236417525197438546', name='MÚtamorphose', manacost=4, damage=0, lifepoints=0, nature='targetedSpell', canAttack=false, currentTargetUniqueId='MÚtamorphose1564236417525197438546', effect='null', specificCard='Metamorphose']
2019-07-27 16:06:57.817  INFO 8884 --- [           main] m.MinihearthstoneApplication             : HeroRepository :
2019-07-27 16:06:57.817  INFO 8884 --- [           main] m.MinihearthstoneApplication             : -------------------------------------------------
2019-07-27 16:06:57.827  INFO 8884 --- [           main] m.MinihearthstoneApplication             : Hero[id=1, uniqueId='Echalwe1564236417443742806626', name='Echalwe', type=paladin, skillType='self', lifepoints=30,defense=0, description=Renfort, invoquant un serviteur 'recrue de la Main d'argent' 1/1., specificHero='Paladin']
2019-07-27 16:06:57.827  INFO 8884 --- [           main] m.MinihearthstoneApplication             : Hero[id=2, uniqueId='Hrothgar15642364174431391984031', name='Hrothgar', type=warrior, skillType='self', lifepoints=30,defense=0, description=Armure, lui confÚrant 2 points d'armure, specificHero='Warrior']
2019-07-27 16:06:57.827  INFO 8884 --- [           main] m.MinihearthstoneApplication             : Hero[id=3, uniqueId='Athelas15642364174431657199573', name='Athelas', type=mage, skillType='targeted', lifepoints=30,defense=0, description=Boule de feu, infligeant un point de dÚgat Ó l'adversaire (serviteur ou hÚros)., specificHero='Mage']
2019-07-27 16:06:57.827  INFO 8884 --- [           main] m.MinihearthstoneApplication             : commonCards :
2019-07-27 16:06:57.827  INFO 8884 --- [           main] m.MinihearthstoneApplication             : -------------------------------------------------
2019-07-27 16:06:57.827  INFO 8884 --- [           main] m.MinihearthstoneApplication             : Card[id=null, uniqueId='Sanglier brocheroc15642364174391579621402', name='Sanglier brocheroc', manacost=1, damage=1, lifepoints=1, nature='servant', canAttack=false, currentTargetUniqueId='Sanglier brocheroc15642364174391579621402', effect='null',
specificCard='null']
2019-07-27 16:06:57.827  INFO 8884 --- [           main] m.MinihearthstoneApplication             : Card[id=null, uniqueId='Soldat du comtÚ-de-l'or15642364174401141138854', name='Soldat du comtÚ-de-l'or', manacost=1, damage=1, lifepoints=2, nature='servant', canAttack=false, currentTargetUniqueId='Soldat du comtÚ-de-l'or15642364174401141138854',
effect='ProvocationEffect', specificCard='null']
2019-07-27 16:06:57.828  INFO 8884 --- [           main] m.MinihearthstoneApplication             : Card[id=null, uniqueId='Chevaucheur de loup15642364174401501020118', name='Chevaucheur de loup', manacost=3, damage=3, lifepoints=1, nature='servant', canAttack=false, currentTargetUniqueId='Chevaucheur de loup15642364174401501020118', effect='ChargeEffect', specificCard='null']
2019-07-27 16:06:57.828  INFO 8884 --- [           main] m.MinihearthstoneApplication             : Card[id=null, uniqueId='Chef de Raid15642364174401237402137', name='Chef de Raid', manacost=3, damage=2, lifepoints=2, nature='servant', canAttack=false, currentTargetUniqueId='Chef de Raid15642364174401237402137', effect='null', specificCard='ChefDeRaid']
2019-07-27 16:06:57.828  INFO 8884 --- [           main] m.MinihearthstoneApplication             : Card[id=null, uniqueId='YÚti noroit1564236417440793069043', name='YÚti noroit', manacost=4, damage=4, lifepoints=5, nature='servant', canAttack=false, currentTargetUniqueId='YÚti noroit1564236417440793069043', effect='null', specificCard='null']
2019-07-27 16:06:57.828  INFO 8884 --- [           main] m.MinihearthstoneApplication             : paladinSpecificCards :
2019-07-27 16:06:57.828  INFO 8884 --- [           main] m.MinihearthstoneApplication             : -------------------------------------------------
2019-07-27 16:06:57.828  INFO 8884 --- [           main] m.MinihearthstoneApplication             : Card[id=null, uniqueId='Champion frisselame15642364174431210663642', name='Champion frisselame', manacost=4, damage=3, lifepoints=2, nature='servant', canAttack=false, currentTargetUniqueId='Champion frisselame15642364174431210663642', effect='LifeStealEffect', specificCard='null']
2019-07-27 16:06:57.828  INFO 8884 --- [           main] m.MinihearthstoneApplication             : Card[id=null, uniqueId='BÚnÚdiction de puissance1564236417443752168969', name='BÚnÚdiction de puissance', manacost=1, damage=3, lifepoints=0, nature='targetedSpell', canAttack=false, currentTargetUniqueId='BÚnÚdiction de puissance1564236417443752168969', effect='null', specificCard='BenedictionDePuissance']
2019-07-27 16:06:57.828  INFO 8884 --- [           main] m.MinihearthstoneApplication             : Card[id=null, uniqueId='ConsÚcration15642364174431814190829', name='ConsÚcration', manacost=4, damage=2, lifepoints=0, nature='spell', canAttack=false, currentTargetUniqueId='ConsÚcration15642364174431814190829', effect='null', specificCard='Consecration']
2019-07-27 16:06:57.828  INFO 8884 --- [           main] m.MinihearthstoneApplication             : DeckRepository :
2019-07-27 16:06:57.828  INFO 8884 --- [           main] m.MinihearthstoneApplication             : -------------------------------------------------
2019-07-27 16:06:57.857  INFO 8884 --- [           main] m.MinihearthstoneApplication             : Deck[id=4, name='Echalwe's card deck', heroId=1, cards{'Sanglier brocheroc Soldat du comtÚ-de-l'or Chevaucheur de loup Chef de Raid YÚti noroit Champion frisselame BÚnÚdiction de puissance ConsÚcration '}]
2019-07-27 16:06:57.857  INFO 8884 --- [           main] m.MinihearthstoneApplication             : Deck[id=13, name='Hrothgar's card deck', heroId=2, cards{'Sanglier brocheroc Soldat du comtÚ-de-l'or Chevaucheur de loup Chef de Raid YÚti noroit Tourbillon Avocat commis d'office Ma¯trise du blocage '}]
2019-07-27 16:06:57.857  INFO 8884 --- [           main] m.MinihearthstoneApplication             : Deck[id=22, name='Athelas's card deck', heroId=3, cards{'Sanglier brocheroc Soldat du comtÚ-de-l'or Chevaucheur de loup Chef de Raid YÚti noroit Image mirroir Explosion des arcanes MÚtamorphose '}]
2019-07-27 16:06:57.857  INFO 8884 --- [           main] m.MinihearthstoneApplication             : -------------------------------------------------
2019-07-27 16:07:56.365  INFO 8884 --- [MessageBroker-1] o.s.w.s.c.WebSocketMessageBrokerStats    : WebSocketSession[2 current WS(2)-HttpStream(0)-HttpPoll(0), 6 total, 0 closed abnormally (0 connect failure, 0 send limit, 0 transport error)], stompSubProtocol[processed CONNECT(6)-CONNECTED(6)-DISCONNECT(0)], stompBrokerRelay[null], inboundChannel[pool size = 16, active threads = 0, queued tasks = 0, completed tasks = 192], outboundChannelpool size = 10, active threads = 0, queued tasks = 0, completed tasks = 10], sockJsScheduler[pool size = 8, active threads = 1, queued tasks = 3, completed tasks = 16]
2019-07-27 16:08:45.019  INFO 8884 --- [boundChannel-20] minihearthstone.controller.ClientProxy   : number of players looking for match : 0
2019-07-27 16:08:45.928  INFO 8884 --- [boundChannel-21] minihearthstone.controller.ClientProxy   : number of players looking for match : 1
2019-07-27 16:08:45.928  INFO 8884 --- [boundChannel-21] minihearthstone.controller.ClientProxy   : size: 1
2019-07-27 16:08:45.928  INFO 8884 --- [boundChannel-21] minihearthstone.controller.ClientProxy   : random: 0
ok
2019-07-27 16:08:50.112  INFO 8884 --- [boundChannel-22] minihearthstone.controller.ClientProxy   : New gameboard :[]
2019-07-27 16:08:50.112  INFO 8884 --- [boundChannel-22] minihearthstone.entities.deck.Deck       : Added player
2019-07-27 16:08:50.112  INFO 8884 --- [boundChannel-22] minihearthstone.entities.deck.Deck       : Added hero
2019-07-27 16:08:50.149  INFO 8884 --- [boundChannel-22] minihearthstone.controller.ClientProxy   : Updated gameboard : [Player[id=31, name='titi', clientId='8281564236420121', status='in-lobby', heroId=1, mana=1, stored_mana=1], gb='34']
2019-07-27 16:08:50.149  INFO 8884 --- [boundChannel-22] minihearthstone.controller.ClientProxy   : Updated gameboard : [Hero[id=35, uniqueId='Echalwe1564236530112783399565', name='Echalwe', type=paladin, skillType='self', lifepoints=30,defense=0, description=Renfort, invoquant un serviteur 'recrue de la Main d'argent' 1/1., specificHero='Paladin']]
2019-07-27 16:08:50.149  INFO 8884 --- [boundChannel-22] minihearthstone.controller.ClientProxy   : Updated gameboard to string : GameBoard[id=34, gameId=33, p1ClientId=8281564236420121, p2ClientId=null, turn=null,
p1HandOfCards='',
 p1CardsOnGround='',
 p2HandOfCards='',
 p2CardsOnGround='']
2019-07-27 16:08:51.510  INFO 8884 --- [boundChannel-17] minihearthstone.controller.ClientProxy   : Already created gameboard
2019-07-27 16:08:51.510  INFO 8884 --- [boundChannel-17] minihearthstone.entities.deck.Deck       : Added player
2019-07-27 16:08:51.510  INFO 8884 --- [boundChannel-17] minihearthstone.entities.deck.Deck       : Added hero
2019-07-27 16:08:51.544  INFO 8884 --- [boundChannel-17] minihearthstone.controller.ClientProxy   : Updated gameboard : [Player[id=31, name='titi', clientId='8281564236420121', status='in-lobby', heroId=1, mana=1, stored_mana=1], gb='34', Player[id=32, name='toto', clientId='4541564236421738', status='in-lobby', heroId=3, mana=1, stored_mana=1],
gb='34']
2019-07-27 16:08:51.545  INFO 8884 --- [boundChannel-17] minihearthstone.controller.ClientProxy   : Updated gameboard : [Hero[id=35, uniqueId='Echalwe1564236530112783399565', name='Echalwe', type=paladin, skillType='self', lifepoints=30,defense=0, description=Renfort, invoquant un serviteur 'recrue de la Main d'argent' 1/1., specificHero='Paladin'], Hero[id=36, uniqueId='Athelas15642365315101454849124', name='Athelas', type=mage, skillType='targeted', lifepoints=30,defense=0, description=Boule de feu, infligeant un point de dÚgat Ó l'adversaire (serviteur ou hÚros)., specificHero='Mage']]
2019-07-27 16:08:51.545  INFO 8884 --- [boundChannel-17] minihearthstone.controller.ClientProxy   : Updated gameboard to string : GameBoard[id=34, gameId=33, p1ClientId=8281564236420121, p2ClientId=4541564236421738, turn=null,
p1HandOfCards='',
 p1CardsOnGround='',
 p2HandOfCards='',
 p2CardsOnGround='']
2019-07-27 16:08:51.550  INFO 8884 --- [boundChannel-22] minihearthstone.controller.ClientProxy   : Received initgame from player: 4541564236421738
2019-07-27 16:08:51.558  INFO 8884 --- [boundChannel-22] minihearthstone.controller.ClientProxy   : Random  :0
2019-07-27 16:08:51.558  INFO 8884 --- [boundChannel-22] minihearthstone.controller.ClientProxy   : The lucky winner is 8281564236420121
2019-07-27 16:08:51.572  INFO 8884 --- [boundChannel-17] minihearthstone.controller.ClientProxy   : Received getfirsthand() from player : 4541564236421738
2019-07-27 16:08:51.572  INFO 8884 --- [boundChannel-17] minihearthstone.controller.ClientProxy   : -------------------------------------------------
2019-07-27 16:08:51.613  INFO 8884 --- [boundChannel-17] minihearthstone.entities.deck.Deck       : Random hand of : 3 cards.
2019-07-27 16:08:51.613  INFO 8884 --- [boundChannel-17] minihearthstone.entities.deck.Deck       : Cards where manacost <= 2 [Card[id=23, uniqueId='Sanglier brocheroc1564236417525542221107', name='Sanglier brocheroc', manacost=1, damage=1, lifepoints=1, nature='servant', canAttack=false, currentTargetUniqueId='Sanglier brocheroc1564236417525542221107', effect='null', specificCard='null'], Card[id=24, uniqueId='Soldat du comtÚ-de-l'or15642364175252036539675', name='Soldat du comtÚ-de-l'or', manacost=1, damage=1, lifepoints=2, nature='servant', canAttack=false, currentTargetUniqueId='Soldat du comtÚ-de-l'or15642364175252036539675', effect='ProvocationEffect', specificCard='null'], Card[id=28, uniqueId='Image mirroir15642364175251449066253', name='Image mirroir', manacost=1, damage=0, lifepoints=2, nature='spell', canAttack=false, currentTargetUniqueId='Image
mirroir15642364175251449066253', effect='ProvocationEffect', specificCard='ImageMirroir'], Card[id=29, uniqueId='Explosion des arcanes15642364175251118400685', name='Explosion des arcanes', manacost=2, damage=1, lifepoints=0, nature='spell', canAttack=false, currentTargetUniqueId='Explosion des arcanes15642364175251118400685', effect='null', specificCard='ExplosionDesArcanes']]
2019-07-27 16:08:51.613  INFO 8884 --- [boundChannel-17] minihearthstone.entities.deck.Deck       : Random pick index: 2
2019-07-27 16:08:51.613  INFO 8884 --- [boundChannel-17] minihearthstone.entities.deck.Deck       : Random pick index: 1
2019-07-27 16:08:51.613  INFO 8884 --- [boundChannel-17] minihearthstone.entities.deck.Deck       : Random pick index: 6
2019-07-27 16:08:51.614  INFO 8884 --- [boundChannel-17] minihearthstone.controller.ClientProxy   : The other player is starting first. You've been given 3 cards.
2019-07-27 16:08:51.614  INFO 8884 --- [boundChannel-17] minihearthstone.controller.ClientProxy   : Gameboard before hand of cards added : GameBoard[id=34, gameId=33, p1ClientId=8281564236420121, p2ClientId=4541564236421738, turn=8281564236420121,
p1HandOfCards='',
 p1CardsOnGround='',
 p2HandOfCards='',
 p2CardsOnGround='']

2019-07-27 16:08:51.614  INFO 8884 --- [boundChannel-17] minihearthstone.controller.ClientProxy   : P2 client id : 4541564236421738
2019-07-27 16:08:51.629  INFO 8884 --- [boundChannel-17] minihearthstone.controller.ClientProxy   : Hand of cards saved in gameboard : [Card[id=null, uniqueId='Image mirroir1564236531613338211186', name='Image mirroir', manacost=1, damage=0, lifepoints=2, nature='spell', canAttack=false, currentTargetUniqueId='Image mirroir1564236531613338211186', effect='ProvocationEffect', specificCard='ImageMirroir'], Card[id=null, uniqueId='Soldat du comtÚ-de-l'or1564236531613717221020', name='Soldat du comtÚ-de-l'or', manacost=1, damage=1, lifepoints=2, nature='servant', canAttack=false, currentTargetUniqueId='Soldat du comtÚ-de-l'or1564236531613717221020', effect='ProvocationEffect', specificCard='null'], Card[id=null, uniqueId='Explosion des arcanes1564236531614718170312', name='Explosion des arcanes', manacost=2, damage=1, lifepoints=0, nature='spell', canAttack=false, currentTargetUniqueId='Explosion des arcanes1564236531614718170312', effect='null', specificCard='ExplosionDesArcanes']]
2019-07-27 16:08:51.654  INFO 8884 --- [boundChannel-17] minihearthstone.controller.ClientProxy   : Gameboard after hand of cards added : GameBoard[id=34, gameId=33, p1ClientId=8281564236420121, p2ClientId=4541564236421738, turn=8281564236420121,
p1HandOfCards='',
 p1CardsOnGround='',
 p2HandOfCards='Image mirroir1564236531613338211186; Soldat du comtÚ-de-l'or1564236531613717221020; Explosion des arcanes1564236531614718170312; ',
 p2CardsOnGround='']

2019-07-27 16:08:52.084  INFO 8884 --- [boundChannel-32] minihearthstone.controller.ClientProxy   : Received initgame from player: 8281564236420121
2019-07-27 16:08:52.099  INFO 8884 --- [boundChannel-18] minihearthstone.controller.ClientProxy   : Received getfirsthand() from player : 8281564236420121
2019-07-27 16:08:52.099  INFO 8884 --- [boundChannel-18] minihearthstone.controller.ClientProxy   : -------------------------------------------------
2019-07-27 16:08:52.119  INFO 8884 --- [boundChannel-18] minihearthstone.entities.deck.Deck       : Random hand of : 3 cards.
2019-07-27 16:08:52.119  INFO 8884 --- [boundChannel-18] minihearthstone.entities.deck.Deck       : Cards where manacost <= 2 [Card[id=5, uniqueId='Sanglier brocheroc1564236417525887422117', name='Sanglier brocheroc', manacost=1, damage=1, lifepoints=1, nature='servant', canAttack=false, currentTargetUniqueId='Sanglier brocheroc1564236417525887422117', effect='null', specificCard='null'], Card[id=6, uniqueId='Soldat du comtÚ-de-l'or156423641752557665884', name='Soldat du comtÚ-de-l'or', manacost=1, damage=1, lifepoints=2, nature='servant', canAttack=false, currentTargetUniqueId='Soldat du comtÚ-de-l'or156423641752557665884', effect='ProvocationEffect', specificCard='null'], Card[id=11, uniqueId='BÚnÚdiction de puissance15642364175251836480833', name='BÚnÚdiction de puissance', manacost=1, damage=3, lifepoints=0, nature='targetedSpell', canAttack=false, currentTargetUniqueId='BÚnÚdiction de puissance15642364175251836480833', effect='null', specificCard='BenedictionDePuissance']]
2019-07-27 16:08:52.119  INFO 8884 --- [boundChannel-18] minihearthstone.entities.deck.Deck       : Random pick index: 0
2019-07-27 16:08:52.119  INFO 8884 --- [boundChannel-18] minihearthstone.entities.deck.Deck       : Random pick index: 1
2019-07-27 16:08:52.119  INFO 8884 --- [boundChannel-18] minihearthstone.entities.deck.Deck       : Random pick index: 1
2019-07-27 16:08:52.119  INFO 8884 --- [boundChannel-18] minihearthstone.controller.ClientProxy   : You are the lucky winner! You have been given 3 cards
2019-07-27 16:08:52.119  INFO 8884 --- [boundChannel-18] minihearthstone.controller.ClientProxy   : Gameboard before hand of cards added : GameBoard[id=34, gameId=33, p1ClientId=8281564236420121, p2ClientId=4541564236421738, turn=8281564236420121,
p1HandOfCards='',
 p1CardsOnGround='',
 p2HandOfCards='Image mirroir1564236531613338211186; Soldat du comtÚ-de-l'or1564236531613717221020; Explosion des arcanes1564236531614718170312; ',
 p2CardsOnGround='']

2019-07-27 16:08:52.119  INFO 8884 --- [boundChannel-18] minihearthstone.controller.ClientProxy   : P1 client id : 8281564236420121
2019-07-27 16:08:52.133  INFO 8884 --- [boundChannel-18] minihearthstone.controller.ClientProxy   : Hand of cards saved in gameboard : [Card[id=null, uniqueId='Sanglier brocheroc15642365321191230941857', name='Sanglier brocheroc', manacost=1, damage=1, lifepoints=1, nature='servant', canAttack=false, currentTargetUniqueId='Sanglier brocheroc15642365321191230941857', effect='null', specificCard='null'], Card[id=null, uniqueId='Soldat du comtÚ-de-l'or15642365321191119569459', name='Soldat du comtÚ-de-l'or', manacost=1, damage=1, lifepoints=2, nature='servant', canAttack=false, currentTargetUniqueId='Soldat du comtÚ-de-l'or15642365321191119569459', effect='ProvocationEffect', specificCard='null'], Card[id=null, uniqueId='Soldat du comtÚ-de-l'or1564236532119735014184', name='Soldat du comtÚ-de-l'or', manacost=1, damage=1, lifepoints=2, nature='servant', canAttack=false, currentTargetUniqueId='Soldat du comtÚ-de-l'or1564236532119735014184', effect='ProvocationEffect', specificCard='null']]
2019-07-27 16:08:52.153  INFO 8884 --- [boundChannel-18] minihearthstone.controller.ClientProxy   : Gameboard after hand of cards added : GameBoard[id=34, gameId=33, p1ClientId=8281564236420121, p2ClientId=4541564236421738, turn=8281564236420121,
p1HandOfCards='Sanglier brocheroc15642365321191230941857; Soldat du comtÚ-de-l'or15642365321191119569459; Soldat du comtÚ-de-l'or1564236532119735014184; ',
 p1CardsOnGround='',
 p2HandOfCards='Image mirroir1564236531613338211186; Soldat du comtÚ-de-l'or1564236531613717221020; Explosion des arcanes1564236531614718170312; ',
 p2CardsOnGround='']

2019-07-27 16:09:08.233  INFO 8884 --- [boundChannel-27] minihearthstone.controller.ClientProxy   : Logging out player : toto
2019-07-27 16:09:08.309  INFO 8884 --- [boundChannel-27] minihearthstone.controller.ClientProxy   : Remaining players : [Player[id=43, name='titi', clientId='8281564236420121', status='available', heroId=null, mana=1, stored_mana=1], gb='']
2019-07-27 16:09:08.312  INFO 8884 --- [boundChannel-27] minihearthstone.controller.ClientProxy   : Remaining matches : []
2019-07-27 16:09:08.314  INFO 8884 --- [boundChannel-27] minihearthstone.controller.ClientProxy   : Remaining games : []
2019-07-27 16:09:15.519  INFO 8884 --- [boundChannel-27] minihearthstone.controller.ClientProxy   : number of players looking for match : 0
2019-07-27 16:09:16.591  INFO 8884 --- [boundChannel-19] minihearthstone.controller.ClientProxy   : number of players looking for match : 1
2019-07-27 16:09:16.592  INFO 8884 --- [boundChannel-19] minihearthstone.controller.ClientProxy   : size: 1
2019-07-27 16:09:16.592  INFO 8884 --- [boundChannel-19] minihearthstone.controller.ClientProxy   : random: 0
ok
2019-07-27 16:09:21.617  INFO 8884 --- [boundChannel-29] minihearthstone.controller.ClientProxy   : New gameboard :[]
2019-07-27 16:09:21.617  INFO 8884 --- [boundChannel-29] minihearthstone.entities.deck.Deck       : Added player
2019-07-27 16:09:21.617  INFO 8884 --- [boundChannel-29] minihearthstone.entities.deck.Deck       : Added hero
2019-07-27 16:09:21.629  INFO 8884 --- [boundChannel-29] minihearthstone.controller.ClientProxy   : Updated gameboard : [Player[id=43, name='titi', clientId='8281564236420121', status='in-lobby', heroId=1, mana=1, stored_mana=1], gb='46']
2019-07-27 16:09:21.629  INFO 8884 --- [boundChannel-29] minihearthstone.controller.ClientProxy   : Updated gameboard : [Hero[id=47, uniqueId='Echalwe15642365616171237477432', name='Echalwe', type=paladin, skillType='self', lifepoints=30,defense=0, description=Renfort, invoquant un serviteur 'recrue de la Main d'argent' 1/1., specificHero='Paladin']]
2019-07-27 16:09:21.629  INFO 8884 --- [boundChannel-29] minihearthstone.controller.ClientProxy   : Updated gameboard to string : GameBoard[id=46, gameId=45, p1ClientId=8281564236420121, p2ClientId=null, turn=null,
p1HandOfCards='',
 p1CardsOnGround='',
 p2HandOfCards='',
 p2CardsOnGround='']
2019-07-27 16:09:22.720  INFO 8884 --- [boundChannel-29] minihearthstone.controller.ClientProxy   : Already created gameboard
2019-07-27 16:09:22.720  INFO 8884 --- [boundChannel-29] minihearthstone.entities.deck.Deck       : Added player
2019-07-27 16:09:22.720  INFO 8884 --- [boundChannel-29] minihearthstone.entities.deck.Deck       : Added hero
2019-07-27 16:09:22.730  INFO 8884 --- [boundChannel-29] minihearthstone.controller.ClientProxy   : Updated gameboard : [Player[id=43, name='titi', clientId='8281564236420121', status='in-lobby', heroId=1, mana=1, stored_mana=1], gb='46', Player[id=44, name='lili', clientId='591564236550265', status='in-lobby', heroId=3, mana=1, stored_mana=1], gb='46']
2019-07-27 16:09:22.730  INFO 8884 --- [boundChannel-29] minihearthstone.controller.ClientProxy   : Updated gameboard : [Hero[id=47, uniqueId='Echalwe15642365616171237477432', name='Echalwe', type=paladin, skillType='self', lifepoints=30,defense=0, description=Renfort, invoquant un serviteur 'recrue de la Main d'argent' 1/1., specificHero='Paladin'], Hero[id=48, uniqueId='Athelas1564236562720760240662', name='Athelas', type=mage, skillType='targeted', lifepoints=30,defense=0, description=Boule de feu, infligeant un point de dÚgat Ó l'adversaire (serviteur ou hÚros)., specificHero='Mage']]
2019-07-27 16:09:22.730  INFO 8884 --- [boundChannel-29] minihearthstone.controller.ClientProxy   : Updated gameboard to string : GameBoard[id=46, gameId=45, p1ClientId=8281564236420121, p2ClientId=591564236550265, turn=null,
p1HandOfCards='',
 p1CardsOnGround='',
 p2HandOfCards='',
 p2CardsOnGround='']
2019-07-27 16:09:22.734  INFO 8884 --- [boundChannel-20] minihearthstone.controller.ClientProxy   : Received initgame from player: 591564236550265
2019-07-27 16:09:22.737  INFO 8884 --- [boundChannel-20] minihearthstone.controller.ClientProxy   : Random  :0
2019-07-27 16:09:22.737  INFO 8884 --- [boundChannel-20] minihearthstone.controller.ClientProxy   : The lucky winner is 8281564236420121
2019-07-27 16:09:22.745  INFO 8884 --- [boundChannel-21] minihearthstone.controller.ClientProxy   : Received getfirsthand() from player : 591564236550265
2019-07-27 16:09:22.745  INFO 8884 --- [boundChannel-21] minihearthstone.controller.ClientProxy   : -------------------------------------------------
2019-07-27 16:09:22.759  INFO 8884 --- [boundChannel-21] minihearthstone.entities.deck.Deck       : Random hand of : 3 cards.
2019-07-27 16:09:22.759  INFO 8884 --- [boundChannel-21] minihearthstone.entities.deck.Deck       : Cards where manacost <= 2 [Card[id=23, uniqueId='Sanglier brocheroc1564236417525542221107', name='Sanglier brocheroc', manacost=1, damage=1, lifepoints=1, nature='servant', canAttack=false, currentTargetUniqueId='Sanglier brocheroc1564236417525542221107', effect='null', specificCard='null'], Card[id=24, uniqueId='Soldat du comtÚ-de-l'or15642364175252036539675', name='Soldat du comtÚ-de-l'or', manacost=1, damage=1, lifepoints=2, nature='servant', canAttack=false, currentTargetUniqueId='Soldat du comtÚ-de-l'or15642364175252036539675', effect='ProvocationEffect', specificCard='null'], Card[id=28, uniqueId='Image mirroir15642364175251449066253', name='Image mirroir', manacost=1, damage=0, lifepoints=2, nature='spell', canAttack=false, currentTargetUniqueId='Image
mirroir15642364175251449066253', effect='ProvocationEffect', specificCard='ImageMirroir'], Card[id=29, uniqueId='Explosion des arcanes15642364175251118400685', name='Explosion des arcanes', manacost=2, damage=1, lifepoints=0, nature='spell', canAttack=false, currentTargetUniqueId='Explosion des arcanes15642364175251118400685', effect='null', specificCard='ExplosionDesArcanes']]
2019-07-27 16:09:22.759  INFO 8884 --- [boundChannel-21] minihearthstone.entities.deck.Deck       : Random pick index: 2
2019-07-27 16:09:22.760  INFO 8884 --- [boundChannel-21] minihearthstone.entities.deck.Deck       : Random pick index: 0
2019-07-27 16:09:22.760  INFO 8884 --- [boundChannel-21] minihearthstone.entities.deck.Deck       : Random pick index: 4
2019-07-27 16:09:22.760  INFO 8884 --- [boundChannel-21] minihearthstone.controller.ClientProxy   : The other player is starting first. You've been given 3 cards.
2019-07-27 16:09:22.760  INFO 8884 --- [boundChannel-21] minihearthstone.controller.ClientProxy   : Gameboard before hand of cards added : GameBoard[id=46, gameId=45, p1ClientId=8281564236420121, p2ClientId=591564236550265, turn=8281564236420121,
p1HandOfCards='',
 p1CardsOnGround='',
 p2HandOfCards='',
 p2CardsOnGround='']

2019-07-27 16:09:22.760  INFO 8884 --- [boundChannel-21] minihearthstone.controller.ClientProxy   : P2 client id : 591564236550265
2019-07-27 16:09:22.768  INFO 8884 --- [boundChannel-21] minihearthstone.controller.ClientProxy   : Hand of cards saved in gameboard : [Card[id=null, uniqueId='Image mirroir15642365627591776533014', name='Image mirroir', manacost=1, damage=0, lifepoints=2, nature='spell', canAttack=false, currentTargetUniqueId='Image mirroir15642365627591776533014', effect='ProvocationEffect', specificCard='ImageMirroir'], Card[id=null, uniqueId='Sanglier brocheroc15642365627601905225879', name='Sanglier brocheroc', manacost=1, damage=1, lifepoints=1, nature='servant', canAttack=false, currentTargetUniqueId='Sanglier brocheroc15642365627601905225879', effect='null', specificCard='null'], Card[id=null, uniqueId='YÚti noroit15642365627601055649629', name='YÚti noroit', manacost=4, damage=4, lifepoints=5, nature='servant', canAttack=false, currentTargetUniqueId='YÚti noroit15642365627601055649629', effect='null', specificCard='null']]
2019-07-27 16:09:22.782  INFO 8884 --- [boundChannel-21] minihearthstone.controller.ClientProxy   : Gameboard after hand of cards added : GameBoard[id=46, gameId=45, p1ClientId=8281564236420121, p2ClientId=591564236550265, turn=8281564236420121,
p1HandOfCards='',
 p1CardsOnGround='',
 p2HandOfCards='Image mirroir15642365627591776533014; Sanglier brocheroc15642365627601905225879; YÚti noroit15642365627601055649629; ',
 p2CardsOnGround='']

2019-07-27 16:09:23.241  INFO 8884 --- [boundChannel-31] minihearthstone.controller.ClientProxy   : Received initgame from player: 8281564236420121
2019-07-27 16:09:23.249  INFO 8884 --- [boundChannel-32] minihearthstone.controller.ClientProxy   : Received getfirsthand() from player : 8281564236420121
2019-07-27 16:09:23.250  INFO 8884 --- [boundChannel-32] minihearthstone.controller.ClientProxy   : -------------------------------------------------
2019-07-27 16:09:23.250  INFO 8884 --- [boundChannel-21] minihearthstone.controller.ClientProxy   : Received getfirsthand() from player : 8281564236420121
2019-07-27 16:09:23.250  INFO 8884 --- [boundChannel-21] minihearthstone.controller.ClientProxy   : -------------------------------------------------
2019-07-27 16:09:23.262  INFO 8884 --- [boundChannel-21] minihearthstone.entities.deck.Deck       : Random hand of : 3 cards.
2019-07-27 16:09:23.262  INFO 8884 --- [boundChannel-21] minihearthstone.entities.deck.Deck       : Cards where manacost <= 2 [Card[id=5, uniqueId='Sanglier brocheroc1564236417525887422117', name='Sanglier brocheroc', manacost=1, damage=1, lifepoints=1, nature='servant', canAttack=false, currentTargetUniqueId='Sanglier brocheroc1564236417525887422117', effect='null', specificCard='null'], Card[id=6, uniqueId='Soldat du comtÚ-de-l'or156423641752557665884', name='Soldat du comtÚ-de-l'or', manacost=1, damage=1, lifepoints=2, nature='servant', canAttack=false, currentTargetUniqueId='Soldat du comtÚ-de-l'or156423641752557665884', effect='ProvocationEffect', specificCard='null'], Card[id=11, uniqueId='BÚnÚdiction de puissance15642364175251836480833', name='BÚnÚdiction de puissance', manacost=1, damage=3, lifepoints=0, nature='targetedSpell', canAttack=false, currentTargetUniqueId='BÚnÚdiction de puissance15642364175251836480833', effect='null', specificCard='BenedictionDePuissance']]
2019-07-27 16:09:23.262  INFO 8884 --- [boundChannel-21] minihearthstone.entities.deck.Deck       : Random pick index: 1
2019-07-27 16:09:23.262  INFO 8884 --- [boundChannel-21] minihearthstone.entities.deck.Deck       : Random pick index: 1
2019-07-27 16:09:23.262  INFO 8884 --- [boundChannel-21] minihearthstone.entities.deck.Deck       : Random pick index: 2
2019-07-27 16:09:23.262  INFO 8884 --- [boundChannel-21] minihearthstone.controller.ClientProxy   : You are the lucky winner! You have been given 3 cards
2019-07-27 16:09:23.262  INFO 8884 --- [boundChannel-21] minihearthstone.controller.ClientProxy   : Gameboard before hand of cards added : GameBoard[id=46, gameId=45, p1ClientId=8281564236420121, p2ClientId=591564236550265, turn=8281564236420121,
p1HandOfCards='',
 p1CardsOnGround='',
 p2HandOfCards='Image mirroir15642365627591776533014; Sanglier brocheroc15642365627601905225879; YÚti noroit15642365627601055649629; ',
 p2CardsOnGround='']

2019-07-27 16:09:23.262  INFO 8884 --- [boundChannel-21] minihearthstone.controller.ClientProxy   : P1 client id : 8281564236420121
2019-07-27 16:09:23.263  INFO 8884 --- [boundChannel-32] minihearthstone.entities.deck.Deck       : Random hand of : 3 cards.
2019-07-27 16:09:23.264  INFO 8884 --- [boundChannel-32] minihearthstone.entities.deck.Deck       : Cards where manacost <= 2 [Card[id=5, uniqueId='Sanglier brocheroc1564236417525887422117', name='Sanglier brocheroc', manacost=1, damage=1, lifepoints=1, nature='servant', canAttack=false, currentTargetUniqueId='Sanglier brocheroc1564236417525887422117', effect='null', specificCard='null'], Card[id=6, uniqueId='Soldat du comtÚ-de-l'or156423641752557665884', name='Soldat du comtÚ-de-l'or', manacost=1, damage=1, lifepoints=2, nature='servant', canAttack=false, currentTargetUniqueId='Soldat du comtÚ-de-l'or156423641752557665884', effect='ProvocationEffect', specificCard='null'], Card[id=11, uniqueId='BÚnÚdiction de puissance15642364175251836480833', name='BÚnÚdiction de puissance', manacost=1, damage=3, lifepoints=0, nature='targetedSpell', canAttack=false, currentTargetUniqueId='BÚnÚdiction de puissance15642364175251836480833', effect='null', specificCard='BenedictionDePuissance']]
2019-07-27 16:09:23.264  INFO 8884 --- [boundChannel-32] minihearthstone.entities.deck.Deck       : Random pick index: 1
2019-07-27 16:09:23.264  INFO 8884 --- [boundChannel-32] minihearthstone.entities.deck.Deck       : Random pick index: 0
2019-07-27 16:09:23.264  INFO 8884 --- [boundChannel-32] minihearthstone.entities.deck.Deck       : Random pick index: 3
2019-07-27 16:09:23.264  INFO 8884 --- [boundChannel-32] minihearthstone.controller.ClientProxy   : You are the lucky winner! You have been given 3 cards
2019-07-27 16:09:23.264  INFO 8884 --- [boundChannel-32] minihearthstone.controller.ClientProxy   : Gameboard before hand of cards added : GameBoard[id=46, gameId=45, p1ClientId=8281564236420121, p2ClientId=591564236550265, turn=8281564236420121,
p1HandOfCards='',
 p1CardsOnGround='',
 p2HandOfCards='Image mirroir15642365627591776533014; Sanglier brocheroc15642365627601905225879; YÚti noroit15642365627601055649629; ',
 p2CardsOnGround='']

2019-07-27 16:09:23.264  INFO 8884 --- [boundChannel-32] minihearthstone.controller.ClientProxy   : P1 client id : 8281564236420121
2019-07-27 16:09:23.272  INFO 8884 --- [boundChannel-32] minihearthstone.controller.ClientProxy   : Hand of cards saved in gameboard : [Card[id=null, uniqueId='Soldat du comtÚ-de-l'or15642365632642070548325', name='Soldat du comtÚ-de-l'or', manacost=1, damage=1, lifepoints=2, nature='servant', canAttack=false, currentTargetUniqueId='Soldat du comtÚ-de-l'or15642365632642070548325', effect='ProvocationEffect', specificCard='null'], Card[id=null, uniqueId='Sanglier brocheroc1564236563264666100716', name='Sanglier brocheroc', manacost=1, damage=1, lifepoints=1, nature='servant', canAttack=false, currentTargetUniqueId='Sanglier brocheroc1564236563264666100716', effect='null', specificCard='null'], Card[id=null, uniqueId='Chef de Raid1564236563264184450531', name='Chef de Raid', manacost=3, damage=2, lifepoints=2, nature='servant', canAttack=false, currentTargetUniqueId='Chef de Raid1564236563264184450531', effect='null', specificCard='ChefDeRaid']]
2019-07-27 16:09:23.273  INFO 8884 --- [boundChannel-21] minihearthstone.controller.ClientProxy   : Hand of cards saved in gameboard : [Card[id=null, uniqueId='Soldat du comtÚ-de-l'or15642365632621459655793', name='Soldat du comtÚ-de-l'or', manacost=1, damage=1, lifepoints=2, nature='servant', canAttack=false, currentTargetUniqueId='Soldat du comtÚ-de-l'or15642365632621459655793', effect='ProvocationEffect', specificCard='null'], Card[id=null, uniqueId='Soldat du comtÚ-de-l'or15642365632622042425712', name='Soldat du comtÚ-de-l'or', manacost=1, damage=1, lifepoints=2, nature='servant', canAttack=false, currentTargetUniqueId='Soldat du comtÚ-de-l'or15642365632622042425712', effect='ProvocationEffect', specificCard='null'], Card[id=null, uniqueId='Chevaucheur de loup15642365632621274145789', name='Chevaucheur de loup', manacost=3, damage=3, lifepoints=1, nature='servant', canAttack=false, currentTargetUniqueId='Chevaucheur de loup15642365632621274145789', effect='ChargeEffect', specificCard='null']]
2019-07-27 16:09:23.283  INFO 8884 --- [boundChannel-32] minihearthstone.controller.ClientProxy   : Gameboard after hand of cards added : GameBoard[id=46, gameId=45, p1ClientId=8281564236420121, p2ClientId=591564236550265, turn=8281564236420121,
p1HandOfCards='Soldat du comtÚ-de-l'or15642365632621459655793; Soldat du comtÚ-de-l'or15642365632622042425712; Soldat du comtÚ-de-l'or15642365632642070548325; Sanglier brocheroc1564236563264666100716; Chevaucheur de loup15642365632621274145789; Chef de Raid1564236563264184450531; ',
 p1CardsOnGround='',
 p2HandOfCards='Image mirroir15642365627591776533014; Sanglier brocheroc15642365627601905225879; YÚti noroit15642365627601055649629; ',
 p2CardsOnGround='']

2019-07-27 16:09:23.285  INFO 8884 --- [boundChannel-21] minihearthstone.controller.ClientProxy   : Gameboard after hand of cards added : GameBoard[id=46, gameId=45, p1ClientId=8281564236420121, p2ClientId=591564236550265, turn=8281564236420121,
p1HandOfCards='Soldat du comtÚ-de-l'or15642365632621459655793; Soldat du comtÚ-de-l'or15642365632622042425712; Soldat du comtÚ-de-l'or15642365632642070548325; Sanglier brocheroc1564236563264666100716; Chevaucheur de loup15642365632621274145789; Chef de Raid1564236563264184450531; ',
 p1CardsOnGround='',
 p2HandOfCards='Image mirroir15642365627591776533014; Sanglier brocheroc15642365627601905225879; YÚti noroit15642365627601055649629; ',
 p2CardsOnGround='']

2019-07-27 16:09:43.421  INFO 8884 --- [boundChannel-28] minihearthstone.controller.ClientProxy   : Logging out player : titi
2019-07-27 16:09:43.457  INFO 8884 --- [boundChannel-28] minihearthstone.controller.ClientProxy   : Remaining players : [Player[id=58, name='lili', clientId='591564236550265', status='available', heroId=null, mana=1, stored_mana=1], gb='']
2019-07-27 16:09:43.459  INFO 8884 --- [boundChannel-28] minihearthstone.controller.ClientProxy   : Remaining matches : []
2019-07-27 16:09:43.459  INFO 8884 --- [boundChannel-28] minihearthstone.controller.ClientProxy   : Remaining games : []
2019-07-27 16:15:22.268  INFO 8884 --- [boundChannel-48] minihearthstone.controller.ClientProxy   : number of players looking for match : 0
2019-07-27 16:15:23.147  INFO 8884 --- [boundChannel-45] minihearthstone.controller.ClientProxy   : number of players looking for match : 1
2019-07-27 16:15:23.148  INFO 8884 --- [boundChannel-45] minihearthstone.controller.ClientProxy   : size: 1
2019-07-27 16:15:23.148  INFO 8884 --- [boundChannel-45] minihearthstone.controller.ClientProxy   : random: 0
ok
2019-07-27 16:15:28.011  INFO 8884 --- [boundChannel-46] minihearthstone.controller.ClientProxy   : New gameboard :[]
2019-07-27 16:15:28.011  INFO 8884 --- [boundChannel-46] minihearthstone.entities.deck.Deck       : Added player
2019-07-27 16:15:28.011  INFO 8884 --- [boundChannel-46] minihearthstone.entities.deck.Deck       : Added hero
2019-07-27 16:15:28.019  INFO 8884 --- [boundChannel-46] minihearthstone.controller.ClientProxy   : Updated gameboard : [Player[id=59, name='tutu', clientId='9121564236585288', status='in-lobby', heroId=1, mana=1, stored_mana=1], gb='61']
2019-07-27 16:15:28.019  INFO 8884 --- [boundChannel-46] minihearthstone.controller.ClientProxy   : Updated gameboard : [Hero[id=62, uniqueId='Echalwe1564236928011620342799', name='Echalwe', type=paladin, skillType='self', lifepoints=30,defense=0, description=Renfort, invoquant un serviteur 'recrue de la Main d'argent' 1/1., specificHero='Paladin']]
2019-07-27 16:15:28.019  INFO 8884 --- [boundChannel-46] minihearthstone.controller.ClientProxy   : Updated gameboard to string : GameBoard[id=61, gameId=60, p1ClientId=9121564236585288, p2ClientId=null, turn=null,
p1HandOfCards='',
 p1CardsOnGround='',
 p2HandOfCards='',
 p2CardsOnGround='']
2019-07-27 16:15:28.762  INFO 8884 --- [boundChannel-38] minihearthstone.controller.ClientProxy   : Already created gameboard
2019-07-27 16:15:28.762  INFO 8884 --- [boundChannel-38] minihearthstone.entities.deck.Deck       : Added player
2019-07-27 16:15:28.762  INFO 8884 --- [boundChannel-38] minihearthstone.entities.deck.Deck       : Added hero
2019-07-27 16:15:28.770  INFO 8884 --- [boundChannel-38] minihearthstone.controller.ClientProxy   : Updated gameboard : [Player[id=58, name='lili', clientId='591564236550265', status='in-lobby', heroId=3, mana=1, stored_mana=1], gb='61', Player[id=59, name='tutu', clientId='9121564236585288', status='in-lobby', heroId=1, mana=1, stored_mana=1], gb='61']
2019-07-27 16:15:28.770  INFO 8884 --- [boundChannel-38] minihearthstone.controller.ClientProxy   : Updated gameboard : [Hero[id=62, uniqueId='Echalwe1564236928011620342799', name='Echalwe', type=paladin, skillType='self', lifepoints=30,defense=0, description=Renfort, invoquant un serviteur 'recrue de la Main d'argent' 1/1., specificHero='Paladin'], Hero[id=63, uniqueId='Athelas1564236928762265705212', name='Athelas', type=mage, skillType='targeted', lifepoints=30,defense=0, description=Boule de feu, infligeant un point de dÚgat Ó l'adversaire (serviteur ou hÚros)., specificHero='Mage']]
2019-07-27 16:15:28.770  INFO 8884 --- [boundChannel-38] minihearthstone.controller.ClientProxy   : Updated gameboard to string : GameBoard[id=61, gameId=60, p1ClientId=9121564236585288, p2ClientId=591564236550265, turn=null,
p1HandOfCards='',
 p1CardsOnGround='',
 p2HandOfCards='',
 p2CardsOnGround='']
2019-07-27 16:15:28.773  INFO 8884 --- [boundChannel-46] minihearthstone.controller.ClientProxy   : Received initgame from player: 591564236550265
2019-07-27 16:15:28.778  INFO 8884 --- [boundChannel-46] minihearthstone.controller.ClientProxy   : Random  :0
2019-07-27 16:15:28.778  INFO 8884 --- [boundChannel-46] minihearthstone.controller.ClientProxy   : The lucky winner is 9121564236585288
2019-07-27 16:15:28.778  INFO 8884 --- [boundChannel-48] minihearthstone.controller.ClientProxy   : Received initgame from player: 591564236550265
2019-07-27 16:15:28.791  INFO 8884 --- [boundChannel-42] minihearthstone.controller.ClientProxy   : Received getfirsthand() from player : 591564236550265
2019-07-27 16:15:28.791  INFO 8884 --- [boundChannel-42] minihearthstone.controller.ClientProxy   : -------------------------------------------------
2019-07-27 16:15:28.792  INFO 8884 --- [boundChannel-37] minihearthstone.controller.ClientProxy   : Received getfirsthand() from player : 591564236550265
2019-07-27 16:15:28.792  INFO 8884 --- [boundChannel-37] minihearthstone.controller.ClientProxy   : -------------------------------------------------
2019-07-27 16:15:28.792  INFO 8884 --- [boundChannel-48] minihearthstone.controller.ClientProxy   : Random  :1
2019-07-27 16:15:28.792  INFO 8884 --- [boundChannel-48] minihearthstone.controller.ClientProxy   : The lucky winner is 591564236550265
2019-07-27 16:15:28.798  INFO 8884 --- [boundChannel-33] minihearthstone.controller.ClientProxy   : Received getfirsthand() from player : 591564236550265
2019-07-27 16:15:28.798  INFO 8884 --- [boundChannel-33] minihearthstone.controller.ClientProxy   : -------------------------------------------------
2019-07-27 16:15:28.810  INFO 8884 --- [boundChannel-37] minihearthstone.entities.deck.Deck       : Random hand of : 3 cards.
2019-07-27 16:15:28.810  INFO 8884 --- [boundChannel-42] minihearthstone.entities.deck.Deck       : Random hand of : 3 cards.
2019-07-27 16:15:28.810  INFO 8884 --- [boundChannel-37] minihearthstone.entities.deck.Deck       : Cards where manacost <= 2 [Card[id=23, uniqueId='Sanglier brocheroc1564236417525542221107', name='Sanglier brocheroc', manacost=1, damage=1, lifepoints=1, nature='servant', canAttack=false, currentTargetUniqueId='Sanglier brocheroc1564236417525542221107', effect='null', specificCard='null'], Card[id=24, uniqueId='Soldat du comtÚ-de-l'or15642364175252036539675', name='Soldat du comtÚ-de-l'or', manacost=1, damage=1, lifepoints=2, nature='servant', canAttack=false, currentTargetUniqueId='Soldat du comtÚ-de-l'or15642364175252036539675', effect='ProvocationEffect', specificCard='null'], Card[id=28, uniqueId='Image mirroir15642364175251449066253', name='Image mirroir', manacost=1, damage=0, lifepoints=2, nature='spell', canAttack=false, currentTargetUniqueId='Image
mirroir15642364175251449066253', effect='ProvocationEffect', specificCard='ImageMirroir'], Card[id=29, uniqueId='Explosion des arcanes15642364175251118400685', name='Explosion des arcanes', manacost=2, damage=1, lifepoints=0, nature='spell', canAttack=false, currentTargetUniqueId='Explosion des arcanes15642364175251118400685', effect='null', specificCard='ExplosionDesArcanes']]
2019-07-27 16:15:28.810  INFO 8884 --- [boundChannel-37] minihearthstone.entities.deck.Deck       : Random pick index: 0
2019-07-27 16:15:28.810  INFO 8884 --- [boundChannel-41] minihearthstone.controller.ClientProxy   : Received getfirsthand() from player : 591564236550265
2019-07-27 16:15:28.811  INFO 8884 --- [boundChannel-37] minihearthstone.entities.deck.Deck       : Random pick index: 2
2019-07-27 16:15:28.811  INFO 8884 --- [boundChannel-37] minihearthstone.entities.deck.Deck       : Random pick index: 6
2019-07-27 16:15:28.811  INFO 8884 --- [boundChannel-37] minihearthstone.controller.ClientProxy   : You are the lucky winner! You have been given 3 cards
2019-07-27 16:15:28.811  INFO 8884 --- [boundChannel-37] minihearthstone.controller.ClientProxy   : Gameboard before hand of cards added : GameBoard[id=61, gameId=60, p1ClientId=9121564236585288, p2ClientId=591564236550265, turn=591564236550265,
p1HandOfCards='',
 p1CardsOnGround='',
 p2HandOfCards='',
 p2CardsOnGround='']

2019-07-27 16:15:28.811  INFO 8884 --- [boundChannel-37] minihearthstone.controller.ClientProxy   : P2 client id : 591564236550265
2019-07-27 16:15:28.811  INFO 8884 --- [boundChannel-42] minihearthstone.entities.deck.Deck       : Cards where manacost <= 2 [Card[id=23, uniqueId='Sanglier brocheroc1564236417525542221107', name='Sanglier brocheroc', manacost=1, damage=1, lifepoints=1, nature='servant', canAttack=false, currentTargetUniqueId='Sanglier brocheroc1564236417525542221107', effect='null', specificCard='null'], Card[id=24, uniqueId='Soldat du comtÚ-de-l'or15642364175252036539675', name='Soldat du comtÚ-de-l'or', manacost=1, damage=1, lifepoints=2, nature='servant', canAttack=false, currentTargetUniqueId='Soldat du comtÚ-de-l'or15642364175252036539675', effect='ProvocationEffect', specificCard='null'], Card[id=28, uniqueId='Image mirroir15642364175251449066253', name='Image mirroir', manacost=1, damage=0, lifepoints=2, nature='spell', canAttack=false, currentTargetUniqueId='Image
mirroir15642364175251449066253', effect='ProvocationEffect', specificCard='ImageMirroir'], Card[id=29, uniqueId='Explosion des arcanes15642364175251118400685', name='Explosion des arcanes', manacost=2, damage=1, lifepoints=0, nature='spell', canAttack=false, currentTargetUniqueId='Explosion des arcanes15642364175251118400685', effect='null', specificCard='ExplosionDesArcanes']]
2019-07-27 16:15:28.811  INFO 8884 --- [boundChannel-42] minihearthstone.entities.deck.Deck       : Random pick index: 0
2019-07-27 16:15:28.811  INFO 8884 --- [boundChannel-42] minihearthstone.entities.deck.Deck       : Random pick index: 1
2019-07-27 16:15:28.811  INFO 8884 --- [boundChannel-42] minihearthstone.entities.deck.Deck       : Random pick index: 0
2019-07-27 16:15:28.811  INFO 8884 --- [boundChannel-42] minihearthstone.controller.ClientProxy   : You are the lucky winner! You have been given 3 cards
2019-07-27 16:15:28.811  INFO 8884 --- [boundChannel-42] minihearthstone.controller.ClientProxy   : Gameboard before hand of cards added : GameBoard[id=61, gameId=60, p1ClientId=9121564236585288, p2ClientId=591564236550265, turn=591564236550265,
p1HandOfCards='',
 p1CardsOnGround='',
 p2HandOfCards='',
 p2CardsOnGround='']

2019-07-27 16:15:28.811  INFO 8884 --- [boundChannel-42] minihearthstone.controller.ClientProxy   : P2 client id : 591564236550265
2019-07-27 16:15:28.811  INFO 8884 --- [boundChannel-39] minihearthstone.controller.ClientProxy   : Received getfirsthand() from player : 591564236550265
2019-07-27 16:15:28.812  INFO 8884 --- [boundChannel-39] minihearthstone.controller.ClientProxy   : -------------------------------------------------
2019-07-27 16:15:28.810  INFO 8884 --- [boundChannel-35] minihearthstone.controller.ClientProxy   : Received getfirsthand() from player : 591564236550265
2019-07-27 16:15:28.812  INFO 8884 --- [boundChannel-35] minihearthstone.controller.ClientProxy   : -------------------------------------------------
2019-07-27 16:15:28.811  INFO 8884 --- [boundChannel-41] minihearthstone.controller.ClientProxy   : -------------------------------------------------
2019-07-27 16:15:28.816  INFO 8884 --- [boundChannel-33] minihearthstone.entities.deck.Deck       : Random hand of : 3 cards.
2019-07-27 16:15:28.816  INFO 8884 --- [boundChannel-33] minihearthstone.entities.deck.Deck       : Cards where manacost <= 2 [Card[id=23, uniqueId='Sanglier brocheroc1564236417525542221107', name='Sanglier brocheroc', manacost=1, damage=1, lifepoints=1, nature='servant', canAttack=false, currentTargetUniqueId='Sanglier brocheroc1564236417525542221107', effect='null', specificCard='null'], Card[id=24, uniqueId='Soldat du comtÚ-de-l'or15642364175252036539675', name='Soldat du comtÚ-de-l'or', manacost=1, damage=1, lifepoints=2, nature='servant', canAttack=false, currentTargetUniqueId='Soldat du comtÚ-de-l'or15642364175252036539675', effect='ProvocationEffect', specificCard='null'], Card[id=28, uniqueId='Image mirroir15642364175251449066253', name='Image mirroir', manacost=1, damage=0, lifepoints=2, nature='spell', canAttack=false, currentTargetUniqueId='Image
mirroir15642364175251449066253', effect='ProvocationEffect', specificCard='ImageMirroir'], Card[id=29, uniqueId='Explosion des arcanes15642364175251118400685', name='Explosion des arcanes', manacost=2, damage=1, lifepoints=0, nature='spell', canAttack=false, currentTargetUniqueId='Explosion des arcanes15642364175251118400685', effect='null', specificCard='ExplosionDesArcanes']]
2019-07-27 16:15:28.817  INFO 8884 --- [boundChannel-33] minihearthstone.entities.deck.Deck       : Random pick index: 0
2019-07-27 16:15:28.817  INFO 8884 --- [boundChannel-33] minihearthstone.entities.deck.Deck       : Random pick index: 1
2019-07-27 16:15:28.817  INFO 8884 --- [boundChannel-33] minihearthstone.entities.deck.Deck       : Random pick index: 1
2019-07-27 16:15:28.817  INFO 8884 --- [boundChannel-33] minihearthstone.controller.ClientProxy   : You are the lucky winner! You have been given 3 cards
2019-07-27 16:15:28.817  INFO 8884 --- [boundChannel-33] minihearthstone.controller.ClientProxy   : Gameboard before hand of cards added : GameBoard[id=61, gameId=60, p1ClientId=9121564236585288, p2ClientId=591564236550265, turn=591564236550265,
p1HandOfCards='',
 p1CardsOnGround='',
 p2HandOfCards='',
 p2CardsOnGround='']

2019-07-27 16:15:28.817  INFO 8884 --- [boundChannel-33] minihearthstone.controller.ClientProxy   : P2 client id : 591564236550265
2019-07-27 16:15:28.831  INFO 8884 --- [boundChannel-37] minihearthstone.controller.ClientProxy   : Hand of cards saved in gameboard : [Card[id=null, uniqueId='Sanglier brocheroc156423692881179837984', name='Sanglier brocheroc', manacost=1, damage=1, lifepoints=1, nature='servant', canAttack=false, currentTargetUniqueId='Sanglier brocheroc156423692881179837984', effect='null', specificCard='null'], Card[id=null, uniqueId='Image mirroir1564236928811518462009', name='Image mirroir', manacost=1, damage=0, lifepoints=2,
nature='spell', canAttack=false, currentTargetUniqueId='Image mirroir1564236928811518462009', effect='ProvocationEffect', specificCard='ImageMirroir'], Card[id=null, uniqueId='Explosion des arcanes15642369288111125112562', name='Explosion des arcanes', manacost=2, damage=1, lifepoints=0, nature='spell', canAttack=false, currentTargetUniqueId='Explosion des arcanes15642369288111125112562', effect='null', specificCard='ExplosionDesArcanes']]
2019-07-27 16:15:28.831  INFO 8884 --- [boundChannel-41] minihearthstone.entities.deck.Deck       : Random hand of : 3 cards.
2019-07-27 16:15:28.832  INFO 8884 --- [boundChannel-41] minihearthstone.entities.deck.Deck       : Cards where manacost <= 2 [Card[id=23, uniqueId='Sanglier brocheroc1564236417525542221107', name='Sanglier brocheroc', manacost=1, damage=1, lifepoints=1, nature='servant', canAttack=false, currentTargetUniqueId='Sanglier brocheroc1564236417525542221107', effect='null', specificCard='null'], Card[id=24, uniqueId='Soldat du comtÚ-de-l'or15642364175252036539675', name='Soldat du comtÚ-de-l'or', manacost=1, damage=1, lifepoints=2, nature='servant', canAttack=false, currentTargetUniqueId='Soldat du comtÚ-de-l'or15642364175252036539675', effect='ProvocationEffect', specificCard='null'], Card[id=28, uniqueId='Image mirroir15642364175251449066253', name='Image mirroir', manacost=1, damage=0, lifepoints=2, nature='spell', canAttack=false, currentTargetUniqueId='Image
mirroir15642364175251449066253', effect='ProvocationEffect', specificCard='ImageMirroir'], Card[id=29, uniqueId='Explosion des arcanes15642364175251118400685', name='Explosion des arcanes', manacost=2, damage=1, lifepoints=0, nature='spell', canAttack=false, currentTargetUniqueId='Explosion des arcanes15642364175251118400685', effect='null', specificCard='ExplosionDesArcanes']]
2019-07-27 16:15:28.832  INFO 8884 --- [boundChannel-41] minihearthstone.entities.deck.Deck       : Random pick index: 1
2019-07-27 16:15:28.832  INFO 8884 --- [boundChannel-41] minihearthstone.entities.deck.Deck       : Random pick index: 2
2019-07-27 16:15:28.832  INFO 8884 --- [boundChannel-41] minihearthstone.entities.deck.Deck       : Random pick index: 4
2019-07-27 16:15:28.832  INFO 8884 --- [boundChannel-41] minihearthstone.controller.ClientProxy   : You are the lucky winner! You have been given 3 cards
2019-07-27 16:15:28.832  INFO 8884 --- [boundChannel-41] minihearthstone.controller.ClientProxy   : Gameboard before hand of cards added : GameBoard[id=61, gameId=60, p1ClientId=9121564236585288, p2ClientId=591564236550265, turn=591564236550265,
p1HandOfCards='',
 p1CardsOnGround='',
 p2HandOfCards='',
 p2CardsOnGround='']

2019-07-27 16:15:28.832  INFO 8884 --- [boundChannel-41] minihearthstone.controller.ClientProxy   : P2 client id : 591564236550265
2019-07-27 16:15:28.833  INFO 8884 --- [boundChannel-39] minihearthstone.entities.deck.Deck       : Random hand of : 3 cards.
2019-07-27 16:15:28.833  INFO 8884 --- [boundChannel-42] minihearthstone.controller.ClientProxy   : Hand of cards saved in gameboard : [Card[id=null, uniqueId='Sanglier brocheroc15642369288111158190024', name='Sanglier brocheroc', manacost=1, damage=1, lifepoints=1, nature='servant', canAttack=false, currentTargetUniqueId='Sanglier brocheroc15642369288111158190024', effect='null', specificCard='null'], Card[id=null, uniqueId='Soldat du comtÚ-de-l'or15642369288111262138175', name='Soldat du comtÚ-de-l'or', manacost=1, damage=1, lifepoints=2, nature='servant', canAttack=false, currentTargetUniqueId='Soldat du comtÚ-de-l'or15642369288111262138175', effect='ProvocationEffect', specificCard='null'], Card[id=null, uniqueId='Sanglier brocheroc15642369288111492480001', name='Sanglier brocheroc', manacost=1, damage=1, lifepoints=1, nature='servant', canAttack=false,
currentTargetUniqueId='Sanglier brocheroc15642369288111492480001', effect='null', specificCard='null']]
2019-07-27 16:15:28.834  INFO 8884 --- [boundChannel-39] minihearthstone.entities.deck.Deck       : Cards where manacost <= 2 [Card[id=23, uniqueId='Sanglier brocheroc1564236417525542221107', name='Sanglier brocheroc', manacost=1, damage=1, lifepoints=1, nature='servant', canAttack=false, currentTargetUniqueId='Sanglier brocheroc1564236417525542221107', effect='null', specificCard='null'], Card[id=24, uniqueId='Soldat du comtÚ-de-l'or15642364175252036539675', name='Soldat du comtÚ-de-l'or', manacost=1, damage=1, lifepoints=2, nature='servant', canAttack=false, currentTargetUniqueId='Soldat du comtÚ-de-l'or15642364175252036539675', effect='ProvocationEffect', specificCard='null'], Card[id=28, uniqueId='Image mirroir15642364175251449066253', name='Image mirroir', manacost=1, damage=0, lifepoints=2, nature='spell', canAttack=false, currentTargetUniqueId='Image
mirroir15642364175251449066253', effect='ProvocationEffect', specificCard='ImageMirroir'], Card[id=29, uniqueId='Explosion des arcanes15642364175251118400685', name='Explosion des arcanes', manacost=2, damage=1, lifepoints=0, nature='spell', canAttack=false, currentTargetUniqueId='Explosion des arcanes15642364175251118400685', effect='null', specificCard='ExplosionDesArcanes']]
2019-07-27 16:15:28.834  INFO 8884 --- [boundChannel-39] minihearthstone.entities.deck.Deck       : Random pick index: 1
2019-07-27 16:15:28.834  INFO 8884 --- [boundChannel-39] minihearthstone.entities.deck.Deck       : Random pick index: 2
2019-07-27 16:15:28.834  INFO 8884 --- [boundChannel-39] minihearthstone.entities.deck.Deck       : Random pick index: 0
2019-07-27 16:15:28.834  INFO 8884 --- [boundChannel-39] minihearthstone.controller.ClientProxy   : You are the lucky winner! You have been given 3 cards
2019-07-27 16:15:28.834  INFO 8884 --- [boundChannel-39] minihearthstone.controller.ClientProxy   : Gameboard before hand of cards added : GameBoard[id=61, gameId=60, p1ClientId=9121564236585288, p2ClientId=591564236550265, turn=591564236550265,
p1HandOfCards='',
 p1CardsOnGround='',
 p2HandOfCards='',
 p2CardsOnGround='']

2019-07-27 16:15:28.834  INFO 8884 --- [boundChannel-39] minihearthstone.controller.ClientProxy   : P2 client id : 591564236550265
2019-07-27 16:15:28.836  INFO 8884 --- [boundChannel-35] minihearthstone.entities.deck.Deck       : Random hand of : 3 cards.
2019-07-27 16:15:28.836  INFO 8884 --- [boundChannel-35] minihearthstone.entities.deck.Deck       : Cards where manacost <= 2 [Card[id=23, uniqueId='Sanglier brocheroc1564236417525542221107', name='Sanglier brocheroc', manacost=1, damage=1, lifepoints=1, nature='servant', canAttack=false, currentTargetUniqueId='Sanglier brocheroc1564236417525542221107', effect='null', specificCard='null'], Card[id=24, uniqueId='Soldat du comtÚ-de-l'or15642364175252036539675', name='Soldat du comtÚ-de-l'or', manacost=1, damage=1, lifepoints=2, nature='servant', canAttack=false, currentTargetUniqueId='Soldat du comtÚ-de-l'or15642364175252036539675', effect='ProvocationEffect', specificCard='null'], Card[id=28, uniqueId='Image mirroir15642364175251449066253', name='Image mirroir', manacost=1, damage=0, lifepoints=2, nature='spell', canAttack=false, currentTargetUniqueId='Image
mirroir15642364175251449066253', effect='ProvocationEffect', specificCard='ImageMirroir'], Card[id=29, uniqueId='Explosion des arcanes15642364175251118400685', name='Explosion des arcanes', manacost=2, damage=1, lifepoints=0, nature='spell', canAttack=false, currentTargetUniqueId='Explosion des arcanes15642364175251118400685', effect='null', specificCard='ExplosionDesArcanes']]
2019-07-27 16:15:28.836  INFO 8884 --- [boundChannel-35] minihearthstone.entities.deck.Deck       : Random pick index: 0
2019-07-27 16:15:28.836  INFO 8884 --- [boundChannel-35] minihearthstone.entities.deck.Deck       : Random pick index: 0
2019-07-27 16:15:28.836  INFO 8884 --- [boundChannel-35] minihearthstone.entities.deck.Deck       : Random pick index: 5
2019-07-27 16:15:28.836  INFO 8884 --- [boundChannel-35] minihearthstone.controller.ClientProxy   : You are the lucky winner! You have been given 3 cards
2019-07-27 16:15:28.836  INFO 8884 --- [boundChannel-35] minihearthstone.controller.ClientProxy   : Gameboard before hand of cards added : GameBoard[id=61, gameId=60, p1ClientId=9121564236585288, p2ClientId=591564236550265, turn=591564236550265,
p1HandOfCards='',
 p1CardsOnGround='',
 p2HandOfCards='',
 p2CardsOnGround='']

2019-07-27 16:15:28.836  INFO 8884 --- [boundChannel-35] minihearthstone.controller.ClientProxy   : P2 client id : 591564236550265
2019-07-27 16:15:28.842  INFO 8884 --- [boundChannel-33] minihearthstone.controller.ClientProxy   : Hand of cards saved in gameboard : [Card[id=null, uniqueId='Sanglier brocheroc1564236928817418307971', name='Sanglier brocheroc', manacost=1, damage=1, lifepoints=1, nature='servant', canAttack=false, currentTargetUniqueId='Sanglier brocheroc1564236928817418307971', effect='null', specificCard='null'], Card[id=null, uniqueId='Soldat du comtÚ-de-l'or15642369288171388133020', name='Soldat du comtÚ-de-l'or', manacost=1, damage=1, lifepoints=2, nature='servant', canAttack=false, currentTargetUniqueId='Soldat du comtÚ-de-l'or15642369288171388133020', effect='ProvocationEffect', specificCard='null'], Card[id=null, uniqueId='Soldat du comtÚ-de-l'or15642369288171239440047', name='Soldat du comtÚ-de-l'or', manacost=1, damage=1, lifepoints=2, nature='servant', canAttack=false, currentTargetUniqueId='Soldat du comtÚ-de-l'or15642369288171239440047', effect='ProvocationEffect', specificCard='null']]
2019-07-27 16:15:28.850  INFO 8884 --- [boundChannel-42] minihearthstone.controller.ClientProxy   : Gameboard after hand of cards added : GameBoard[id=61, gameId=60, p1ClientId=9121564236585288, p2ClientId=591564236550265, turn=591564236550265,
p1HandOfCards='',
 p1CardsOnGround='',
 p2HandOfCards='Sanglier brocheroc156423692881179837984; Sanglier brocheroc15642369288111158190024; Image mirroir1564236928811518462009; Explosion des arcanes15642369288111125112562; Soldat du comtÚ-de-l'or15642369288111262138175; Sanglier brocheroc15642369288111492480001; ',
 p2CardsOnGround='']

2019-07-27 16:15:28.853  INFO 8884 --- [boundChannel-37] minihearthstone.controller.ClientProxy   : Gameboard after hand of cards added : GameBoard[id=61, gameId=60, p1ClientId=9121564236585288, p2ClientId=591564236550265, turn=591564236550265,
p1HandOfCards='',
 p1CardsOnGround='',
 p2HandOfCards='Sanglier brocheroc156423692881179837984; Sanglier brocheroc15642369288111158190024; Image mirroir1564236928811518462009; Explosion des arcanes15642369288111125112562; Soldat du comtÚ-de-l'or15642369288111262138175; Sanglier brocheroc15642369288111492480001; ',
 p2CardsOnGround='']

2019-07-27 16:15:28.853  INFO 8884 --- [boundChannel-41] minihearthstone.controller.ClientProxy   : Hand of cards saved in gameboard : [Card[id=null, uniqueId='Soldat du comtÚ-de-l'or15642369288321777780779', name='Soldat du comtÚ-de-l'or', manacost=1, damage=1, lifepoints=2, nature='servant', canAttack=false, currentTargetUniqueId='Soldat du comtÚ-de-l'or15642369288321777780779', effect='ProvocationEffect', specificCard='null'], Card[id=null, uniqueId='Image mirroir15642369288321121969470', name='Image mirroir', manacost=1, damage=0, lifepoints=2, nature='spell', canAttack=false, currentTargetUniqueId='Image mirroir15642369288321121969470', effect='ProvocationEffect', specificCard='ImageMirroir'], Card[id=null, uniqueId='YÚti noroit15642369288321910331861', name='YÚti noroit', manacost=4, damage=4, lifepoints=5, nature='servant', canAttack=false, currentTargetUniqueId='YÚti noroit15642369288321910331861', effect='null', specificCard='null']]
2019-07-27 16:15:28.860  INFO 8884 --- [boundChannel-39] minihearthstone.controller.ClientProxy   : Hand of cards saved in gameboard : [Card[id=null, uniqueId='Soldat du comtÚ-de-l'or156423692883486444016', name='Soldat du comtÚ-de-l'or', manacost=1, damage=1, lifepoints=2, nature='servant', canAttack=false, currentTargetUniqueId='Soldat du comtÚ-de-l'or156423692883486444016', effect='ProvocationEffect', specificCard='null'], Card[id=null, uniqueId='Image mirroir15642369288341470782815', name='Image mirroir', manacost=1, damage=0, lifepoints=2, nature='spell', canAttack=false, currentTargetUniqueId='Image mirroir15642369288341470782815', effect='ProvocationEffect', specificCard='ImageMirroir'], Card[id=null, uniqueId='Sanglier brocheroc1564236928834432491031', name='Sanglier brocheroc', manacost=1, damage=1, lifepoints=1, nature='servant', canAttack=false, currentTargetUniqueId='Sanglier brocheroc1564236928834432491031', effect='null', specificCard='null']]
2019-07-27 16:15:28.870  INFO 8884 --- [boundChannel-33] minihearthstone.controller.ClientProxy   : Gameboard after hand of cards added : GameBoard[id=61, gameId=60, p1ClientId=9121564236585288, p2ClientId=591564236550265, turn=591564236550265,
p1HandOfCards='',
 p1CardsOnGround='',
 p2HandOfCards='Sanglier brocheroc156423692881179837984; Sanglier brocheroc15642369288111158190024; Image mirroir1564236928811518462009; Explosion des arcanes15642369288111125112562; Soldat du comtÚ-de-l'or15642369288111262138175; Sanglier brocheroc15642369288111492480001; Sanglier brocheroc1564236928817418307971; Soldat du comtÚ-de-l'or15642369288171388133020; Soldat du comtÚ-de-l'or15642369288171239440047; ',
 p2CardsOnGround='']

2019-07-27 16:15:28.870  INFO 8884 --- [boundChannel-35] minihearthstone.controller.ClientProxy   : Hand of cards saved in gameboard : [Card[id=null, uniqueId='Sanglier brocheroc1564236928836387361391', name='Sanglier brocheroc', manacost=1, damage=1, lifepoints=1, nature='servant', canAttack=false, currentTargetUniqueId='Sanglier brocheroc1564236928836387361391', effect='null', specificCard='null'], Card[id=null, uniqueId='Sanglier brocheroc1564236928836698372929', name='Sanglier brocheroc', manacost=1, damage=1, lifepoints=1, nature='servant', canAttack=false, currentTargetUniqueId='Sanglier brocheroc1564236928836698372929', effect='null', specificCard='null'], Card[id=null, uniqueId='Image mirroir1564236928836792419880', name='Image mirroir', manacost=1, damage=0, lifepoints=2, nature='spell', canAttack=false, currentTargetUniqueId='Image mirroir1564236928836792419880', effect='ProvocationEffect', specificCard='ImageMirroir']]
2019-07-27 16:15:28.880  INFO 8884 --- [boundChannel-41] minihearthstone.controller.ClientProxy   : Gameboard after hand of cards added : GameBoard[id=61, gameId=60, p1ClientId=9121564236585288, p2ClientId=591564236550265, turn=591564236550265,
p1HandOfCards='',
 p1CardsOnGround='',
 p2HandOfCards='Sanglier brocheroc156423692881179837984; Sanglier brocheroc15642369288111158190024; Image mirroir1564236928811518462009; Explosion des arcanes15642369288111125112562; Soldat du comtÚ-de-l'or15642369288111262138175; Sanglier brocheroc15642369288111492480001; Sanglier brocheroc1564236928817418307971; Soldat du comtÚ-de-l'or15642369288171388133020; Soldat du comtÚ-de-l'or15642369288171239440047; Soldat du comtÚ-de-l'or15642369288321777780779; Soldat du comtÚ-de-l'or156423692883486444016; Image mirroir15642369288321121969470; YÚti noroit15642369288321910331861; Image mirroir15642369288341470782815; Sanglier brocheroc1564236928834432491031; ',
 p2CardsOnGround='']

2019-07-27 16:15:28.885  INFO 8884 --- [boundChannel-39] minihearthstone.controller.ClientProxy   : Gameboard after hand of cards added : GameBoard[id=61, gameId=60, p1ClientId=9121564236585288, p2ClientId=591564236550265, turn=591564236550265,
p1HandOfCards='',
 p1CardsOnGround='',
 p2HandOfCards='Sanglier brocheroc156423692881179837984; Sanglier brocheroc15642369288111158190024; Image mirroir1564236928811518462009; Explosion des arcanes15642369288111125112562; Soldat du comtÚ-de-l'or15642369288111262138175; Sanglier brocheroc15642369288111492480001; Sanglier brocheroc1564236928817418307971; Soldat du comtÚ-de-l'or15642369288171388133020; Soldat du comtÚ-de-l'or15642369288171239440047; Soldat du comtÚ-de-l'or15642369288321777780779; Soldat du comtÚ-de-l'or156423692883486444016; Image mirroir15642369288321121969470; YÚti noroit15642369288321910331861; Image mirroir15642369288341470782815; Sanglier brocheroc1564236928834432491031; ',
 p2CardsOnGround='']

2019-07-27 16:15:28.891  INFO 8884 --- [boundChannel-35] minihearthstone.controller.ClientProxy   : Gameboard after hand of cards added : GameBoard[id=61, gameId=60, p1ClientId=9121564236585288, p2ClientId=591564236550265, turn=591564236550265,
p1HandOfCards='',
 p1CardsOnGround='',
 p2HandOfCards='Sanglier brocheroc156423692881179837984; Sanglier brocheroc15642369288111158190024; Image mirroir1564236928811518462009; Explosion des arcanes15642369288111125112562; Soldat du comtÚ-de-l'or15642369288111262138175; Sanglier brocheroc15642369288111492480001; Sanglier brocheroc1564236928817418307971; Soldat du comtÚ-de-l'or15642369288171388133020; Soldat du comtÚ-de-l'or15642369288171239440047; Soldat du comtÚ-de-l'or15642369288321777780779; Sanglier brocheroc1564236928836387361391; Sanglier brocheroc1564236928836698372929; Soldat du comtÚ-de-l'or156423692883486444016; Image mirroir15642369288321121969470; YÚti noroit15642369288321910331861; Image mirroir15642369288341470782815; Sanglier brocheroc1564236928834432491031; Image mirroir1564236928836792419880; ',
 p2CardsOnGround='']

2019-07-27 16:15:29.286  INFO 8884 --- [boundChannel-44] minihearthstone.controller.ClientProxy   : Received initgame from player: 9121564236585288
2019-07-27 16:15:29.295  INFO 8884 --- [boundChannel-34] minihearthstone.controller.ClientProxy   : Received getfirsthand() from player : 9121564236585288
2019-07-27 16:15:29.295  INFO 8884 --- [boundChannel-34] minihearthstone.controller.ClientProxy   : -------------------------------------------------
2019-07-27 16:15:29.301  INFO 8884 --- [boundChannel-41] minihearthstone.controller.ClientProxy   : Received initgame from player: 9121564236585288
2019-07-27 16:15:29.308  INFO 8884 --- [boundChannel-34] minihearthstone.entities.deck.Deck       : Random hand of : 3 cards.
2019-07-27 16:15:29.308  INFO 8884 --- [boundChannel-34] minihearthstone.entities.deck.Deck       : Cards where manacost <= 2 [Card[id=5, uniqueId='Sanglier brocheroc1564236417525887422117', name='Sanglier brocheroc', manacost=1, damage=1, lifepoints=1, nature='servant', canAttack=false, currentTargetUniqueId='Sanglier brocheroc1564236417525887422117', effect='null', specificCard='null'], Card[id=6, uniqueId='Soldat du comtÚ-de-l'or156423641752557665884', name='Soldat du comtÚ-de-l'or', manacost=1, damage=1, lifepoints=2, nature='servant', canAttack=false, currentTargetUniqueId='Soldat du comtÚ-de-l'or156423641752557665884', effect='ProvocationEffect', specificCard='null'], Card[id=11, uniqueId='BÚnÚdiction de puissance15642364175251836480833', name='BÚnÚdiction de puissance', manacost=1, damage=3, lifepoints=0, nature='targetedSpell', canAttack=false, currentTargetUniqueId='BÚnÚdiction de puissance15642364175251836480833', effect='null', specificCard='BenedictionDePuissance']]
2019-07-27 16:15:29.308  INFO 8884 --- [boundChannel-34] minihearthstone.entities.deck.Deck       : Random pick index: 1
2019-07-27 16:15:29.308  INFO 8884 --- [boundChannel-34] minihearthstone.entities.deck.Deck       : Random pick index: 0
2019-07-27 16:15:29.308  INFO 8884 --- [boundChannel-34] minihearthstone.entities.deck.Deck       : Random pick index: 0
2019-07-27 16:15:29.308  INFO 8884 --- [boundChannel-34] minihearthstone.controller.ClientProxy   : The other player is starting first. You've been given 3 cards.
2019-07-27 16:15:29.309  INFO 8884 --- [boundChannel-34] minihearthstone.controller.ClientProxy   : Gameboard before hand of cards added : GameBoard[id=61, gameId=60, p1ClientId=9121564236585288, p2ClientId=591564236550265, turn=591564236550265,
p1HandOfCards='',
 p1CardsOnGround='',
 p2HandOfCards='Sanglier brocheroc156423692881179837984; Sanglier brocheroc15642369288111158190024; Image mirroir1564236928811518462009; Explosion des arcanes15642369288111125112562; Soldat du comtÚ-de-l'or15642369288111262138175; Sanglier brocheroc15642369288111492480001; Sanglier brocheroc1564236928817418307971; Soldat du comtÚ-de-l'or15642369288171388133020; Soldat du comtÚ-de-l'or15642369288171239440047; Soldat du comtÚ-de-l'or15642369288321777780779; Sanglier brocheroc1564236928836387361391; Sanglier brocheroc1564236928836698372929; Soldat du comtÚ-de-l'or156423692883486444016; Image mirroir15642369288321121969470; YÚti noroit15642369288321910331861; Image mirroir15642369288341470782815; Sanglier brocheroc1564236928834432491031; Image mirroir1564236928836792419880; ',
 p2CardsOnGround='']

2019-07-27 16:15:29.309  INFO 8884 --- [boundChannel-34] minihearthstone.controller.ClientProxy   : P1 client id : 9121564236585288
2019-07-27 16:15:29.311  INFO 8884 --- [boundChannel-47] minihearthstone.controller.ClientProxy   : Received getfirsthand() from player : 9121564236585288
2019-07-27 16:15:29.311  INFO 8884 --- [boundChannel-47] minihearthstone.controller.ClientProxy   : -------------------------------------------------
2019-07-27 16:15:29.313  INFO 8884 --- [boundChannel-33] minihearthstone.controller.ClientProxy   : Received getfirsthand() from player : 9121564236585288
2019-07-27 16:15:29.313  INFO 8884 --- [boundChannel-33] minihearthstone.controller.ClientProxy   : -------------------------------------------------
2019-07-27 16:15:29.322  INFO 8884 --- [boundChannel-34] minihearthstone.controller.ClientProxy   : Hand of cards saved in gameboard : [Card[id=null, uniqueId='Soldat du comtÚ-de-l'or15642369293081310009136', name='Soldat du comtÚ-de-l'or', manacost=1, damage=1, lifepoints=2, nature='servant', canAttack=false, currentTargetUniqueId='Soldat du comtÚ-de-l'or15642369293081310009136', effect='ProvocationEffect', specificCard='null'], Card[id=null, uniqueId='Sanglier brocheroc15642369293081649365630', name='Sanglier brocheroc', manacost=1, damage=1, lifepoints=1, nature='servant', canAttack=false, currentTargetUniqueId='Sanglier brocheroc15642369293081649365630', effect='null', specificCard='null'], Card[id=null, uniqueId='Sanglier brocheroc1564236929308322617750', name='Sanglier brocheroc', manacost=1, damage=1, lifepoints=1, nature='servant', canAttack=false, currentTargetUniqueId='Sanglier brocheroc1564236929308322617750', effect='null', specificCard='null']]
2019-07-27 16:15:29.328  INFO 8884 --- [boundChannel-33] minihearthstone.entities.deck.Deck       : Random hand of : 3 cards.
2019-07-27 16:15:29.328  INFO 8884 --- [boundChannel-47] minihearthstone.entities.deck.Deck       : Random hand of : 3 cards.
2019-07-27 16:15:29.328  INFO 8884 --- [boundChannel-33] minihearthstone.entities.deck.Deck       : Cards where manacost <= 2 [Card[id=5, uniqueId='Sanglier brocheroc1564236417525887422117', name='Sanglier brocheroc', manacost=1, damage=1, lifepoints=1, nature='servant', canAttack=false, currentTargetUniqueId='Sanglier brocheroc1564236417525887422117', effect='null', specificCard='null'], Card[id=6, uniqueId='Soldat du comtÚ-de-l'or156423641752557665884', name='Soldat du comtÚ-de-l'or', manacost=1, damage=1, lifepoints=2, nature='servant', canAttack=false, currentTargetUniqueId='Soldat du comtÚ-de-l'or156423641752557665884', effect='ProvocationEffect', specificCard='null'], Card[id=11, uniqueId='BÚnÚdiction de puissance15642364175251836480833', name='BÚnÚdiction de puissance', manacost=1, damage=3, lifepoints=0, nature='targetedSpell', canAttack=false, currentTargetUniqueId='BÚnÚdiction de puissance15642364175251836480833', effect='null', specificCard='BenedictionDePuissance']]
2019-07-27 16:15:29.328  INFO 8884 --- [boundChannel-33] minihearthstone.entities.deck.Deck       : Random pick index: 1
2019-07-27 16:15:29.328  INFO 8884 --- [boundChannel-33] minihearthstone.entities.deck.Deck       : Random pick index: 0
2019-07-27 16:15:29.328  INFO 8884 --- [boundChannel-33] minihearthstone.entities.deck.Deck       : Random pick index: 4
2019-07-27 16:15:29.328  INFO 8884 --- [boundChannel-47] minihearthstone.entities.deck.Deck       : Cards where manacost <= 2 [Card[id=5, uniqueId='Sanglier brocheroc1564236417525887422117', name='Sanglier brocheroc', manacost=1, damage=1, lifepoints=1, nature='servant', canAttack=false, currentTargetUniqueId='Sanglier brocheroc1564236417525887422117', effect='null', specificCard='null'], Card[id=6, uniqueId='Soldat du comtÚ-de-l'or156423641752557665884', name='Soldat du comtÚ-de-l'or', manacost=1, damage=1, lifepoints=2, nature='servant', canAttack=false, currentTargetUniqueId='Soldat du comtÚ-de-l'or156423641752557665884', effect='ProvocationEffect', specificCard='null'], Card[id=11, uniqueId='BÚnÚdiction de puissance15642364175251836480833', name='BÚnÚdiction de puissance', manacost=1, damage=3, lifepoints=0, nature='targetedSpell', canAttack=false, currentTargetUniqueId='BÚnÚdiction de puissance15642364175251836480833', effect='null', specificCard='BenedictionDePuissance']]
2019-07-27 16:15:29.328  INFO 8884 --- [boundChannel-47] minihearthstone.entities.deck.Deck       : Random pick index: 0
2019-07-27 16:15:29.328  INFO 8884 --- [boundChannel-33] minihearthstone.controller.ClientProxy   : The other player is starting first. You've been given 3 cards.
2019-07-27 16:15:29.328  INFO 8884 --- [boundChannel-47] minihearthstone.entities.deck.Deck       : Random pick index: 0
2019-07-27 16:15:29.328  INFO 8884 --- [boundChannel-47] minihearthstone.entities.deck.Deck       : Random pick index: 5
2019-07-27 16:15:29.328  INFO 8884 --- [boundChannel-47] minihearthstone.controller.ClientProxy   : The other player is starting first. You've been given 3 cards.
2019-07-27 16:15:29.328  INFO 8884 --- [boundChannel-33] minihearthstone.controller.ClientProxy   : Gameboard before hand of cards added : GameBoard[id=61, gameId=60, p1ClientId=9121564236585288, p2ClientId=591564236550265, turn=591564236550265,
p1HandOfCards='Soldat du comtÚ-de-l'or15642369293081310009136; Sanglier brocheroc15642369293081649365630; Sanglier brocheroc1564236929308322617750; ',
 p1CardsOnGround='',
 p2HandOfCards='Sanglier brocheroc156423692881179837984; Sanglier brocheroc15642369288111158190024; Image mirroir1564236928811518462009; Explosion des arcanes15642369288111125112562; Soldat du comtÚ-de-l'or15642369288111262138175; Sanglier brocheroc15642369288111492480001; Sanglier brocheroc1564236928817418307971; Soldat du comtÚ-de-l'or15642369288171388133020; Soldat du comtÚ-de-l'or15642369288171239440047; Soldat du comtÚ-de-l'or15642369288321777780779; Sanglier brocheroc1564236928836387361391; Sanglier brocheroc1564236928836698372929; Soldat du comtÚ-de-l'or156423692883486444016; Image mirroir15642369288321121969470; YÚti noroit15642369288321910331861; Image mirroir15642369288341470782815; Sanglier brocheroc1564236928834432491031; Image mirroir1564236928836792419880; ',
 p2CardsOnGround='']

2019-07-27 16:15:29.328  INFO 8884 --- [boundChannel-47] minihearthstone.controller.ClientProxy   : Gameboard before hand of cards added : GameBoard[id=61, gameId=60, p1ClientId=9121564236585288, p2ClientId=591564236550265, turn=591564236550265,
p1HandOfCards='Soldat du comtÚ-de-l'or15642369293081310009136; Sanglier brocheroc15642369293081649365630; Sanglier brocheroc1564236929308322617750; ',
 p1CardsOnGround='',
 p2HandOfCards='Sanglier brocheroc156423692881179837984; Sanglier brocheroc15642369288111158190024; Image mirroir1564236928811518462009; Explosion des arcanes15642369288111125112562; Soldat du comtÚ-de-l'or15642369288111262138175; Sanglier brocheroc15642369288111492480001; Sanglier brocheroc1564236928817418307971; Soldat du comtÚ-de-l'or15642369288171388133020; Soldat du comtÚ-de-l'or15642369288171239440047; Soldat du comtÚ-de-l'or15642369288321777780779; Sanglier brocheroc1564236928836387361391; Sanglier brocheroc1564236928836698372929; Soldat du comtÚ-de-l'or156423692883486444016; Image mirroir15642369288321121969470; YÚti noroit15642369288321910331861; Image mirroir15642369288341470782815; Sanglier brocheroc1564236928834432491031; Image mirroir1564236928836792419880; ',
 p2CardsOnGround='']

2019-07-27 16:15:29.335  INFO 8884 --- [boundChannel-34] minihearthstone.controller.ClientProxy   : Gameboard after hand of cards added : GameBoard[id=61, gameId=60, p1ClientId=9121564236585288, p2ClientId=591564236550265, turn=591564236550265,
p1HandOfCards='Soldat du comtÚ-de-l'or15642369293081310009136; Sanglier brocheroc15642369293081649365630; Sanglier brocheroc1564236929308322617750; ',
 p1CardsOnGround='',
 p2HandOfCards='Sanglier brocheroc156423692881179837984; Sanglier brocheroc15642369288111158190024; Image mirroir1564236928811518462009; Explosion des arcanes15642369288111125112562; Soldat du comtÚ-de-l'or15642369288111262138175; Sanglier brocheroc15642369288111492480001; Sanglier brocheroc1564236928817418307971; Soldat du comtÚ-de-l'or15642369288171388133020; Soldat du comtÚ-de-l'or15642369288171239440047; Soldat du comtÚ-de-l'or15642369288321777780779; Sanglier brocheroc1564236928836387361391; Sanglier brocheroc1564236928836698372929; Soldat du comtÚ-de-l'or156423692883486444016; Image mirroir15642369288321121969470; YÚti noroit15642369288321910331861; Image mirroir15642369288341470782815; Sanglier brocheroc1564236928834432491031; Image mirroir1564236928836792419880; ',
 p2CardsOnGround='']

2019-07-27 16:15:29.338  INFO 8884 --- [boundChannel-33] minihearthstone.controller.ClientProxy   : Hand of cards saved in gameboard : [Card[id=null, uniqueId='Soldat du comtÚ-de-l'or15642369293281582354174', name='Soldat du comtÚ-de-l'or', manacost=1, damage=1, lifepoints=2, nature='servant', canAttack=false, currentTargetUniqueId='Soldat du comtÚ-de-l'or15642369293281582354174', effect='ProvocationEffect', specificCard='null'], Card[id=null, uniqueId='Sanglier brocheroc15642369293281729235426', name='Sanglier brocheroc', manacost=1, damage=1, lifepoints=1, nature='servant', canAttack=false, currentTargetUniqueId='Sanglier brocheroc15642369293281729235426', effect='null', specificCard='null'], Card[id=null, uniqueId='YÚti noroit15642369293281472799005', name='YÚti noroit', manacost=4, damage=4, lifepoints=5, nature='servant', canAttack=false, currentTargetUniqueId='YÚti noroit15642369293281472799005', effect='null', specificCard='null']]
2019-07-27 16:15:29.338  INFO 8884 --- [boundChannel-47] minihearthstone.controller.ClientProxy   : Hand of cards saved in gameboard : [Card[id=null, uniqueId='Sanglier brocheroc1564236929328885449098', name='Sanglier brocheroc', manacost=1, damage=1, lifepoints=1, nature='servant', canAttack=false, currentTargetUniqueId='Sanglier brocheroc1564236929328885449098', effect='null', specificCard='null'], Card[id=null, uniqueId='Sanglier brocheroc15642369293281988528153', name='Sanglier brocheroc', manacost=1, damage=1, lifepoints=1, nature='servant', canAttack=false, currentTargetUniqueId='Sanglier brocheroc15642369293281988528153', effect='null', specificCard='null'], Card[id=null, uniqueId='Champion frisselame15642369293282053067639', name='Champion frisselame', manacost=4, damage=3, lifepoints=2, nature='servant', canAttack=false, currentTargetUniqueId='Champion frisselame15642369293282053067639', effect='LifeStealEffect', specificCard='null']]
2019-07-27 16:15:29.344  INFO 8884 --- [boundChannel-33] minihearthstone.controller.ClientProxy   : Gameboard after hand of cards added : GameBoard[id=61, gameId=60, p1ClientId=9121564236585288, p2ClientId=591564236550265, turn=591564236550265,
p1HandOfCards='Soldat du comtÚ-de-l'or15642369293081310009136; Sanglier brocheroc15642369293081649365630; Sanglier brocheroc1564236929308322617750; ',
 p1CardsOnGround='',
 p2HandOfCards='Sanglier brocheroc156423692881179837984; Sanglier brocheroc15642369288111158190024; Image mirroir1564236928811518462009; Explosion des arcanes15642369288111125112562; Soldat du comtÚ-de-l'or15642369288111262138175; Sanglier brocheroc15642369288111492480001; Sanglier brocheroc1564236928817418307971; Soldat du comtÚ-de-l'or15642369288171388133020; Soldat du comtÚ-de-l'or15642369288171239440047; Soldat du comtÚ-de-l'or15642369288321777780779; Sanglier brocheroc1564236928836387361391; Sanglier brocheroc1564236928836698372929; Soldat du comtÚ-de-l'or156423692883486444016; Image mirroir15642369288321121969470; YÚti noroit15642369288321910331861; Image mirroir15642369288341470782815; Sanglier brocheroc1564236928834432491031; Image mirroir1564236928836792419880; ',
 p2CardsOnGround='']

2019-07-27 16:15:29.349  INFO 8884 --- [boundChannel-47] minihearthstone.controller.ClientProxy   : Gameboard after hand of cards added : GameBoard[id=61, gameId=60, p1ClientId=9121564236585288, p2ClientId=591564236550265, turn=591564236550265,
p1HandOfCards='Soldat du comtÚ-de-l'or15642369293081310009136; Sanglier brocheroc15642369293081649365630; Sanglier brocheroc1564236929308322617750; ',
 p1CardsOnGround='',
 p2HandOfCards='Sanglier brocheroc156423692881179837984; Sanglier brocheroc15642369288111158190024; Image mirroir1564236928811518462009; Explosion des arcanes15642369288111125112562; Soldat du comtÚ-de-l'or15642369288111262138175; Sanglier brocheroc15642369288111492480001; Sanglier brocheroc1564236928817418307971; Soldat du comtÚ-de-l'or15642369288171388133020; Soldat du comtÚ-de-l'or15642369288171239440047; Soldat du comtÚ-de-l'or15642369288321777780779; Sanglier brocheroc1564236928836387361391; Sanglier brocheroc1564236928836698372929; Soldat du comtÚ-de-l'or156423692883486444016; Image mirroir15642369288321121969470; YÚti noroit15642369288321910331861; Image mirroir15642369288341470782815; Sanglier brocheroc1564236928834432491031; Image mirroir1564236928836792419880; ',
 p2CardsOnGround='']

<=<=2019-07-27 16:17:30.383  INFO 8884 --- [boundChannel-52] minihearthstone.controller.ClientProxy   : Receive end of turn from : 591564236550265
2019-07-27 16:17:30.383  INFO 8884 --- [boundChannel-52] minihearthstone.controller.ClientProxy   : -------------------------------------------------
2019-07-27 16:17:30.404  INFO 8884 --- [boundChannel-52] minihearthstone.controller.ClientProxy   : Gameboard updated after end of turn : GameBoard[id=61, gameId=60, p1ClientId=9121564236585288, p2ClientId=591564236550265, turn=9121564236585288,
p1HandOfCards='Soldat du comtÚ-de-l'or15642369293081310009136; Sanglier brocheroc15642369293081649365630; Sanglier brocheroc1564236929308322617750; ',
 p1CardsOnGround='',
 p2HandOfCards='Sanglier brocheroc156423692881179837984; Sanglier brocheroc15642369288111158190024; Image mirroir1564236928811518462009; Explosion des arcanes15642369288111125112562; Soldat du comtÚ-de-l'or15642369288111262138175; Sanglier brocheroc15642369288111492480001; Sanglier brocheroc1564236928817418307971; Soldat du comtÚ-de-l'or15642369288171388133020; Soldat du comtÚ-de-l'or15642369288171239440047; Soldat du comtÚ-de-l'or15642369288321777780779; Sanglier brocheroc1564236928836387361391; Sanglier brocheroc1564236928836698372929; Soldat du comtÚ-de-l'or156423692883486444016; Image mirroir15642369288321121969470; YÚti noroit15642369288321910331861; Image mirroir15642369288341470782815; Sanglier brocheroc1564236928834432491031; Image mirroir1564236928836792419880; ',
 p2CardsOnGround='']
2019-07-27 16:17:30.411  INFO 8884 --- [boundChannel-55] minihearthstone.controller.ClientProxy   : Notifiy end of turn to : 9121564236585288
2019-07-27 16:17:30.411  INFO 8884 --- [boundChannel-55] minihearthstone.controller.ClientProxy   : -------------------------------------------------
2019-07-27 16:17:30.415  INFO 8884 --- [boundChannel-55] minihearthstone.entities.deck.Deck       : getPlayerHandOfCards(9121564236585288) -> p2HandOfCards : [Card[id=64, uniqueId='Sanglier brocheroc156423692881179837984', name='Sanglier brocheroc', manacost=1, damage=1, lifepoints=1, nature='servant', canAttack=false, currentTargetUniqueId='Sanglier brocheroc156423692881179837984', effect='null', specificCard='null'], Card[id=65, uniqueId='Sanglier brocheroc15642369288111158190024', name='Sanglier brocheroc', manacost=1, damage=1, lifepoints=1, nature='servant', canAttack=false, currentTargetUniqueId='Sanglier brocheroc15642369288111158190024', effect='null', specificCard='null'], Card[id=66, uniqueId='Image mirroir1564236928811518462009', name='Image mirroir', manacost=1, damage=0, lifepoints=2, nature='spell', canAttack=false, currentTargetUniqueId='Image mirroir1564236928811518462009', effect='ProvocationEffect', specificCard='ImageMirroir'], Card[id=67, uniqueId='Explosion des arcanes15642369288111125112562', name='Explosion des arcanes', manacost=2, damage=1, lifepoints=0, nature='spell', canAttack=false, currentTargetUniqueId='Explosion des arcanes15642369288111125112562', effect='null', specificCard='ExplosionDesArcanes'], Card[id=68, uniqueId='Soldat du comtÚ-de-l'or15642369288111262138175', name='Soldat du comtÚ-de-l'or', manacost=1, damage=1, lifepoints=2, nature='servant', canAttack=false, currentTargetUniqueId='Soldat du comtÚ-de-l'or15642369288111262138175', effect='ProvocationEffect', specificCard='null'], Card[id=69, uniqueId='Sanglier brocheroc15642369288111492480001', name='Sanglier brocheroc', manacost=1, damage=1, lifepoints=1, nature='servant', canAttack=false, currentTargetUniqueId='Sanglier brocheroc15642369288111492480001', effect='null', specificCard='null'], Card[id=70, uniqueId='Sanglier brocheroc1564236928817418307971', name='Sanglier brocheroc', manacost=1, damage=1, lifepoints=1, nature='servant', canAttack=false, currentTargetUniqueId='Sanglier brocheroc1564236928817418307971', effect='null', specificCard='null'], Card[id=71, uniqueId='Soldat du comtÚ-de-l'or15642369288171388133020', name='Soldat du comtÚ-de-l'or', manacost=1, damage=1, lifepoints=2, nature='servant', canAttack=false, currentTargetUniqueId='Soldat du comtÚ-de-l'or15642369288171388133020', effect='ProvocationEffect', specificCard='null'], Card[id=72, uniqueId='Soldat du comtÚ-de-l'or15642369288171239440047', name='Soldat du comtÚ-de-l'or', manacost=1, damage=1, lifepoints=2, nature='servant', canAttack=false, currentTargetUniqueId='Soldat du comtÚ-de-l'or15642369288171239440047', effect='ProvocationEffect', specificCard='null'], Card[id=73, uniqueId='Soldat du comtÚ-de-l'or15642369288321777780779', name='Soldat du comtÚ-de-l'or', manacost=1, damage=1, lifepoints=2, nature='servant', canAttack=false, currentTargetUniqueId='Soldat du comtÚ-de-l'or15642369288321777780779', effect='ProvocationEffect', specificCard='null'], Card[id=74, uniqueId='Sanglier brocheroc1564236928836387361391', name='Sanglier brocheroc', manacost=1, damage=1, lifepoints=1, nature='servant', canAttack=false,
currentTargetUniqueId='Sanglier brocheroc1564236928836387361391', effect='null', specificCard='null'], Card[id=75, uniqueId='Sanglier brocheroc1564236928836698372929', name='Sanglier brocheroc', manacost=1, damage=1, lifepoints=1, nature='servant', canAttack=false, currentTargetUniqueId='Sanglier brocheroc1564236928836698372929', effect='null', specificCard='null'], Card[id=76, uniqueId='Soldat du comtÚ-de-l'or156423692883486444016', name='Soldat du comtÚ-de-l'or', manacost=1, damage=1, lifepoints=2, nature='servant', canAttack=false, currentTargetUniqueId='Soldat du comtÚ-de-l'or156423692883486444016', effect='ProvocationEffect', specificCard='null'], Card[id=77, uniqueId='Image mirroir15642369288321121969470', name='Image mirroir', manacost=1, damage=0, lifepoints=2, nature='spell', canAttack=false, currentTargetUniqueId='Image mirroir15642369288321121969470', effect='ProvocationEffect', specificCard='ImageMirroir'], Card[id=78, uniqueId='YÚti noroit15642369288321910331861', name='YÚti noroit', manacost=4, damage=4, lifepoints=5, nature='servant', canAttack=false, currentTargetUniqueId='YÚti noroit15642369288321910331861', effect='null', specificCard='null'], Card[id=79, uniqueId='Image mirroir15642369288341470782815', name='Image mirroir', manacost=1, damage=0, lifepoints=2, nature='spell', canAttack=false, currentTargetUniqueId='Image mirroir15642369288341470782815', effect='ProvocationEffect', specificCard='ImageMirroir'], Card[id=80, uniqueId='Sanglier brocheroc1564236928834432491031', name='Sanglier brocheroc', manacost=1, damage=1,
lifepoints=1, nature='servant', canAttack=false, currentTargetUniqueId='Sanglier brocheroc1564236928834432491031', effect='null', specificCard='null'], Card[id=81, uniqueId='Image mirroir1564236928836792419880', name='Image mirroir', manacost=1, damage=0, lifepoints=2, nature='spell', canAttack=false, currentTargetUniqueId='Image mirroir1564236928836792419880', effect='ProvocationEffect', specificCard='ImageMirroir']]
2019-07-27 16:19:30.602  INFO 8884 --- [boundChannel-61] minihearthstone.controller.ClientProxy   : Receive end of turn from : 9121564236585288
2019-07-27 16:19:30.602  INFO 8884 --- [boundChannel-61] minihearthstone.controller.ClientProxy   : -------------------------------------------------
2019-07-27 16:19:30.616  INFO 8884 --- [boundChannel-61] minihearthstone.controller.ClientProxy   : Gameboard updated after end of turn : GameBoard[id=61, gameId=60, p1ClientId=9121564236585288, p2ClientId=591564236550265, turn=591564236550265,
p1HandOfCards='Soldat du comtÚ-de-l'or15642369293081310009136; Sanglier brocheroc15642369293081649365630; Sanglier brocheroc1564236929308322617750; ',
 p1CardsOnGround='',
 p2HandOfCards='Sanglier brocheroc156423692881179837984; Sanglier brocheroc15642369288111158190024; Image mirroir1564236928811518462009; Explosion des arcanes15642369288111125112562; Soldat du comtÚ-de-l'or15642369288111262138175; Sanglier brocheroc15642369288111492480001; Sanglier brocheroc1564236928817418307971; Soldat du comtÚ-de-l'or15642369288171388133020; Soldat du comtÚ-de-l'or15642369288171239440047; Soldat du comtÚ-de-l'or15642369288321777780779; Sanglier brocheroc1564236928836387361391; Sanglier brocheroc1564236928836698372929; Soldat du comtÚ-de-l'or156423692883486444016; Image mirroir15642369288321121969470; YÚti noroit15642369288321910331861; Image mirroir15642369288341470782815; Sanglier brocheroc1564236928834432491031; Image mirroir1564236928836792419880; ',
 p2CardsOnGround='']
2019-07-27 16:19:30.621  INFO 8884 --- [boundChannel-64] minihearthstone.controller.ClientProxy   : Notifiy end of turn to : 591564236550265
2019-07-27 16:19:30.622  INFO 8884 --- [boundChannel-64] minihearthstone.controller.ClientProxy   : -------------------------------------------------
2019-07-27 16:19:30.625  INFO 8884 --- [boundChannel-64] minihearthstone.entities.deck.Deck       : getPlayerHandOfCards(591564236550265) -> p1HandOfCards : [Card[id=82, uniqueId='Soldat du comtÚ-de-l'or15642369293081310009136', name='Soldat du comtÚ-de-l'or', manacost=1, damage=1, lifepoints=2, nature='servant', canAttack=false, currentTargetUniqueId='Soldat du comtÚ-de-l'or15642369293081310009136', effect='ProvocationEffect', specificCard='null'], Card[id=83, uniqueId='Sanglier brocheroc15642369293081649365630', name='Sanglier brocheroc', manacost=1, damage=1, lifepoints=1, nature='servant', canAttack=false, currentTargetUniqueId='Sanglier brocheroc15642369293081649365630', effect='null', specificCard='null'], Card[id=84, uniqueId='Sanglier brocheroc1564236929308322617750', name='Sanglier brocheroc', manacost=1, damage=1, lifepoints=1, nature='servant', canAttack=false, currentTargetUniqueId='Sanglier brocheroc1564236929308322617750', effect='null', specificCard='null']]
2019-07-27 16:19:30.625  INFO 8884 --- [boundChannel-64] minihearthstone.controller.ClientProxy   : There's less than 7 cards in hand: 3
2019-07-27 16:19:30.628  INFO 8884 --- [boundChannel-64] minihearthstone.entities.deck.Deck       : pickCardFromDeckToPlayerHand : 591564236550265
2019-07-27 16:19:30.628  INFO 8884 --- [boundChannel-64] minihearthstone.entities.deck.Deck       : Random pick index: 6
2019-07-27 16:19:30.628  INFO 8884 --- [boundChannel-64] minihearthstone.entities.deck.Deck       : getPlayerHandOfCards(591564236550265) -> p1HandOfCards : [Card[id=82, uniqueId='Soldat du comtÚ-de-l'or15642369293081310009136', name='Soldat du comtÚ-de-l'or', manacost=1, damage=1, lifepoints=2, nature='servant', canAttack=false, currentTargetUniqueId='Soldat du comtÚ-de-l'or15642369293081310009136', effect='ProvocationEffect', specificCard='null'], Card[id=83, uniqueId='Sanglier brocheroc15642369293081649365630', name='Sanglier brocheroc', manacost=1, damage=1, lifepoints=1, nature='servant', canAttack=false, currentTargetUniqueId='Sanglier brocheroc15642369293081649365630', effect='null', specificCard='null'], Card[id=84, uniqueId='Sanglier brocheroc1564236929308322617750', name='Sanglier brocheroc', manacost=1, damage=1, lifepoints=1, nature='servant', canAttack=false, currentTargetUniqueId='Sanglier brocheroc1564236929308322617750', effect='null', specificCard='null'], Card[id=null, uniqueId='Explosion des arcanes15642364175251118400685', name='Explosion des arcanes', manacost=2, damage=1, lifepoints=0, nature='spell', canAttack=false, currentTargetUniqueId='Explosion des arcanes15642364175251118400685', effect='null', specificCard='ExplosionDesArcanes']]
2019-07-27 16:19:30.628  INFO 8884 --- [boundChannel-64] minihearthstone.controller.ClientProxy   : Number after picking cards : 4

## Case 2 

Windows PowerShell
Copyright (C) Microsoft Corporation. Tous droits réservés.

PS G:\Github\minihearthstone> cd code/server
PS G:\Github\minihearthstone\code\server> gradle bootRun
Starting a Gradle Daemon, 1 incompatible and 1 stopped Daemons could not be reused, use --status for details

> Task :compileJava
Note: G:\Github\minihearthstone\code\server\src\main\java\minihearthstone\facade\Facade.java uses unchecked or unsafe operations.
Note: Recompile with -Xlint:unchecked for details.

> Task :bootRun
09:30:54.612 [main] INFO minihearthstone.MinihearthstoneApplication - version: 5.1.3.RELEASE

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::        (v2.1.1.RELEASE)

2019-07-28 09:30:55.545  INFO 5284 --- [           main] m.MinihearthstoneApplication             : Starting MinihearthstoneApplication on PC-Roxane with PID 5284 (G:\Github\minihearthstone\code\server\build\classes\java\main started by RoxaneKang in G:\Github\minihearthstone\code\server)
2019-07-28 09:30:55.549  INFO 5284 --- [           main] m.MinihearthstoneApplication             : No active profile set, falling back to default profiles: default
2019-07-28 09:30:57.369  INFO 5284 --- [           main] .s.d.r.c.RepositoryConfigurationDelegate : Bootstrapping Spring Data repositories in DEFAULT mode.
2019-07-28 09:30:57.531  INFO 5284 --- [           main] .s.d.r.c.RepositoryConfigurationDelegate : Finished Spring Data repository scanning in 151ms. Found 6 repository interfaces.
2019-07-28 09:30:58.240  INFO 5284 --- [           main] trationDelegate$BeanPostProcessorChecker : Bean 'org.springframework.transaction.annotation.ProxyTransactionManagementConfiguration' of type [org.springframework.transaction.annotation.ProxyTransactionManagementConfiguration$$EnhancerBySpringCGLIB$$479a82c8] is not eligible for getting processed by all BeanPostProcessors (for example: not eligible for auto-proxying)
2019-07-28 09:30:58.311  INFO 5284 --- [           main] trationDelegate$BeanPostProcessorChecker : Bean 'org.springframework.hateoas.config.HateoasConfiguration' of type [org.springframework.hateoas.config.HateoasConfiguration$$EnhancerBySpringCGLIB$$c71acffa] is not eligible for getting processed by all BeanPostProcessors (for example: not eligible for auto-proxying)
2019-07-28 09:30:59.309  INFO 5284 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port(s): 8090 (http)
2019-07-28 09:30:59.360  INFO 5284 --- [           main] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
2019-07-28 09:30:59.361  INFO 5284 --- [           main] org.apache.catalina.core.StandardEngine  : Starting Servlet Engine: Apache Tomcat/9.0.13
2019-07-28 09:30:59.384  INFO 5284 --- [           main] o.a.catalina.core.AprLifecycleListener   : The APR based Apache Tomcat Native library which allows optimal performance in production environments was not found on the java.library.path: [C:\Program Files\Java\jdk1.8.0_60\bin;C:\WINDOWS\Sun\Java\bin;C:\WINDOWS\system32;C:\WINDOWS;C:\Program
Files (x86)\Python37-32\Scripts\;C:\Program Files (x86)\Python37-32\;C:\oraclexe\app\oracle\product\11.2.0\server\bin;C:\ProgramData\Oracle\Java\javapath;C:\Python34\;C:\Python34\Scripts;C:\WINDOWS\system32;C:\WINDOWS;C:\WINDOWS\System32\Wbem;C:\WINDOWS\System32\WindowsPowerShell\v1.0\;C:\Program Files\Common Files\Apple\Mobile Device Support\;C:\Program Files (x86)\Common Files\Apple\Apple Application Support;D:\Softwares\Git\Git\cmd;C:\WINDOWS\system32;C:\WINDOWS;C:\WINDOWS\System32\Wbem;C:\WINDOWS\System32\WindowsPowerShell\v1.0\;D:\Softwares\Gow\bin;D:\Softwares\Xampp\Xampp\mysql\bin;C:\Program Files (x86)\Skype\Phone\;C:\Program Files (x86)\QuickTime\QTSystem\;C:\Program Files\Java\jdk1.8.0_60\bin;D:\Softwares\Android\android-sdk\tools;D:\Softwares\Android\android-sdk\tools\bin\;D:\Softwares\Android\android-sdk\platform-tools;C:\Program Files (x86)\apache-maven-3.5.2\bin;C:\CamlLight\bin;C:\Program Files (x86)\instantclient_12_2;C:\Program Files (x86)\instantclient-sqlplus-windows.x64-12.2.0.1.0\instantclient_12_2;C:\Users\RoxaneKang\AppData\Local\Julia-0.6.2\bin;C:\Program Files (x86)\Common Files\Acronis\VirtualFile\;C:\Program Files (x86)\Common Files\Acronis\VirtualFile64\;C:\Program Files
(x86)\Common Files\Acronis\SnapAPI\;C:\WINDOWS\System32\OpenSSH\;C:\Program Files (x86)\Gpg4win\..\GnuPG\bin;C:\Program Files\gs\gs9.23\bin;C:\xampp\php;C:\ProgramData\ComposerSetup\bin;C:\Program Files (x86)\Brackets\command;D:\Softwares\Sparql\apache-jena-3.9.0\bat;C:\Users\RoxaneKang\AppData\Roaming\nvm;C:\Program Files\nodejs;D:\Softwares\tarql-1.1\bin;C:\Program Files\wkhtmltopdf\bin;G:\Github\markdown-to-pdf;D:\Softwares\Gradle\gradle-4.10.2-all\gradle-4.10.2\bin;G:\Development\WebApps\tomcat\bin;C:\Program Files\doxygen\bin;C:\Program Files (x86)\IVI Foundation\VISA\WinNT\Bin;C:\Users\RoxaneKang\AppData\Roaming\Python\Python37\Scripts;C:\Program Files\MiKTeX 2.9\miktex\bin\x64\;C:\Program Files (x86)\GnuWin32\bin;C:\Program Files (x86)\Graphviz2.38\bin\dot.exe;C:\ProgramData\chocolatey\bin;C:\Users\RoxaneKang\Anaconda3;C:\Users\RoxaneKang\Anaconda3\Library\mingw-w64\bin;C:\Users\RoxaneKang\Anaconda3\Library\usr\bin;C:\Users\RoxaneKang\Anaconda3\Library\bin;C:\Users\RoxaneKang\Anaconda3\Scripts;C:\Users\RoxaneKang\AppData\Local\Microsoft\WindowsApps;C:\Users\RoxaneKang\AppData\Local\atom\bin;C:\Users\RoxaneKang\AppData\Roaming\npm;C:\CamlLight\bin;C:\Users\RoxaneKang\AppData\Local\Microsoft\WindowsApps;C:\Program Files\gs\gs9.23\bin;C:\Users\RoxaneKang\AppData\Roaming\Composer\vendor\bin;C:\Users\RoxaneKang\AppData\Roaming\nvm;C:\Program Files\nodejs;C:\Users\RoxaneKang\AppData\Local\Pandoc\;D:\Softwares\VisualStudioCode\Microsoft VS Code\bin;C:\Users\RoxaneKang\AppData\Local\GitHubDesktop\bin;C:\Users\RoxaneKang\AppData\Local\Programs\EmEditor;C:\Users\RoxaneKang\AppData\Roaming\Python\Python37\Scripts;C:\Users\RoxaneKang\AppData\Local\Programs\MiKTeX 2.9\miktex\bin\x64\;C:\Program Files (x86)\Graphviz2.38\bin\;C:\Users\RoxaneKang\AppData\Local\Google\Cloud SDK\google-cloud-sdk\bin;;.]
2019-07-28 09:30:59.817  INFO 5284 --- [           main] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
2019-07-28 09:30:59.817  INFO 5284 --- [           main] o.s.web.context.ContextLoader            : Root WebApplicationContext: initialization completed in 4170 ms
2019-07-28 09:31:00.352  INFO 5284 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Starting...
2019-07-28 09:31:00.635  INFO 5284 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Start completed.
2019-07-28 09:31:00.813  INFO 5284 --- [           main] o.hibernate.jpa.internal.util.LogHelper  : HHH000204: Processing PersistenceUnitInfo [
        name: default
        ...]
2019-07-28 09:31:01.007  INFO 5284 --- [           main] org.hibernate.Version                    : HHH000412: Hibernate Core {5.3.7.Final}
2019-07-28 09:31:01.010  INFO 5284 --- [           main] org.hibernate.cfg.Environment            : HHH000206: hibernate.properties not found
2019-07-28 09:31:01.418  INFO 5284 --- [           main] o.hibernate.annotations.common.Version   : HCANN000001: Hibernate Commons Annotations {5.0.4.Final}
2019-07-28 09:31:01.775  INFO 5284 --- [           main] org.hibernate.dialect.Dialect            : HHH000400: Using dialect: org.hibernate.dialect.H2Dialect
2019-07-28 09:31:02.255  INFO 5284 --- [           main] o.hibernate.id.enhanced.TableGenerator   : HHH000398: Explicit segment value for id generator [hibernate_sequences.sequence_name] suggested; using default [default]
2019-07-28 09:31:02.268  INFO 5284 --- [           main] o.hibernate.id.enhanced.TableGenerator   : HHH000398: Explicit segment value for id generator [hibernate_sequences.sequence_name] suggested; using default [default]
2019-07-28 09:31:02.269  INFO 5284 --- [           main] o.hibernate.id.enhanced.TableGenerator   : HHH000398: Explicit segment value for id generator [hibernate_sequences.sequence_name] suggested; using default [default]
2019-07-28 09:31:03.972  WARN 5284 --- [           main] o.h.t.s.i.ExceptionHandlerLoggedImpl     : GenerationTarget encountered exception accepting command : Error executing DDL "insert into hibernate_sequences(sequence_name, next_val) values ('default',0)" via JDBC Statement

org.hibernate.tool.schema.spi.CommandAcceptanceException: Error executing DDL "insert into hibernate_sequences(sequence_name, next_val) values ('default',0)" via JDBC Statement
        at org.hibernate.tool.schema.internal.exec.GenerationTargetToDatabase.accept(GenerationTargetToDatabase.java:67) ~[hibernate-core-5.3.7.Final.jar:5.3.7.Final]
        at org.hibernate.tool.schema.internal.SchemaCreatorImpl.applySqlString(SchemaCreatorImpl.java:440) [hibernate-core-5.3.7.Final.jar:5.3.7.Final]
        at org.hibernate.tool.schema.internal.SchemaCreatorImpl.applySqlStrings(SchemaCreatorImpl.java:424) [hibernate-core-5.3.7.Final.jar:5.3.7.Final]
        at org.hibernate.tool.schema.internal.SchemaCreatorImpl.createFromMetadata(SchemaCreatorImpl.java:315) [hibernate-core-5.3.7.Final.jar:5.3.7.Final]
        at org.hibernate.tool.schema.internal.SchemaCreatorImpl.performCreation(SchemaCreatorImpl.java:166) [hibernate-core-5.3.7.Final.jar:5.3.7.Final]
        at org.hibernate.tool.schema.internal.SchemaCreatorImpl.doCreation(SchemaCreatorImpl.java:135) [hibernate-core-5.3.7.Final.jar:5.3.7.Final]
        at org.hibernate.tool.schema.internal.SchemaCreatorImpl.doCreation(SchemaCreatorImpl.java:121) [hibernate-core-5.3.7.Final.jar:5.3.7.Final]
        at org.hibernate.tool.schema.spi.SchemaManagementToolCoordinator.performDatabaseAction(SchemaManagementToolCoordinator.java:155) [hibernate-core-5.3.7.Final.jar:5.3.7.Final]
        at org.hibernate.tool.schema.spi.SchemaManagementToolCoordinator.process(SchemaManagementToolCoordinator.java:72) [hibernate-core-5.3.7.Final.jar:5.3.7.Final]
        at org.hibernate.internal.SessionFactoryImpl.<init>(SessionFactoryImpl.java:310) [hibernate-core-5.3.7.Final.jar:5.3.7.Final]
        at org.hibernate.boot.internal.SessionFactoryBuilderImpl.build(SessionFactoryBuilderImpl.java:467) [hibernate-core-5.3.7.Final.jar:5.3.7.Final]
        at org.hibernate.jpa.boot.internal.EntityManagerFactoryBuilderImpl.build(EntityManagerFactoryBuilderImpl.java:939) [hibernate-core-5.3.7.Final.jar:5.3.7.Final]
        at org.springframework.orm.jpa.vendor.SpringHibernateJpaPersistenceProvider.createContainerEntityManagerFactory(SpringHibernateJpaPersistenceProvider.java:57) [spring-orm-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean.createNativeEntityManagerFactory(LocalContainerEntityManagerFactoryBean.java:365) [spring-orm-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.orm.jpa.AbstractEntityManagerFactoryBean.buildNativeEntityManagerFactory(AbstractEntityManagerFactoryBean.java:390) [spring-orm-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.orm.jpa.AbstractEntityManagerFactoryBean.afterPropertiesSet(AbstractEntityManagerFactoryBean.java:377) [spring-orm-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean.afterPropertiesSet(LocalContainerEntityManagerFactoryBean.java:341) [spring-orm-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.invokeInitMethods(AbstractAutowireCapableBeanFactory.java:1804) [spring-beans-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.initializeBean(AbstractAutowireCapableBeanFactory.java:1741) [spring-beans-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:576) [spring-beans-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:498) [spring-beans-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.beans.factory.support.AbstractBeanFactory.lambda$doGetBean$0(AbstractBeanFactory.java:320) [spring-beans-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:222) ~[spring-beans-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:318) [spring-beans-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:199) [spring-beans-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.context.support.AbstractApplicationContext.getBean(AbstractApplicationContext.java:1083) ~[spring-context-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.context.support.AbstractApplicationContext.finishBeanFactoryInitialization(AbstractApplicationContext.java:853) ~[spring-context-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.context.support.AbstractApplicationContext.refresh(AbstractApplicationContext.java:546) ~[spring-context-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.boot.web.servlet.context.ServletWebServerApplicationContext.refresh(ServletWebServerApplicationContext.java:142) ~[spring-boot-2.1.1.RELEASE.jar:2.1.1.RELEASE]
        at org.springframework.boot.SpringApplication.refresh(SpringApplication.java:775) ~[spring-boot-2.1.1.RELEASE.jar:2.1.1.RELEASE]
        at org.springframework.boot.SpringApplication.refreshContext(SpringApplication.java:397) ~[spring-boot-2.1.1.RELEASE.jar:2.1.1.RELEASE]
        at org.springframework.boot.SpringApplication.run(SpringApplication.java:316) ~[spring-boot-2.1.1.RELEASE.jar:2.1.1.RELEASE]
        at org.springframework.boot.SpringApplication.run(SpringApplication.java:1260) ~[spring-boot-2.1.1.RELEASE.jar:2.1.1.RELEASE]
        at org.springframework.boot.SpringApplication.run(SpringApplication.java:1248) ~[spring-boot-2.1.1.RELEASE.jar:2.1.1.RELEASE]
        at minihearthstone.MinihearthstoneApplication.main(MinihearthstoneApplication.java:29) ~[main/:na]
Caused by: org.h2.jdbc.JdbcSQLException: Violation dindex unique ou clÚ primaire: {0}
Unique index or primary key violation: {0}; SQL statement:
insert into hibernate_sequences(sequence_name, next_val) values ('default',0) [23505-197]
        at org.h2.message.DbException.getJdbcSQLException(DbException.java:357) ~[h2-1.4.197.jar:1.4.197]
        at org.h2.message.DbException.get(DbException.java:179) ~[h2-1.4.197.jar:1.4.197]
        at org.h2.message.DbException.get(DbException.java:155) ~[h2-1.4.197.jar:1.4.197]
        at org.h2.index.BaseIndex.getDuplicateKeyException(BaseIndex.java:101) ~[h2-1.4.197.jar:1.4.197]
        at org.h2.mvstore.db.MVSecondaryIndex.requireUnique(MVSecondaryIndex.java:236) ~[h2-1.4.197.jar:1.4.197]
        at org.h2.mvstore.db.MVSecondaryIndex.add(MVSecondaryIndex.java:202) ~[h2-1.4.197.jar:1.4.197]
        at org.h2.mvstore.db.MVTable.addRow(MVTable.java:732) ~[h2-1.4.197.jar:1.4.197]
        at org.h2.command.dml.Insert.insertRows(Insert.java:182) ~[h2-1.4.197.jar:1.4.197]
        at org.h2.command.dml.Insert.update(Insert.java:134) ~[h2-1.4.197.jar:1.4.197]
        at org.h2.command.CommandContainer.update(CommandContainer.java:102) ~[h2-1.4.197.jar:1.4.197]
        at org.h2.command.Command.executeUpdate(Command.java:261) ~[h2-1.4.197.jar:1.4.197]
        at org.h2.jdbc.JdbcStatement.executeInternal(JdbcStatement.java:233) ~[h2-1.4.197.jar:1.4.197]
        at org.h2.jdbc.JdbcStatement.execute(JdbcStatement.java:205) ~[h2-1.4.197.jar:1.4.197]
        at com.zaxxer.hikari.pool.ProxyStatement.execute(ProxyStatement.java:95) ~[HikariCP-3.2.0.jar:na]
        at com.zaxxer.hikari.pool.HikariProxyStatement.execute(HikariProxyStatement.java) ~[HikariCP-3.2.0.jar:na]
        at org.hibernate.tool.schema.internal.exec.GenerationTargetToDatabase.accept(GenerationTargetToDatabase.java:54) ~[hibernate-core-5.3.7.Final.jar:5.3.7.Final]
        ... 34 common frames omitted

2019-07-28 09:31:03.973  WARN 5284 --- [           main] o.h.t.s.i.ExceptionHandlerLoggedImpl     : GenerationTarget encountered exception accepting command : Error executing DDL "insert into hibernate_sequences(sequence_name, next_val) values ('default',0)" via JDBC Statement

org.hibernate.tool.schema.spi.CommandAcceptanceException: Error executing DDL "insert into hibernate_sequences(sequence_name, next_val) values ('default',0)" via JDBC Statement
        at org.hibernate.tool.schema.internal.exec.GenerationTargetToDatabase.accept(GenerationTargetToDatabase.java:67) ~[hibernate-core-5.3.7.Final.jar:5.3.7.Final]
        at org.hibernate.tool.schema.internal.SchemaCreatorImpl.applySqlString(SchemaCreatorImpl.java:440) [hibernate-core-5.3.7.Final.jar:5.3.7.Final]
        at org.hibernate.tool.schema.internal.SchemaCreatorImpl.applySqlStrings(SchemaCreatorImpl.java:424) [hibernate-core-5.3.7.Final.jar:5.3.7.Final]
        at org.hibernate.tool.schema.internal.SchemaCreatorImpl.createFromMetadata(SchemaCreatorImpl.java:315) [hibernate-core-5.3.7.Final.jar:5.3.7.Final]
        at org.hibernate.tool.schema.internal.SchemaCreatorImpl.performCreation(SchemaCreatorImpl.java:166) [hibernate-core-5.3.7.Final.jar:5.3.7.Final]
        at org.hibernate.tool.schema.internal.SchemaCreatorImpl.doCreation(SchemaCreatorImpl.java:135) [hibernate-core-5.3.7.Final.jar:5.3.7.Final]
        at org.hibernate.tool.schema.internal.SchemaCreatorImpl.doCreation(SchemaCreatorImpl.java:121) [hibernate-core-5.3.7.Final.jar:5.3.7.Final]
        at org.hibernate.tool.schema.spi.SchemaManagementToolCoordinator.performDatabaseAction(SchemaManagementToolCoordinator.java:155) [hibernate-core-5.3.7.Final.jar:5.3.7.Final]
        at org.hibernate.tool.schema.spi.SchemaManagementToolCoordinator.process(SchemaManagementToolCoordinator.java:72) [hibernate-core-5.3.7.Final.jar:5.3.7.Final]
        at org.hibernate.internal.SessionFactoryImpl.<init>(SessionFactoryImpl.java:310) [hibernate-core-5.3.7.Final.jar:5.3.7.Final]
        at org.hibernate.boot.internal.SessionFactoryBuilderImpl.build(SessionFactoryBuilderImpl.java:467) [hibernate-core-5.3.7.Final.jar:5.3.7.Final]
        at org.hibernate.jpa.boot.internal.EntityManagerFactoryBuilderImpl.build(EntityManagerFactoryBuilderImpl.java:939) [hibernate-core-5.3.7.Final.jar:5.3.7.Final]
        at org.springframework.orm.jpa.vendor.SpringHibernateJpaPersistenceProvider.createContainerEntityManagerFactory(SpringHibernateJpaPersistenceProvider.java:57) [spring-orm-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean.createNativeEntityManagerFactory(LocalContainerEntityManagerFactoryBean.java:365) [spring-orm-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.orm.jpa.AbstractEntityManagerFactoryBean.buildNativeEntityManagerFactory(AbstractEntityManagerFactoryBean.java:390) [spring-orm-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.orm.jpa.AbstractEntityManagerFactoryBean.afterPropertiesSet(AbstractEntityManagerFactoryBean.java:377) [spring-orm-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean.afterPropertiesSet(LocalContainerEntityManagerFactoryBean.java:341) [spring-orm-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.invokeInitMethods(AbstractAutowireCapableBeanFactory.java:1804) [spring-beans-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.initializeBean(AbstractAutowireCapableBeanFactory.java:1741) [spring-beans-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:576) [spring-beans-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:498) [spring-beans-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.beans.factory.support.AbstractBeanFactory.lambda$doGetBean$0(AbstractBeanFactory.java:320) [spring-beans-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:222) ~[spring-beans-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:318) [spring-beans-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:199) [spring-beans-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.context.support.AbstractApplicationContext.getBean(AbstractApplicationContext.java:1083) ~[spring-context-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.context.support.AbstractApplicationContext.finishBeanFactoryInitialization(AbstractApplicationContext.java:853) ~[spring-context-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.context.support.AbstractApplicationContext.refresh(AbstractApplicationContext.java:546) ~[spring-context-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.boot.web.servlet.context.ServletWebServerApplicationContext.refresh(ServletWebServerApplicationContext.java:142) ~[spring-boot-2.1.1.RELEASE.jar:2.1.1.RELEASE]
        at org.springframework.boot.SpringApplication.refresh(SpringApplication.java:775) ~[spring-boot-2.1.1.RELEASE.jar:2.1.1.RELEASE]
        at org.springframework.boot.SpringApplication.refreshContext(SpringApplication.java:397) ~[spring-boot-2.1.1.RELEASE.jar:2.1.1.RELEASE]
        at org.springframework.boot.SpringApplication.run(SpringApplication.java:316) ~[spring-boot-2.1.1.RELEASE.jar:2.1.1.RELEASE]
        at org.springframework.boot.SpringApplication.run(SpringApplication.java:1260) ~[spring-boot-2.1.1.RELEASE.jar:2.1.1.RELEASE]
        at org.springframework.boot.SpringApplication.run(SpringApplication.java:1248) ~[spring-boot-2.1.1.RELEASE.jar:2.1.1.RELEASE]
        at minihearthstone.MinihearthstoneApplication.main(MinihearthstoneApplication.java:29) ~[main/:na]
Caused by: org.h2.jdbc.JdbcSQLException: Violation dindex unique ou clÚ primaire: {0}
Unique index or primary key violation: {0}; SQL statement:
insert into hibernate_sequences(sequence_name, next_val) values ('default',0) [23505-197]
        at org.h2.message.DbException.getJdbcSQLException(DbException.java:357) ~[h2-1.4.197.jar:1.4.197]
        at org.h2.message.DbException.get(DbException.java:179) ~[h2-1.4.197.jar:1.4.197]
        at org.h2.message.DbException.get(DbException.java:155) ~[h2-1.4.197.jar:1.4.197]
        at org.h2.index.BaseIndex.getDuplicateKeyException(BaseIndex.java:101) ~[h2-1.4.197.jar:1.4.197]
        at org.h2.mvstore.db.MVSecondaryIndex.requireUnique(MVSecondaryIndex.java:236) ~[h2-1.4.197.jar:1.4.197]
        at org.h2.mvstore.db.MVSecondaryIndex.add(MVSecondaryIndex.java:202) ~[h2-1.4.197.jar:1.4.197]
        at org.h2.mvstore.db.MVTable.addRow(MVTable.java:732) ~[h2-1.4.197.jar:1.4.197]
        at org.h2.command.dml.Insert.insertRows(Insert.java:182) ~[h2-1.4.197.jar:1.4.197]
        at org.h2.command.dml.Insert.update(Insert.java:134) ~[h2-1.4.197.jar:1.4.197]
        at org.h2.command.CommandContainer.update(CommandContainer.java:102) ~[h2-1.4.197.jar:1.4.197]
        at org.h2.command.Command.executeUpdate(Command.java:261) ~[h2-1.4.197.jar:1.4.197]
        at org.h2.jdbc.JdbcStatement.executeInternal(JdbcStatement.java:233) ~[h2-1.4.197.jar:1.4.197]
        at org.h2.jdbc.JdbcStatement.execute(JdbcStatement.java:205) ~[h2-1.4.197.jar:1.4.197]
        at com.zaxxer.hikari.pool.ProxyStatement.execute(ProxyStatement.java:95) ~[HikariCP-3.2.0.jar:na]
        at com.zaxxer.hikari.pool.HikariProxyStatement.execute(HikariProxyStatement.java) ~[HikariCP-3.2.0.jar:na]
        at org.hibernate.tool.schema.internal.exec.GenerationTargetToDatabase.accept(GenerationTargetToDatabase.java:54) ~[hibernate-core-5.3.7.Final.jar:5.3.7.Final]
        ... 34 common frames omitted

2019-07-28 09:31:04.029  INFO 5284 --- [           main] o.h.t.schema.internal.SchemaCreatorImpl  : HHH000476: Executing import script 'org.hibernate.tool.schema.internal.exec.ScriptSourceInputNonExistentImpl@1acc873b'
2019-07-28 09:31:04.035  INFO 5284 --- [           main] j.LocalContainerEntityManagerFactoryBean : Initialized JPA EntityManagerFactory for persistence unit 'default'
2019-07-28 09:31:06.031  INFO 5284 --- [           main] o.s.s.concurrent.ThreadPoolTaskExecutor  : Initializing ExecutorService 'clientInboundChannelExecutor'
2019-07-28 09:31:06.043  INFO 5284 --- [           main] o.s.s.concurrent.ThreadPoolTaskExecutor  : Initializing ExecutorService 'clientOutboundChannelExecutor'
2019-07-28 09:31:06.067  INFO 5284 --- [           main] o.s.s.c.ThreadPoolTaskScheduler          : Initializing ExecutorService 'messageBrokerTaskScheduler'
2019-07-28 09:31:06.148  INFO 5284 --- [           main] o.s.s.concurrent.ThreadPoolTaskExecutor  : Initializing ExecutorService 'brokerChannelExecutor'
2019-07-28 09:31:06.671  WARN 5284 --- [           main] aWebConfiguration$JpaWebMvcConfiguration : spring.jpa.open-in-view is enabled by default. Therefore, database queries may be performed during view rendering. Explicitly configure spring.jpa.open-in-view to disable this warning
2019-07-28 09:31:07.400  INFO 5284 --- [           main] o.s.m.s.b.SimpleBrokerMessageHandler     : Starting...
2019-07-28 09:31:07.401  INFO 5284 --- [           main] o.s.m.s.b.SimpleBrokerMessageHandler     : BrokerAvailabilityEvent[available=true, SimpleBrokerMessageHandler [DefaultSubscriptionRegistry[cache[0 destination(s)], registry[0 sessions]]]]
2019-07-28 09:31:07.401  INFO 5284 --- [           main] o.s.m.s.b.SimpleBrokerMessageHandler     : Started.
2019-07-28 09:31:07.454  INFO 5284 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port(s): 8090 (http) with context path ''
2019-07-28 09:31:07.458  INFO 5284 --- [           main] m.MinihearthstoneApplication             : Started MinihearthstoneApplication in 12.525 seconds (JVM running for 13.336)
2019-07-28 09:31:07.630  INFO 5284 --- [           main] m.MinihearthstoneApplication             : CardRepository :
2019-07-28 09:31:07.630  INFO 5284 --- [           main] m.MinihearthstoneApplication             : -------------------------------------------------
2019-07-28 09:31:07.658  INFO 5284 --- [           main] o.h.h.i.QueryTranslatorFactoryInitiator  : HHH000397: Using ASTQueryTranslatorFactory
2019-07-28 09:31:07.875  INFO 5284 --- [           main] m.MinihearthstoneApplication             : Card[id=5, uniqueId='Sanglier brocheroc1564299067566645189182', name='Sanglier brocheroc', manacost=1, damage=1, lifepoints=1, nature='servant', canAttack=false, currentTargetUniqueId='Sanglier brocheroc1564299067566645189182', effect='null', specificCard='null']
2019-07-28 09:31:07.876  INFO 5284 --- [           main] m.MinihearthstoneApplication             : Card[id=6, uniqueId='Soldat du comtÚ-de-l'or15642990675661738792684', name='Soldat du comtÚ-de-l'or', manacost=1, damage=1, lifepoints=2, nature='servant', canAttack=false, currentTargetUniqueId='Soldat du comtÚ-de-l'or15642990675661738792684', effect='ProvocationEffect', specificCard='null']
2019-07-28 09:31:07.876  INFO 5284 --- [           main] m.MinihearthstoneApplication             : Card[id=7, uniqueId='Chevaucheur de loup15642990675661124209422', name='Chevaucheur de loup', manacost=3, damage=3, lifepoints=1, nature='servant', canAttack=false, currentTargetUniqueId='Chevaucheur de loup15642990675661124209422', effect='ChargeEffect', specificCard='null']
2019-07-28 09:31:07.876  INFO 5284 --- [           main] m.MinihearthstoneApplication             : Card[id=8, uniqueId='Chef de Raid1564299067566515187664', name='Chef de Raid', manacost=3, damage=2, lifepoints=2, nature='servant', canAttack=false, currentTargetUniqueId='Chef de Raid1564299067566515187664', effect='null', specificCard='ChefDeRaid']
2019-07-28 09:31:07.877  INFO 5284 --- [           main] m.MinihearthstoneApplication             : Card[id=9, uniqueId='YÚti noroit1564299067566504732089', name='YÚti noroit', manacost=4, damage=4, lifepoints=5, nature='servant', canAttack=false, currentTargetUniqueId='YÚti noroit1564299067566504732089', effect='null', specificCard='null']
2019-07-28 09:31:07.877  INFO 5284 --- [           main] m.MinihearthstoneApplication             : Card[id=10, uniqueId='Champion frisselame15642990675661738750917', name='Champion frisselame', manacost=4, damage=3, lifepoints=2, nature='servant', canAttack=false, currentTargetUniqueId='Champion frisselame15642990675661738750917', effect='LifeStealEffect', specificCard='null']
2019-07-28 09:31:07.877  INFO 5284 --- [           main] m.MinihearthstoneApplication             : Card[id=11, uniqueId='BÚnÚdiction de puissance1564299067566887421884', name='BÚnÚdiction de puissance', manacost=1, damage=3, lifepoints=0, nature='targetedSpell', canAttack=false, currentTargetUniqueId='BÚnÚdiction de puissance1564299067566887421884', effect='null', specificCard='BenedictionDePuissance']
2019-07-28 09:31:07.877  INFO 5284 --- [           main] m.MinihearthstoneApplication             : Card[id=12, uniqueId='ConsÚcration156429906756657666431', name='ConsÚcration', manacost=4, damage=2, lifepoints=0, nature='spell', canAttack=false, currentTargetUniqueId='ConsÚcration156429906756657666431', effect='null', specificCard='Consecration']
2019-07-28 09:31:07.878  INFO 5284 --- [           main] m.MinihearthstoneApplication             : Card[id=14, uniqueId='Sanglier brocheroc1564299067566823102651', name='Sanglier brocheroc', manacost=1, damage=1, lifepoints=1, nature='servant', canAttack=false, currentTargetUniqueId='Sanglier brocheroc1564299067566823102651', effect='null', specificCard='null']
2019-07-28 09:31:07.878  INFO 5284 --- [           main] m.MinihearthstoneApplication             : Card[id=15, uniqueId='Soldat du comtÚ-de-l'or15642990675661335406171', name='Soldat du comtÚ-de-l'or', manacost=1, damage=1, lifepoints=2, nature='servant', canAttack=false, currentTargetUniqueId='Soldat du comtÚ-de-l'or15642990675661335406171', effect='ProvocationEffect', specificCard='null']
2019-07-28 09:31:07.878  INFO 5284 --- [           main] m.MinihearthstoneApplication             : Card[id=16, uniqueId='Chevaucheur de loup15642990675661555475609', name='Chevaucheur de loup', manacost=3, damage=3, lifepoints=1, nature='servant', canAttack=false, currentTargetUniqueId='Chevaucheur de loup15642990675661555475609', effect='ChargeEffect', specificCard='null']
2019-07-28 09:31:07.878  INFO 5284 --- [           main] m.MinihearthstoneApplication             : Card[id=17, uniqueId='Chef de Raid1564299067566551850296', name='Chef de Raid', manacost=3, damage=2, lifepoints=2, nature='servant', canAttack=false, currentTargetUniqueId='Chef de Raid1564299067566551850296', effect='null', specificCard='ChefDeRaid']
2019-07-28 09:31:07.879  INFO 5284 --- [           main] m.MinihearthstoneApplication             : Card[id=18, uniqueId='YÚti noroit15642990675661836480605', name='YÚti noroit', manacost=4, damage=4, lifepoints=5, nature='servant', canAttack=false, currentTargetUniqueId='YÚti noroit15642990675661836480605', effect='null', specificCard='null']
2019-07-28 09:31:07.879  INFO 5284 --- [           main] m.MinihearthstoneApplication             : Card[id=19, uniqueId='Tourbillon15642990675661728428090', name='Tourbillon', manacost=1, damage=1, lifepoints=0, nature='spell', canAttack=false, currentTargetUniqueId='Tourbillon15642990675661728428090', effect='null', specificCard='Tourbillon']
2019-07-28 09:31:07.879  INFO 5284 --- [           main] m.MinihearthstoneApplication             : Card[id=20, uniqueId='Avocat commis d'office1564299067567235190445', name='Avocat commis d'office', manacost=2, damage=0, lifepoints=7, nature='servant', canAttack=false, currentTargetUniqueId='Avocat commis d'office1564299067567235190445', effect='ProvocationEffect', specificCard='null']
2019-07-28 09:31:07.879  INFO 5284 --- [           main] m.MinihearthstoneApplication             : Card[id=21, uniqueId='Ma¯trise du blocage1564299067567177712051', name='Ma¯trise du blocage', manacost=3, damage=0, lifepoints=0, nature='spell', canAttack=false, currentTargetUniqueId='Ma¯trise du blocage1564299067567177712051', effect='null', specificCard='MaitriseDuBlocage']
2019-07-28 09:31:07.880  INFO 5284 --- [           main] m.MinihearthstoneApplication             : Card[id=23, uniqueId='Sanglier brocheroc15642990675671409403503', name='Sanglier brocheroc', manacost=1, damage=1, lifepoints=1, nature='servant', canAttack=false, currentTargetUniqueId='Sanglier brocheroc15642990675671409403503', effect='null', specificCard='null']
2019-07-28 09:31:07.880  INFO 5284 --- [           main] m.MinihearthstoneApplication             : Card[id=24, uniqueId='Soldat du comtÚ-de-l'or1564299067567519425599', name='Soldat du comtÚ-de-l'or', manacost=1, damage=1, lifepoints=2, nature='servant', canAttack=false, currentTargetUniqueId='Soldat du comtÚ-de-l'or1564299067567519425599', effect='ProvocationEffect', specificCard='null']
2019-07-28 09:31:07.880  INFO 5284 --- [           main] m.MinihearthstoneApplication             : Card[id=25, uniqueId='Chevaucheur de loup1564299067567899656314', name='Chevaucheur de loup', manacost=3, damage=3, lifepoints=1, nature='servant', canAttack=false, currentTargetUniqueId='Chevaucheur de loup1564299067567899656314', effect='ChargeEffect', specificCard='null']
2019-07-28 09:31:07.881  INFO 5284 --- [           main] m.MinihearthstoneApplication             : Card[id=26, uniqueId='Chef de Raid156429906756741645533', name='Chef de Raid', manacost=3, damage=2, lifepoints=2, nature='servant', canAttack=false, currentTargetUniqueId='Chef de Raid156429906756741645533', effect='null', specificCard='ChefDeRaid']
2019-07-28 09:31:07.881  INFO 5284 --- [           main] m.MinihearthstoneApplication             : Card[id=27, uniqueId='YÚti noroit15642990675671486209929', name='YÚti noroit', manacost=4, damage=4, lifepoints=5, nature='servant', canAttack=false, currentTargetUniqueId='YÚti noroit15642990675671486209929', effect='null', specificCard='null']
2019-07-28 09:31:07.881  INFO 5284 --- [           main] m.MinihearthstoneApplication             : Card[id=28, uniqueId='Image mirroir15642990675671749004319', name='Image mirroir', manacost=1, damage=0, lifepoints=2, nature='spell', canAttack=false, currentTargetUniqueId='Image mirroir15642990675671749004319', effect='ProvocationEffect', specificCard='ImageMirroir']
2019-07-28 09:31:07.881  INFO 5284 --- [           main] m.MinihearthstoneApplication             : Card[id=29, uniqueId='Explosion des arcanes1564299067567542221141', name='Explosion des arcanes', manacost=2, damage=1, lifepoints=0, nature='spell', canAttack=false, currentTargetUniqueId='Explosion des arcanes1564299067567542221141', effect='null', specificCard='ExplosionDesArcanes']
2019-07-28 09:31:07.882  INFO 5284 --- [           main] m.MinihearthstoneApplication             : Card[id=30, uniqueId='MÚtamorphose15642990675672036539765', name='MÚtamorphose', manacost=4, damage=0, lifepoints=0, nature='targetedSpell', canAttack=false, currentTargetUniqueId='MÚtamorphose15642990675672036539765', effect='null', specificCard='Metamorphose']
2019-07-28 09:31:07.882  INFO 5284 --- [           main] m.MinihearthstoneApplication             : HeroRepository :
2019-07-28 09:31:07.882  INFO 5284 --- [           main] m.MinihearthstoneApplication             : -------------------------------------------------
2019-07-28 09:31:07.892  INFO 5284 --- [           main] m.MinihearthstoneApplication             : Hero[id=1, uniqueId='Echalwe15642990674601774996876', name='Echalwe', type=paladin, skillType='self', lifepoints=30,defense=0, description=Renfort, invoquant un serviteur 'recrue de la Main d'argent' 1/1., specificHero='Paladin']
2019-07-28 09:31:07.892  INFO 5284 --- [           main] m.MinihearthstoneApplication             : Hero[id=2, uniqueId='Hrothgar15642990674601802627645', name='Hrothgar', type=warrior, skillType='self', lifepoints=30,defense=0, description=Armure, lui confÚrant 2 points d'armure, specificHero='Warrior']
2019-07-28 09:31:07.893  INFO 5284 --- [           main] m.MinihearthstoneApplication             : Hero[id=3, uniqueId='Athelas15642990674601859631581', name='Athelas', type=mage, skillType='targeted', lifepoints=30,defense=0, description=Boule de feu, infligeant un point de dÚgat Ó l'adversaire (serviteur ou hÚros)., specificHero='Mage']
2019-07-28 09:31:07.893  INFO 5284 --- [           main] m.MinihearthstoneApplication             : commonCards :
2019-07-28 09:31:07.893  INFO 5284 --- [           main] m.MinihearthstoneApplication             : -------------------------------------------------
2019-07-28 09:31:07.893  INFO 5284 --- [           main] m.MinihearthstoneApplication             : Card[id=null, uniqueId='Sanglier brocheroc1564299067460198025887', name='Sanglier brocheroc', manacost=1, damage=1, lifepoints=1, nature='servant', canAttack=false, currentTargetUniqueId='Sanglier brocheroc1564299067460198025887', effect='null', specificCard='null']
2019-07-28 09:31:07.893  INFO 5284 --- [           main] m.MinihearthstoneApplication             : Card[id=null, uniqueId='Soldat du comtÚ-de-l'or15642990674601073352578', name='Soldat du comtÚ-de-l'or', manacost=1, damage=1, lifepoints=2, nature='servant', canAttack=false, currentTargetUniqueId='Soldat du comtÚ-de-l'or15642990674601073352578',
effect='ProvocationEffect', specificCard='null']
2019-07-28 09:31:07.893  INFO 5284 --- [           main] m.MinihearthstoneApplication             : Card[id=null, uniqueId='Chevaucheur de loup1564299067460332149761', name='Chevaucheur de loup', manacost=3, damage=3, lifepoints=1, nature='servant', canAttack=false, currentTargetUniqueId='Chevaucheur de loup1564299067460332149761', effect='ChargeEffect', specificCard='null']
2019-07-28 09:31:07.893  INFO 5284 --- [           main] m.MinihearthstoneApplication             : Card[id=null, uniqueId='Chef de Raid1564299067460614979398', name='Chef de Raid', manacost=3, damage=2, lifepoints=2, nature='servant', canAttack=false, currentTargetUniqueId='Chef de Raid1564299067460614979398', effect='null', specificCard='ChefDeRaid']
2019-07-28 09:31:07.894  INFO 5284 --- [           main] m.MinihearthstoneApplication             : Card[id=null, uniqueId='YÚti noroit15642990674601140573820', name='YÚti noroit', manacost=4, damage=4, lifepoints=5, nature='servant', canAttack=false, currentTargetUniqueId='YÚti noroit15642990674601140573820', effect='null', specificCard='null']
2019-07-28 09:31:07.894  INFO 5284 --- [           main] m.MinihearthstoneApplication             : paladinSpecificCards :
2019-07-28 09:31:07.894  INFO 5284 --- [           main] m.MinihearthstoneApplication             : -------------------------------------------------
2019-07-28 09:31:07.894  INFO 5284 --- [           main] m.MinihearthstoneApplication             : Card[id=null, uniqueId='Champion frisselame1564299067460748128577', name='Champion frisselame', manacost=4, damage=3, lifepoints=2, nature='servant', canAttack=false, currentTargetUniqueId='Champion frisselame1564299067460748128577', effect='LifeStealEffect', specificCard='null']
2019-07-28 09:31:07.894  INFO 5284 --- [           main] m.MinihearthstoneApplication             : Card[id=null, uniqueId='BÚnÚdiction de puissance15642990674601579620831',
name='BÚnÚdiction de puissance', manacost=1, damage=3, lifepoints=0, nature='targetedSpell', canAttack=false, currentTargetUniqueId='BÚnÚdiction de puissance15642990674601579620831', effect='null', specificCard='BenedictionDePuissance']
2019-07-28 09:31:07.894  INFO 5284 --- [           main] m.MinihearthstoneApplication             : Card[id=null, uniqueId='ConsÚcration15642990674601141138617', name='ConsÚcration', manacost=4, damage=2, lifepoints=0, nature='spell', canAttack=false, currentTargetUniqueId='ConsÚcration15642990674601141138617', effect='null', specificCard='Consecration']
2019-07-28 09:31:07.894  INFO 5284 --- [           main] m.MinihearthstoneApplication             : DeckRepository :
2019-07-28 09:31:07.894  INFO 5284 --- [           main] m.MinihearthstoneApplication             : -------------------------------------------------
2019-07-28 09:31:07.954  INFO 5284 --- [           main] m.MinihearthstoneApplication             : Deck[id=4, name='Echalwe's card deck', heroId=1, cards{'Sanglier brocheroc Soldat du comtÚ-de-l'or Chevaucheur de loup Chef de Raid YÚti noroit Champion frisselame BÚnÚdiction de puissance ConsÚcration '}]
2019-07-28 09:31:07.954  INFO 5284 --- [           main] m.MinihearthstoneApplication             : Deck[id=13, name='Hrothgar's card deck', heroId=2, cards{'Sanglier brocheroc Soldat du comtÚ-de-l'or Chevaucheur de loup Chef de Raid YÚti noroit Tourbillon Avocat commis d'office Ma¯trise du blocage '}]
2019-07-28 09:31:07.954  INFO 5284 --- [           main] m.MinihearthstoneApplication             : Deck[id=22, name='Athelas's card deck', heroId=3, cards{'Sanglier brocheroc Soldat du comtÚ-de-l'or Chevaucheur de loup Chef de Raid YÚti noroit Image mirroir Explosion des arcanes MÚtamorphose '}]
2019-07-28 09:31:07.954  INFO 5284 --- [           main] m.MinihearthstoneApplication             : -------------------------------------------------
2019-07-28 09:32:01.170  INFO 5284 --- [nio-8090-exec-1] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring DispatcherServlet 'dispatcherServlet'
2019-07-28 09:32:01.170  INFO 5284 --- [nio-8090-exec-1] o.s.web.servlet.DispatcherServlet        : Initializing Servlet 'dispatcherServlet'
2019-07-28 09:32:01.246  INFO 5284 --- [nio-8090-exec-1] o.s.web.servlet.DispatcherServlet        : Completed initialization in 75 ms
2019-07-28 09:32:06.146  INFO 5284 --- [MessageBroker-1] o.s.w.s.c.WebSocketMessageBrokerStats    : WebSocketSession[2 current WS(2)-HttpStream(0)-HttpPoll(0), 2 total, 0 closed abnormally (0 connect failure, 0 send limit, 0 transport error)], stompSubProtocol[processed CONNECT(2)-CONNECTED(2)-DISCONNECT(0)], stompBrokerRelay[null], inboundChannel[pool size = 16, active threads = 0, queued tasks = 0, completed tasks = 60], outboundChannelpool size = 2, active threads = 0, queued tasks = 0, completed tasks = 2], sockJsScheduler[pool size = 7, active threads = 1, queued tasks = 3, completed tasks = 1]
2019-07-28 09:37:34.510  INFO 5284 --- [boundChannel-20] minihearthstone.controller.ClientProxy   : number of players looking for match : 0
2019-07-28 09:37:35.306  INFO 5284 --- [boundChannel-18] minihearthstone.controller.ClientProxy   : number of players looking for match : 1
2019-07-28 09:37:35.306  INFO 5284 --- [boundChannel-18] minihearthstone.controller.ClientProxy   : size: 1
2019-07-28 09:37:35.306  INFO 5284 --- [boundChannel-18] minihearthstone.controller.ClientProxy   : random: 0
ok
2019-07-28 09:37:40.581  INFO 5284 --- [boundChannel-22] minihearthstone.controller.ClientProxy   : New gameboard :[]
2019-07-28 09:37:40.582  INFO 5284 --- [boundChannel-22] minihearthstone.entities.deck.Deck       : Added player
2019-07-28 09:37:40.582  INFO 5284 --- [boundChannel-22] minihearthstone.entities.deck.Deck       : Added hero
2019-07-28 09:37:40.617  INFO 5284 --- [boundChannel-22] minihearthstone.controller.ClientProxy   : Updated gameboard : [Player[id=31, name='titi', clientId='6201564299122801', status='in-lobby', heroId=2, mana=1, stored_mana=1], gb='34']
2019-07-28 09:37:40.617  INFO 5284 --- [boundChannel-22] minihearthstone.controller.ClientProxy   : Updated gameboard : [Hero[id=35, uniqueId='Hrothgar1564299460582864545425', name='Hrothgar', type=warrior, skillType='self', lifepoints=30,defense=0, description=Armure, lui confÚrant 2 points d'armure, specificHero='Warrior']]
2019-07-28 09:37:40.617  INFO 5284 --- [boundChannel-22] minihearthstone.controller.ClientProxy   : Updated gameboard to string : GameBoard[id=34, gameId=33, p1ClientId=6201564299122801, p2ClientId=null, turn=null,
p1HandOfCards='',
 p1CardsOnGround='',
 p2HandOfCards='',
 p2CardsOnGround='']
2019-07-28 09:37:41.219  INFO 5284 --- [boundChannel-30] minihearthstone.controller.ClientProxy   : Already created gameboard
2019-07-28 09:37:41.219  INFO 5284 --- [boundChannel-30] minihearthstone.entities.deck.Deck       : Added player
2019-07-28 09:37:41.219  INFO 5284 --- [boundChannel-30] minihearthstone.entities.deck.Deck       : Added hero
2019-07-28 09:37:41.246  INFO 5284 --- [boundChannel-30] minihearthstone.controller.ClientProxy   : Updated gameboard : [Player[id=31, name='titi', clientId='6201564299122801', status='in-lobby', heroId=2, mana=1, stored_mana=1], gb='34', Player[id=32, name='toto', clientId='3691564299118888', status='in-lobby', heroId=3, mana=1, stored_mana=1],
gb='34']
2019-07-28 09:37:41.246  INFO 5284 --- [boundChannel-30] minihearthstone.controller.ClientProxy   : Updated gameboard : [Hero[id=35, uniqueId='Hrothgar1564299460582864545425', name='Hrothgar', type=warrior, skillType='self', lifepoints=30,defense=0, description=Armure, lui confÚrant 2 points d'armure, specificHero='Warrior'], Hero[id=36, uniqueId='Athelas156429946121941692177', name='Athelas', type=mage, skillType='targeted', lifepoints=30,defense=0, description=Boule de feu, infligeant un point de dÚgat Ó l'adversaire (serviteur ou hÚros)., specificHero='Mage']]
2019-07-28 09:37:41.246  INFO 5284 --- [boundChannel-30] minihearthstone.controller.ClientProxy   : Updated gameboard to string : GameBoard[id=34, gameId=33, p1ClientId=6201564299122801, p2ClientId=3691564299118888, turn=null,
p1HandOfCards='',
 p1CardsOnGround='',
 p2HandOfCards='',
 p2CardsOnGround='']
2019-07-28 09:37:41.251  INFO 5284 --- [boundChannel-22] minihearthstone.controller.ClientProxy   : Received initgame from player: 3691564299118888
2019-07-28 09:37:41.299  INFO 5284 --- [boundChannel-22] minihearthstone.controller.ClientProxy   : Random  :1
2019-07-28 09:37:41.300  INFO 5284 --- [boundChannel-22] minihearthstone.controller.ClientProxy   : The lucky winner is 3691564299118888
2019-07-28 09:37:41.321  INFO 5284 --- [boundChannel-30] minihearthstone.controller.ClientProxy   : Received getfirsthand() from player : 3691564299118888
2019-07-28 09:37:41.321  INFO 5284 --- [boundChannel-30] minihearthstone.controller.ClientProxy   : -------------------------------------------------
2019-07-28 09:37:41.362  INFO 5284 --- [boundChannel-30] minihearthstone.entities.deck.Deck       : Random hand of : 3 cards.
2019-07-28 09:37:41.363  INFO 5284 --- [boundChannel-30] minihearthstone.entities.deck.Deck       : Cards where manacost <= 2 [Card[id=23, uniqueId='Sanglier brocheroc15642990675671409403503', name='Sanglier brocheroc', manacost=1, damage=1, lifepoints=1, nature='servant', canAttack=false, currentTargetUniqueId='Sanglier brocheroc15642990675671409403503', effect='null', specificCard='null'], Card[id=24, uniqueId='Soldat du comtÚ-de-l'or1564299067567519425599', name='Soldat du comtÚ-de-l'or', manacost=1, damage=1, lifepoints=2, nature='servant', canAttack=false, currentTargetUniqueId='Soldat du comtÚ-de-l'or1564299067567519425599', effect='ProvocationEffect', specificCard='null'], Card[id=28, uniqueId='Image mirroir15642990675671749004319', name='Image mirroir', manacost=1, damage=0, lifepoints=2, nature='spell', canAttack=false, currentTargetUniqueId='Image
mirroir15642990675671749004319', effect='ProvocationEffect', specificCard='ImageMirroir'], Card[id=29, uniqueId='Explosion des arcanes1564299067567542221141', name='Explosion des arcanes', manacost=2, damage=1, lifepoints=0, nature='spell', canAttack=false, currentTargetUniqueId='Explosion des arcanes1564299067567542221141', effect='null', specificCard='ExplosionDesArcanes']]
2019-07-28 09:37:41.363  INFO 5284 --- [boundChannel-30] minihearthstone.entities.deck.Deck       : Random pick index: 2
2019-07-28 09:37:41.363  INFO 5284 --- [boundChannel-30] minihearthstone.entities.deck.Deck       : Random pick index: 1
2019-07-28 09:37:41.363  INFO 5284 --- [boundChannel-30] minihearthstone.entities.deck.Deck       : Random pick index: 3
2019-07-28 09:37:41.364  INFO 5284 --- [boundChannel-30] minihearthstone.controller.ClientProxy   : Gameboard before hand of cards added : GameBoard[id=34, gameId=33, p1ClientId=6201564299122801, p2ClientId=3691564299118888, turn=3691564299118888,
p1HandOfCards='',
 p1CardsOnGround='',
 p2HandOfCards='',
 p2CardsOnGround='']

2019-07-28 09:37:41.364  INFO 5284 --- [boundChannel-30] minihearthstone.controller.ClientProxy   : P2 client id : 3691564299118888
2019-07-28 09:37:41.365  INFO 5284 --- [boundChannel-30] minihearthstone.controller.ClientProxy   : Number of cards in P2 hand : 3
2019-07-28 09:37:41.388  INFO 5284 --- [boundChannel-30] minihearthstone.controller.ClientProxy   : Hand of cards saved in gameboard : [Card[id=null, uniqueId='Image mirroir1564299461363604066985', name='Image mirroir', manacost=1, damage=0, lifepoints=2, nature='spell', canAttack=false, currentTargetUniqueId='Image mirroir1564299461363604066985', effect='ProvocationEffect', specificCard='ImageMirroir'], Card[id=null, uniqueId='Soldat du comtÚ-de-l'or15642994613631924561941', name='Soldat du comtÚ-de-l'or', manacost=1, damage=1, lifepoints=2, nature='servant', canAttack=false, currentTargetUniqueId='Soldat du comtÚ-de-l'or15642994613631924561941', effect='ProvocationEffect', specificCard='null'], Card[id=null, uniqueId='Chef de Raid15642994613631422519964', name='Chef de Raid', manacost=3, damage=2, lifepoints=2, nature='servant', canAttack=false, currentTargetUniqueId='Chef de Raid15642994613631422519964', effect='null', specificCard='ChefDeRaid']]
2019-07-28 09:37:41.407  INFO 5284 --- [boundChannel-30] minihearthstone.controller.ClientProxy   : Gameboard after hand of cards added : GameBoard[id=34, gameId=33, p1ClientId=6201564299122801, p2ClientId=3691564299118888, turn=3691564299118888,
p1HandOfCards='',
 p1CardsOnGround='',
 p2HandOfCards='Image mirroir1564299461363604066985; Soldat du comtÚ-de-l'or15642994613631924561941; Chef de Raid15642994613631422519964; ',
 p2CardsOnGround='']

2019-07-28 09:37:41.790  INFO 5284 --- [boundChannel-31] minihearthstone.controller.ClientProxy   : Received initgame from player: 6201564299122801
2019-07-28 09:37:41.823  INFO 5284 --- [boundChannel-22] minihearthstone.controller.ClientProxy   : Received getfirsthand() from player : 6201564299122801
2019-07-28 09:37:41.823  INFO 5284 --- [boundChannel-22] minihearthstone.controller.ClientProxy   : -------------------------------------------------
2019-07-28 09:37:41.841  INFO 5284 --- [boundChannel-22] minihearthstone.entities.deck.Deck       : Random hand of : 3 cards.
2019-07-28 09:37:41.841  INFO 5284 --- [boundChannel-22] minihearthstone.entities.deck.Deck       : Cards where manacost <= 2 [Card[id=14, uniqueId='Sanglier brocheroc1564299067566823102651', name='Sanglier brocheroc', manacost=1, damage=1, lifepoints=1, nature='servant', canAttack=false, currentTargetUniqueId='Sanglier brocheroc1564299067566823102651', effect='null', specificCard='null'], Card[id=15, uniqueId='Soldat du comtÚ-de-l'or15642990675661335406171', name='Soldat du comtÚ-de-l'or', manacost=1, damage=1, lifepoints=2, nature='servant', canAttack=false, currentTargetUniqueId='Soldat du comtÚ-de-l'or15642990675661335406171', effect='ProvocationEffect', specificCard='null'], Card[id=19, uniqueId='Tourbillon15642990675661728428090', name='Tourbillon', manacost=1, damage=1, lifepoints=0, nature='spell', canAttack=false, currentTargetUniqueId='Tourbillon15642990675661728428090', effect='null', specificCard='Tourbillon'], Card[id=20, uniqueId='Avocat commis d'office1564299067567235190445', name='Avocat commis d'office', manacost=2, damage=0, lifepoints=7, nature='servant', canAttack=false, currentTargetUniqueId='Avocat commis d'office1564299067567235190445', effect='ProvocationEffect', specificCard='null']]
2019-07-28 09:37:41.841  INFO 5284 --- [boundChannel-22] minihearthstone.entities.deck.Deck       : Random pick index: 2
2019-07-28 09:37:41.841  INFO 5284 --- [boundChannel-22] minihearthstone.entities.deck.Deck       : Random pick index: 1
2019-07-28 09:37:41.841  INFO 5284 --- [boundChannel-22] minihearthstone.entities.deck.Deck       : Random pick index: 5
2019-07-28 09:37:41.841  INFO 5284 --- [boundChannel-22] minihearthstone.controller.ClientProxy   : Gameboard before hand of cards added : GameBoard[id=34, gameId=33, p1ClientId=6201564299122801, p2ClientId=3691564299118888, turn=3691564299118888,
p1HandOfCards='',
 p1CardsOnGround='',
 p2HandOfCards='Image mirroir1564299461363604066985; Soldat du comtÚ-de-l'or15642994613631924561941; Chef de Raid15642994613631422519964; ',
 p2CardsOnGround='']

2019-07-28 09:37:41.841  INFO 5284 --- [boundChannel-22] minihearthstone.controller.ClientProxy   : P1 client id : 6201564299122801
2019-07-28 09:37:41.842  INFO 5284 --- [boundChannel-22] minihearthstone.controller.ClientProxy   : Number of cards in P1 hand : 3
2019-07-28 09:37:41.870  INFO 5284 --- [boundChannel-22] minihearthstone.controller.ClientProxy   : Hand of cards saved in gameboard : [Card[id=null, uniqueId='Tourbillon1564299461841242119275', name='Tourbillon', manacost=1, damage=1, lifepoints=0, nature='spell', canAttack=false, currentTargetUniqueId='Tourbillon1564299461841242119275', effect='null', specificCard='Tourbillon'], Card[id=null, uniqueId='Soldat du comtÚ-de-l'or1564299461841573886338', name='Soldat du comtÚ-de-l'or', manacost=1, damage=1, lifepoints=2, nature='servant', canAttack=false, currentTargetUniqueId='Soldat du comtÚ-de-l'or1564299461841573886338', effect='ProvocationEffect', specificCard='null'], Card[id=null, uniqueId='Tourbillon1564299461841447329853', name='Tourbillon', manacost=1, damage=1, lifepoints=0, nature='spell', canAttack=false, currentTargetUniqueId='Tourbillon1564299461841447329853', effect='null', specificCard='Tourbillon']]
2019-07-28 09:37:41.910  INFO 5284 --- [boundChannel-22] minihearthstone.controller.ClientProxy   : Gameboard after hand of cards added : GameBoard[id=34, gameId=33, p1ClientId=6201564299122801, p2ClientId=3691564299118888, turn=3691564299118888,
p1HandOfCards='Tourbillon1564299461841242119275; Soldat du comtÚ-de-l'or1564299461841573886338; Tourbillon1564299461841447329853; ',
 p1CardsOnGround='',
 p2HandOfCards='Image mirroir1564299461363604066985; Soldat du comtÚ-de-l'or15642994613631924561941; Chef de Raid15642994613631422519964; ',
 p2CardsOnGround='']

2019-07-28 09:37:44.941  INFO 5284 --- [boundChannel-17] minihearthstone.controller.ClientProxy   : Logging out player : toto
2019-07-28 09:37:45.035  INFO 5284 --- [boundChannel-17] minihearthstone.controller.ClientProxy   : Remaining players : [Player[id=43, name='titi', clientId='6201564299122801', status='available', heroId=null, mana=1, stored_mana=1], gb='']
2019-07-28 09:37:45.039  INFO 5284 --- [boundChannel-17] minihearthstone.controller.ClientProxy   : Remaining matches : []
2019-07-28 09:37:45.043  INFO 5284 --- [boundChannel-17] minihearthstone.controller.ClientProxy   : Remaining games : []
2019-07-28 09:37:52.672  INFO 5284 --- [boundChannel-19] minihearthstone.controller.ClientProxy   : number of players looking for match : 0
2019-07-28 09:37:53.426  INFO 5284 --- [boundChannel-29] minihearthstone.controller.ClientProxy   : number of players looking for match : 1
2019-07-28 09:37:53.426  INFO 5284 --- [boundChannel-29] minihearthstone.controller.ClientProxy   : size: 1
2019-07-28 09:37:53.426  INFO 5284 --- [boundChannel-29] minihearthstone.controller.ClientProxy   : random: 0
ok
2019-07-28 09:38:57.004  INFO 5284 --- [boundChannel-36] minihearthstone.controller.ClientProxy   : New gameboard :[]
2019-07-28 09:38:57.005  INFO 5284 --- [boundChannel-36] minihearthstone.entities.deck.Deck       : Added player
2019-07-28 09:38:57.005  INFO 5284 --- [boundChannel-36] minihearthstone.entities.deck.Deck       : Added hero
2019-07-28 09:38:57.014  INFO 5284 --- [boundChannel-36] minihearthstone.controller.ClientProxy   : Updated gameboard : [Player[id=43, name='titi', clientId='6201564299122801', status='in-lobby', heroId=3, mana=1, stored_mana=1], gb='46']
2019-07-28 09:38:57.014  INFO 5284 --- [boundChannel-36] minihearthstone.controller.ClientProxy   : Updated gameboard : [Hero[id=47, uniqueId='Athelas1564299537005858690643', name='Athelas', type=mage, skillType='targeted', lifepoints=30,defense=0, description=Boule de feu, infligeant un point de dÚgat Ó l'adversaire (serviteur ou hÚros)., specificHero='Mage']]
2019-07-28 09:38:57.014  INFO 5284 --- [boundChannel-36] minihearthstone.controller.ClientProxy   : Updated gameboard to string : GameBoard[id=46, gameId=45, p1ClientId=6201564299122801, p2ClientId=null, turn=null,
p1HandOfCards='',
 p1CardsOnGround='',
 p2HandOfCards='',
 p2CardsOnGround='']
2019-07-28 09:38:57.873  INFO 5284 --- [boundChannel-34] minihearthstone.controller.ClientProxy   : Already created gameboard
2019-07-28 09:38:57.873  INFO 5284 --- [boundChannel-34] minihearthstone.entities.deck.Deck       : Added player
2019-07-28 09:38:57.873  INFO 5284 --- [boundChannel-34] minihearthstone.entities.deck.Deck       : Added hero
2019-07-28 09:38:57.889  INFO 5284 --- [boundChannel-34] minihearthstone.controller.ClientProxy   : Updated gameboard : [Player[id=43, name='titi', clientId='6201564299122801', status='in-lobby', heroId=3, mana=1, stored_mana=1], gb='46', Player[id=44, name='tutu', clientId='21564299466835', status='in-lobby', heroId=2, mana=1, stored_mana=1], gb='46']
2019-07-28 09:38:57.889  INFO 5284 --- [boundChannel-34] minihearthstone.controller.ClientProxy   : Updated gameboard : [Hero[id=47, uniqueId='Athelas1564299537005858690643', name='Athelas', type=mage, skillType='targeted', lifepoints=30,defense=0, description=Boule de feu, infligeant un point de dÚgat Ó l'adversaire (serviteur ou hÚros)., specificHero='Mage'], Hero[id=48, uniqueId='Hrothgar15642995378732052209690', name='Hrothgar', type=warrior, skillType='self', lifepoints=30,defense=0, description=Armure, lui confÚrant 2 points d'armure, specificHero='Warrior']]
2019-07-28 09:38:57.889  INFO 5284 --- [boundChannel-34] minihearthstone.controller.ClientProxy   : Updated gameboard to string : GameBoard[id=46, gameId=45, p1ClientId=6201564299122801, p2ClientId=21564299466835, turn=null,
p1HandOfCards='',
 p1CardsOnGround='',
 p2HandOfCards='',
 p2CardsOnGround='']
2019-07-28 09:38:57.897  INFO 5284 --- [boundChannel-33] minihearthstone.controller.ClientProxy   : Received initgame from player: 21564299466835
2019-07-28 09:38:57.912  INFO 5284 --- [boundChannel-33] minihearthstone.controller.ClientProxy   : Random  :1
2019-07-28 09:38:57.913  INFO 5284 --- [boundChannel-33] minihearthstone.controller.ClientProxy   : The lucky winner is 21564299466835
2019-07-28 09:38:57.926  INFO 5284 --- [boundChannel-34] minihearthstone.controller.ClientProxy   : Received getfirsthand() from player : 21564299466835
2019-07-28 09:38:57.926  INFO 5284 --- [boundChannel-34] minihearthstone.controller.ClientProxy   : -------------------------------------------------
2019-07-28 09:38:57.948  INFO 5284 --- [boundChannel-34] minihearthstone.entities.deck.Deck       : Random hand of : 3 cards.
2019-07-28 09:38:57.949  INFO 5284 --- [boundChannel-34] minihearthstone.entities.deck.Deck       : Cards where manacost <= 2 [Card[id=14, uniqueId='Sanglier brocheroc1564299067566823102651', name='Sanglier brocheroc', manacost=1, damage=1, lifepoints=1, nature='servant', canAttack=false, currentTargetUniqueId='Sanglier brocheroc1564299067566823102651', effect='null', specificCard='null'], Card[id=15, uniqueId='Soldat du comtÚ-de-l'or15642990675661335406171', name='Soldat du comtÚ-de-l'or', manacost=1, damage=1, lifepoints=2, nature='servant', canAttack=false, currentTargetUniqueId='Soldat du comtÚ-de-l'or15642990675661335406171', effect='ProvocationEffect', specificCard='null'], Card[id=19, uniqueId='Tourbillon15642990675661728428090', name='Tourbillon', manacost=1, damage=1, lifepoints=0, nature='spell', canAttack=false, currentTargetUniqueId='Tourbillon15642990675661728428090', effect='null', specificCard='Tourbillon'], Card[id=20, uniqueId='Avocat commis d'office1564299067567235190445', name='Avocat commis d'office', manacost=2, damage=0, lifepoints=7, nature='servant', canAttack=false, currentTargetUniqueId='Avocat commis d'office1564299067567235190445', effect='ProvocationEffect', specificCard='null']]
2019-07-28 09:38:57.950  INFO 5284 --- [boundChannel-34] minihearthstone.entities.deck.Deck       : Random pick index: 2
2019-07-28 09:38:57.950  INFO 5284 --- [boundChannel-34] minihearthstone.entities.deck.Deck       : Random pick index: 1
2019-07-28 09:38:57.950  INFO 5284 --- [boundChannel-34] minihearthstone.entities.deck.Deck       : Random pick index: 2
2019-07-28 09:38:57.950  INFO 5284 --- [boundChannel-34] minihearthstone.controller.ClientProxy   : Gameboard before hand of cards added : GameBoard[id=46, gameId=45, p1ClientId=6201564299122801, p2ClientId=21564299466835, turn=21564299466835,
p1HandOfCards='',
 p1CardsOnGround='',
 p2HandOfCards='',
 p2CardsOnGround='']

2019-07-28 09:38:57.950  INFO 5284 --- [boundChannel-34] minihearthstone.controller.ClientProxy   : P2 client id : 21564299466835
2019-07-28 09:38:57.950  INFO 5284 --- [boundChannel-34] minihearthstone.controller.ClientProxy   : Number of cards in P2 hand : 3
2019-07-28 09:38:57.960  INFO 5284 --- [boundChannel-34] minihearthstone.controller.ClientProxy   : Hand of cards saved in gameboard : [Card[id=null, uniqueId='Tourbillon156429953795030288936', name='Tourbillon', manacost=1, damage=1, lifepoints=0, nature='spell', canAttack=false, currentTargetUniqueId='Tourbillon156429953795030288936', effect='null', specificCard='Tourbillon'], Card[id=null, uniqueId='Soldat du comtÚ-de-l'or1564299537950744223879', name='Soldat du comtÚ-de-l'or', manacost=1, damage=1, lifepoints=2,
nature='servant', canAttack=false, currentTargetUniqueId='Soldat du comtÚ-de-l'or1564299537950744223879', effect='ProvocationEffect', specificCard='null'], Card[id=null, uniqueId='Chevaucheur de loup15642995379501590367542', name='Chevaucheur de loup', manacost=3, damage=3, lifepoints=1, nature='servant', canAttack=false, currentTargetUniqueId='Chevaucheur de loup15642995379501590367542', effect='ChargeEffect', specificCard='null']]
2019-07-28 09:38:57.981  INFO 5284 --- [boundChannel-34] minihearthstone.controller.ClientProxy   : Gameboard after hand of cards added : GameBoard[id=46, gameId=45, p1ClientId=6201564299122801, p2ClientId=21564299466835, turn=21564299466835,
p1HandOfCards='',
 p1CardsOnGround='',
 p2HandOfCards='Tourbillon156429953795030288936; Soldat du comtÚ-de-l'or1564299537950744223879; Chevaucheur de loup15642995379501590367542; ',
 p2CardsOnGround='']

2019-07-28 09:38:58.427  INFO 5284 --- [boundChannel-48] minihearthstone.controller.ClientProxy   : Received initgame from player: 6201564299122801
2019-07-28 09:38:58.438  INFO 5284 --- [boundChannel-33] minihearthstone.controller.ClientProxy   : Received getfirsthand() from player : 6201564299122801
2019-07-28 09:38:58.438  INFO 5284 --- [boundChannel-33] minihearthstone.controller.ClientProxy   : -------------------------------------------------
2019-07-28 09:38:58.439  INFO 5284 --- [boundChannel-34] minihearthstone.controller.ClientProxy   : Received getfirsthand() from player : 6201564299122801
2019-07-28 09:38:58.439  INFO 5284 --- [boundChannel-34] minihearthstone.controller.ClientProxy   : -------------------------------------------------
2019-07-28 09:38:58.461  INFO 5284 --- [boundChannel-33] minihearthstone.entities.deck.Deck       : Random hand of : 3 cards.
2019-07-28 09:38:58.461  INFO 5284 --- [boundChannel-34] minihearthstone.entities.deck.Deck       : Random hand of : 3 cards.
2019-07-28 09:38:58.461  INFO 5284 --- [boundChannel-33] minihearthstone.entities.deck.Deck       : Cards where manacost <= 2 [Card[id=23, uniqueId='Sanglier brocheroc15642990675671409403503', name='Sanglier brocheroc', manacost=1, damage=1, lifepoints=1, nature='servant', canAttack=false, currentTargetUniqueId='Sanglier brocheroc15642990675671409403503', effect='null', specificCard='null'], Card[id=24, uniqueId='Soldat du comtÚ-de-l'or1564299067567519425599', name='Soldat du comtÚ-de-l'or', manacost=1, damage=1, lifepoints=2, nature='servant', canAttack=false, currentTargetUniqueId='Soldat du comtÚ-de-l'or1564299067567519425599', effect='ProvocationEffect', specificCard='null'], Card[id=28, uniqueId='Image mirroir15642990675671749004319', name='Image mirroir', manacost=1, damage=0, lifepoints=2, nature='spell', canAttack=false, currentTargetUniqueId='Image
mirroir15642990675671749004319', effect='ProvocationEffect', specificCard='ImageMirroir'], Card[id=29, uniqueId='Explosion des arcanes1564299067567542221141', name='Explosion des arcanes', manacost=2, damage=1, lifepoints=0, nature='spell', canAttack=false, currentTargetUniqueId='Explosion des arcanes1564299067567542221141', effect='null', specificCard='ExplosionDesArcanes']]
2019-07-28 09:38:58.461  INFO 5284 --- [boundChannel-34] minihearthstone.entities.deck.Deck       : Cards where manacost <= 2 [Card[id=23, uniqueId='Sanglier brocheroc15642990675671409403503', name='Sanglier brocheroc', manacost=1, damage=1, lifepoints=1, nature='servant', canAttack=false, currentTargetUniqueId='Sanglier brocheroc15642990675671409403503', effect='null', specificCard='null'], Card[id=24, uniqueId='Soldat du comtÚ-de-l'or1564299067567519425599', name='Soldat du comtÚ-de-l'or', manacost=1, damage=1, lifepoints=2, nature='servant', canAttack=false, currentTargetUniqueId='Soldat du comtÚ-de-l'or1564299067567519425599', effect='ProvocationEffect', specificCard='null'], Card[id=28, uniqueId='Image mirroir15642990675671749004319', name='Image mirroir', manacost=1, damage=0, lifepoints=2, nature='spell', canAttack=false, currentTargetUniqueId='Image
mirroir15642990675671749004319', effect='ProvocationEffect', specificCard='ImageMirroir'], Card[id=29, uniqueId='Explosion des arcanes1564299067567542221141', name='Explosion des arcanes', manacost=2, damage=1, lifepoints=0, nature='spell', canAttack=false, currentTargetUniqueId='Explosion des arcanes1564299067567542221141', effect='null', specificCard='ExplosionDesArcanes']]
2019-07-28 09:38:58.461  INFO 5284 --- [boundChannel-33] minihearthstone.entities.deck.Deck       : Random pick index: 2
2019-07-28 09:38:58.461  INFO 5284 --- [boundChannel-34] minihearthstone.entities.deck.Deck       : Random pick index: 1
2019-07-28 09:38:58.462  INFO 5284 --- [boundChannel-34] minihearthstone.entities.deck.Deck       : Random pick index: 2
2019-07-28 09:38:58.462  INFO 5284 --- [boundChannel-33] minihearthstone.entities.deck.Deck       : Random pick index: 1
2019-07-28 09:38:58.462  INFO 5284 --- [boundChannel-34] minihearthstone.entities.deck.Deck       : Random pick index: 5
2019-07-28 09:38:58.462  INFO 5284 --- [boundChannel-33] minihearthstone.entities.deck.Deck       : Random pick index: 4
2019-07-28 09:38:58.462  INFO 5284 --- [boundChannel-34] minihearthstone.controller.ClientProxy   : Gameboard before hand of cards added : GameBoard[id=46, gameId=45, p1ClientId=6201564299122801, p2ClientId=21564299466835, turn=21564299466835,
p1HandOfCards='',
 p1CardsOnGround='',
 p2HandOfCards='Tourbillon156429953795030288936; Soldat du comtÚ-de-l'or1564299537950744223879; Chevaucheur de loup15642995379501590367542; ',
 p2CardsOnGround='']

2019-07-28 09:38:58.462  INFO 5284 --- [boundChannel-33] minihearthstone.controller.ClientProxy   : Gameboard before hand of cards added : GameBoard[id=46, gameId=45, p1ClientId=6201564299122801, p2ClientId=21564299466835, turn=21564299466835,
p1HandOfCards='',
 p1CardsOnGround='',
 p2HandOfCards='Tourbillon156429953795030288936; Soldat du comtÚ-de-l'or1564299537950744223879; Chevaucheur de loup15642995379501590367542; ',
 p2CardsOnGround='']

2019-07-28 09:38:58.462  INFO 5284 --- [boundChannel-34] minihearthstone.controller.ClientProxy   : P1 client id : 6201564299122801
2019-07-28 09:38:58.462  INFO 5284 --- [boundChannel-33] minihearthstone.controller.ClientProxy   : P1 client id : 6201564299122801
2019-07-28 09:38:58.462  INFO 5284 --- [boundChannel-33] minihearthstone.controller.ClientProxy   : Number of cards in P1 hand : 3
2019-07-28 09:38:58.462  INFO 5284 --- [boundChannel-34] minihearthstone.controller.ClientProxy   : Number of cards in P1 hand : 3
2019-07-28 09:38:58.490  INFO 5284 --- [boundChannel-33] minihearthstone.controller.ClientProxy   : Hand of cards saved in gameboard : [Card[id=null, uniqueId='Image mirroir15642995384611116131198', name='Image mirroir', manacost=1, damage=0, lifepoints=2, nature='spell', canAttack=false, currentTargetUniqueId='Image mirroir15642995384611116131198', effect='ProvocationEffect', specificCard='ImageMirroir'], Card[id=null, uniqueId='Soldat du comtÚ-de-l'or1564299538462603629837', name='Soldat du comtÚ-de-l'or', manacost=1, damage=1, lifepoints=2, nature='servant', canAttack=false, currentTargetUniqueId='Soldat du comtÚ-de-l'or1564299538462603629837', effect='ProvocationEffect', specificCard='null'], Card[id=null, uniqueId='YÚti noroit1564299538462132876846', name='YÚti noroit', manacost=4, damage=4, lifepoints=5, nature='servant', canAttack=false, currentTargetUniqueId='YÚti noroit1564299538462132876846', effect='null', specificCard='null']]
2019-07-28 09:38:58.500  INFO 5284 --- [boundChannel-34] minihearthstone.controller.ClientProxy   : Hand of cards saved in gameboard : [Card[id=null, uniqueId='Soldat du comtÚ-de-l'or156429953846192214424', name='Soldat du comtÚ-de-l'or', manacost=1, damage=1, lifepoints=2, nature='servant', canAttack=false, currentTargetUniqueId='Soldat du comtÚ-de-l'or156429953846192214424', effect='ProvocationEffect', specificCard='null'], Card[id=null, uniqueId='Image mirroir15642995384621474095757', name='Image mirroir', manacost=1, damage=0, lifepoints=2, nature='spell', canAttack=false, currentTargetUniqueId='Image mirroir15642995384621474095757', effect='ProvocationEffect', specificCard='ImageMirroir'], Card[id=null, uniqueId='Image mirroir15642995384621284766774', name='Image mirroir', manacost=1, damage=0, lifepoints=2, nature='spell', canAttack=false, currentTargetUniqueId='Image mirroir15642995384621284766774', effect='ProvocationEffect', specificCard='ImageMirroir']]
2019-07-28 09:38:58.506  INFO 5284 --- [boundChannel-33] minihearthstone.controller.ClientProxy   : Gameboard after hand of cards added : GameBoard[id=46, gameId=45, p1ClientId=6201564299122801, p2ClientId=21564299466835, turn=21564299466835,
p1HandOfCards='Soldat du comtÚ-de-l'or156429953846192214424; Image mirroir15642995384621474095757; Image mirroir15642995384611116131198; Soldat du comtÚ-de-l'or1564299538462603629837; YÚti noroit1564299538462132876846; Image mirroir15642995384621284766774; ',
 p1CardsOnGround='',
 p2HandOfCards='Tourbillon156429953795030288936; Soldat du comtÚ-de-l'or1564299537950744223879; Chevaucheur de loup15642995379501590367542; ',
 p2CardsOnGround='']

2019-07-28 09:38:58.517  INFO 5284 --- [boundChannel-34] minihearthstone.controller.ClientProxy   : Gameboard after hand of cards added : GameBoard[id=46, gameId=45, p1ClientId=6201564299122801, p2ClientId=21564299466835, turn=21564299466835,
p1HandOfCards='Soldat du comtÚ-de-l'or156429953846192214424; Image mirroir15642995384621474095757; Image mirroir15642995384611116131198; Soldat du comtÚ-de-l'or1564299538462603629837; YÚti noroit1564299538462132876846; Image mirroir15642995384621284766774; ',
 p1CardsOnGround='',
 p2HandOfCards='Tourbillon156429953795030288936; Soldat du comtÚ-de-l'or1564299537950744223879; Chevaucheur de loup15642995379501590367542; ',
 p2CardsOnGround='']


 ## Case 3 

 Windows PowerShell
Copyright (C) Microsoft Corporation. Tous droits réservés.

PS G:\Github\minihearthstone> cd code/server
PS G:\Github\minihearthstone\code\server> gradle bootRun
Starting a Gradle Daemon, 1 incompatible and 1 stopped Daemons could not be reused, use --status for details

> Task :bootRun
11:56:53.224 [main] INFO minihearthstone.MinihearthstoneApplication - version: 5.1.3.RELEASE

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::        (v2.1.1.RELEASE)

2019-07-28 11:56:54.108  INFO 12468 --- [           main] m.MinihearthstoneApplication             : Starting MinihearthstoneApplication on PC-Roxane with PID 12468 (G:\Github\minihearthstone\code\server\build\classes\java\main started by RoxaneKang in G:\Github\minihearthstone\code\server)
2019-07-28 11:56:54.111  INFO 12468 --- [           main] m.MinihearthstoneApplication             : No active profile set, falling back to default profiles: default
2019-07-28 11:56:55.693  INFO 12468 --- [           main] .s.d.r.c.RepositoryConfigurationDelegate : Bootstrapping Spring Data repositories in DEFAULT mode.
2019-07-28 11:56:55.852  INFO 12468 --- [           main] .s.d.r.c.RepositoryConfigurationDelegate : Finished Spring Data repository scanning in 145ms. Found 6 repository interfaces.
2019-07-28 11:56:56.742  INFO 12468 --- [           main] trationDelegate$BeanPostProcessorChecker : Bean 'org.springframework.transaction.annotation.ProxyTransactionManagementConfiguration' of type [org.springframework.transaction.annotation.ProxyTransactionManagementConfiguration$$EnhancerBySpringCGLIB$$2f7b86ba] is not eligible for getting processed by all BeanPostProcessors (for example: not eligible for auto-proxying)
2019-07-28 11:56:56.779  INFO 12468 --- [           main] trationDelegate$BeanPostProcessorChecker : Bean 'org.springframework.hateoas.config.HateoasConfiguration' of type [org.springframework.hateoas.config.HateoasConfiguration$$EnhancerBySpringCGLIB$$aefbd3ec] is not eligible for getting processed by all BeanPostProcessors (for example: not eligible for auto-proxying)
2019-07-28 11:56:57.591  INFO 12468 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port(s): 8090 (http)
2019-07-28 11:56:57.641  INFO 12468 --- [           main] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
2019-07-28 11:56:57.641  INFO 12468 --- [           main] org.apache.catalina.core.StandardEngine  : Starting Servlet Engine: Apache Tomcat/9.0.13
2019-07-28 11:56:57.662  INFO 12468 --- [           main] o.a.catalina.core.AprLifecycleListener   : The APR based Apache Tomcat Native library which allows optimal performance in production environments was not found on the java.library.path: [C:\Program Files\Java\jdk1.8.0_60\bin;C:\WINDOWS\Sun\Java\bin;C:\WINDOWS\system32;C:\WINDOWS;C:\Program Files (x86)\Python37-32\Scripts\;C:\Program Files (x86)\Python37-32\;C:\oraclexe\app\oracle\product\11.2.0\server\bin;C:\ProgramData\Oracle\Java\javapath;C:\Python34\;C:\Python34\Scripts;C:\WINDOWS\system32;C:\WINDOWS;C:\WINDOWS\System32\Wbem;C:\WINDOWS\System32\WindowsPowerShell\v1.0\;C:\Program Files\Common Files\Apple\Mobile Device Support\;C:\Program Files (x86)\Common Files\Apple\Apple Application Support;D:\Softwares\Git\Git\cmd;C:\WINDOWS\system32;C:\WINDOWS;C:\WINDOWS\System32\Wbem;C:\WINDOWS\System32\WindowsPowerShell\v1.0\;D:\Softwares\Gow\bin;D:\Softwares\Xampp\Xampp\mysql\bin;C:\Program Files (x86)\Skype\Phone\;C:\Program Files (x86)\QuickTime\QTSystem\;C:\Program Files\Java\jdk1.8.0_60\bin;D:\Softwares\Android\android-sdk\tools;D:\Softwares\Android\android-sdk\tools\bin\;D:\Softwares\Android\android-sdk\platform-tools;C:\Program Files (x86)\apache-maven-3.5.2\bin;C:\CamlLight\bin;C:\Program Files (x86)\instantclient_12_2;C:\Program Files (x86)\instantclient-sqlplus-windows.x64-12.2.0.1.0\instantclient_12_2;C:\Users\RoxaneKang\AppData\Local\Julia-0.6.2\bin;C:\Program Files (x86)\Common Files\Acronis\VirtualFile\;C:\Program Files (x86)\Common Files\Acronis\VirtualFile64\;C:\Program Files (x86)\Common Files\Acronis\SnapAPI\;C:\WINDOWS\System32\OpenSSH\;C:\Program Files (x86)\Gpg4win\..\GnuPG\bin;C:\Program Files\gs\gs9.23\bin;C:\xampp\php;C:\ProgramData\ComposerSetup\bin;C:\Program Files (x86)\Brackets\command;D:\Softwares\Sparql\apache-jena-3.9.0\bat;C:\Users\RoxaneKang\AppData\Roaming\nvm;C:\Program Files\nodejs;D:\Softwares\tarql-1.1\bin;C:\Program Files\wkhtmltopdf\bin;G:\Github\markdown-to-pdf;D:\Softwares\Gradle\gradle-4.10.2-all\gradle-4.10.2\bin;G:\Development\WebApps\tomcat\bin;C:\Program Files\doxygen\bin;C:\Program Files (x86)\IVI Foundation\VISA\WinNT\Bin;C:\Users\RoxaneKang\AppData\Roaming\Python\Python37\Scripts;C:\Program Files\MiKTeX 2.9\miktex\bin\x64\;C:\Program Files (x86)\GnuWin32\bin;C:\Program Files (x86)\Graphviz2.38\bin\dot.exe;C:\ProgramData\chocolatey\bin;C:\Users\RoxaneKang\Anaconda3;C:\Users\RoxaneKang\Anaconda3\Library\mingw-w64\bin;C:\Users\RoxaneKang\Anaconda3\Library\usr\bin;C:\Users\RoxaneKang\Anaconda3\Library\bin;C:\Users\RoxaneKang\Anaconda3\Scripts;C:\Users\RoxaneKang\AppData\Local\Microsoft\WindowsApps;C:\Users\RoxaneKang\AppData\Local\atom\bin;C:\Users\RoxaneKang\AppData\Roaming\npm;C:\CamlLight\bin;C:\Users\RoxaneKang\AppData\Local\Microsoft\WindowsApps;C:\Program Files\gs\gs9.23\bin;C:\Users\RoxaneKang\AppData\Roaming\Composer\vendor\bin;C:\Users\RoxaneKang\AppData\Roaming\nvm;C:\Program Files\nodejs;C:\Users\RoxaneKang\AppData\Local\Pandoc\;D:\Softwares\VisualStudioCode\Microsoft VS Code\bin;C:\Users\RoxaneKang\AppData\Local\GitHubDesktop\bin;C:\Users\RoxaneKang\AppData\Local\Programs\EmEditor;C:\Users\RoxaneKang\AppData\Roaming\Python\Python37\Scripts;C:\Users\RoxaneKang\AppData\Local\Programs\MiKTeX 2.9\miktex\bin\x64\;C:\Program Files (x86)\Graphviz2.38\bin\;C:\Users\RoxaneKang\AppData\Local\Google\Cloud SDK\google-cloud-sdk\bin;;.]
2019-07-28 11:56:58.169  INFO 12468 --- [           main] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
2019-07-28 11:56:58.169  INFO 12468 --- [           main] o.s.web.context.ContextLoader            : Root WebApplicationContext: initialization completed in 3982 ms
2019-07-28 11:56:58.758  INFO 12468 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Starting...
2019-07-28 11:56:59.126  INFO 12468 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Start completed.
2019-07-28 11:56:59.367  INFO 12468 --- [           main] o.hibernate.jpa.internal.util.LogHelper  : HHH000204: Processing PersistenceUnitInfo [
        name: default
        ...]
2019-07-28 11:56:59.563  INFO 12468 --- [           main] org.hibernate.Version                    : HHH000412: Hibernate Core {5.3.7.Final}
2019-07-28 11:56:59.568  INFO 12468 --- [           main] org.hibernate.cfg.Environment            : HHH000206: hibernate.properties not found
2019-07-28 11:57:00.048  INFO 12468 --- [           main] o.hibernate.annotations.common.Version   : HCANN000001: Hibernate Commons Annotations {5.0.4.Final}
2019-07-28 11:57:00.349  INFO 12468 --- [           main] org.hibernate.dialect.Dialect            : HHH000400: Using dialect: org.hibernate.dialect.H2Dialect
2019-07-28 11:57:00.877  INFO 12468 --- [           main] o.hibernate.id.enhanced.TableGenerator   : HHH000398: Explicit segment value for id generator [hibernate_sequences.sequence_name] suggested; using default [default]
2019-07-28 11:57:00.896  INFO 12468 --- [           main] o.hibernate.id.enhanced.TableGenerator   : HHH000398: Explicit segment value for id generator [hibernate_sequences.sequence_name] suggested; using default [default]
2019-07-28 11:57:00.897  INFO 12468 --- [           main] o.hibernate.id.enhanced.TableGenerator   : HHH000398: Explicit segment value for id generator [hibernate_sequences.sequence_name] suggested; using default [default]
2019-07-28 11:57:02.502  WARN 12468 --- [           main] o.h.t.s.i.ExceptionHandlerLoggedImpl     : GenerationTarget encountered exception accepting command : Error executing DDL "insert into hibernate_sequences(sequence_name, next_val) values ('default',0)" via JDBC Statement

org.hibernate.tool.schema.spi.CommandAcceptanceException: Error executing DDL "insert into hibernate_sequences(sequence_name, next_val) values ('default',0)" via JDBC Statement
        at org.hibernate.tool.schema.internal.exec.GenerationTargetToDatabase.accept(GenerationTargetToDatabase.java:67) ~[hibernate-core-5.3.7.Final.jar:5.3.7.Final]
        at org.hibernate.tool.schema.internal.SchemaCreatorImpl.applySqlString(SchemaCreatorImpl.java:440) [hibernate-core-5.3.7.Final.jar:5.3.7.Final]
        at org.hibernate.tool.schema.internal.SchemaCreatorImpl.applySqlStrings(SchemaCreatorImpl.java:424) [hibernate-core-5.3.7.Final.jar:5.3.7.Final]
        at org.hibernate.tool.schema.internal.SchemaCreatorImpl.createFromMetadata(SchemaCreatorImpl.java:315) [hibernate-core-5.3.7.Final.jar:5.3.7.Final]
        at org.hibernate.tool.schema.internal.SchemaCreatorImpl.performCreation(SchemaCreatorImpl.java:166) [hibernate-core-5.3.7.Final.jar:5.3.7.Final]
        at org.hibernate.tool.schema.internal.SchemaCreatorImpl.doCreation(SchemaCreatorImpl.java:135) [hibernate-core-5.3.7.Final.jar:5.3.7.Final]
        at org.hibernate.tool.schema.internal.SchemaCreatorImpl.doCreation(SchemaCreatorImpl.java:121) [hibernate-core-5.3.7.Final.jar:5.3.7.Final]
        at org.hibernate.tool.schema.spi.SchemaManagementToolCoordinator.performDatabaseAction(SchemaManagementToolCoordinator.java:155) [hibernate-core-5.3.7.Final.jar:5.3.7.Final]
        at org.hibernate.tool.schema.spi.SchemaManagementToolCoordinator.process(SchemaManagementToolCoordinator.java:72) [hibernate-core-5.3.7.Final.jar:5.3.7.Final]
        at org.hibernate.internal.SessionFactoryImpl.<init>(SessionFactoryImpl.java:310) [hibernate-core-5.3.7.Final.jar:5.3.7.Final]
        at org.hibernate.boot.internal.SessionFactoryBuilderImpl.build(SessionFactoryBuilderImpl.java:467) [hibernate-core-5.3.7.Final.jar:5.3.7.Final]
        at org.hibernate.jpa.boot.internal.EntityManagerFactoryBuilderImpl.build(EntityManagerFactoryBuilderImpl.java:939) [hibernate-core-5.3.7.Final.jar:5.3.7.Final]
        at org.springframework.orm.jpa.vendor.SpringHibernateJpaPersistenceProvider.createContainerEntityManagerFactory(SpringHibernateJpaPersistenceProvider.java:57) [spring-orm-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean.createNativeEntityManagerFactory(LocalContainerEntityManagerFactoryBean.java:365) [spring-orm-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.orm.jpa.AbstractEntityManagerFactoryBean.buildNativeEntityManagerFactory(AbstractEntityManagerFactoryBean.java:390) [spring-orm-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.orm.jpa.AbstractEntityManagerFactoryBean.afterPropertiesSet(AbstractEntityManagerFactoryBean.java:377) [spring-orm-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean.afterPropertiesSet(LocalContainerEntityManagerFactoryBean.java:341) [spring-orm-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.invokeInitMethods(AbstractAutowireCapableBeanFactory.java:1804) [spring-beans-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.initializeBean(AbstractAutowireCapableBeanFactory.java:1741) [spring-beans-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:576) [spring-beans-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:498) [spring-beans-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.beans.factory.support.AbstractBeanFactory.lambda$doGetBean$0(AbstractBeanFactory.java:320) [spring-beans-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:222) ~[spring-beans-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:318) [spring-beans-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:199) [spring-beans-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.context.support.AbstractApplicationContext.getBean(AbstractApplicationContext.java:1083) ~[spring-context-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.context.support.AbstractApplicationContext.finishBeanFactoryInitialization(AbstractApplicationContext.java:853) ~[spring-context-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.context.support.AbstractApplicationContext.refresh(AbstractApplicationContext.java:546) ~[spring-context-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.boot.web.servlet.context.ServletWebServerApplicationContext.refresh(ServletWebServerApplicationContext.java:142) ~[spring-boot-2.1.1.RELEASE.jar:2.1.1.RELEASE]
        at org.springframework.boot.SpringApplication.refresh(SpringApplication.java:775) ~[spring-boot-2.1.1.RELEASE.jar:2.1.1.RELEASE]
        at org.springframework.boot.SpringApplication.refreshContext(SpringApplication.java:397) ~[spring-boot-2.1.1.RELEASE.jar:2.1.1.RELEASE]
        at org.springframework.boot.SpringApplication.run(SpringApplication.java:316) ~[spring-boot-2.1.1.RELEASE.jar:2.1.1.RELEASE]
        at org.springframework.boot.SpringApplication.run(SpringApplication.java:1260) ~[spring-boot-2.1.1.RELEASE.jar:2.1.1.RELEASE]
        at org.springframework.boot.SpringApplication.run(SpringApplication.java:1248) ~[spring-boot-2.1.1.RELEASE.jar:2.1.1.RELEASE]
        at minihearthstone.MinihearthstoneApplication.main(MinihearthstoneApplication.java:29) ~[main/:na]
Caused by: org.h2.jdbc.JdbcSQLException: Violation dindex unique ou clÚ primaire: {0}
Unique index or primary key violation: {0}; SQL statement:
insert into hibernate_sequences(sequence_name, next_val) values ('default',0) [23505-197]
        at org.h2.message.DbException.getJdbcSQLException(DbException.java:357) ~[h2-1.4.197.jar:1.4.197]
        at org.h2.message.DbException.get(DbException.java:179) ~[h2-1.4.197.jar:1.4.197]
        at org.h2.message.DbException.get(DbException.java:155) ~[h2-1.4.197.jar:1.4.197]
        at org.h2.index.BaseIndex.getDuplicateKeyException(BaseIndex.java:101) ~[h2-1.4.197.jar:1.4.197]
        at org.h2.mvstore.db.MVSecondaryIndex.requireUnique(MVSecondaryIndex.java:236) ~[h2-1.4.197.jar:1.4.197]
        at org.h2.mvstore.db.MVSecondaryIndex.add(MVSecondaryIndex.java:202) ~[h2-1.4.197.jar:1.4.197]
        at org.h2.mvstore.db.MVTable.addRow(MVTable.java:732) ~[h2-1.4.197.jar:1.4.197]
        at org.h2.command.dml.Insert.insertRows(Insert.java:182) ~[h2-1.4.197.jar:1.4.197]
        at org.h2.command.dml.Insert.update(Insert.java:134) ~[h2-1.4.197.jar:1.4.197]
        at org.h2.command.CommandContainer.update(CommandContainer.java:102) ~[h2-1.4.197.jar:1.4.197]
        at org.h2.command.Command.executeUpdate(Command.java:261) ~[h2-1.4.197.jar:1.4.197]
        at org.h2.jdbc.JdbcStatement.executeInternal(JdbcStatement.java:233) ~[h2-1.4.197.jar:1.4.197]
        at org.h2.jdbc.JdbcStatement.execute(JdbcStatement.java:205) ~[h2-1.4.197.jar:1.4.197]
        at com.zaxxer.hikari.pool.ProxyStatement.execute(ProxyStatement.java:95) ~[HikariCP-3.2.0.jar:na]
        at com.zaxxer.hikari.pool.HikariProxyStatement.execute(HikariProxyStatement.java) ~[HikariCP-3.2.0.jar:na]
        at org.hibernate.tool.schema.internal.exec.GenerationTargetToDatabase.accept(GenerationTargetToDatabase.java:54) ~[hibernate-core-5.3.7.Final.jar:5.3.7.Final]
        ... 34 common frames omitted

2019-07-28 11:57:02.505  WARN 12468 --- [           main] o.h.t.s.i.ExceptionHandlerLoggedImpl     : GenerationTarget encountered exception accepting command : Error executing DDL "insert into hibernate_sequences(sequence_name, next_val) values ('default',0)" via JDBC Statement

org.hibernate.tool.schema.spi.CommandAcceptanceException: Error executing DDL "insert into hibernate_sequences(sequence_name, next_val) values ('default',0)" via JDBC Statement
        at org.hibernate.tool.schema.internal.exec.GenerationTargetToDatabase.accept(GenerationTargetToDatabase.java:67) ~[hibernate-core-5.3.7.Final.jar:5.3.7.Final]
        at org.hibernate.tool.schema.internal.SchemaCreatorImpl.applySqlString(SchemaCreatorImpl.java:440) [hibernate-core-5.3.7.Final.jar:5.3.7.Final]
        at org.hibernate.tool.schema.internal.SchemaCreatorImpl.applySqlStrings(SchemaCreatorImpl.java:424) [hibernate-core-5.3.7.Final.jar:5.3.7.Final]
        at org.hibernate.tool.schema.internal.SchemaCreatorImpl.createFromMetadata(SchemaCreatorImpl.java:315) [hibernate-core-5.3.7.Final.jar:5.3.7.Final]
        at org.hibernate.tool.schema.internal.SchemaCreatorImpl.performCreation(SchemaCreatorImpl.java:166) [hibernate-core-5.3.7.Final.jar:5.3.7.Final]
        at org.hibernate.tool.schema.internal.SchemaCreatorImpl.doCreation(SchemaCreatorImpl.java:135) [hibernate-core-5.3.7.Final.jar:5.3.7.Final]
        at org.hibernate.tool.schema.internal.SchemaCreatorImpl.doCreation(SchemaCreatorImpl.java:121) [hibernate-core-5.3.7.Final.jar:5.3.7.Final]
        at org.hibernate.tool.schema.spi.SchemaManagementToolCoordinator.performDatabaseAction(SchemaManagementToolCoordinator.java:155) [hibernate-core-5.3.7.Final.jar:5.3.7.Final]
        at org.hibernate.tool.schema.spi.SchemaManagementToolCoordinator.process(SchemaManagementToolCoordinator.java:72) [hibernate-core-5.3.7.Final.jar:5.3.7.Final]
        at org.hibernate.internal.SessionFactoryImpl.<init>(SessionFactoryImpl.java:310) [hibernate-core-5.3.7.Final.jar:5.3.7.Final]
        at org.hibernate.boot.internal.SessionFactoryBuilderImpl.build(SessionFactoryBuilderImpl.java:467) [hibernate-core-5.3.7.Final.jar:5.3.7.Final]
        at org.hibernate.jpa.boot.internal.EntityManagerFactoryBuilderImpl.build(EntityManagerFactoryBuilderImpl.java:939) [hibernate-core-5.3.7.Final.jar:5.3.7.Final]
        at org.springframework.orm.jpa.vendor.SpringHibernateJpaPersistenceProvider.createContainerEntityManagerFactory(SpringHibernateJpaPersistenceProvider.java:57) [spring-orm-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean.createNativeEntityManagerFactory(LocalContainerEntityManagerFactoryBean.java:365) [spring-orm-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.orm.jpa.AbstractEntityManagerFactoryBean.buildNativeEntityManagerFactory(AbstractEntityManagerFactoryBean.java:390) [spring-orm-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.orm.jpa.AbstractEntityManagerFactoryBean.afterPropertiesSet(AbstractEntityManagerFactoryBean.java:377) [spring-orm-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean.afterPropertiesSet(LocalContainerEntityManagerFactoryBean.java:341) [spring-orm-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.invokeInitMethods(AbstractAutowireCapableBeanFactory.java:1804) [spring-beans-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.initializeBean(AbstractAutowireCapableBeanFactory.java:1741) [spring-beans-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:576) [spring-beans-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:498) [spring-beans-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.beans.factory.support.AbstractBeanFactory.lambda$doGetBean$0(AbstractBeanFactory.java:320) [spring-beans-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:222) ~[spring-beans-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:318) [spring-beans-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:199) [spring-beans-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.context.support.AbstractApplicationContext.getBean(AbstractApplicationContext.java:1083) ~[spring-context-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.context.support.AbstractApplicationContext.finishBeanFactoryInitialization(AbstractApplicationContext.java:853) ~[spring-context-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.context.support.AbstractApplicationContext.refresh(AbstractApplicationContext.java:546) ~[spring-context-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.boot.web.servlet.context.ServletWebServerApplicationContext.refresh(ServletWebServerApplicationContext.java:142) ~[spring-boot-2.1.1.RELEASE.jar:2.1.1.RELEASE]
        at org.springframework.boot.SpringApplication.refresh(SpringApplication.java:775) ~[spring-boot-2.1.1.RELEASE.jar:2.1.1.RELEASE]
        at org.springframework.boot.SpringApplication.refreshContext(SpringApplication.java:397) ~[spring-boot-2.1.1.RELEASE.jar:2.1.1.RELEASE]
        at org.springframework.boot.SpringApplication.run(SpringApplication.java:316) ~[spring-boot-2.1.1.RELEASE.jar:2.1.1.RELEASE]
        at org.springframework.boot.SpringApplication.run(SpringApplication.java:1260) ~[spring-boot-2.1.1.RELEASE.jar:2.1.1.RELEASE]
        at org.springframework.boot.SpringApplication.run(SpringApplication.java:1248) ~[spring-boot-2.1.1.RELEASE.jar:2.1.1.RELEASE]
        at minihearthstone.MinihearthstoneApplication.main(MinihearthstoneApplication.java:29) ~[main/:na]
Caused by: org.h2.jdbc.JdbcSQLException: Violation dindex unique ou clÚ primaire: {0}
Unique index or primary key violation: {0}; SQL statement:
insert into hibernate_sequences(sequence_name, next_val) values ('default',0) [23505-197]
        at org.h2.message.DbException.getJdbcSQLException(DbException.java:357) ~[h2-1.4.197.jar:1.4.197]
        at org.h2.message.DbException.get(DbException.java:179) ~[h2-1.4.197.jar:1.4.197]
        at org.h2.message.DbException.get(DbException.java:155) ~[h2-1.4.197.jar:1.4.197]
        at org.h2.index.BaseIndex.getDuplicateKeyException(BaseIndex.java:101) ~[h2-1.4.197.jar:1.4.197]
        at org.h2.mvstore.db.MVSecondaryIndex.requireUnique(MVSecondaryIndex.java:236) ~[h2-1.4.197.jar:1.4.197]
        at org.h2.mvstore.db.MVSecondaryIndex.add(MVSecondaryIndex.java:202) ~[h2-1.4.197.jar:1.4.197]
        at org.h2.mvstore.db.MVTable.addRow(MVTable.java:732) ~[h2-1.4.197.jar:1.4.197]
        at org.h2.command.dml.Insert.insertRows(Insert.java:182) ~[h2-1.4.197.jar:1.4.197]
        at org.h2.command.dml.Insert.update(Insert.java:134) ~[h2-1.4.197.jar:1.4.197]
        at org.h2.command.CommandContainer.update(CommandContainer.java:102) ~[h2-1.4.197.jar:1.4.197]
        at org.h2.command.Command.executeUpdate(Command.java:261) ~[h2-1.4.197.jar:1.4.197]
        at org.h2.jdbc.JdbcStatement.executeInternal(JdbcStatement.java:233) ~[h2-1.4.197.jar:1.4.197]
        at org.h2.jdbc.JdbcStatement.execute(JdbcStatement.java:205) ~[h2-1.4.197.jar:1.4.197]
        at com.zaxxer.hikari.pool.ProxyStatement.execute(ProxyStatement.java:95) ~[HikariCP-3.2.0.jar:na]
        at com.zaxxer.hikari.pool.HikariProxyStatement.execute(HikariProxyStatement.java) ~[HikariCP-3.2.0.jar:na]
        at org.hibernate.tool.schema.internal.exec.GenerationTargetToDatabase.accept(GenerationTargetToDatabase.java:54) ~[hibernate-core-5.3.7.Final.jar:5.3.7.Final]
        ... 34 common frames omitted

2019-07-28 11:57:02.549  INFO 12468 --- [           main] o.h.t.schema.internal.SchemaCreatorImpl  : HHH000476: Executing import script 'org.hibernate.tool.schema.internal.exec.ScriptSourceInputNonExistentImpl@5d9bb69b'
2019-07-28 11:57:02.553  INFO 12468 --- [           main] j.LocalContainerEntityManagerFactoryBean : Initialized JPA EntityManagerFactory for persistence unit 'default'
2019-07-28 11:57:04.650  INFO 12468 --- [           main] o.s.s.concurrent.ThreadPoolTaskExecutor  : Initializing ExecutorService 'clientInboundChannelExecutor'
2019-07-28 11:57:04.661  INFO 12468 --- [           main] o.s.s.concurrent.ThreadPoolTaskExecutor  : Initializing ExecutorService 'clientOutboundChannelExecutor'
2019-07-28 11:57:04.682  INFO 12468 --- [           main] o.s.s.c.ThreadPoolTaskScheduler          : Initializing ExecutorService 'messageBrokerTaskScheduler'
2019-07-28 11:57:04.758  INFO 12468 --- [           main] o.s.s.concurrent.ThreadPoolTaskExecutor  : Initializing ExecutorService 'brokerChannelExecutor'
2019-07-28 11:57:05.283  WARN 12468 --- [           main] aWebConfiguration$JpaWebMvcConfiguration : spring.jpa.open-in-view is enabled by default. Therefore, database queries may be performed during view rendering. Explicitly configure spring.jpa.open-in-view to disable this warning
2019-07-28 11:57:05.935  INFO 12468 --- [           main] o.s.m.s.b.SimpleBrokerMessageHandler     : Starting...
2019-07-28 11:57:05.936  INFO 12468 --- [           main] o.s.m.s.b.SimpleBrokerMessageHandler     : BrokerAvailabilityEvent[available=true, SimpleBrokerMessageHandler [DefaultSubscriptionRegistry[cache[0 destination(s)], registry[0 sessions]]]]
2019-07-28 11:57:05.936  INFO 12468 --- [           main] o.s.m.s.b.SimpleBrokerMessageHandler     : Started.
2019-07-28 11:57:05.984  INFO 12468 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port(s): 8090 (http) with context path ''
2019-07-28 11:57:05.986  INFO 12468 --- [           main] m.MinihearthstoneApplication             : Started MinihearthstoneApplication in 12.457 seconds (JVM running for 13.288)
2019-07-28 11:57:06.144  INFO 12468 --- [           main] m.MinihearthstoneApplication             : CardRepository :
2019-07-28 11:57:06.144  INFO 12468 --- [           main] m.MinihearthstoneApplication             : -------------------------------------------------
2019-07-28 11:57:06.187  INFO 12468 --- [           main] o.h.h.i.QueryTranslatorFactoryInitiator  : HHH000397: Using ASTQueryTranslatorFactory
2019-07-28 11:57:06.578  INFO 12468 --- [           main] m.MinihearthstoneApplication             : Card[id=5, uniqueId='Sanglier brocheroc1564307826078934810152', name='Sanglier brocheroc', manacost=1, damage=1, lifepoints=1, nature='servant', canAttack=false, currentTargetUniqueId='Sanglier brocheroc1564307826078934810152', effect='null', specificCard='null']
2019-07-28 11:57:06.578  INFO 12468 --- [           main] m.MinihearthstoneApplication             : Card[id=6, uniqueId='Soldat du comtÚ-de-l'or15643078260781286966925', name='Soldat du comtÚ-de-l'or', manacost=1, damage=1, lifepoints=2, nature='servant', canAttack=false, currentTargetUniqueId='Soldat du comtÚ-de-l'or15643078260781286966925', effect='ProvocationEffect', specificCard='null']
2019-07-28 11:57:06.578  INFO 12468 --- [           main] m.MinihearthstoneApplication             : Card[id=7, uniqueId='Chevaucheur de loup15643078260781867460368', name='Chevaucheur de loup', manacost=3, damage=3, lifepoints=1, nature='servant', canAttack=false, currentTargetUniqueId='Chevaucheur de loup15643078260781867460368', effect='ChargeEffect', specificCard='null']
2019-07-28 11:57:06.578  INFO 12468 --- [           main] m.MinihearthstoneApplication             : Card[id=8, uniqueId='Chef de Raid15643078260781393092951', name='Chef de
Raid', manacost=3, damage=2, lifepoints=2, nature='servant', canAttack=false, currentTargetUniqueId='Chef de Raid15643078260781393092951', effect='null', specificCard='ChefDeRaid']
2019-07-28 11:57:06.579  INFO 12468 --- [           main] m.MinihearthstoneApplication             : Card[id=9, uniqueId='YÚti noroit1564307826078607193256', name='YÚti noroit', manacost=4, damage=4, lifepoints=5, nature='servant', canAttack=false, currentTargetUniqueId='YÚti noroit1564307826078607193256', effect='null', specificCard='null']
2019-07-28 11:57:06.579  INFO 12468 --- [           main] m.MinihearthstoneApplication             : Card[id=10, uniqueId='Champion frisselame15643078260781141905717', name='Champion frisselame', manacost=4, damage=3, lifepoints=2, nature='servant', canAttack=false, currentTargetUniqueId='Champion frisselame15643078260781141905717', effect='LifeStealEffect', specificCard='null']
2019-07-28 11:57:06.579  INFO 12468 --- [           main] m.MinihearthstoneApplication             : Card[id=11, uniqueId='BÚnÚdiction de puissance15643078260781378815278', name='BÚnÚdiction de puissance', manacost=1, damage=3, lifepoints=0, nature='targetedSpell', canAttack=false, currentTargetUniqueId='BÚnÚdiction de puissance15643078260781378815278', effect='null', specificCard='BenedictionDePuissance']
2019-07-28 11:57:06.580  INFO 12468 --- [           main] m.MinihearthstoneApplication             : Card[id=12, uniqueId='ConsÚcration15643078260781183788057', name='ConsÚcration', manacost=4, damage=2, lifepoints=0, nature='spell', canAttack=false, currentTargetUniqueId='ConsÚcration15643078260781183788057', effect='null', specificCard='Consecration']
2019-07-28 11:57:06.580  INFO 12468 --- [           main] m.MinihearthstoneApplication             : Card[id=14, uniqueId='Sanglier brocheroc15643078260781782208418', name='Sanglier brocheroc', manacost=1, damage=1, lifepoints=1, nature='servant', canAttack=false, currentTargetUniqueId='Sanglier brocheroc15643078260781782208418', effect='null', specificCard='null']
2019-07-28 11:57:06.580  INFO 12468 --- [           main] m.MinihearthstoneApplication             : Card[id=15, uniqueId='Soldat du comtÚ-de-l'or1564307826078785927536', name='Soldat du comtÚ-de-l'or', manacost=1, damage=1, lifepoints=2, nature='servant', canAttack=false, currentTargetUniqueId='Soldat du comtÚ-de-l'or1564307826078785927536', effect='ProvocationEffect', specificCard='null']
2019-07-28 11:57:06.581  INFO 12468 --- [           main] m.MinihearthstoneApplication             : Card[id=16, uniqueId='Chevaucheur de loup156430782607867168568', name='Chevaucheur de loup', manacost=3, damage=3, lifepoints=1, nature='servant', canAttack=false, currentTargetUniqueId='Chevaucheur de loup156430782607867168568', effect='ChargeEffect', specificCard='null']
2019-07-28 11:57:06.581  INFO 12468 --- [           main] m.MinihearthstoneApplication             : Card[id=17, uniqueId='Chef de Raid15643078260781004759645', name='Chef de Raid', manacost=3, damage=2, lifepoints=2, nature='servant', canAttack=false, currentTargetUniqueId='Chef de Raid15643078260781004759645', effect='null', specificCard='ChefDeRaid']
2019-07-28 11:57:06.582  INFO 12468 --- [           main] m.MinihearthstoneApplication             : Card[id=18, uniqueId='YÚti noroit156430782607856051908', name='YÚti noroit', manacost=4, damage=4, lifepoints=5, nature='servant', canAttack=false, currentTargetUniqueId='YÚti noroit156430782607856051908', effect='null', specificCard='null']
2019-07-28 11:57:06.582  INFO 12468 --- [           main] m.MinihearthstoneApplication             : Card[id=19, uniqueId='Tourbillon15643078260781874641945', name='Tourbillon', manacost=1, damage=1, lifepoints=0, nature='spell', canAttack=false, currentTargetUniqueId='Tourbillon15643078260781874641945', effect='null', specificCard='Tourbillon']
2019-07-28 11:57:06.584  INFO 12468 --- [           main] m.MinihearthstoneApplication             : Card[id=20, uniqueId='Avocat commis d'office15643078260781820662205', name='Avocat commis d'office', manacost=2, damage=0, lifepoints=7, nature='servant', canAttack=false, currentTargetUniqueId='Avocat commis d'office15643078260781820662205', effect='ProvocationEffect', specificCard='null']
2019-07-28 11:57:06.585  INFO 12468 --- [           main] m.MinihearthstoneApplication             : Card[id=21, uniqueId='Ma¯trise du blocage15643078260781275670923', name='Ma¯trise du blocage', manacost=3, damage=0, lifepoints=0, nature='spell', canAttack=false, currentTargetUniqueId='Ma¯trise du blocage15643078260781275670923', effect='null',
specificCard='MaitriseDuBlocage']
2019-07-28 11:57:06.587  INFO 12468 --- [           main] m.MinihearthstoneApplication             : Card[id=23, uniqueId='Sanglier brocheroc15643078260781975569728', name='Sanglier brocheroc', manacost=1, damage=1, lifepoints=1, nature='servant', canAttack=false, currentTargetUniqueId='Sanglier brocheroc15643078260781975569728', effect='null', specificCard='null']
2019-07-28 11:57:06.589  INFO 12468 --- [           main] m.MinihearthstoneApplication             : Card[id=24, uniqueId='Soldat du comtÚ-de-l'or15643078260782096524892', name='Soldat du comtÚ-de-l'or', manacost=1, damage=1, lifepoints=2, nature='servant', canAttack=false, currentTargetUniqueId='Soldat du comtÚ-de-l'or15643078260782096524892', effect='ProvocationEffect', specificCard='null']
2019-07-28 11:57:06.591  INFO 12468 --- [           main] m.MinihearthstoneApplication             : Card[id=25, uniqueId='Chevaucheur de loup1564307826078955660235', name='Chevaucheur de loup', manacost=3, damage=3, lifepoints=1, nature='servant', canAttack=false, currentTargetUniqueId='Chevaucheur de loup1564307826078955660235', effect='ChargeEffect', specificCard='null']
2019-07-28 11:57:06.591  INFO 12468 --- [           main] m.MinihearthstoneApplication             : Card[id=26, uniqueId='Chef de Raid15643078260781031581820', name='Chef de Raid', manacost=3, damage=2, lifepoints=2, nature='servant', canAttack=false, currentTargetUniqueId='Chef de Raid15643078260781031581820', effect='null', specificCard='ChefDeRaid']
2019-07-28 11:57:06.592  INFO 12468 --- [           main] m.MinihearthstoneApplication             : Card[id=27, uniqueId='YÚti noroit15643078260781311114510', name='YÚti noroit', manacost=4, damage=4, lifepoints=5, nature='servant', canAttack=false, currentTargetUniqueId='YÚti noroit15643078260781311114510', effect='null', specificCard='null']
2019-07-28 11:57:06.593  INFO 12468 --- [           main] m.MinihearthstoneApplication             : Card[id=28, uniqueId='Image mirroir156430782607824652094', name='Image mirroir', manacost=1, damage=0, lifepoints=2, nature='spell', canAttack=false, currentTargetUniqueId='Image mirroir156430782607824652094', effect='ProvocationEffect', specificCard='ImageMirroir']
2019-07-28 11:57:06.594  INFO 12468 --- [           main] m.MinihearthstoneApplication             : Card[id=29, uniqueId='Explosion des arcanes1564307826078146662754', name='Explosion des arcanes', manacost=2, damage=1, lifepoints=0, nature='spell', canAttack=false, currentTargetUniqueId='Explosion des arcanes1564307826078146662754', effect='null', specificCard='ExplosionDesArcanes']
2019-07-28 11:57:06.595  INFO 12468 --- [           main] m.MinihearthstoneApplication             : Card[id=30, uniqueId='MÚtamorphose15643078260781348845063', name='MÚtamorphose', manacost=4, damage=0, lifepoints=0, nature='targetedSpell', canAttack=false, currentTargetUniqueId='MÚtamorphose15643078260781348845063', effect='null', specificCard='Metamorphose']
2019-07-28 11:57:06.595  INFO 12468 --- [           main] m.MinihearthstoneApplication             : HeroRepository :
2019-07-28 11:57:06.595  INFO 12468 --- [           main] m.MinihearthstoneApplication             : -------------------------------------------------
2019-07-28 11:57:06.618  INFO 12468 --- [           main] m.MinihearthstoneApplication             : Hero[id=1, uniqueId='Echalwe15643078259891870367709', name='Echalwe', type=paladin, skillType='self', lifepoints=30,defense=0, description=Renfort, invoquant un serviteur 'recrue de la Main d'argent' 1/1., specificHero='Paladin']
2019-07-28 11:57:06.619  INFO 12468 --- [           main] m.MinihearthstoneApplication             : Hero[id=2, uniqueId='Hrothgar15643078259891821216251', name='Hrothgar', type=warrior, skillType='self', lifepoints=30,defense=0, description=Armure, lui confÚrant 2 points d'armure, specificHero='Warrior']
2019-07-28 11:57:06.619  INFO 12468 --- [           main] m.MinihearthstoneApplication             : Hero[id=3, uniqueId='Athelas15643078259891336343619', name='Athelas', type=mage, skillType='targeted', lifepoints=30,defense=0, description=Boule de feu, infligeant un point de dÚgat Ó l'adversaire (serviteur ou hÚros)., specificHero='Mage']
2019-07-28 11:57:06.619  INFO 12468 --- [           main] m.MinihearthstoneApplication             : commonCards :
2019-07-28 11:57:06.619  INFO 12468 --- [           main] m.MinihearthstoneApplication             : -------------------------------------------------
2019-07-28 11:57:06.620  INFO 12468 --- [           main] m.MinihearthstoneApplication             : Card[id=null, uniqueId='Sanglier brocheroc1564307825988148337673', name='Sanglier brocheroc', manacost=1, damage=1, lifepoints=1, nature='servant', canAttack=false, currentTargetUniqueId='Sanglier brocheroc1564307825988148337673', effect='null', specificCard='null']
2019-07-28 11:57:06.621  INFO 12468 --- [           main] m.MinihearthstoneApplication             : Card[id=null, uniqueId='Soldat du comtÚ-de-l'or1564307825989465258918', name='Soldat du comtÚ-de-l'or', manacost=1, damage=1, lifepoints=2, nature='servant', canAttack=false, currentTargetUniqueId='Soldat du comtÚ-de-l'or1564307825989465258918', effect='ProvocationEffect', specificCard='null']
2019-07-28 11:57:06.623  INFO 12468 --- [           main] m.MinihearthstoneApplication             : Card[id=null, uniqueId='Chevaucheur de loup1564307825989262005843', name='Chevaucheur de loup', manacost=3, damage=3, lifepoints=1, nature='servant', canAttack=false, currentTargetUniqueId='Chevaucheur de loup1564307825989262005843', effect='ChargeEffect', specificCard='null']
2019-07-28 11:57:06.624  INFO 12468 --- [           main] m.MinihearthstoneApplication             : Card[id=null, uniqueId='Chef de Raid15643078259891341083893', name='Chef
de Raid', manacost=3, damage=2, lifepoints=2, nature='servant', canAttack=false, currentTargetUniqueId='Chef de Raid15643078259891341083893', effect='null', specificCard='ChefDeRaid']
2019-07-28 11:57:06.625  INFO 12468 --- [           main] m.MinihearthstoneApplication             : Card[id=null, uniqueId='YÚti noroit15643078259892089229999', name='YÚti noroit', manacost=4, damage=4, lifepoints=5, nature='servant', canAttack=false, currentTargetUniqueId='YÚti noroit15643078259892089229999', effect='null', specificCard='null']2019-07-28 11:57:06.625  INFO 12468 --- [           main] m.MinihearthstoneApplication             : paladinSpecificCards :
2019-07-28 11:57:06.625  INFO 12468 --- [           main] m.MinihearthstoneApplication             : -------------------------------------------------
2019-07-28 11:57:06.625  INFO 12468 --- [           main] m.MinihearthstoneApplication             : Card[id=null, uniqueId='Champion frisselame15643078259891027296831', name='Champion frisselame', manacost=4, damage=3, lifepoints=2, nature='servant', canAttack=false, currentTargetUniqueId='Champion frisselame15643078259891027296831', effect='LifeStealEffect', specificCard='null']
2019-07-28 11:57:06.626  INFO 12468 --- [           main] m.MinihearthstoneApplication             : Card[id=null, uniqueId='BÚnÚdiction de puissance15643078259891573508485', name='BÚnÚdiction de puissance', manacost=1, damage=3, lifepoints=0, nature='targetedSpell', canAttack=false, currentTargetUniqueId='BÚnÚdiction de puissance15643078259891573508485', effect='null', specificCard='BenedictionDePuissance']
2019-07-28 11:57:06.627  INFO 12468 --- [           main] m.MinihearthstoneApplication             : Card[id=null, uniqueId='ConsÚcration15643078259891752152413', name='ConsÚcration', manacost=4, damage=2, lifepoints=0, nature='spell', canAttack=false, currentTargetUniqueId='ConsÚcration15643078259891752152413', effect='null', specificCard='Consecration']
2019-07-28 11:57:06.627  INFO 12468 --- [           main] m.MinihearthstoneApplication             : DeckRepository :
2019-07-28 11:57:06.627  INFO 12468 --- [           main] m.MinihearthstoneApplication             : -------------------------------------------------
2019-07-28 11:57:06.732  INFO 12468 --- [           main] m.MinihearthstoneApplication             : Deck[id=4, name='Echalwe's card deck', heroId=1, cards{'Sanglier brocheroc Soldat du comtÚ-de-l'or Chevaucheur de loup Chef de Raid YÚti noroit Champion frisselame BÚnÚdiction de puissance ConsÚcration '}]
2019-07-28 11:57:06.733  INFO 12468 --- [           main] m.MinihearthstoneApplication             : Deck[id=13, name='Hrothgar's card deck', heroId=2, cards{'Sanglier brocheroc Soldat du comtÚ-de-l'or Chevaucheur de loup Chef de Raid YÚti noroit Tourbillon Avocat commis d'office Ma¯trise du blocage '}]
2019-07-28 11:57:06.733  INFO 12468 --- [           main] m.MinihearthstoneApplication             : Deck[id=22, name='Athelas's card deck', heroId=3, cards{'Sanglier brocheroc Soldat du comtÚ-de-l'or Chevaucheur de loup Chef de Raid YÚti noroit Image mirroir Explosion des arcanes MÚtamorphose '}]
2019-07-28 11:57:06.733  INFO 12468 --- [           main] m.MinihearthstoneApplication             : -------------------------------------------------
2019-07-28 11:57:46.966  INFO 12468 --- [nio-8090-exec-2] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring DispatcherServlet 'dispatcherServlet'
2019-07-28 11:57:46.966  INFO 12468 --- [nio-8090-exec-2] o.s.web.servlet.DispatcherServlet        : Initializing Servlet 'dispatcherServlet'
2019-07-28 11:57:47.005  INFO 12468 --- [nio-8090-exec-2] o.s.web.servlet.DispatcherServlet        : Completed initialization in 39 ms
2019-07-28 11:58:04.755  INFO 12468 --- [MessageBroker-6] o.s.w.s.c.WebSocketMessageBrokerStats    : WebSocketSession[2 current WS(2)-HttpStream(0)-HttpPoll(0), 2 total, 0 closed abnormally (0 connect failure, 0 send limit, 0 transport error)], stompSubProtocol[processed CONNECT(2)-CONNECTED(2)-DISCONNECT(0)], stompBrokerRelay[null], inboundChannel[pool size = 16, active threads = 0, queued tasks = 0, completed tasks = 60], outboundChannelpool size = 2, active threads = 0, queued tasks = 0, completed tasks = 2], sockJsScheduler[pool size = 8, active threads = 1, queued tasks = 3, completed tasks = 4]
2019-07-28 12:18:00.503  INFO 12468 --- [boundChannel-20] minihearthstone.controller.ClientProxy   : number of players looking for match : 0
2019-07-28 12:18:01.174  INFO 12468 --- [boundChannel-21] minihearthstone.controller.ClientProxy   : number of players looking for match : 1
2019-07-28 12:18:01.174  INFO 12468 --- [boundChannel-21] minihearthstone.controller.ClientProxy   : size: 1
2019-07-28 12:18:01.174  INFO 12468 --- [boundChannel-21] minihearthstone.controller.ClientProxy   : random: 0
ok
2019-07-28 12:18:05.847  INFO 12468 --- [boundChannel-22] minihearthstone.controller.ClientProxy   : New gameboard :[]
2019-07-28 12:18:05.848  INFO 12468 --- [boundChannel-22] minihearthstone.entities.deck.Deck       : Added player
2019-07-28 12:18:05.848  INFO 12468 --- [boundChannel-22] minihearthstone.entities.deck.Deck       : Added hero
2019-07-28 12:18:05.891  INFO 12468 --- [boundChannel-22] minihearthstone.controller.ClientProxy   : Updated gameboard : [Player[id=32, name='toto', clientId='2951564307866692', status='in-lobby', heroId=2, mana=1, stored_mana=1], gb='34']
2019-07-28 12:18:05.891  INFO 12468 --- [boundChannel-22] minihearthstone.controller.ClientProxy   : Updated gameboard : [Hero[id=35, uniqueId='Hrothgar1564309085848147867873', name='Hrothgar', type=warrior, skillType='self', lifepoints=30,defense=0, description=Armure, lui confÚrant 2 points d'armure, specificHero='Warrior']]
2019-07-28 12:18:05.891  INFO 12468 --- [boundChannel-22] minihearthstone.controller.ClientProxy   : Updated gameboard to string : GameBoard[id=34, gameId=33, p1ClientId=2951564307866692, p2ClientId=null, turn=null,
p1HandOfCards='',
 p1CardsOnGround='',
 p2HandOfCards='',
 p2CardsOnGround='']
2019-07-28 12:18:06.768  INFO 12468 --- [boundChannel-25] minihearthstone.controller.ClientProxy   : Already created gameboard
2019-07-28 12:18:06.769  INFO 12468 --- [boundChannel-25] minihearthstone.entities.deck.Deck       : Added player
2019-07-28 12:18:06.769  INFO 12468 --- [boundChannel-25] minihearthstone.entities.deck.Deck       : Added hero
2019-07-28 12:18:06.794  INFO 12468 --- [boundChannel-25] minihearthstone.controller.ClientProxy   : Updated gameboard : [Player[id=31, name='titi', clientId='3201564307866946', status='in-lobby', heroId=3, mana=1, stored_mana=1], gb='34', Player[id=32, name='toto', clientId='2951564307866692', status='in-lobby', heroId=2, mana=1, stored_mana=1], gb='34']
2019-07-28 12:18:06.794  INFO 12468 --- [boundChannel-25] minihearthstone.controller.ClientProxy   : Updated gameboard : [Hero[id=35, uniqueId='Hrothgar1564309085848147867873', name='Hrothgar', type=warrior, skillType='self', lifepoints=30,defense=0, description=Armure, lui confÚrant 2 points d'armure, specificHero='Warrior'], Hero[id=36, uniqueId='Athelas1564309086769686660191', name='Athelas', type=mage, skillType='targeted', lifepoints=30,defense=0, description=Boule de feu, infligeant un point de dÚgat Ó l'adversaire (serviteur ou hÚros)., specificHero='Mage']]
2019-07-28 12:18:06.795  INFO 12468 --- [boundChannel-25] minihearthstone.controller.ClientProxy   : Updated gameboard to string : GameBoard[id=34, gameId=33, p1ClientId=2951564307866692, p2ClientId=3201564307866946, turn=null,
p1HandOfCards='',
 p1CardsOnGround='',
 p2HandOfCards='',
 p2CardsOnGround='']
2019-07-28 12:18:06.802  INFO 12468 --- [boundChannel-22] minihearthstone.controller.ClientProxy   : Received initgame from player: 3201564307866946
2019-07-28 12:18:06.807  INFO 12468 --- [boundChannel-22] minihearthstone.controller.ClientProxy   : Random  :0
2019-07-28 12:18:06.807  INFO 12468 --- [boundChannel-22] minihearthstone.controller.ClientProxy   : The lucky winner is 2951564307866692
2019-07-28 12:18:06.844  INFO 12468 --- [boundChannel-21] minihearthstone.controller.ClientProxy   : Received getfirsthand() from player : 3201564307866946
2019-07-28 12:18:06.845  INFO 12468 --- [boundChannel-21] minihearthstone.controller.ClientProxy   : -------------------------------------------------
2019-07-28 12:18:06.897  INFO 12468 --- [boundChannel-21] minihearthstone.entities.deck.Deck       : Random hand of : 3 cards.
2019-07-28 12:18:06.898  INFO 12468 --- [boundChannel-21] minihearthstone.entities.deck.Deck       : Cards where manacost <= 2 [Card[id=23, uniqueId='Sanglier brocheroc15643078260781975569728', name='Sanglier brocheroc', manacost=1, damage=1, lifepoints=1, nature='servant', canAttack=false, currentTargetUniqueId='Sanglier brocheroc15643078260781975569728', effect='null', specificCard='null'], Card[id=24, uniqueId='Soldat du comtÚ-de-l'or15643078260782096524892', name='Soldat du comtÚ-de-l'or', manacost=1, damage=1, lifepoints=2, nature='servant', canAttack=false, currentTargetUniqueId='Soldat du comtÚ-de-l'or15643078260782096524892', effect='ProvocationEffect', specificCard='null'], Card[id=28, uniqueId='Image mirroir156430782607824652094', name='Image mirroir', manacost=1, damage=0, lifepoints=2, nature='spell', canAttack=false, currentTargetUniqueId='Image mirroir156430782607824652094', effect='ProvocationEffect', specificCard='ImageMirroir'], Card[id=29, uniqueId='Explosion des arcanes1564307826078146662754', name='Explosion
des arcanes', manacost=2, damage=1, lifepoints=0, nature='spell', canAttack=false, currentTargetUniqueId='Explosion des arcanes1564307826078146662754', effect='null', specificCard='ExplosionDesArcanes']]
2019-07-28 12:18:06.898  INFO 12468 --- [boundChannel-21] minihearthstone.entities.deck.Deck       : Random pick index: 0
2019-07-28 12:18:06.898  INFO 12468 --- [boundChannel-21] minihearthstone.entities.deck.Deck       : Random pick index: 2
2019-07-28 12:18:06.898  INFO 12468 --- [boundChannel-21] minihearthstone.entities.deck.Deck       : Random pick index: 3
2019-07-28 12:18:06.899  INFO 12468 --- [boundChannel-21] minihearthstone.controller.ClientProxy   : Gameboard before hand of cards added : GameBoard[id=34, gameId=33, p1ClientId=2951564307866692, p2ClientId=3201564307866946, turn=2951564307866692,
p1HandOfCards='',
 p1CardsOnGround='',
 p2HandOfCards='',
 p2CardsOnGround='']

2019-07-28 12:18:06.899  INFO 12468 --- [boundChannel-21] minihearthstone.controller.ClientProxy   : P2 client id : 3201564307866946
2019-07-28 12:18:06.899  INFO 12468 --- [boundChannel-21] minihearthstone.controller.ClientProxy   : Number of cards in P2 hand : 3
2019-07-28 12:18:06.919  INFO 12468 --- [boundChannel-21] minihearthstone.controller.ClientProxy   : Hand of cards saved in gameboard : [Card[id=null, uniqueId='Sanglier brocheroc15643090868981269977557', name='Sanglier brocheroc', manacost=1, damage=1, lifepoints=1, nature='servant', canAttack=false, currentTargetUniqueId='Sanglier brocheroc15643090868981269977557', effect='null', specificCard='null'], Card[id=null, uniqueId='Image mirroir1564309086898800030039', name='Image mirroir', manacost=1, damage=0, lifepoints=2, nature='spell', canAttack=false, currentTargetUniqueId='Image mirroir1564309086898800030039', effect='ProvocationEffect', specificCard='ImageMirroir'], Card[id=null, uniqueId='Chef de Raid15643090868981665732837', name='Chef de Raid', manacost=3, damage=2, lifepoints=2, nature='servant', canAttack=false, currentTargetUniqueId='Chef de Raid15643090868981665732837', effect='null', specificCard='ChefDeRaid']]
2019-07-28 12:18:06.939  INFO 12468 --- [boundChannel-21] minihearthstone.controller.ClientProxy   : Gameboard after hand of cards added : GameBoard[id=34, gameId=33, p1ClientId=2951564307866692, p2ClientId=3201564307866946, turn=2951564307866692,
p1HandOfCards='',
 p1CardsOnGround='',
 p2HandOfCards='Sanglier brocheroc15643090868981269977557; Image mirroir1564309086898800030039; Chef de Raid15643090868981665732837; ',
 p2CardsOnGround='']

2019-07-28 12:18:07.356  INFO 12468 --- [boundChannel-24] minihearthstone.controller.ClientProxy   : Received initgame from player: 2951564307866692
2019-07-28 12:18:07.372  INFO 12468 --- [boundChannel-26] minihearthstone.controller.ClientProxy   : Received getfirsthand() from player : 2951564307866692
2019-07-28 12:18:07.372  INFO 12468 --- [boundChannel-26] minihearthstone.controller.ClientProxy   : -------------------------------------------------
2019-07-28 12:18:07.390  INFO 12468 --- [boundChannel-26] minihearthstone.entities.deck.Deck       : Random hand of : 3 cards.
2019-07-28 12:18:07.390  INFO 12468 --- [boundChannel-26] minihearthstone.entities.deck.Deck       : Cards where manacost <= 2 [Card[id=14, uniqueId='Sanglier brocheroc15643078260781782208418', name='Sanglier brocheroc', manacost=1, damage=1, lifepoints=1, nature='servant', canAttack=false, currentTargetUniqueId='Sanglier brocheroc15643078260781782208418', effect='null', specificCard='null'], Card[id=15, uniqueId='Soldat du comtÚ-de-l'or1564307826078785927536', name='Soldat du comtÚ-de-l'or', manacost=1, damage=1, lifepoints=2, nature='servant', canAttack=false, currentTargetUniqueId='Soldat du comtÚ-de-l'or1564307826078785927536', effect='ProvocationEffect', specificCard='null'], Card[id=19, uniqueId='Tourbillon15643078260781874641945', name='Tourbillon', manacost=1, damage=1, lifepoints=0, nature='spell', canAttack=false, currentTargetUniqueId='Tourbillon15643078260781874641945', effect='null', specificCard='Tourbillon'], Card[id=20, uniqueId='Avocat commis d'office15643078260781820662205', name='Avocat commis d'office', manacost=2, damage=0, lifepoints=7, nature='servant', canAttack=false, currentTargetUniqueId='Avocat commis d'office15643078260781820662205', effect='ProvocationEffect', specificCard='null']]
2019-07-28 12:18:07.390  INFO 12468 --- [boundChannel-26] minihearthstone.entities.deck.Deck       : Random pick index: 2
2019-07-28 12:18:07.390  INFO 12468 --- [boundChannel-26] minihearthstone.entities.deck.Deck       : Random pick index: 2
2019-07-28 12:18:07.390  INFO 12468 --- [boundChannel-26] minihearthstone.entities.deck.Deck       : Random pick index: 3
2019-07-28 12:18:07.390  INFO 12468 --- [boundChannel-26] minihearthstone.controller.ClientProxy   : Gameboard before hand of cards added : GameBoard[id=34, gameId=33, p1ClientId=2951564307866692, p2ClientId=3201564307866946, turn=2951564307866692,
p1HandOfCards='',
 p1CardsOnGround='',
 p2HandOfCards='Sanglier brocheroc15643090868981269977557; Image mirroir1564309086898800030039; Chef de Raid15643090868981665732837; ',
 p2CardsOnGround='']

2019-07-28 12:18:07.391  INFO 12468 --- [boundChannel-26] minihearthstone.controller.ClientProxy   : P1 client id : 2951564307866692
2019-07-28 12:18:07.391  INFO 12468 --- [boundChannel-26] minihearthstone.controller.ClientProxy   : Number of cards in P1 hand : 3
2019-07-28 12:18:07.411  INFO 12468 --- [boundChannel-26] minihearthstone.controller.ClientProxy   : Hand of cards saved in gameboard : [Card[id=null, uniqueId='Tourbillon1564309087390268316956', name='Tourbillon', manacost=1, damage=1, lifepoints=0, nature='spell', canAttack=false, currentTargetUniqueId='Tourbillon1564309087390268316956', effect='null', specificCard='Tourbillon'], Card[id=null, uniqueId='Tourbillon15643090873901329375036', name='Tourbillon', manacost=1, damage=1, lifepoints=0, nature='spell', canAttack=false, currentTargetUniqueId='Tourbillon15643090873901329375036', effect='null', specificCard='Tourbillon'], Card[id=null, uniqueId='Chef de Raid1564309087390796397683',
name='Chef de Raid', manacost=3, damage=2, lifepoints=2, nature='servant', canAttack=false, currentTargetUniqueId='Chef de Raid1564309087390796397683', effect='null', specificCard='ChefDeRaid']]
2019-07-28 12:18:07.438  INFO 12468 --- [boundChannel-26] minihearthstone.controller.ClientProxy   : Gameboard after hand of cards added : GameBoard[id=34, gameId=33, p1ClientId=2951564307866692, p2ClientId=3201564307866946, turn=2951564307866692,
p1HandOfCards='Tourbillon1564309087390268316956; Tourbillon15643090873901329375036; Chef de Raid1564309087390796397683; ',
 p1CardsOnGround='',
 p2HandOfCards='Sanglier brocheroc15643090868981269977557; Image mirroir1564309086898800030039; Chef de Raid15643090868981665732837; ',
 p2CardsOnGround='']

2019-07-28 12:18:11.923  INFO 12468 --- [boundChannel-27] minihearthstone.controller.ClientProxy   : Logging out player : titi
2019-07-28 12:18:11.988  INFO 12468 --- [boundChannel-27] minihearthstone.controller.ClientProxy   : Remaining players : [Player[id=43, name='toto', clientId='2951564307866692', status='available', heroId=null, mana=1, stored_mana=1], gb='']
2019-07-28 12:18:11.990  INFO 12468 --- [boundChannel-27] minihearthstone.controller.ClientProxy   : Remaining matches : []
2019-07-28 12:18:11.993  INFO 12468 --- [boundChannel-27] minihearthstone.controller.ClientProxy   : Remaining games : []
2019-07-28 12:18:17.530  INFO 12468 --- [boundChannel-27] minihearthstone.controller.ClientProxy   : number of players looking for match : 0
2019-07-28 12:18:18.474  INFO 12468 --- [boundChannel-18] minihearthstone.controller.ClientProxy   : number of players looking for match : 1
2019-07-28 12:18:18.474  INFO 12468 --- [boundChannel-18] minihearthstone.controller.ClientProxy   : size: 1
2019-07-28 12:18:18.474  INFO 12468 --- [boundChannel-18] minihearthstone.controller.ClientProxy   : random: 0
ok
2019-07-28 12:18:23.421  INFO 12468 --- [boundChannel-23] minihearthstone.controller.ClientProxy   : New gameboard :[]
2019-07-28 12:18:23.422  INFO 12468 --- [boundChannel-23] minihearthstone.entities.deck.Deck       : Added player
2019-07-28 12:18:23.422  INFO 12468 --- [boundChannel-23] minihearthstone.entities.deck.Deck       : Added hero
2019-07-28 12:18:23.443  INFO 12468 --- [boundChannel-23] minihearthstone.controller.ClientProxy   : Updated gameboard : [Player[id=44, name='tutu', clientId='5011564309093734', status='in-lobby', heroId=3, mana=1, stored_mana=1], gb='46']
2019-07-28 12:18:23.443  INFO 12468 --- [boundChannel-23] minihearthstone.controller.ClientProxy   : Updated gameboard : [Hero[id=47, uniqueId='Athelas15643091034221655325272', name='Athelas', type=mage, skillType='targeted', lifepoints=30,defense=0, description=Boule de feu, infligeant un point de dÚgat Ó l'adversaire (serviteur ou hÚros)., specificHero='Mage']]
2019-07-28 12:18:23.443  INFO 12468 --- [boundChannel-23] minihearthstone.controller.ClientProxy   : Updated gameboard to string : GameBoard[id=46, gameId=45, p1ClientId=5011564309093734, p2ClientId=null, turn=null,
p1HandOfCards='',
 p1CardsOnGround='',
 p2HandOfCards='',
 p2CardsOnGround='']
2019-07-28 12:18:24.019  INFO 12468 --- [boundChannel-19] minihearthstone.controller.ClientProxy   : Already created gameboard
2019-07-28 12:18:24.019  INFO 12468 --- [boundChannel-19] minihearthstone.entities.deck.Deck       : Added player
2019-07-28 12:18:24.019  INFO 12468 --- [boundChannel-19] minihearthstone.entities.deck.Deck       : Added hero
2019-07-28 12:18:24.040  INFO 12468 --- [boundChannel-19] minihearthstone.controller.ClientProxy   : Updated gameboard : [Player[id=43, name='toto', clientId='2951564307866692', status='in-lobby', heroId=2, mana=1, stored_mana=1], gb='46', Player[id=44, name='tutu', clientId='5011564309093734', status='in-lobby', heroId=3, mana=1, stored_mana=1], gb='46']
2019-07-28 12:18:24.040  INFO 12468 --- [boundChannel-19] minihearthstone.controller.ClientProxy   : Updated gameboard : [Hero[id=47, uniqueId='Athelas15643091034221655325272', name='Athelas', type=mage, skillType='targeted', lifepoints=30,defense=0, description=Boule de feu, infligeant un point de dÚgat Ó l'adversaire (serviteur ou hÚros)., specificHero='Mage'], Hero[id=48, uniqueId='Hrothgar1564309104019963867014', name='Hrothgar', type=warrior, skillType='self', lifepoints=30,defense=0, description=Armure, lui confÚrant 2 points d'armure, specificHero='Warrior']]
2019-07-28 12:18:24.040  INFO 12468 --- [boundChannel-19] minihearthstone.controller.ClientProxy   : Updated gameboard to string : GameBoard[id=46, gameId=45, p1ClientId=5011564309093734, p2ClientId=2951564307866692, turn=null,
p1HandOfCards='',
 p1CardsOnGround='',
 p2HandOfCards='',
 p2CardsOnGround='']
2019-07-28 12:18:24.046  INFO 12468 --- [boundChannel-23] minihearthstone.controller.ClientProxy   : Received initgame from player: 2951564307866692
2019-07-28 12:18:24.056  INFO 12468 --- [boundChannel-23] minihearthstone.controller.ClientProxy   : Random  :1
2019-07-28 12:18:24.057  INFO 12468 --- [boundChannel-23] minihearthstone.controller.ClientProxy   : The lucky winner is 2951564307866692
2019-07-28 12:18:24.063  INFO 12468 --- [boundChannel-19] minihearthstone.controller.ClientProxy   : Received initgame from player: 2951564307866692
2019-07-28 12:18:24.078  INFO 12468 --- [boundChannel-29] minihearthstone.controller.ClientProxy   : Received getfirsthand() from player : 2951564307866692
2019-07-28 12:18:24.078  INFO 12468 --- [boundChannel-29] minihearthstone.controller.ClientProxy   : -------------------------------------------------
2019-07-28 12:18:24.080  INFO 12468 --- [boundChannel-21] minihearthstone.controller.ClientProxy   : Received getfirsthand() from player : 2951564307866692
2019-07-28 12:18:24.081  INFO 12468 --- [boundChannel-21] minihearthstone.controller.ClientProxy   : -------------------------------------------------
2019-07-28 12:18:24.081  INFO 12468 --- [boundChannel-28] minihearthstone.controller.ClientProxy   : Received getfirsthand() from player : 2951564307866692
2019-07-28 12:18:24.081  INFO 12468 --- [boundChannel-28] minihearthstone.controller.ClientProxy   : -------------------------------------------------
2019-07-28 12:18:24.094  INFO 12468 --- [boundChannel-24] minihearthstone.controller.ClientProxy   : Received getfirsthand() from player : 2951564307866692
2019-07-28 12:18:24.094  INFO 12468 --- [boundChannel-24] minihearthstone.controller.ClientProxy   : -------------------------------------------------
2019-07-28 12:18:24.099  INFO 12468 --- [boundChannel-29] minihearthstone.entities.deck.Deck       : Random hand of : 3 cards.
2019-07-28 12:18:24.099  INFO 12468 --- [boundChannel-18] minihearthstone.controller.ClientProxy   : Received getfirsthand() from player : 2951564307866692
2019-07-28 12:18:24.099  INFO 12468 --- [boundChannel-18] minihearthstone.controller.ClientProxy   : -------------------------------------------------
2019-07-28 12:18:24.099  INFO 12468 --- [boundChannel-29] minihearthstone.entities.deck.Deck       : Cards where manacost <= 2 [Card[id=14, uniqueId='Sanglier brocheroc15643078260781782208418', name='Sanglier brocheroc', manacost=1, damage=1, lifepoints=1, nature='servant', canAttack=false, currentTargetUniqueId='Sanglier brocheroc15643078260781782208418', effect='null', specificCard='null'], Card[id=15, uniqueId='Soldat du comtÚ-de-l'or1564307826078785927536', name='Soldat du comtÚ-de-l'or', manacost=1, damage=1, lifepoints=2, nature='servant', canAttack=false, currentTargetUniqueId='Soldat du comtÚ-de-l'or1564307826078785927536', effect='ProvocationEffect', specificCard='null'], Card[id=19, uniqueId='Tourbillon15643078260781874641945', name='Tourbillon', manacost=1, damage=1, lifepoints=0, nature='spell', canAttack=false, currentTargetUniqueId='Tourbillon15643078260781874641945', effect='null', specificCard='Tourbillon'], Card[id=20, uniqueId='Avocat commis d'office15643078260781820662205', name='Avocat commis d'office', manacost=2, damage=0, lifepoints=7, nature='servant', canAttack=false, currentTargetUniqueId='Avocat commis d'office15643078260781820662205', effect='ProvocationEffect', specificCard='null']]
2019-07-28 12:18:24.099  INFO 12468 --- [boundChannel-29] minihearthstone.entities.deck.Deck       : Random pick index: 1
2019-07-28 12:18:24.099  INFO 12468 --- [boundChannel-29] minihearthstone.entities.deck.Deck       : Random pick index: 0
2019-07-28 12:18:24.099  INFO 12468 --- [boundChannel-29] minihearthstone.entities.deck.Deck       : Random pick index: 2
2019-07-28 12:18:24.100  INFO 12468 --- [boundChannel-29] minihearthstone.controller.ClientProxy   : Gameboard before hand of cards added : GameBoard[id=46, gameId=45, p1ClientId=5011564309093734, p2ClientId=2951564307866692, turn=2951564307866692,
p1HandOfCards='',
 p1CardsOnGround='',
 p2HandOfCards='',
 p2CardsOnGround='']

2019-07-28 12:18:24.100  INFO 12468 --- [boundChannel-29] minihearthstone.controller.ClientProxy   : P2 client id : 2951564307866692
2019-07-28 12:18:24.100  INFO 12468 --- [boundChannel-29] minihearthstone.controller.ClientProxy   : Number of cards in P2 hand : 3
2019-07-28 12:18:24.104  INFO 12468 --- [boundChannel-28] minihearthstone.entities.deck.Deck       : Random hand of : 3 cards.
2019-07-28 12:18:24.105  INFO 12468 --- [boundChannel-28] minihearthstone.entities.deck.Deck       : Cards where manacost <= 2 [Card[id=14, uniqueId='Sanglier brocheroc15643078260781782208418', name='Sanglier brocheroc', manacost=1, damage=1, lifepoints=1, nature='servant', canAttack=false, currentTargetUniqueId='Sanglier brocheroc15643078260781782208418', effect='null', specificCard='null'], Card[id=15, uniqueId='Soldat du comtÚ-de-l'or1564307826078785927536', name='Soldat du comtÚ-de-l'or', manacost=1, damage=1, lifepoints=2, nature='servant', canAttack=false, currentTargetUniqueId='Soldat du comtÚ-de-l'or1564307826078785927536', effect='ProvocationEffect', specificCard='null'], Card[id=19, uniqueId='Tourbillon15643078260781874641945', name='Tourbillon', manacost=1, damage=1, lifepoints=0, nature='spell', canAttack=false, currentTargetUniqueId='Tourbillon15643078260781874641945', effect='null', specificCard='Tourbillon'], Card[id=20, uniqueId='Avocat commis d'office15643078260781820662205', name='Avocat commis d'office', manacost=2, damage=0, lifepoints=7, nature='servant', canAttack=false, currentTargetUniqueId='Avocat commis d'office15643078260781820662205', effect='ProvocationEffect', specificCard='null']]
2019-07-28 12:18:24.106  INFO 12468 --- [boundChannel-28] minihearthstone.entities.deck.Deck       : Random pick index: 0
2019-07-28 12:18:24.106  INFO 12468 --- [boundChannel-28] minihearthstone.entities.deck.Deck       : Random pick index: 0
2019-07-28 12:18:24.106  INFO 12468 --- [boundChannel-28] minihearthstone.entities.deck.Deck       : Random pick index: 0
2019-07-28 12:18:24.106  INFO 12468 --- [boundChannel-28] minihearthstone.controller.ClientProxy   : Gameboard before hand of cards added : GameBoard[id=46, gameId=45, p1ClientId=5011564309093734, p2ClientId=2951564307866692, turn=2951564307866692,
p1HandOfCards='',
 p1CardsOnGround='',
 p2HandOfCards='',
 p2CardsOnGround='']

2019-07-28 12:18:24.106  INFO 12468 --- [boundChannel-28] minihearthstone.controller.ClientProxy   : P2 client id : 2951564307866692
2019-07-28 12:18:24.106  INFO 12468 --- [boundChannel-28] minihearthstone.controller.ClientProxy   : Number of cards in P2 hand : 3
2019-07-28 12:18:24.108  INFO 12468 --- [boundChannel-21] minihearthstone.entities.deck.Deck       : Random hand of : 3 cards.
2019-07-28 12:18:24.108  INFO 12468 --- [boundChannel-21] minihearthstone.entities.deck.Deck       : Cards where manacost <= 2 [Card[id=14, uniqueId='Sanglier brocheroc15643078260781782208418', name='Sanglier brocheroc', manacost=1, damage=1, lifepoints=1, nature='servant', canAttack=false, currentTargetUniqueId='Sanglier brocheroc15643078260781782208418', effect='null', specificCard='null'], Card[id=15, uniqueId='Soldat du comtÚ-de-l'or1564307826078785927536', name='Soldat du comtÚ-de-l'or', manacost=1, damage=1, lifepoints=2, nature='servant', canAttack=false, currentTargetUniqueId='Soldat du comtÚ-de-l'or1564307826078785927536', effect='ProvocationEffect', specificCard='null'], Card[id=19, uniqueId='Tourbillon15643078260781874641945', name='Tourbillon', manacost=1, damage=1, lifepoints=0, nature='spell', canAttack=false, currentTargetUniqueId='Tourbillon15643078260781874641945', effect='null', specificCard='Tourbillon'], Card[id=20, uniqueId='Avocat commis d'office15643078260781820662205', name='Avocat commis d'office', manacost=2, damage=0, lifepoints=7, nature='servant', canAttack=false, currentTargetUniqueId='Avocat commis d'office15643078260781820662205', effect='ProvocationEffect', specificCard='null']]
2019-07-28 12:18:24.109  INFO 12468 --- [boundChannel-21] minihearthstone.entities.deck.Deck       : Random pick index: 0
2019-07-28 12:18:24.109  INFO 12468 --- [boundChannel-21] minihearthstone.entities.deck.Deck       : Random pick index: 1
2019-07-28 12:18:24.109  INFO 12468 --- [boundChannel-21] minihearthstone.entities.deck.Deck       : Random pick index: 1
2019-07-28 12:18:24.109  INFO 12468 --- [boundChannel-21] minihearthstone.controller.ClientProxy   : Gameboard before hand of cards added : GameBoard[id=46, gameId=45, p1ClientId=5011564309093734, p2ClientId=2951564307866692, turn=2951564307866692,
p1HandOfCards='',
 p1CardsOnGround='',
 p2HandOfCards='',
 p2CardsOnGround='']

2019-07-28 12:18:24.109  INFO 12468 --- [boundChannel-21] minihearthstone.controller.ClientProxy   : P2 client id : 2951564307866692
2019-07-28 12:18:24.109  INFO 12468 --- [boundChannel-21] minihearthstone.controller.ClientProxy   : Number of cards in P2 hand : 3
2019-07-28 12:18:24.111  INFO 12468 --- [boundChannel-24] minihearthstone.entities.deck.Deck       : Random hand of : 3 cards.
2019-07-28 12:18:24.112  INFO 12468 --- [boundChannel-24] minihearthstone.entities.deck.Deck       : Cards where manacost <= 2 [Card[id=14, uniqueId='Sanglier brocheroc15643078260781782208418', name='Sanglier brocheroc', manacost=1, damage=1, lifepoints=1, nature='servant', canAttack=false, currentTargetUniqueId='Sanglier brocheroc15643078260781782208418', effect='null', specificCard='null'], Card[id=15, uniqueId='Soldat du comtÚ-de-l'or1564307826078785927536', name='Soldat du comtÚ-de-l'or', manacost=1, damage=1, lifepoints=2, nature='servant', canAttack=false, currentTargetUniqueId='Soldat du comtÚ-de-l'or1564307826078785927536', effect='ProvocationEffect', specificCard='null'], Card[id=19, uniqueId='Tourbillon15643078260781874641945', name='Tourbillon', manacost=1, damage=1, lifepoints=0, nature='spell', canAttack=false, currentTargetUniqueId='Tourbillon15643078260781874641945', effect='null', specificCard='Tourbillon'], Card[id=20, uniqueId='Avocat commis d'office15643078260781820662205', name='Avocat commis d'office', manacost=2, damage=0, lifepoints=7, nature='servant', canAttack=false, currentTargetUniqueId='Avocat commis d'office15643078260781820662205', effect='ProvocationEffect', specificCard='null']]
2019-07-28 12:18:24.112  INFO 12468 --- [boundChannel-24] minihearthstone.entities.deck.Deck       : Random pick index: 1
2019-07-28 12:18:24.112  INFO 12468 --- [boundChannel-24] minihearthstone.entities.deck.Deck       : Random pick index: 2
2019-07-28 12:18:24.112  INFO 12468 --- [boundChannel-24] minihearthstone.entities.deck.Deck       : Random pick index: 1
2019-07-28 12:18:24.112  INFO 12468 --- [boundChannel-24] minihearthstone.controller.ClientProxy   : Gameboard before hand of cards added : GameBoard[id=46, gameId=45, p1ClientId=5011564309093734, p2ClientId=2951564307866692, turn=2951564307866692,
p1HandOfCards='',
 p1CardsOnGround='',
 p2HandOfCards='',
 p2CardsOnGround='']

2019-07-28 12:18:24.112  INFO 12468 --- [boundChannel-24] minihearthstone.controller.ClientProxy   : P2 client id : 2951564307866692
2019-07-28 12:18:24.112  INFO 12468 --- [boundChannel-24] minihearthstone.controller.ClientProxy   : Number of cards in P2 hand : 3
2019-07-28 12:18:24.115  INFO 12468 --- [boundChannel-30] minihearthstone.controller.ClientProxy   : Received getfirsthand() from player : 2951564307866692
2019-07-28 12:18:24.115  INFO 12468 --- [boundChannel-30] minihearthstone.controller.ClientProxy   : -------------------------------------------------
2019-07-28 12:18:24.121  INFO 12468 --- [boundChannel-28] minihearthstone.controller.ClientProxy   : Hand of cards saved in gameboard : [Card[id=null, uniqueId='Sanglier brocheroc15643091041061529603653', name='Sanglier brocheroc', manacost=1, damage=1, lifepoints=1, nature='servant', canAttack=false, currentTargetUniqueId='Sanglier brocheroc15643091041061529603653', effect='null', specificCard='null'], Card[id=null, uniqueId='Sanglier brocheroc1564309104106128173498', name='Sanglier brocheroc', manacost=1, damage=1, lifepoints=1, nature='servant', canAttack=false, currentTargetUniqueId='Sanglier brocheroc1564309104106128173498', effect='null', specificCard='null'], Card[id=null, uniqueId='Sanglier brocheroc1564309104106988677072', name='Sanglier brocheroc', manacost=1, damage=1, lifepoints=1, nature='servant', canAttack=false, currentTargetUniqueId='Sanglier brocheroc1564309104106988677072', effect='null', specificCard='null']]
2019-07-28 12:18:24.139  INFO 12468 --- [boundChannel-28] minihearthstone.controller.ClientProxy   : Gameboard after hand of cards added : GameBoard[id=46, gameId=45, p1ClientId=5011564309093734, p2ClientId=2951564307866692, turn=2951564307866692,
p1HandOfCards='',
 p1CardsOnGround='',
 p2HandOfCards='Sanglier brocheroc15643091041061529603653; Sanglier brocheroc1564309104106128173498; Sanglier brocheroc1564309104106988677072; ',
 p2CardsOnGround='']

2019-07-28 12:18:24.148  INFO 12468 --- [boundChannel-21] minihearthstone.controller.ClientProxy   : Hand of cards saved in gameboard : [Card[id=null, uniqueId='Sanglier brocheroc1564309104109496621421', name='Sanglier brocheroc', manacost=1, damage=1, lifepoints=1, nature='servant', canAttack=false, currentTargetUniqueId='Sanglier brocheroc1564309104109496621421', effect='null', specificCard='null'], Card[id=null, uniqueId='Soldat du comtÚ-de-l'or15643091041091527679789', name='Soldat du comtÚ-de-l'or', manacost=1,
damage=1, lifepoints=2, nature='servant', canAttack=false, currentTargetUniqueId='Soldat du comtÚ-de-l'or15643091041091527679789', effect='ProvocationEffect', specificCard='null'], Card[id=null, uniqueId='Soldat du comtÚ-de-l'or1564309104109606554932', name='Soldat du comtÚ-de-l'or', manacost=1, damage=1, lifepoints=2, nature='servant', canAttack=false, currentTargetUniqueId='Soldat du comtÚ-de-l'or1564309104109606554932', effect='ProvocationEffect', specificCard='null']]
2019-07-28 12:18:24.148  INFO 12468 --- [boundChannel-18] minihearthstone.entities.deck.Deck       : Random hand of : 3 cards.
2019-07-28 12:18:24.153  INFO 12468 --- [boundChannel-18] minihearthstone.entities.deck.Deck       : Cards where manacost <= 2 [Card[id=14, uniqueId='Sanglier brocheroc15643078260781782208418', name='Sanglier brocheroc', manacost=1, damage=1, lifepoints=1, nature='servant', canAttack=false, currentTargetUniqueId='Sanglier brocheroc15643078260781782208418', effect='null', specificCard='null'], Card[id=15, uniqueId='Soldat du comtÚ-de-l'or1564307826078785927536', name='Soldat du comtÚ-de-l'or', manacost=1, damage=1, lifepoints=2, nature='servant', canAttack=false, currentTargetUniqueId='Soldat du comtÚ-de-l'or1564307826078785927536', effect='ProvocationEffect', specificCard='null'], Card[id=19, uniqueId='Tourbillon15643078260781874641945', name='Tourbillon', manacost=1, damage=1, lifepoints=0, nature='spell', canAttack=false, currentTargetUniqueId='Tourbillon15643078260781874641945', effect='null', specificCard='Tourbillon'], Card[id=20, uniqueId='Avocat commis d'office15643078260781820662205', name='Avocat commis d'office', manacost=2, damage=0, lifepoints=7, nature='servant', canAttack=false, currentTargetUniqueId='Avocat commis d'office15643078260781820662205', effect='ProvocationEffect', specificCard='null']]
2019-07-28 12:18:24.153  INFO 12468 --- [boundChannel-18] minihearthstone.entities.deck.Deck       : Random pick index: 2
2019-07-28 12:18:24.153  INFO 12468 --- [boundChannel-18] minihearthstone.entities.deck.Deck       : Random pick index: 2
2019-07-28 12:18:24.153  INFO 12468 --- [boundChannel-18] minihearthstone.entities.deck.Deck       : Random pick index: 6
2019-07-28 12:18:24.154  INFO 12468 --- [boundChannel-18] minihearthstone.controller.ClientProxy   : Gameboard before hand of cards added : GameBoard[id=46, gameId=45, p1ClientId=5011564309093734, p2ClientId=2951564307866692, turn=2951564307866692,
p1HandOfCards='',
 p1CardsOnGround='',
 p2HandOfCards='Sanglier brocheroc15643091041061529603653; Sanglier brocheroc1564309104106128173498; Sanglier brocheroc1564309104106988677072; ',
 p2CardsOnGround='']

2019-07-28 12:18:24.161  INFO 12468 --- [boundChannel-18] minihearthstone.controller.ClientProxy   : Hand of cards saved in gameboard : [Card[id=null, uniqueId='Tourbillon1564309104153483432223', name='Tourbillon', manacost=1, damage=1, lifepoints=0, nature='spell', canAttack=false, currentTargetUniqueId='Tourbillon1564309104153483432223', effect='null', specificCard='Tourbillon'], Card[id=null, uniqueId='Tourbillon15643091041532083763279', name='Tourbillon', manacost=1, damage=1, lifepoints=0, nature='spell', canAttack=false, currentTargetUniqueId='Tourbillon15643091041532083763279', effect='null', specificCard='Tourbillon'], Card[id=null, uniqueId='Avocat commis d'office1564309104153450309727', name='Avocat commis d'office', manacost=2, damage=0, lifepoints=7, nature='servant', canAttack=false, currentTargetUniqueId='Avocat commis d'office1564309104153450309727', effect='ProvocationEffect', specificCard='null']]
2019-07-28 12:18:24.168  INFO 12468 --- [boundChannel-29] minihearthstone.controller.ClientProxy   : Hand of cards saved in gameboard : [Card[id=null, uniqueId='Soldat du comtÚ-de-l'or15643091040991506816921', name='Soldat du comtÚ-de-l'or', manacost=1, damage=1, lifepoints=2, nature='servant', canAttack=false, currentTargetUniqueId='Soldat du comtÚ-de-l'or15643091040991506816921', effect='ProvocationEffect', specificCard='null'], Card[id=null, uniqueId='Sanglier brocheroc15643091040991803397187', name='Sanglier brocheroc', manacost=1, damage=1, lifepoints=1, nature='servant', canAttack=false, currentTargetUniqueId='Sanglier brocheroc15643091040991803397187', effect='null', specificCard='null'], Card[id=null, uniqueId='Chevaucheur de loup15643091040991598594926', name='Chevaucheur de loup', manacost=3, damage=3, lifepoints=1, nature='servant', canAttack=false, currentTargetUniqueId='Chevaucheur de loup15643091040991598594926', effect='ChargeEffect', specificCard='null']]
2019-07-28 12:18:24.169  INFO 12468 --- [boundChannel-18] minihearthstone.controller.ClientProxy   : Gameboard after hand of cards added : GameBoard[id=46, gameId=45, p1ClientId=5011564309093734, p2ClientId=2951564307866692, turn=2951564307866692,
p1HandOfCards='',
 p1CardsOnGround='',
 p2HandOfCards='Sanglier brocheroc15643091041061529603653; Sanglier brocheroc1564309104106128173498; Sanglier brocheroc1564309104106988677072; Sanglier brocheroc1564309104109496621421; Soldat du comtÚ-de-l'or15643091041091527679789; Soldat du comtÚ-de-l'or1564309104109606554932; ',
 p2CardsOnGround='']

2019-07-28 12:18:24.172  INFO 12468 --- [boundChannel-30] minihearthstone.entities.deck.Deck       : Random hand of : 3 cards.
2019-07-28 12:18:24.172  INFO 12468 --- [boundChannel-30] minihearthstone.entities.deck.Deck       : Cards where manacost <= 2 [Card[id=14, uniqueId='Sanglier brocheroc15643078260781782208418', name='Sanglier brocheroc', manacost=1, damage=1, lifepoints=1, nature='servant', canAttack=false, currentTargetUniqueId='Sanglier brocheroc15643078260781782208418', effect='null', specificCard='null'], Card[id=15, uniqueId='Soldat du comtÚ-de-l'or1564307826078785927536', name='Soldat du comtÚ-de-l'or', manacost=1, damage=1, lifepoints=2, nature='servant', canAttack=false, currentTargetUniqueId='Soldat du comtÚ-de-l'or1564307826078785927536', effect='ProvocationEffect', specificCard='null'], Card[id=19, uniqueId='Tourbillon15643078260781874641945', name='Tourbillon', manacost=1, damage=1, lifepoints=0, nature='spell', canAttack=false, currentTargetUniqueId='Tourbillon15643078260781874641945', effect='null', specificCard='Tourbillon'], Card[id=20, uniqueId='Avocat commis d'office15643078260781820662205', name='Avocat commis d'office', manacost=2, damage=0, lifepoints=7, nature='servant', canAttack=false, currentTargetUniqueId='Avocat commis d'office15643078260781820662205', effect='ProvocationEffect', specificCard='null']]
2019-07-28 12:18:24.173  INFO 12468 --- [boundChannel-30] minihearthstone.entities.deck.Deck       : Random pick index: 1
2019-07-28 12:18:24.173  INFO 12468 --- [boundChannel-30] minihearthstone.entities.deck.Deck       : Random pick index: 2
2019-07-28 12:18:24.173  INFO 12468 --- [boundChannel-30] minihearthstone.entities.deck.Deck       : Random pick index: 4
2019-07-28 12:18:24.173  INFO 12468 --- [boundChannel-30] minihearthstone.controller.ClientProxy   : Gameboard before hand of cards added : GameBoard[id=46, gameId=45, p1ClientId=5011564309093734, p2ClientId=2951564307866692, turn=2951564307866692,
p1HandOfCards='',
 p1CardsOnGround='',
 p2HandOfCards='Sanglier brocheroc15643091041061529603653; Sanglier brocheroc1564309104106128173498; Sanglier brocheroc1564309104106988677072; Sanglier brocheroc1564309104109496621421; Soldat du comtÚ-de-l'or15643091041091527679789; Soldat du comtÚ-de-l'or1564309104109606554932; ',
 p2CardsOnGround='']

2019-07-28 12:18:24.178  INFO 12468 --- [boundChannel-24] minihearthstone.controller.ClientProxy   : Hand of cards saved in gameboard : [Card[id=null, uniqueId='Soldat du comtÚ-de-l'or15643091041121414244286', name='Soldat du comtÚ-de-l'or', manacost=1, damage=1, lifepoints=2, nature='servant', canAttack=false, currentTargetUniqueId='Soldat du comtÚ-de-l'or15643091041121414244286', effect='ProvocationEffect', specificCard='null'], Card[id=null, uniqueId='Tourbillon1564309104112937504992', name='Tourbillon', manacost=1, damage=1, lifepoints=0, nature='spell', canAttack=false, currentTargetUniqueId='Tourbillon1564309104112937504992', effect='null', specificCard='Tourbillon'], Card[id=null, uniqueId='Soldat du comtÚ-de-l'or156430910411244003318', name='Soldat du comtÚ-de-l'or', manacost=1, damage=1, lifepoints=2, nature='servant', canAttack=false, currentTargetUniqueId='Soldat du comtÚ-de-l'or156430910411244003318', effect='ProvocationEffect', specificCard='null']]
2019-07-28 12:18:24.199  INFO 12468 --- [boundChannel-29] minihearthstone.controller.ClientProxy   : Gameboard after hand of cards added : GameBoard[id=46, gameId=45, p1ClientId=5011564309093734, p2ClientId=2951564307866692, turn=2951564307866692,
p1HandOfCards='',
 p1CardsOnGround='',
 p2HandOfCards='Sanglier brocheroc15643091041061529603653; Sanglier brocheroc1564309104106128173498; Sanglier brocheroc1564309104106988677072; Soldat du comtÚ-de-l'or15643091040991506816921; Sanglier brocheroc15643091040991803397187; Sanglier brocheroc1564309104109496621421; Soldat du comtÚ-de-l'or15643091041091527679789; Soldat du comtÚ-de-l'or1564309104109606554932; Chevaucheur de loup15643091040991598594926; ',
 p2CardsOnGround='']

2019-07-28 12:18:24.206  INFO 12468 --- [boundChannel-21] minihearthstone.controller.ClientProxy   : Gameboard after hand of cards added : GameBoard[id=46, gameId=45, p1ClientId=5011564309093734, p2ClientId=2951564307866692, turn=2951564307866692,
p1HandOfCards='',
 p1CardsOnGround='',
 p2HandOfCards='Sanglier brocheroc15643091041061529603653; Sanglier brocheroc1564309104106128173498; Sanglier brocheroc1564309104106988677072; Sanglier brocheroc1564309104109496621421; Soldat du comtÚ-de-l'or15643091041091527679789; Soldat du comtÚ-de-l'or1564309104109606554932; ',
 p2CardsOnGround='']

2019-07-28 12:18:24.214  INFO 12468 --- [boundChannel-30] minihearthstone.controller.ClientProxy   : Hand of cards saved in gameboard : [Card[id=null, uniqueId='Soldat du comtÚ-de-l'or1564309104173444770035', name='Soldat du comtÚ-de-l'or', manacost=1, damage=1, lifepoints=2, nature='servant', canAttack=false, currentTargetUniqueId='Soldat du comtÚ-de-l'or1564309104173444770035', effect='ProvocationEffect', specificCard='null'], Card[id=null, uniqueId='Tourbillon1564309104173728221677', name='Tourbillon', manacost=1, damage=1, lifepoints=0, nature='spell', canAttack=false, currentTargetUniqueId='Tourbillon1564309104173728221677', effect='null', specificCard='Tourbillon'], Card[id=null, uniqueId='YÚti noroit1564309104173927987791', name='YÚti noroit', manacost=4, damage=4, lifepoints=5, nature='servant', canAttack=false, currentTargetUniqueId='YÚti noroit1564309104173927987791', effect='null', specificCard='null']]
2019-07-28 12:18:24.226  INFO 12468 --- [boundChannel-30] minihearthstone.controller.ClientProxy   : Gameboard after hand of cards added : GameBoard[id=46, gameId=45, p1ClientId=5011564309093734, p2ClientId=2951564307866692, turn=2951564307866692,
p1HandOfCards='',
 p1CardsOnGround='',
 p2HandOfCards='Sanglier brocheroc15643091041061529603653; Sanglier brocheroc1564309104106128173498; Sanglier brocheroc1564309104106988677072; Soldat du comtÚ-de-l'or15643091040991506816921; Sanglier brocheroc15643091040991803397187; Sanglier brocheroc1564309104109496621421; Soldat du comtÚ-de-l'or15643091041091527679789; Soldat du comtÚ-de-l'or1564309104109606554932; Chevaucheur de loup15643091040991598594926; Soldat du comtÚ-de-l'or15643091041121414244286; Tourbillon1564309104112937504992; Soldat du comtÚ-de-l'or156430910411244003318; ',
 p2CardsOnGround='']

2019-07-28 12:18:24.230  INFO 12468 --- [boundChannel-24] minihearthstone.controller.ClientProxy   : Gameboard after hand of cards added : GameBoard[id=46, gameId=45, p1ClientId=5011564309093734, p2ClientId=2951564307866692, turn=2951564307866692,
p1HandOfCards='',
 p1CardsOnGround='',
 p2HandOfCards='Sanglier brocheroc15643091041061529603653; Sanglier brocheroc1564309104106128173498; Sanglier brocheroc1564309104106988677072; Soldat du comtÚ-de-l'or15643091040991506816921; Sanglier brocheroc15643091040991803397187; Sanglier brocheroc1564309104109496621421; Soldat du comtÚ-de-l'or15643091041091527679789; Soldat du comtÚ-de-l'or1564309104109606554932; Chevaucheur de loup15643091040991598594926; Soldat du comtÚ-de-l'or15643091041121414244286; Tourbillon1564309104112937504992; Soldat du comtÚ-de-l'or156430910411244003318; ',
 p2CardsOnGround='']

2019-07-28 12:18:24.577  INFO 12468 --- [boundChannel-25] minihearthstone.controller.ClientProxy   : Received initgame from player: 5011564309093734
2019-07-28 12:18:24.584  INFO 12468 --- [boundChannel-27] minihearthstone.controller.ClientProxy   : Received initgame from player: 5011564309093734
2019-07-28 12:18:24.596  INFO 12468 --- [boundChannel-21] minihearthstone.controller.ClientProxy   : Received getfirsthand() from player : 5011564309093734
2019-07-28 12:18:24.597  INFO 12468 --- [boundChannel-21] minihearthstone.controller.ClientProxy   : -------------------------------------------------
2019-07-28 12:18:24.601  INFO 12468 --- [boundChannel-24] minihearthstone.controller.ClientProxy   : Received getfirsthand() from player : 5011564309093734
2019-07-28 12:18:24.601  INFO 12468 --- [boundChannel-24] minihearthstone.controller.ClientProxy   : -------------------------------------------------
2019-07-28 12:18:24.610  INFO 12468 --- [boundChannel-18] minihearthstone.controller.ClientProxy   : Received getfirsthand() from player : 5011564309093734
2019-07-28 12:18:24.610  INFO 12468 --- [boundChannel-18] minihearthstone.controller.ClientProxy   : -------------------------------------------------
2019-07-28 12:18:24.615  INFO 12468 --- [boundChannel-17] minihearthstone.controller.ClientProxy   : Received getfirsthand() from player : 5011564309093734
2019-07-28 12:18:24.615  INFO 12468 --- [boundChannel-17] minihearthstone.controller.ClientProxy   : -------------------------------------------------
2019-07-28 12:18:24.635  INFO 12468 --- [boundChannel-24] minihearthstone.entities.deck.Deck       : Random hand of : 3 cards.
2019-07-28 12:18:24.635  INFO 12468 --- [boundChannel-21] minihearthstone.entities.deck.Deck       : Random hand of : 3 cards.
2019-07-28 12:18:24.636  INFO 12468 --- [boundChannel-21] minihearthstone.entities.deck.Deck       : Cards where manacost <= 2 [Card[id=23, uniqueId='Sanglier brocheroc15643078260781975569728', name='Sanglier brocheroc', manacost=1, damage=1, lifepoints=1, nature='servant', canAttack=false, currentTargetUniqueId='Sanglier brocheroc15643078260781975569728', effect='null', specificCard='null'], Card[id=24, uniqueId='Soldat du comtÚ-de-l'or15643078260782096524892', name='Soldat du comtÚ-de-l'or', manacost=1, damage=1, lifepoints=2, nature='servant', canAttack=false, currentTargetUniqueId='Soldat du comtÚ-de-l'or15643078260782096524892', effect='ProvocationEffect', specificCard='null'], Card[id=28, uniqueId='Image mirroir156430782607824652094', name='Image mirroir', manacost=1, damage=0, lifepoints=2, nature='spell', canAttack=false, currentTargetUniqueId='Image mirroir156430782607824652094', effect='ProvocationEffect', specificCard='ImageMirroir'], Card[id=29, uniqueId='Explosion des arcanes1564307826078146662754', name='Explosion
des arcanes', manacost=2, damage=1, lifepoints=0, nature='spell', canAttack=false, currentTargetUniqueId='Explosion des arcanes1564307826078146662754', effect='null', specificCard='ExplosionDesArcanes']]
2019-07-28 12:18:24.636  INFO 12468 --- [boundChannel-21] minihearthstone.entities.deck.Deck       : Random pick index: 0
2019-07-28 12:18:24.636  INFO 12468 --- [boundChannel-21] minihearthstone.entities.deck.Deck       : Random pick index: 2
2019-07-28 12:18:24.635  INFO 12468 --- [boundChannel-24] minihearthstone.entities.deck.Deck       : Cards where manacost <= 2 [Card[id=23, uniqueId='Sanglier brocheroc15643078260781975569728', name='Sanglier brocheroc', manacost=1, damage=1, lifepoints=1, nature='servant', canAttack=false, currentTargetUniqueId='Sanglier brocheroc15643078260781975569728', effect='null', specificCard='null'], Card[id=24, uniqueId='Soldat du comtÚ-de-l'or15643078260782096524892', name='Soldat du comtÚ-de-l'or', manacost=1, damage=1, lifepoints=2, nature='servant', canAttack=false, currentTargetUniqueId='Soldat du comtÚ-de-l'or15643078260782096524892', effect='ProvocationEffect', specificCard='null'], Card[id=28, uniqueId='Image mirroir156430782607824652094', name='Image mirroir', manacost=1, damage=0, lifepoints=2, nature='spell', canAttack=false, currentTargetUniqueId='Image mirroir156430782607824652094', effect='ProvocationEffect', specificCard='ImageMirroir'], Card[id=29, uniqueId='Explosion des arcanes1564307826078146662754', name='Explosion
des arcanes', manacost=2, damage=1, lifepoints=0, nature='spell', canAttack=false, currentTargetUniqueId='Explosion des arcanes1564307826078146662754', effect='null', specificCard='ExplosionDesArcanes']]
2019-07-28 12:18:24.636  INFO 12468 --- [boundChannel-24] minihearthstone.entities.deck.Deck       : Random pick index: 2
2019-07-28 12:18:24.636  INFO 12468 --- [boundChannel-24] minihearthstone.entities.deck.Deck       : Random pick index: 0
2019-07-28 12:18:24.636  INFO 12468 --- [boundChannel-24] minihearthstone.entities.deck.Deck       : Random pick index: 6
2019-07-28 12:18:24.637  INFO 12468 --- [boundChannel-21] minihearthstone.entities.deck.Deck       : Random pick index: 5
2019-07-28 12:18:24.637  INFO 12468 --- [boundChannel-21] minihearthstone.controller.ClientProxy   : Gameboard before hand of cards added : GameBoard[id=46, gameId=45, p1ClientId=5011564309093734, p2ClientId=2951564307866692, turn=2951564307866692,
p1HandOfCards='',
 p1CardsOnGround='',
 p2HandOfCards='Sanglier brocheroc15643091041061529603653; Sanglier brocheroc1564309104106128173498; Sanglier brocheroc1564309104106988677072; Soldat du comtÚ-de-l'or15643091040991506816921; Sanglier brocheroc15643091040991803397187; Sanglier brocheroc1564309104109496621421; Soldat du comtÚ-de-l'or15643091041091527679789; Soldat du comtÚ-de-l'or1564309104109606554932; Chevaucheur de loup15643091040991598594926; Soldat du comtÚ-de-l'or15643091041121414244286; Tourbillon1564309104112937504992; Soldat du comtÚ-de-l'or156430910411244003318; ',
 p2CardsOnGround='']

2019-07-28 12:18:24.637  INFO 12468 --- [boundChannel-21] minihearthstone.controller.ClientProxy   : P1 client id : 5011564309093734
2019-07-28 12:18:24.637  INFO 12468 --- [boundChannel-21] minihearthstone.controller.ClientProxy   : Number of cards in P1 hand : 3
2019-07-28 12:18:24.638  INFO 12468 --- [boundChannel-24] minihearthstone.controller.ClientProxy   : Gameboard before hand of cards added : GameBoard[id=46, gameId=45, p1ClientId=5011564309093734, p2ClientId=2951564307866692, turn=2951564307866692,
p1HandOfCards='',
 p1CardsOnGround='',
 p2HandOfCards='Sanglier brocheroc15643091041061529603653; Sanglier brocheroc1564309104106128173498; Sanglier brocheroc1564309104106988677072; Soldat du comtÚ-de-l'or15643091040991506816921; Sanglier brocheroc15643091040991803397187; Sanglier brocheroc1564309104109496621421; Soldat du comtÚ-de-l'or15643091041091527679789; Soldat du comtÚ-de-l'or1564309104109606554932; Chevaucheur de loup15643091040991598594926; Soldat du comtÚ-de-l'or15643091041121414244286; Tourbillon1564309104112937504992; Soldat du comtÚ-de-l'or156430910411244003318; ',
 p2CardsOnGround='']

2019-07-28 12:18:24.638  INFO 12468 --- [boundChannel-24] minihearthstone.controller.ClientProxy   : P1 client id : 5011564309093734
2019-07-28 12:18:24.638  INFO 12468 --- [boundChannel-24] minihearthstone.controller.ClientProxy   : Number of cards in P1 hand : 3
2019-07-28 12:18:24.647  INFO 12468 --- [boundChannel-18] minihearthstone.entities.deck.Deck       : Random hand of : 3 cards.
2019-07-28 12:18:24.648  INFO 12468 --- [boundChannel-18] minihearthstone.entities.deck.Deck       : Cards where manacost <= 2 [Card[id=23, uniqueId='Sanglier brocheroc15643078260781975569728', name='Sanglier brocheroc', manacost=1, damage=1, lifepoints=1, nature='servant', canAttack=false, currentTargetUniqueId='Sanglier brocheroc15643078260781975569728', effect='null', specificCard='null'], Card[id=24, uniqueId='Soldat du comtÚ-de-l'or15643078260782096524892', name='Soldat du comtÚ-de-l'or', manacost=1, damage=1, lifepoints=2, nature='servant', canAttack=false, currentTargetUniqueId='Soldat du comtÚ-de-l'or15643078260782096524892', effect='ProvocationEffect', specificCard='null'], Card[id=28, uniqueId='Image mirroir156430782607824652094', name='Image mirroir', manacost=1, damage=0, lifepoints=2, nature='spell', canAttack=false, currentTargetUniqueId='Image mirroir156430782607824652094', effect='ProvocationEffect', specificCard='ImageMirroir'], Card[id=29, uniqueId='Explosion des arcanes1564307826078146662754', name='Explosion
des arcanes', manacost=2, damage=1, lifepoints=0, nature='spell', canAttack=false, currentTargetUniqueId='Explosion des arcanes1564307826078146662754', effect='null', specificCard='ExplosionDesArcanes']]
2019-07-28 12:18:24.649  INFO 12468 --- [boundChannel-18] minihearthstone.entities.deck.Deck       : Random pick index: 2
2019-07-28 12:18:24.659  INFO 12468 --- [boundChannel-18] minihearthstone.entities.deck.Deck       : Random pick index: 1
2019-07-28 12:18:24.659  INFO 12468 --- [boundChannel-18] minihearthstone.entities.deck.Deck       : Random pick index: 4
2019-07-28 12:18:24.659  INFO 12468 --- [boundChannel-18] minihearthstone.controller.ClientProxy   : Gameboard before hand of cards added : GameBoard[id=46, gameId=45, p1ClientId=5011564309093734, p2ClientId=2951564307866692, turn=2951564307866692,
p1HandOfCards='',
 p1CardsOnGround='',
 p2HandOfCards='Sanglier brocheroc15643091041061529603653; Sanglier brocheroc1564309104106128173498; Sanglier brocheroc1564309104106988677072; Soldat du comtÚ-de-l'or15643091040991506816921; Sanglier brocheroc15643091040991803397187; Sanglier brocheroc1564309104109496621421; Soldat du comtÚ-de-l'or15643091041091527679789; Soldat du comtÚ-de-l'or1564309104109606554932; Chevaucheur de loup15643091040991598594926; Soldat du comtÚ-de-l'or15643091041121414244286; Tourbillon1564309104112937504992; Soldat du comtÚ-de-l'or156430910411244003318; ',
 p2CardsOnGround='']

2019-07-28 12:18:24.659  INFO 12468 --- [boundChannel-18] minihearthstone.controller.ClientProxy   : P1 client id : 5011564309093734
2019-07-28 12:18:24.659  INFO 12468 --- [boundChannel-18] minihearthstone.controller.ClientProxy   : Number of cards in P1 hand : 3
2019-07-28 12:18:24.665  INFO 12468 --- [boundChannel-17] minihearthstone.entities.deck.Deck       : Random hand of : 3 cards.
2019-07-28 12:18:24.665  INFO 12468 --- [boundChannel-17] minihearthstone.entities.deck.Deck       : Cards where manacost <= 2 [Card[id=23, uniqueId='Sanglier brocheroc15643078260781975569728', name='Sanglier brocheroc', manacost=1, damage=1, lifepoints=1, nature='servant', canAttack=false, currentTargetUniqueId='Sanglier brocheroc15643078260781975569728', effect='null', specificCard='null'], Card[id=24, uniqueId='Soldat du comtÚ-de-l'or15643078260782096524892', name='Soldat du comtÚ-de-l'or', manacost=1, damage=1, lifepoints=2, nature='servant', canAttack=false, currentTargetUniqueId='Soldat du comtÚ-de-l'or15643078260782096524892', effect='ProvocationEffect', specificCard='null'], Card[id=28, uniqueId='Image mirroir156430782607824652094', name='Image mirroir', manacost=1, damage=0, lifepoints=2, nature='spell', canAttack=false, currentTargetUniqueId='Image mirroir156430782607824652094', effect='ProvocationEffect', specificCard='ImageMirroir'], Card[id=29, uniqueId='Explosion des arcanes1564307826078146662754', name='Explosion
des arcanes', manacost=2, damage=1, lifepoints=0, nature='spell', canAttack=false, currentTargetUniqueId='Explosion des arcanes1564307826078146662754', effect='null', specificCard='ExplosionDesArcanes']]
2019-07-28 12:18:24.665  INFO 12468 --- [boundChannel-17] minihearthstone.entities.deck.Deck       : Random pick index: 1
2019-07-28 12:18:24.666  INFO 12468 --- [boundChannel-17] minihearthstone.entities.deck.Deck       : Random pick index: 1
2019-07-28 12:18:24.666  INFO 12468 --- [boundChannel-17] minihearthstone.entities.deck.Deck       : Random pick index: 3
2019-07-28 12:18:24.666  INFO 12468 --- [boundChannel-17] minihearthstone.controller.ClientProxy   : Gameboard before hand of cards added : GameBoard[id=46, gameId=45, p1ClientId=5011564309093734, p2ClientId=2951564307866692, turn=2951564307866692,
p1HandOfCards='',
 p1CardsOnGround='',
 p2HandOfCards='Sanglier brocheroc15643091041061529603653; Sanglier brocheroc1564309104106128173498; Sanglier brocheroc1564309104106988677072; Soldat du comtÚ-de-l'or15643091040991506816921; Sanglier brocheroc15643091040991803397187; Sanglier brocheroc1564309104109496621421; Soldat du comtÚ-de-l'or15643091041091527679789; Soldat du comtÚ-de-l'or1564309104109606554932; Chevaucheur de loup15643091040991598594926; Soldat du comtÚ-de-l'or15643091041121414244286; Tourbillon1564309104112937504992; Soldat du comtÚ-de-l'or156430910411244003318; ',
 p2CardsOnGround='']

2019-07-28 12:18:24.666  INFO 12468 --- [boundChannel-17] minihearthstone.controller.ClientProxy   : P1 client id : 5011564309093734
2019-07-28 12:18:24.666  INFO 12468 --- [boundChannel-17] minihearthstone.controller.ClientProxy   : Number of cards in P1 hand : 3
2019-07-28 12:18:24.668  INFO 12468 --- [boundChannel-21] minihearthstone.controller.ClientProxy   : Hand of cards saved in gameboard : [Card[id=null, uniqueId='Sanglier brocheroc1564309104636939670430', name='Sanglier brocheroc', manacost=1, damage=1, lifepoints=1, nature='servant', canAttack=false, currentTargetUniqueId='Sanglier brocheroc1564309104636939670430', effect='null', specificCard='null'], Card[id=null, uniqueId='Image mirroir15643091046361296296066', name='Image mirroir', manacost=1, damage=0, lifepoints=2, nature='spell', canAttack=false, currentTargetUniqueId='Image mirroir15643091046361296296066', effect='ProvocationEffect', specificCard='ImageMirroir'], Card[id=null, uniqueId='Image mirroir1564309104637458375129', name='Image mirroir', manacost=1, damage=0, lifepoints=2, nature='spell', canAttack=false, currentTargetUniqueId='Image mirroir1564309104637458375129', effect='ProvocationEffect', specificCard='ImageMirroir']]
2019-07-28 12:18:24.676  INFO 12468 --- [boundChannel-24] minihearthstone.controller.ClientProxy   : Hand of cards saved in gameboard : [Card[id=null, uniqueId='Image mirroir1564309104636592646499', name='Image mirroir', manacost=1, damage=0, lifepoints=2, nature='spell', canAttack=false, currentTargetUniqueId='Image mirroir1564309104636592646499', effect='ProvocationEffect', specificCard='ImageMirroir'], Card[id=null, uniqueId='Sanglier brocheroc1564309104636926429297', name='Sanglier brocheroc', manacost=1, damage=1, lifepoints=1, nature='servant', canAttack=false, currentTargetUniqueId='Sanglier brocheroc1564309104636926429297', effect='null', specificCard='null'], Card[id=null, uniqueId='Explosion des arcanes15643091046371589590236', name='Explosion des arcanes', manacost=2, damage=1, lifepoints=0, nature='spell', canAttack=false, currentTargetUniqueId='Explosion des arcanes15643091046371589590236', effect='null', specificCard='ExplosionDesArcanes']]
2019-07-28 12:18:24.698  INFO 12468 --- [boundChannel-18] minihearthstone.controller.ClientProxy   : Hand of cards saved in gameboard : [Card[id=null, uniqueId='Image mirroir15643091046591938463152', name='Image mirroir', manacost=1, damage=0, lifepoints=2, nature='spell', canAttack=false, currentTargetUniqueId='Image mirroir15643091046591938463152', effect='ProvocationEffect', specificCard='ImageMirroir'], Card[id=null, uniqueId='Soldat du comtÚ-de-l'or15643091046591207888878', name='Soldat du comtÚ-de-l'or', manacost=1, damage=1, lifepoints=2, nature='servant', canAttack=false, currentTargetUniqueId='Soldat du comtÚ-de-l'or15643091046591207888878', effect='ProvocationEffect', specificCard='null'], Card[id=null, uniqueId='YÚti noroit15643091046591185303379', name='YÚti noroit', manacost=4, damage=4, lifepoints=5, nature='servant', canAttack=false, currentTargetUniqueId='YÚti noroit15643091046591185303379', effect='null', specificCard='null']]
2019-07-28 12:18:24.705  INFO 12468 --- [boundChannel-17] minihearthstone.controller.ClientProxy   : Hand of cards saved in gameboard : [Card[id=null, uniqueId='Soldat du comtÚ-de-l'or15643091046651964477219', name='Soldat du comtÚ-de-l'or', manacost=1, damage=1, lifepoints=2, nature='servant', canAttack=false, currentTargetUniqueId='Soldat du comtÚ-de-l'or15643091046651964477219', effect='ProvocationEffect', specificCard='null'], Card[id=null, uniqueId='Soldat du comtÚ-de-l'or1564309104666468218102', name='Soldat du comtÚ-de-l'or', manacost=1, damage=1, lifepoints=2, nature='servant', canAttack=false, currentTargetUniqueId='Soldat du comtÚ-de-l'or1564309104666468218102', effect='ProvocationEffect', specificCard='null'], Card[id=null, uniqueId='Chef de Raid156430910466616574925', name='Chef de Raid', manacost=3, damage=2, lifepoints=2, nature='servant', canAttack=false, currentTargetUniqueId='Chef de Raid156430910466616574925', effect='null', specificCard='ChefDeRaid']]
2019-07-28 12:18:24.709  INFO 12468 --- [boundChannel-24] minihearthstone.controller.ClientProxy   : Gameboard after hand of cards added : GameBoard[id=46, gameId=45, p1ClientId=5011564309093734, p2ClientId=2951564307866692, turn=2951564307866692,
p1HandOfCards='Sanglier brocheroc1564309104636939670430; Image mirroir15643091046361296296066; Image mirroir1564309104637458375129; Image mirroir1564309104636592646499; Sanglier brocheroc1564309104636926429297; Explosion des arcanes15643091046371589590236; Image mirroir15643091046591938463152; Soldat du comtÚ-de-l'or15643091046591207888878; YÚti
noroit15643091046591185303379; ',
 p1CardsOnGround='',
 p2HandOfCards='Sanglier brocheroc15643091041061529603653; Sanglier brocheroc1564309104106128173498; Sanglier brocheroc1564309104106988677072; Soldat du comtÚ-de-l'or15643091040991506816921; Sanglier brocheroc15643091040991803397187; Sanglier brocheroc1564309104109496621421; Soldat du comtÚ-de-l'or15643091041091527679789; Soldat du comtÚ-de-l'or1564309104109606554932; Chevaucheur de loup15643091040991598594926; Soldat du comtÚ-de-l'or15643091041121414244286; Tourbillon1564309104112937504992; Soldat du comtÚ-de-l'or156430910411244003318; ',
 p2CardsOnGround='']

2019-07-28 12:18:24.712  INFO 12468 --- [boundChannel-21] minihearthstone.controller.ClientProxy   : Gameboard after hand of cards added : GameBoard[id=46, gameId=45, p1ClientId=5011564309093734, p2ClientId=2951564307866692, turn=2951564307866692,
p1HandOfCards='Sanglier brocheroc1564309104636939670430; Image mirroir15643091046361296296066; Image mirroir1564309104637458375129; Image mirroir1564309104636592646499; Sanglier brocheroc1564309104636926429297; Explosion des arcanes15643091046371589590236; Image mirroir15643091046591938463152; Soldat du comtÚ-de-l'or15643091046591207888878; YÚti
noroit15643091046591185303379; ',
 p1CardsOnGround='',
 p2HandOfCards='Sanglier brocheroc15643091041061529603653; Sanglier brocheroc1564309104106128173498; Sanglier brocheroc1564309104106988677072; Soldat du comtÚ-de-l'or15643091040991506816921; Sanglier brocheroc15643091040991803397187; Sanglier brocheroc1564309104109496621421; Soldat du comtÚ-de-l'or15643091041091527679789; Soldat du comtÚ-de-l'or1564309104109606554932; Chevaucheur de loup15643091040991598594926; Soldat du comtÚ-de-l'or15643091041121414244286; Tourbillon1564309104112937504992; Soldat du comtÚ-de-l'or156430910411244003318; ',
 p2CardsOnGround='']

2019-07-28 12:18:24.742  INFO 12468 --- [boundChannel-18] minihearthstone.controller.ClientProxy   : Gameboard after hand of cards added : GameBoard[id=46, gameId=45, p1ClientId=5011564309093734, p2ClientId=2951564307866692, turn=2951564307866692,
p1HandOfCards='Sanglier brocheroc1564309104636939670430; Image mirroir15643091046361296296066; Image mirroir1564309104637458375129; Image mirroir1564309104636592646499; Sanglier brocheroc1564309104636926429297; Explosion des arcanes15643091046371589590236; Soldat du comtÚ-de-l'or15643091046651964477219; Soldat du comtÚ-de-l'or1564309104666468218102; Chef de Raid156430910466616574925; Image mirroir15643091046591938463152; Soldat du comtÚ-de-l'or15643091046591207888878; YÚti noroit15643091046591185303379; ',
 p1CardsOnGround='',
 p2HandOfCards='Sanglier brocheroc15643091041061529603653; Sanglier brocheroc1564309104106128173498; Sanglier brocheroc1564309104106988677072; Soldat du comtÚ-de-l'or15643091040991506816921; Sanglier brocheroc15643091040991803397187; Sanglier brocheroc1564309104109496621421; Soldat du comtÚ-de-l'or15643091041091527679789; Soldat du comtÚ-de-l'or1564309104109606554932; Chevaucheur de loup15643091040991598594926; Soldat du comtÚ-de-l'or15643091041121414244286; Tourbillon1564309104112937504992; Soldat du comtÚ-de-l'or156430910411244003318; ',
 p2CardsOnGround='']

2019-07-28 12:18:24.751  INFO 12468 --- [boundChannel-17] minihearthstone.controller.ClientProxy   : Gameboard after hand of cards added : GameBoard[id=46, gameId=45, p1ClientId=5011564309093734, p2ClientId=2951564307866692, turn=2951564307866692,
p1HandOfCards='Sanglier brocheroc1564309104636939670430; Image mirroir15643091046361296296066; Image mirroir1564309104637458375129; Image mirroir1564309104636592646499; Sanglier brocheroc1564309104636926429297; Explosion des arcanes15643091046371589590236; Soldat du comtÚ-de-l'or15643091046651964477219; Soldat du comtÚ-de-l'or1564309104666468218102; Chef de Raid156430910466616574925; Image mirroir15643091046591938463152; Soldat du comtÚ-de-l'or15643091046591207888878; YÚti noroit15643091046591185303379; ',
 p1CardsOnGround='',
 p2HandOfCards='Sanglier brocheroc15643091041061529603653; Sanglier brocheroc1564309104106128173498; Sanglier brocheroc1564309104106988677072; Soldat du comtÚ-de-l'or15643091040991506816921; Sanglier brocheroc15643091040991803397187; Sanglier brocheroc1564309104109496621421; Soldat du comtÚ-de-l'or15643091041091527679789; Soldat du comtÚ-de-l'or1564309104109606554932; Chevaucheur de loup15643091040991598594926; Soldat du comtÚ-de-l'or15643091041121414244286; Tourbillon1564309104112937504992; Soldat du comtÚ-de-l'or156430910411244003318; ',
 p2CardsOnGround='']

2019-07-28 12:20:08.971  INFO 12468 --- [boundChannel-36] minihearthstone.controller.ClientProxy   : Receive end of turn from : 2951564307866692
2019-07-28 12:20:08.971  INFO 12468 --- [boundChannel-36] minihearthstone.controller.ClientProxy   : -------------------------------------------------
2019-07-28 12:20:09.005  INFO 12468 --- [boundChannel-36] minihearthstone.controller.ClientProxy   : Gameboard updated after end of turn : GameBoard[id=46, gameId=45, p1ClientId=5011564309093734, p2ClientId=2951564307866692, turn=5011564309093734,
p1HandOfCards='Sanglier brocheroc1564309104636939670430; Image mirroir15643091046361296296066; Image mirroir1564309104637458375129; Image mirroir1564309104636592646499; Sanglier brocheroc1564309104636926429297; Explosion des arcanes15643091046371589590236; Soldat du comtÚ-de-l'or15643091046651964477219; Soldat du comtÚ-de-l'or1564309104666468218102; Chef de Raid156430910466616574925; Image mirroir15643091046591938463152; Soldat du comtÚ-de-l'or15643091046591207888878; YÚti noroit15643091046591185303379; ',
 p1CardsOnGround='',
 p2HandOfCards='Sanglier brocheroc15643091041061529603653; Sanglier brocheroc1564309104106128173498; Sanglier brocheroc1564309104106988677072; Soldat du comtÚ-de-l'or15643091040991506816921; Sanglier brocheroc15643091040991803397187; Sanglier brocheroc1564309104109496621421; Soldat du comtÚ-de-l'or15643091041091527679789; Soldat du comtÚ-de-l'or1564309104109606554932; Chevaucheur de loup15643091040991598594926; Soldat du comtÚ-de-l'or15643091041121414244286; Tourbillon1564309104112937504992; Soldat du comtÚ-de-l'or156430910411244003318; ',
 p2CardsOnGround='']
2019-07-28 12:20:09.013  INFO 12468 --- [boundChannel-39] minihearthstone.controller.ClientProxy   : Notifiy end of turn to : 5011564309093734
2019-07-28 12:20:09.013  INFO 12468 --- [boundChannel-39] minihearthstone.controller.ClientProxy   : -------------------------------------------------
2019-07-28 12:20:09.039  INFO 12468 --- [boundChannel-39] minihearthstone.entities.deck.Deck       : getPlayerHandOfCards(5011564309093734) -> p2HandOfCards : [Card[id=49, uniqueId='Sanglier brocheroc15643091041061529603653', name='Sanglier brocheroc', manacost=1, damage=1, lifepoints=1, nature='servant', canAttack=false, currentTargetUniqueId='Sanglier brocheroc15643091041061529603653', effect='null', specificCard='null'], Card[id=50, uniqueId='Sanglier brocheroc1564309104106128173498', name='Sanglier brocheroc', manacost=1, damage=1, lifepoints=1, nature='servant', canAttack=false, currentTargetUniqueId='Sanglier brocheroc1564309104106128173498', effect='null', specificCard='null'], Card[id=51, uniqueId='Sanglier brocheroc1564309104106988677072', name='Sanglier brocheroc', manacost=1, damage=1, lifepoints=1, nature='servant', canAttack=false, currentTargetUniqueId='Sanglier brocheroc1564309104106988677072', effect='null', specificCard='null'], Card[id=52, uniqueId='Soldat du comtÚ-de-l'or15643091040991506816921', name='Soldat
du comtÚ-de-l'or', manacost=1, damage=1, lifepoints=2, nature='servant', canAttack=false, currentTargetUniqueId='Soldat du comtÚ-de-l'or15643091040991506816921', effect='ProvocationEffect', specificCard='null'], Card[id=53, uniqueId='Sanglier brocheroc15643091040991803397187', name='Sanglier brocheroc', manacost=1, damage=1, lifepoints=1, nature='servant', canAttack=false, currentTargetUniqueId='Sanglier brocheroc15643091040991803397187', effect='null', specificCard='null'], Card[id=54, uniqueId='Sanglier brocheroc1564309104109496621421', name='Sanglier brocheroc', manacost=1, damage=1, lifepoints=1, nature='servant', canAttack=false, currentTargetUniqueId='Sanglier brocheroc1564309104109496621421', effect='null', specificCard='null'], Card[id=55, uniqueId='Soldat du comtÚ-de-l'or15643091041091527679789', name='Soldat du comtÚ-de-l'or', manacost=1, damage=1, lifepoints=2, nature='servant', canAttack=false, currentTargetUniqueId='Soldat du comtÚ-de-l'or15643091041091527679789', effect='ProvocationEffect', specificCard='null'], Card[id=56, uniqueId='Soldat du comtÚ-de-l'or1564309104109606554932', name='Soldat du comtÚ-de-l'or', manacost=1, damage=1, lifepoints=2, nature='servant', canAttack=false, currentTargetUniqueId='Soldat du comtÚ-de-l'or1564309104109606554932', effect='ProvocationEffect', specificCard='null'], Card[id=57, uniqueId='Chevaucheur de loup15643091040991598594926', name='Chevaucheur de loup', manacost=3, damage=3, lifepoints=1, nature='servant', canAttack=false, currentTargetUniqueId='Chevaucheur de loup15643091040991598594926', effect='ChargeEffect', specificCard='null'], Card[id=58, uniqueId='Soldat du comtÚ-de-l'or15643091041121414244286', name='Soldat du comtÚ-de-l'or', manacost=1, damage=1,
lifepoints=2, nature='servant', canAttack=false, currentTargetUniqueId='Soldat du comtÚ-de-l'or15643091041121414244286', effect='ProvocationEffect', specificCard='null'], Card[id=59, uniqueId='Tourbillon1564309104112937504992', name='Tourbillon', manacost=1, damage=1, lifepoints=0, nature='spell', canAttack=false, currentTargetUniqueId='Tourbillon1564309104112937504992', effect='null', specificCard='Tourbillon'], Card[id=60, uniqueId='Soldat du comtÚ-de-l'or156430910411244003318', name='Soldat du comtÚ-de-l'or', manacost=1, damage=1, lifepoints=2, nature='servant', canAttack=false, currentTargetUniqueId='Soldat du comtÚ-de-l'or156430910411244003318', effect='ProvocationEffect', specificCard='null']]