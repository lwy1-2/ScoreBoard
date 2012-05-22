package dk.frankbille.scoreboard.service;

import java.util.List;

import dk.frankbille.scoreboard.domain.Game;
import dk.frankbille.scoreboard.domain.Player;
import dk.frankbille.scoreboard.domain.PlayerResult;
import dk.frankbille.scoreboard.domain.User;

public interface ScoreBoardService {

	Player createNewPlayer(String name);

	void savePlayer(Player player);

	List<Player> getAllPlayers();

	void saveGame(Game game);

	List<Game> getAllGames();

	List<PlayerResult> getPlayerResults();

	Player getPlayer(Long playerId);

	List<Game> getPlayerGames(Player player);

	boolean hasUserWithUsername(String username);

	void createUser(User user);

	User authenticate(String username, String password);


}
