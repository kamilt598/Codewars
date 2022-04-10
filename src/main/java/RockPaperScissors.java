public class RockPaperScissors {

    public static String rps(String p1, String p2) {
        switch (p1) {
            case "scissors":
                if (p2 == "paper") return "Player 1 won!";
                if (p2 == "rock") return "Player 2 won!";
                if (p2 == "scissors") return "Draw!";
            case "paper":
                if (p2 == "rock") return "Player 1 won!";
                if (p2 == "scissors") return "Player 2 won!";
                if (p2 == "paper") return "Draw!";
            case "rock":
                if (p2 == "scissors") return "Player 1 won!";
                if (p2 == "paper") return "Player 2 won!";
                if (p2 == "rock") return "Draw!";
        }
        return "";
    }

}
