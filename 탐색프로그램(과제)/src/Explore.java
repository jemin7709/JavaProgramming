import java.io.File;

public class Explore {
	
	public static void search(String adress, String target) { // 주소를 입력받아 파일을 찾는 프로그램
		File file = new File(adress);
		File[] fileArray = file.listFiles();

		if (fileArray == null) { // 폴더가 비어있으면 return
			return;
		}

		for (File f : fileArray) { // 폴더 목록을 가져오기
			if (f.isFile()) { // 가져온게 파일이라면
				if (f.getName().equals(target)) { // ActivationClient.dll과 이름이 같은지 확인
					System.out.println(f + "(" + f.length() + " byte)"); // 같다면 출력
				}
			} else { // 폴더라면
				String path = f.getPath(); // 폴더 주소를 받아오기
				if (!path.isEmpty()) { // 하위폴더가 있다면 (path가 empty가 아니라면)
					search(path, target); // 재귀호출
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
