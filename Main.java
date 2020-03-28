public class Main {
    public static void main(String[] args) {
        Company company1 = new Company("Google", "Silicon", 20000, 4880);
        Company company2=new Company("Chase", "Chicago", 23344, 6403);
        Company company3=new Company("apple","New York", 34554,8680);
        Company company4=new Company("BofAmerica","Pheonix", 344432,36008);

        Company[] companies={company1, company2, company3, new Company("US Bamk","Dallas",100000, 4555)};

        System.out.println("-------------------------");
        for(Company company : companies){
            if(company.yearBudget>3000){
                System.out.println(company.name);
            }
    }
        int sum=0;
        for( Company company : companies){

            sum += company.yearBudget;
          }
        System.out.println("Totla budget of all companies: "+sum);



       }

    }

