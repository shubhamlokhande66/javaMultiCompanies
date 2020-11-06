

class MultipleCompanies {
public static void main(String args[]) {

EmpWageCompany1(60,30,6,3);
EmpWageCompany2(70,40,7,4);
EmpWageCompany3(80,55,8,5);
}

public static void EmpWageCompany1(int wages,int workingdays,int workinghrsperday,int part_timeworkinghrsperday){
int Empsalary=wages*workingdays*workinghrsperday;
int Part_timesalary=wages*workingdays*part_timeworkinghrsperday;
int presence=(int)Math.floor(Math.random()*10)%3;
switch (presence) {
case 0:
System.out.println("Company1 Employee is absent");
break;
case 1:
System.out.println("Company1 Employee is present");
System.out.println("Wages:" +Empsalary);
break;
case 2:
System.out.println("Company1 part_time worker is present ");
System.out.println("Wages:" +Part_timesalary);
break;

}
}


public static void EmpWageCompany2(int wages,int workingdays,int workinghrsperday,int part_timeworkinghrsperday){
int Empsalary=wages*workingdays*workinghrsperday;
int Part_timesalary=wages*workingdays*part_timeworkinghrsperday;
int presence=(int)Math.floor(Math.random()*10)%3;
switch (presence) {
case 0:
System.out.println("Company2 Employee is absent");
break;
case 1:
System.out.println("Company2 Employee is present");
System.out.println("Wages:" +Empsalary);
break;
case 2:
System.out.println("Company2 part_time worker is present");
System.out.println("Wages:" +Part_timesalary);
break;

}
}


public static void EmpWageCompany3(int wages,int workingdays,int workinghrsperday,int part_timeworkinghrsperday){
int Empsalary=wages*workingdays*workinghrsperday;
int Part_timesalary=wages*workingdays*part_timeworkinghrsperday;
int presence=(int)Math.floor(Math.random()*10)%3;
switch (presence) {
case 0:
System.out.println("company3 Employee is absent");
break;
case 1:
System.out.println("Company3 Employee is present");
System.out.println("Wages:" +Empsalary);
break;
case 2:
System.out.println("Company3 part_time worker is present");
System.out.println("Wages:" +Part_timesalary);
break;

}
}



}
