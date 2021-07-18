package orihimik.eba;
//遷移処理：タイトル、エンド表示等のメソッドを入れておく。
//最初、繊維的な部分だけ入れていたが、テキスト表示はここにまとまった感ある。

public class Function { //処理の時系列に沿って記載していく
	static Boolean ctrl;

	public static void title() {
		System.out.println("\t＿人人人人人人人人＿									＿人人人人人人人人＿");
		System.out.println("\t＞　パッケージ名　＜		おーダァーChan:ver.0.75		＞　あれやこれや　＜");
		System.out.println("\t￣ＹＹＹＹＹＹＹＹ￣									￣ＹＹＹＹＹＹＹＹ￣");
		System.out.println("\t	　( -ﾉ-)　　　　　　　　　　　(-人-)　　　　　　　　　　　 (-_-) 　　　");
		System.out.println();
		System.out.println("\t					半角のカンマで区切って入力するダァー！！");
		System.out.println("\t					  例：Kominato.Railway.Amaariki.Station");
		System.out.println();
	}
	public static void gene_txt() {
		System.out.println("\t		↓入力テキストからアレヤコレヤ生成したダァー！！");
		System.out.println();

	}
	public static void loop_txt1() {
		System.out.println("\t		実は、半角カンマ入れない一文でも大丈夫だったりするダァー(・∀・)！！");
		System.out.println("\t		例：Kominato.Railway.Amaariki.Station");
		System.out.println();
	}
	public static void loop_txt2() {
		System.out.println("\t		半角カンマが...ランダムに入っていると..予期せぬものが...生成されるやも(・Q・)");
		System.out.println("\t		例：Kominato.Railway.Amaariki.Station");
		System.out.println();
	}
	public static void loop_txt3() {
		System.out.println("\t		作るネタを思いつかん...(・∀・；)");
		System.out.println("\t		例：Kominato.Railway.Amaariki.Station");
		System.out.println();
	}


	public static void end() {
		System.out.println("\nおわり～(・∀・)！！\n");
	}
	public static boolean ctrl_true() { //trueを返すだけ
		return ctrl = true;
	}
	public static boolean ctrl_false() { //falseを返すだけ
		return ctrl = false;
	}

}
