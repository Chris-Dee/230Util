
public class C {

	public static double q=1.612177*EE(-19); //Electron Charge (C)
	public static double kb=8.617385*EE(-5); //Boltzmann's Constant (eV/K)
	public static double mo=9.909389*EE(-28); //Electron Rest Mass (g)
	public static double eo=8.854187*EE(-14); //Dielectric Permittivity of Vacuum (F/cm)
<<<<<<< HEAD
	public static double esi=11.7*eo; //Dielectric Permittivity of Silicon (F/cm)
	public static double eox=3.9*eo; //Dielectric Permittivity of Silicon Dioxide (F/cm)
=======
	public static double esi=11.7*eo; //Dielectric Permeability of Silicon (F/cm)
	public static double eox=3.9*eo; //Dielectric Permeability of Silicon Dioxide (F/cm)
>>>>>>> 87d557d3a352de0e409cf3bee21ac5ebacfc8742
	public static double Navo=6.022136*EE(23); //Avogadro's Number (mole-1)
	public static double eV=1.602177*EE(-19); //Electron Volt (J)
	public static double hJ=6.626075*EE(-34); //Plank's Constant in joules*s. slide 1.5
	public static double hEV=4.135669*EE(-15); //Plank's Constant in eV*s slide 1.5
	public static double hbarJ=1.054572*EE(-34); //Reduced Plank's Constant (J*s)
	public static double hbarEV=6.582122*EE(-16); //Reduced Plank's Constant (eV*s)
	public static double kbtq=0.02585; //(kvT/q) (V) 
	public static double latticeSi=5.4037; //Lattice Constant in angstroms. rest are on 1.7
	public static double ni=1.07*EE(10); //Intrinsic Carrier Concentration (cm-3)
	public static double mndos=1.090*mo; //Electron Density of States Effective Mass at 300K
	public static double mn=.320*mo; //Electron Conductivity Effective Mass at 300K
	public static double mpdos=1.150*mo; //Hole Density of States Effective Mass at 300K
	public static double mp=.386*mo; //Hole Conductivity Effective Mass at 300K

	public static double exp(double arg){
		return p(Math.E,arg);
	}
	public static double EE(double sci){
		return p(10,sci);
	}
	public static double p(double num, double othNum){
		return Math.pow(num,othNum);
	}

	public static Double s(double d){
		System.out.println(d);
		return d;
	}

}
