package minihearthstone.entities.player;

import com.fasterxml.jackson.annotation.JsonBackReference;
import minihearthstone.entities.gameboard.GameBoard;

import javax.persistence.*;
import javax.transaction.Transactional;

@Entity
@Transactional
public class Player implements IPlayer {

  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  private Long id;
  private Long clientId;
  private String name;
  private String status;
  private Long heroId;
  private String heroUniqueId;
  private int mana;
  private int stored_mana;

  @ManyToOne(fetch=FetchType.EAGER, optional = true) 
  @JsonBackReference(value="players-mapping")
  private GameBoard gameBoard;

  protected Player() {};

  public Player(String playername, Long clientId) {
    this.name = playername;
    this.status = "";
    this.clientId = clientId;
    this.stored_mana = 1;
    this.mana = this.stored_mana;
  }

  /**
   * Copy constructor
   * @param name
   * @param clientId
   * @param status
   * @param heroId
   * @param mana
   * @param stored_mana
   * @param gameBoard
   */
  protected Player(String name, Long clientId, String status, Long heroId, String heroUniqueId, int mana, int stored_mana, GameBoard gameBoard) {
    this.name = name;
    this.clientId = clientId;
    this.status = status;
    this.heroId = heroId;
    this.heroUniqueId = heroUniqueId;
    this.mana = mana;
    this.stored_mana = stored_mana;
    this.gameBoard = gameBoard;
  }

  @Override
  public String toString() {
    return String.format(
            "Player[id=%d, name='%s', clientId='%s', status='%s', heroId=%d, heroUniqueId='%s', mana=%d, stored_mana=%d], gb='%s'",
            id, name, clientId, status, heroId, heroUniqueId,  mana, stored_mana, (gameBoard != null) ? gameBoard.getId(): "");
  }

  // GETTERS 
  public Long getId() {
    return this.id;
  } 
  public Long getClientId() {
    return this.clientId;
  }
  public String getName() {
    return this.name;
  }
  public String getStatus() {
      return this.status;
  }
  public Long getHeroId() {
    return this.heroId;
  }
  public String getHeroUniqueId() { return  this.heroUniqueId; }
  public int getMana() {
    return this.mana;
  }
  public int getStored_mana() {
    return this.stored_mana;
  }

  // SETTERS
  public void setClientId(Long clientId) {
    this.clientId = clientId;
  }
  public void setName(String name) {
    this.name = name;
  }
  public void setStatus(String status) {
      this.status = status;
  }
  public void setHeroId(Long heroId) {
    this.heroId = heroId;
  }
  public void setHeroUniqueId(String uniqueId) { this.heroUniqueId = uniqueId; }
  public void setMana(int mana) {
    this.mana = mana;
  }
  public void setGameboard(GameBoard gameBoard) {
    this.gameBoard = gameBoard;
  }
  public void unsetGameBoard() {
    this.gameBoard = null;
  }
  public void setStored_mana(int stored_mana) {
    this.stored_mana = stored_mana;
  }

  // Methods
  public void incrementMana() {
    if (this.stored_mana < 10) {
      this.stored_mana += 1;
    }
    this.mana = this.stored_mana;
  }

  public void deductMana(int cardCost) {
    if (this.mana - cardCost >= 0) {
      this.mana = this.mana - cardCost;
    }
    else this.mana = 0;
  }

  public boolean checkEnoughMana(int cardCost) {
    if (this.mana - cardCost >= 0) {
      return true;
    }
    else return false;
  }

  public Player copy() {
    Player clone = new Player(this.name, this.clientId, this.status, this.heroId, this. heroUniqueId, this.mana, this.stored_mana,this.gameBoard);
    return clone;
  }

  public void clone(Player player) {
      this.name = player.name;
      this.clientId = player.clientId;
      this.status = player.status;
      this.heroId = player.heroId;
      this.heroUniqueId = player.heroUniqueId;
      this.mana = player.mana;
      this.stored_mana = player.stored_mana;
      this.gameBoard = player.gameBoard;
  }
}
