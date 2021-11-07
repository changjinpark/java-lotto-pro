package lotto;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class WinningNumberTest {

    private WinningNumber winningNumber;

    @BeforeEach
    void setUp() {
        winningNumber = WinningNumber.createWinningNumber(new String[]{"1", "2", "3", "4", "5", "6"});
    }

    @DisplayName("당첨 번호 객체의 배열 길이 확인")
    @Test
    void length() {
        assertThat(winningNumber.length()).isEqualTo(6);
    }

    @DisplayName("당첨 번호 가져오기")
    @Test
    void getWinningNumber() {
        assertThat(winningNumber.getWinningNumber()).isEqualTo(new String[]{"1", "2", "3", "4", "5", "6"});
    }
}
