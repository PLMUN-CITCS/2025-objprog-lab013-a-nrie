public class ParametersAndArguments {
	public static void main(String[] args) {
		int roomWidth = 10;
		int roomHeigth = 15;
		int area = calculateArea(roomWidth, roomHeigth);
		System.out.println("The calculated area is: " + area);
		
	}
	public static int calculateArea (int width, int height) {
	    int area = width * height;
	    return area;
	}
}