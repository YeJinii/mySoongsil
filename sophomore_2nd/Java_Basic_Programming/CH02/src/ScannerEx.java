import java.util.Scanner;

public class ScannerEx {
	public static void main(String[] args) {
		System.out.println("�̸�, ����, ����, ü��, ���� ���θ� ��ĭ���� �и��Ͽ� �Է��ϼ���");
		
		Scanner scanner = new Scanner(System.in);
		String name = scanner.next();
		System.out.println("����� �̸��� " + name + "�Դϴ�.");
		String city = scanner.next();
		System.out.println("����� ��� ���ô� " + city + "�Դϴ�.");
		int age = scanner.nextInt();
		System.out.println("����� ���̴� "+ age + "�Դϴ�.");
		double weight = scanner.nextDouble();
		System.out.println("����� ü���� "+ weight + "�Դϴ�.");
		boolean single = scanner.nextBoolean();
		System.out.println("����� ���� ���δ� " + single + "�Դϴ�.");
		
		scanner.close();
	}
}