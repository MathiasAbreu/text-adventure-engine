package xyz.devosmium.games.textadventureengine.menus;

import xyz.devosmium.games.textadventureengine.Game;
import xyz.devosmium.games.textadventureengine.mobiles.Player;
import xyz.devosmium.games.textadventureengine.util.MessageQueue;
import xyz.devosmium.games.textadventureengine.util.PlayerType;

public class ClassMenu extends BaseMenu {

  public ClassMenu() {

    this.menuItems.add(new MenuItem("Fighter", "Well-trained in the art of fighting, your enemies quake before you!"));
    this.menuItems.add(new MenuItem("Sorceror", "Student of magic, you wield great power"));

    while (true) {

      MessageQueue.add("Please choose a class to begin your journey as.");
      MenuItem selectedItem = displayMenu(this.menuItems);

      if (testOption(selectedItem)) {

        Player player = Player.getInstance();
        Game game = new Game(player, PlayerType.NEW);
        break;
      }
    }
  }

  private static boolean testOption(MenuItem m) {
    
    String key = m.getCmdKey();
    MessageQueue.add("Selected" + key.toUpperCase());
    return true;
  }
}
