package java_basic;

import java.util.Scanner;

public class Quiz3 {

	public static void main(String[] args) {
		
		final int PRICE_PER_LOTTO = 1000;
		
		int[] lotto_num = new int[45]; // �ζ� ��ȣ
		int[][] output_num; // ��÷��ȣ
		int inMoney; // ���Աݾ�
		int lottoCnt; // �ζ�Ƚ��
		int changeMoney; // �Ž�����
		
		Scanner scann = new Scanner(System.in);
		
		//�Է�
		System.out.print("�ݾ��� �Է� : ");
		inMoney = scann.nextInt();scann.nextLine();
		lottoCnt = inMoney / PRICE_PER_LOTTO;
		changeMoney = inMoney % PRICE_PER_LOTTO;
		output_num = new int[lottoCnt][6];
		
		//ó��
		for (int i=1; i < 46; i++) {
			lotto_num[i-1] = i;
		}
		for (int count=0; count < lottoCnt; count++) {
			int temp=0;
			for (int i=0; i < 45*100; i++) {
				int temp_index = (int)(Math.random()*45);
				temp = lotto_num[0]; 
				lotto_num[0] = lotto_num[temp_index];
				lotto_num[temp_index] = temp;
			}
			for (int i=0; i < 6; i++) {
				output_num[count][i] = lotto_num[i];
			}
		}	
		
		//���
		for (int i=0; i < output_num.length; i++) {
			for (int j=0; j < output_num[i].length; j++) {
				System.out.print(output_num[i][j] + "\t");
			}
			System.out.println();
		}
		
		System.out.println("�Ž��� �� : ��" + changeMoney);

	}

}
