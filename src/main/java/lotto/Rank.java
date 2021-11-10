package lotto;

import java.util.Arrays;

public enum Rank {
    FIRST(6, 2_000_000_000),
    SECOND(5, 1_500_000),
    THIRD(4, 50_000),
    FOURTH(3, 5000),
    NO_MATCH(0, 0);

    private int countOfMatch;
    private int winningMoney;

    Rank(int countOfMatch, int winningMoney) {
        this.countOfMatch = countOfMatch;
        this.winningMoney = winningMoney;
    }

    public int getCountOfMatch() {
        return countOfMatch;
    }

    public int getWinningMoney() {
        return winningMoney;
    }


    public static Rank valueOf(int countOfMatch) {
        return Arrays.stream(values())
                .filter(rank -> isMatchCount(countOfMatch, rank))
                .findFirst()
                .orElse(NO_MATCH);
    }

    private static boolean isMatchCount(int countOfMatch, Rank rank) {
        return rank.countOfMatch == countOfMatch;
    }
}
