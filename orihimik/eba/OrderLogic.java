package orihimik.eba;

import java.util.ArrayList;
import java.util.Random;

public class OrderLogic {
	String srcTxt;
	String[] srcOrder = null;
	ArrayList<String> srcOrderR = null;
	String[] srcOrderCbC = null;

	public OrderLogic(String srcTxt) { //文字列受け取ってセットして基礎となる配列作る
		this.srcTxt = srcTxt;
		srcOrder = srcTxt.split("\\."); //ピリオドで分割する時は、こうしないと出来ない。
	}

	public void srcOrder() { //■順おーダァー
		for (int i = 0; i < srcOrder.length; i++) {
			if (i < srcOrder.length-1) {
				System.out.print(srcOrder[i]);
				System.out.print(".");
			}
			else {
				System.out.print(srcOrder[i]);
			}
		}
		System.out.println();
		System.out.println();
	}

	public void rOrder_01() { //■逆おーダァー :
		for (int i = srcOrder.length-1; i >= 0; i--) {
			if (i > 0) {
				System.out.print(srcOrder[i]);
				System.out.print(".");
			}
			else {
				System.out.print(srcOrder[i]);
			}
		}
		System.out.println();
		System.out.println();
	}

	public void rOrder_02() { //■順逆おーダァー :
		for (int i = 0; i < srcOrder.length; i++) {
			if (i < srcOrder.length-1) { //配列内の文字列を後ろから取得して表示
				for (int j =srcOrder[i].length()-1; j >= 0 ; j--) {
					System.out.print(srcOrder[i].substring(j,j+1));
				}
				System.out.print(".");
			}
			else {
				for (int j =srcOrder[i].length()-1; j >= 0 ; j--) {
					System.out.print(srcOrder[i].substring(j,j+1));
				}
			}
		}
		System.out.println();
		System.out.println();
	}

	public void rOrder_03() { //■逆逆おーダァー :
		for (int i = srcOrder.length-1; i >= 0; i--) {//外は逆オーダーを流用
			if (i > 0) {
				for (int j =srcOrder[i].length()-1; j >= 0 ; j--) {
					System.out.print(srcOrder[i].substring(j,j+1));
				}
				System.out.print(".");
			}
			else {
				for (int j =srcOrder[i].length()-1; j >= 0 ; j--) {
					System.out.print(srcOrder[i].substring(j,j+1));
				}
			}
		}
		System.out.println();
		System.out.println();
	}

	public void srcOrder_CbC() { //■順おーダァーCbyC :
		String s = srcTxt.replace(".",""); //ピリオドを抜く
		for (int i = 0; i < s.length(); i++) {
			System.out.print(s.substring(i,i+1));
			System.out.print(".");
		}
		System.out.println();
		System.out.println();
	}

	public void srcOrder_enigma() { //■順乱おーダァー :
		Random rand = new Random();
		ArrayList<String> enigma = new ArrayList<String>();

		for (int a = 0; a < srcOrder.length; a++) {//処理する全体数
			if (a < srcOrder.length-1) {
				for(int i = 0; i < srcOrder[a].length(); i++) {//個々の配列を
					enigma.add(srcOrder[a].substring(i, i+1));//1文字ずつ分けてアレイリストに格納
					}
				for(int k = 0; k < srcOrder[a].length(); k++){//個々の配列に入れた文字列の長さ分処理を繰り返す
					int rdm = rand.nextInt(enigma.size());//ランダム処理、乱数範囲をアレイリストのサイズにするのが味噌
					System.out.print(enigma.remove(rdm));//ランダムで１つずつ文字を除外する。remove使った意味を考えるダァー
					//System.out.print("/");
				}
				enigma.clear();
				System.out.print(".");
			}
			else { //↑のif文と以下else内の記載は一緒。
				for(int i = 0; i < srcOrder[a].length(); i++) {
					enigma.add(srcOrder[a].substring(i, i+1));
					}
				for(int k = 0; k < srcOrder[a].length(); k++){
					int rdm = rand.nextInt(enigma.size());
					System.out.print(enigma.remove(rdm));
				}
			}
		}
		System.out.println();
		System.out.println();
	}
}
