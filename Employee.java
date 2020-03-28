
     class Company{
        String name;
        String location;
        int yearBudget;
        int numberOfEmployees;

        public Company(String name, String location, int yearBudget, int numberOfEmployees){
            this.name=name;
            this.location=location;
            this.yearBudget=yearBudget;
            this.numberOfEmployees=numberOfEmployees;
        }
        public void  displayInfo(){
            System.out.println(name+"\n"+location+"\n"+yearBudget+"\n"+numberOfEmployees);
        }

    }

