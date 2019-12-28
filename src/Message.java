class Message {
    void startGame() {
        System.out.println("Игра \"20 спичек\" началась.");
    }

    void matchesOnTable(int matchesOnTable) {
        System.out.println("Количество оставшихся спичек на столе - " + matchesOnTable);
    }

    void step(String currentPlayer, int pickedMatches) {
        System.out.print("Ход делает " + currentPlayer);
        if (currentPlayer.equals("компьютер")) {
            System.out.println(". Количество вытяннутых спичек - " + pickedMatches);
        } else {
            System.out.print(". Введите количество спичек, которое хотите вытянуть - ");
        }
    }

    void wrongPick() {
        System.out.print("Вы выбрали неверное количество спичек. Введите число от 1 до 3 - ");
    }


    void endGame(String currentPlayer) {
        System.out.println("На столе осталась 1 спичка. Победил " + currentPlayer + "!");
    }
}
