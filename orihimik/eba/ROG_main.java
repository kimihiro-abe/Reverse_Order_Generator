package orihimik.eba;

public class ROG_main { //Reverse_Order_Generator

	static int count;

	public static void main(String[] args) { //メイン部分はなるべくメソッドだけで処理することを試してみる

		Function.title(); //タイトル画面表示

		// 入力機構：打ち込んだものを、全部文字列としてStringに格納
		InputIF iIF = new InputIF(); //入力機構を使うためのインスタンス生成

		while(Function.ctrl_true()) { //試しにメソッドでtrueを返して貰うのをテスト
			String srcTxt = iIF.inputIF(); //入力機構で入力した結果をsrcTxtに代入

			// 今回のミッションとしてコンストラクタ使う
			OrderLogic oLogic = new OrderLogic(srcTxt);
			//System.out.println();

			// ■順おーダァー : kominato.amaariki		srcOrder
				System.out.println("■順おーダァー : 今、入力したそのものダァー "); //表示部分の文章は遊び心で
				oLogic.srcOrder(); //ソースをまんま表示するダァー

			// ■逆おーダァー : amaariki.kominato		rOrder_01	ikiraama.otanimoki
				System.out.println("■逆おーダァー : ");
				oLogic.rOrder_01();

			// ■順逆おーダァー :otanimok.ikirama			rOrder_02
				System.out.println("■順逆おーダァー : ");
				oLogic.rOrder_02();

			// ■逆逆おーダァー : ikirama.otanimok			rOrder_03
				System.out.println("■逆逆おーダァー : ");
				oLogic.rOrder_03();

			// ■順おーダァーCbyC : 順おーダァーを１文字ずつカンマで区切る（Character by character）
				System.out.println("■順おーダァーCbyC : CbyCとは「一文字ずつ」をGoogle翻訳した結果の略ダァー");
				oLogic.srcOrder_CbC();

			// ■順乱おーダァー : ソースのランダム並び替え			enigma_01
				System.out.println("■順乱おーダァー : 順おーダァーの中身をランダムしたダァー");
				oLogic.srcOrder_enigma();

			// ■継続促しテキストの表示
				count++;

				if (count % 2 ==0) {
					Function.loop_txt2();
				}
				else if (count % 7 ==0){
					Function.loop_txt3();
				}
				else {
					Function.loop_txt1();
				}

		}
		//デバッグ用エンド確認処理
		Function.end();
	}


}
