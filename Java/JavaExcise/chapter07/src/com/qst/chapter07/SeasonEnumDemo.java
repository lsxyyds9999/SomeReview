package com.qst.chapter07;

public class SeasonEnumDemo {

	public static void main(String[] args) {
		System.out.println("SeasonEnumö���������ʵ��ֵ��");
		// ö����Ĭ����һ��values���������ظ�ö���������ʵ��ֵ
		for (SeasonEnum s : SeasonEnum.values()) {
			System.out.println(s);
		}
		System.out.println("---------------------");

		// ����һ��ö�������,��ֱ�Ӹ�ֵ
		SeasonEnum season = SeasonEnum.WINTER;

		// ʹ��switch����ж�ö��ֵ
		switch (season) {
		case SPRING:
			System.out.println("��ů����������̤��");
			break;
		case SUMMER:
			System.out.println("�������ף��ʺ���Ӿ");
			break;
		case FALL:
			System.out.println("�����ˬ��������ʱ");
			break;
		case WINTER:
			System.out.println("����ѩƮ��Χ¯��ѩ");
			break;
		}

	}

}