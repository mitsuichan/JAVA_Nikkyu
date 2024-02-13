/**
 * Nikkyu
 */
public class Nikkyu {

    public static void main(String[] args) {

        try {

            // 日給
            int dayMoney = Integer.parseInt(args[0]);
            // 一日当たりの勤務時間
            int dayTime = Integer.parseInt(args[1]);
            // 一ヵ月当たりの勤務日数
            int dayMonth = Integer.parseInt(args[2]);

            // 時給
            int hourMoney = (int) (dayMoney / dayTime);
            // 月給
            int monthMoney = (int) (dayMoney * dayMonth);
            // 年休
            int yearMoney = (int) (dayMoney * dayMonth * 12);

            System.out.println("時給：" + hourMoney + "円");
            System.out.println("月給：" + monthMoney + "円");
            System.out.println("年収：" + yearMoney + "円");

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("オブジェクト：" + e + "が検出されました。");
            System.out.println("日給、一日当たりの勤務時間、一ヵ月当たりの勤務日数の入力が無い為、エラーが起きました。もう一度入力お願いします。");
        } finally {
            System.out.println("後処理");
        }
    }
}
