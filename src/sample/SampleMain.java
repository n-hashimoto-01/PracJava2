package sample;

import java.security.InvalidParameterException;

/**
 * サンプルクラス
 * @author n-hashimoto-01 
 *
 */
public class SampleMain {
	public static void main(String[] args) {
		// 入力チェック
		if (args.length != 2) {
			throw new InvalidParameterException("引数は2つ指定してください　実際：" + args.length);
		}
		
		int maxLoop = 0;
		try {
			maxLoop = Integer.parseInt(args[1]);
		} catch (NumberFormatException e) {
			throw new InvalidParameterException("引数2は数値で指定してください");
		}
		
		for (int i = 0; i < maxLoop; i++) {
			System.out.println(args[0]);
		}
		
		System.out.println("end");
	}
}
