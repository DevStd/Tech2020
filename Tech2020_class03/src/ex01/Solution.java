package ex01;
import java.util.*;

public class Solution {

	public class Dept {
	    String no;
	    String name;
	    String upperNo;
	    public Dept(String no, String name, String upperNo) {
	        super();
	        this.no = no;
	        this.name = name;
	        this.upperNo = upperNo;
	    }
	}

	public class Emp {
	    String no;
	    String name;
	    String position;
	    String deptNo;
	    public Emp(String no, String name, String position, String deptNo) {
	        super();
	        this.no = no;
	        this.name = name;
	        this.position = position;
	        this.deptNo = deptNo;
	    }
	}
	
	public String solution(String[] DEPT, String[] EMP, String empNo) {
		HashMap<String, Dept> dept = new HashMap<>();
		for(String line : DEPT) {
			String[] d = line.split("#");
            dept.put(d[0], new Dept(d[0], d[1], d[2]));
		}
		
		HashMap<String, Emp> emp = new HashMap<>();
		for(String line : EMP) {
			String[] e = line.split("#");
            emp.put(e[0], new Emp(e[0], e[1], e[2], e[3]));
		}
		
		Emp person = emp.get(empNo);
		String deptNm = getEntireDept(dept, person.deptNo);
        
		return deptNm + " " + person.name + " " + person.position;
	}
	
	public static String getEntireDept(HashMap<String, Dept> dept, String deptNo) {
        Dept d = dept.get(deptNo);
        if("0".equals(d.upperNo)) return d.name;
        else return getEntireDept(dept, d.upperNo) + " " + d.name;
    }

}
