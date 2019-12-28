import java.util.Scanner;

class User {
    void step() {
        Message message = new Message();
        TwentyMatches.setCurrentPlayer("пользователь");
        message.step(TwentyMatches.getCurrentPlayer(), TwentyMatches.getPickedMatches());
        Scanner scanner = new Scanner(System.in);
        int pickedMatches = scanner.nextInt();
        while (pickedMatches < 1 || pickedMatches > 3) {
            message.wrongPick();
            scanner = new Scanner(System.in);
            pickedMatches = scanner.nextInt();
        }
        TwentyMatches.setPickedMatches(pickedMatches);
        TwentyMatches.setMatchesOnTable(TwentyMatches.getMatchesOnTable() - TwentyMatches.getPickedMatches());
    }
}

