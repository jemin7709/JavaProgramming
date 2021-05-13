import java.io.File;

public class Explore {
	
	public static void search(String adress, String target) { // �ּҸ� �Է¹޾� ������ ã�� ���α׷�
		File file = new File(adress);
		File[] fileArray = file.listFiles();

		if (fileArray == null) { // ������ ��������� return
			return;
		}

		for (File f : fileArray) { // ���� ����� ��������
			if (f.isFile()) { // �����°� �����̶��
				if (f.getName().equals(target)) { // ActivationClient.dll�� �̸��� ������ Ȯ��
					System.out.println(f + "(" + f.length() + " byte)"); // ���ٸ� ���
				}
			} else { // �������
				String path = f.getPath(); // ���� �ּҸ� �޾ƿ���
				if (!path.isEmpty()) { // ���������� �ִٸ� (path�� empty�� �ƴ϶��)
					search(path, target); // ���ȣ��
				}
			}
		}
		return;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			search("C:\\Windows", "ActivationClient.dll");
		} catch (Exception e) {
			// TODO: handle exception
			System.err.println(e);
		}
	}

}
