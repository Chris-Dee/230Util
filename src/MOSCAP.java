
public class MOSCAP {
<<<<<<< HEAD
	public static double PhiPm(double Na){
		return -0.51165-C.kbtq*Math.log(Na/C.ni);
	}
	public static double phiFb(double Na){
		return C.kbtq*Math.log(Na/C.ni);
	}
	public static double Cox(double Xox){
		return C.esi/Xox;
	}
	public static double Vfb(double Na,double Xox, double QfQit){
		return PhiPm(Na)-QfQit/Cox(Xox);
	}
	public static double Vtn(double Na, double QfQit, double Xox){
		return Vfb(Na,Xox,QfQit)+2*phiFb(Na)+Math.sqrt(2*C.q*C.esi*Na*phiFb(Na))/Cox(Xox);
	}
	public static double VSC(double Na){
		return 2*phiFb(Na);
	}
=======
public static double PhiPm(double Na){
	System.out.print("Phi pm, Voltage difference to metal contact: ");
	return C.s( -0.51165-C.kbtq*Math.log(Na/C.ni));
}
public static double phiFb(double Na){
	System.out.print("phi fb: ");
	return C.s( C.kbtq*Math.log(Na/C.ni));
}
public static double Cox(double Xox){
	System.out.print("hehehehe Cocks: ");
	return C.s( C.esi/Xox);
}
public static double Vfb(double Na,double Xox, double QfQit){
	System.out.print("Flat Band Voltage: ");
	return C.s( PhiPm(Na)-QfQit/Cox(Xox));
}
public static double Vtn(double Na, double QfQit, double Xox){
	System.out.print("Threshold Voltage ");
	return C.s( Vfb(Na,Xox,QfQit)+2*phiFb(Na)+Math.sqrt(2*C.q*C.esi*Na*phiFb(Na))/Cox(Xox));
}
//Capacitances
>>>>>>> 87d557d3a352de0e409cf3bee21ac5ebacfc8742
}
