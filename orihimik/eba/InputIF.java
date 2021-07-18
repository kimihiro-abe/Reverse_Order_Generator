package orihimik.eba;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputIF {

	public String inputIF() { //入力
		//入力部分
		//System.out.println("半角のカンマで区切って入力するダァー！！\n例：Kominato.Railway.Amaariki.Station）");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String src = null; //入力ソースを格納する変数
			try {
				src = br.readLine();
				//br.close(); //closeしようとしたらエラーでた（次回以降の宿題
			}
			catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println();
			return src;

	}
}
