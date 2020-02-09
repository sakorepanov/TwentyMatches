class TwentyMatches {
    private static int matchesOnTable = 20;
    private static int pickedMatches;
    private static String currentPlayer = "компьютер";

    public static void main(String[] args) {
        Message message = new Message();
        Computer computer = new Computer();
        User user = new User();

        message.startGame();
        message.matchesOnTable(matchesOnTable);
        while (matchesOnTable > 1) {
            computer.step(matchesOnTable);
            if (matchesOnTable == 1) {
                message.endGame(currentPlayer);
            } else {
                message.matchesOnTable(matchesOnTable);
                user.step();
                if (matchesOnTable == 1) {
                    message.endGame(currentPlayer);
                }
                message.matchesOnTable(matchesOnTable);
            }
        }

    }


    static int getMatchesOnTable() {
        return matchesOnTable;
    }

    static void setMatchesOnTable(int matchesOnTable) {
        TwentyMatches.matchesOnTable = matchesOnTable;
    }

    static int getPickedMatches() {
        return pickedMatches;
    }

    static void setPickedMatches(int pickedMatches) {
        TwentyMatches.pickedMatches = pickedMatches;
    }

    static String getCurrentPlayer() {
        return currentPlayer;
    }

    static void setCurrentPlayer(String currentPlayer) {
        TwentyMatches.currentPlayer = currentPlayer;
    }
}
