package geometrie;

public class TestObjetGeometrique {

	public static void main(String[] args) {
		
		Cercle cercle1 = new Cercle();
		Rectangle rectangle1 = new Rectangle();
		ObjetGeometrique tabObjgeo[] = {cercle1, rectangle1};
		
		for (int i=0; i<tabObjgeo.length; i++) {
			System.out.println (tabObjgeo[i].perimetre());
			System.out.println (tabObjgeo[i].surface());
			
		}
		
		}

	}

