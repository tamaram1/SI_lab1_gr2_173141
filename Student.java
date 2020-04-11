class Student {
	String index;
	String firstName;
	String lastName;

	List<Integer> grades = new ArrayList<Integer>();

	//TODO constructor
	public Student(String index, String firstName, String lastName, List<Integer> list) {
		this.index = index;
		this.firstName = firstName;
		this.lastName = lastName;
		this.list = list;
	}


	//TODO seters & getters
	public String getIndex() {
		return index;
	}

	public void setIndex(String index) {
		this.index = index;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public List<Integer> getList() {
		return list;
	}

	public void setList(List<Integer> list) {
		this.list = list;
	}



	public double getAverage(List <Integer> grades) {
		//TODO
		int sum = 0;
		for(int i = 0; i < grades.size(); i++){
			sum += i;
		}
		return sum / grades.size();
	}

	public int ECTSCredits() {
		//TODO
		
	}
}
