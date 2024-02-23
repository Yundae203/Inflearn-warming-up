import casino.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Dice luckyDice = UnknownDice.decideFaces(6);
        Note memoPad = new MemoPad();

        Dealer dealer = Dealer.playWith(luckyDice, memoPad);

        System.out.print("숫자를 입력하세요 : ");
        dealer.rollDiceMultipleTimes(scanner.nextInt());

        dealer.tellTheResult();
    }
}