package Bai7_CleanCodeAndRefactoring.baitap;

public class TennisGame {

    public static final int SCORE_CHECK = 4;

    public static String getEqualScore(String player1Name, String player2Name, int player1_score, int player2_score) {
        String score = "";
        int tempScore = 0;
        boolean isTheSameScore = player1_score == player2_score;
        if (isTheSameScore) {
            score = getEqualScore(player1_score);
        } else if (player1_score >= SCORE_CHECK || player2_score >= SCORE_CHECK) {
            score = getWinner(player1_score, player2_score);
        } else {
            score = getPlaying(player1_score, player2_score, score);
        }
        return score;
    }

    private static String getPlaying(int player1_score, int player2_score, String score) {
        int tempScore;
        for (int i = 1; i < 3; i++) {
            if (i == 1) tempScore = player1_score;
            else {
                score += "-";
                tempScore = player2_score;
            }
            switch (tempScore) {
                case 0:
                    score += "Love";
                    break;
                case 1:
                    score += "Fifteen";
                    break;
                case 2:
                    score += "Thirty";
                    break;
                case 3:
                    score += "Forty";
                    break;
            }
        }
        return score;
    }

    private static String getWinner(int player1_score, int player2_score) {
        String score;
        int minusResult = player1_score - player2_score;
        if (minusResult == 1) score = "Advantage player1";
        else if (minusResult == -1) score = "Advantage player2";
        else if (minusResult >= 2) score = "Win for player1";
        else score = "Win for player2";
        return score;
    }

    private static String getEqualScore(int player1_score) {
        String score;
        switch (player1_score) {
            case 0:
                score = "Love-All";
                break;
            case 1:
                score = "Fifteen-All";
                break;
            case 2:
                score = "Thirty-All";
                break;
            case 3:
                score = "Forty-All";
                break;
            default:
                score = "Deuce";
                break;

        }
        return score;
    }
}