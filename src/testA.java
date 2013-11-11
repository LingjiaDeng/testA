import java.util.Hashtable;
import java.util.Set;


public class testA {
	public static void main(String[] args){
		String line = "TW_ENG_20090828.0051	SMART LIST	58-390	SMART LIST	58-390	Denis	225-230	FX	206-208	neutral	1.0";
		
		
		line = line.replaceAll("\t([0-9]+)\\-([0-9]+)\t", "\t$1:$2\t");
		System.out.println(line);
		System.out.println(line.split("\t").length);
	}

}
