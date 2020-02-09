class Computer {
    void step(int matchesOnTable) {
        Message message = new Message();
        TwentyMatches.setCurrentPlayer("компьютер");
        if (matchesOnTable == 20) {
            TwentyMatches.setPickedMatches(3);
        } else {
            TwentyMatches.setPickedMatches(4 - TwentyMatches.getPickedMatches());
        }
        TwentyMatches.setMatchesOnTable(TwentyMatches.getMatchesOnTable() - TwentyMatches.getPickedMatches());
        message.step(TwentyMatches.getCurrentPlayer(), TwentyMatches.getPickedMatches());
    }
}
