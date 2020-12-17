package helloworld;

public class oop_dt_1 {

	public static void main(String[] args) {
		//给一个有普通收入、工资收入、特殊津贴的人算税
		//定义类型为Income的数组
		Income[] incomes= {new Income(3000),new Salary(7500),new StateCouncilSpecialAllowance(15000)};
		System.out.println(totaltax(incomes));
	}
	//定义可变参数类型
	public  static double totaltax(Income...incomes) {
		double total=0;
		for(Income a:incomes) {
			total=total+a.getTax();
		}
		return total;
	}
}
//定义一种收入报税类Income
class Income {
    protected double income;

    public Income(double income) {
        this.income = income;
    }

    public double getTax() {
        return income * 0.1; // 税率10%
    }
}
//对于工资收入报税需要减去一个基础
class Salary extends Income {
	public Salary(double income) {
        super(income);
    }

    @Override
    public double getTax() {
        if (income <= 5000) {
            return 0;
        }
        return (income - 5000) * 0.2;
    }
}
//如果享受特殊津贴可以免税
class StateCouncilSpecialAllowance extends Income {
    public StateCouncilSpecialAllowance(double income) {
        super(income);
    }

    @Override
    public double getTax() {
        return 0;
    }
}