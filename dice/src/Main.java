import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.print("숫자를 입력하세요 : ");
        Scanner scanner = new Scanner(System.in);
        int rollTime = scanner.nextInt();

        Dice luckyDice = UnknownDice.decideFaces(6);
        Note memoPad = new MemoPad();

        Dealer dealer = Dealer.playWith(luckyDice, memoPad);

        dealer.rollDiceMultipleTimes(rollTime);
        System.out.println("===== !결과 출력! =====");
        dealer.tellTheResult();

    }
}