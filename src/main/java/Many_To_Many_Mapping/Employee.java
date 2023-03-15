package Many_To_Many_Mapping;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Employee {

	@Id
	private int Eid;
	private String Name;
	
	@ManyToMany
	private List <Project> projects;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int eid, String name, List<Project> project) {
		super();
		Eid = eid;
		Name = name;
		this.projects = project;
	}

	public int getEid() {
		return Eid;
	}

	public void setEid(int eid) {
		Eid = eid;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public List<Project> getProject() {
		return projects;
	}

	public void setProject(List<Project> project) {
		this.projects = project;
	}

	@Override
	public String toString() {
		return "Employee [Eid=" + Eid + ", Name=" + Name + ", project=" + projects + "]";
	}
	
	
}
