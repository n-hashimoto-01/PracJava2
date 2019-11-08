package sample;

import java.security.InvalidParameterException;

/**
 * �T���v���N���X
 * @author n-hashimoto-01 
 *
 */
public class SampleMain {
	public static void main(String[] args) {
		// ���̓`�F�b�N
		if (args.length != 2) {
			throw new InvalidParameterException("������2�w�肵�Ă��������@���ہF" + args.length);
		}
		
		int maxLoop = 0;
		try {
			maxLoop = Integer.parseInt(args[1]);
		} catch (NumberFormatException e) {
			throw new InvalidParameterException("����2�͐��l�Ŏw�肵�Ă�������");
		}
		
		for (int i = 0; i < maxLoop; i++) {
			System.out.println(args[0]);
		}
		
		System.out.println("end");
	}
}
