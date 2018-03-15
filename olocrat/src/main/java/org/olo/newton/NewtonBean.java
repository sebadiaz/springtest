package org.olo.newton;


/**
 * http://www.irem.univ-mrs.fr/IMG/pdf/methode_de_newton.pdf
 * @author misys
 *n ←− 0
t ←− f(a)
z ←− f(b)
L ←− {a}
Tant que abs(b − a) > ε faire
c ←− a −
(a − b) ∗ t
t − z
L ←− L suivie de c
b ←− a
a ←− c
z ←− t
t ←− f(a)
n ←− n + 1
Afficher n
Afficher L
 */
public class NewtonBean {
	
	public float calculate(Function f) {
		float n=0;
		Variables a=null;
		Variables b=null;
		float t=f.calculate(a);
		float z=f.calculate(b);
		
		return 0;
	}

}
