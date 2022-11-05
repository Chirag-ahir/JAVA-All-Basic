interface face1{
	public void faceMethod1();
}
interface face2{
	public void faceMethod2();
}
class Facing implements face1,face2{
	public void faceMethod1(){
		System.out.println("Face 1 is beauiful");
	}
	public void faceMethod2(){
		System.out.println("Face 2 is intermediate");
	}
}
public class MultipleInterface{
	public static void main(String[] args){
		Facing FF = new Facing();
		FF.faceMethod1();
		FF.faceMethod2();
	}
}
		