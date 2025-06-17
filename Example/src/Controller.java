
public class Controller {
	Addition ad ;
	public String register(int a, int b) {
		
		int res = ad.add(a, b);
		System.out.println(res);
		return null;
	}
}
