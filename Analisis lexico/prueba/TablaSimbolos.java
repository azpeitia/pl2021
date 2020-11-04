import java.util.HashMap;

class TablaSimbolos {
	protected static HashMap<String,Integer> hm = new HashMap<String,Integer>();
	
	public static void put(String variable, int valor) {
		hm.put(variable, valor);
	}
	
	public static int get(String variable) {
		
		if(hm.containsKey(variable)){
			int valor = hm.get(variable);
			return valor;
		}else{
			return 0;
		}
	}

	public static void getAll(){
		System.out.println("-------------");
		for (String item : hm.keySet()) {
		    System.out.println(item+"="+hm.get(item));
		}	
	}

	public static void dump() {
		System.out.println("-------------");
		for (String item : hm.keySet()) {
		    System.out.println(item+"="+hm.get(item));
		}	
	}

}