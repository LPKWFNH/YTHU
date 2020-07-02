package oop.polymorphiccc;

public class Income {
    protected double income;
    public Income(double income) {
        this.income = income;
    }
    public double getTax() {
        return income * 0.1;
    }
}

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

class StateCouncilSpecialAllowance extends Income {
    public StateCouncilSpecialAllowance(double income) {
        super(income);
    }
    @Override
    public double getTax() {
        return 0;
    }
    /*
     * 子类覆写父类方法后，如果需要调用父类方法
     * 可以用super调用
     * */
    public double parentGetTax() {
        return super.getTax();
    }
}

class Main {
    public static void main(String[] args) {
        Income income = new Income(3000);
        Salary salary = new Salary(7500);
        StateCouncilSpecialAllowance stateCouncilSpecialAllowance = new StateCouncilSpecialAllowance(15000);
        System.out.println(totalTax(income, salary, stateCouncilSpecialAllowance));
    }
    /*
    * 形参：Income
    * 实参：Income、Salary、StateCouncilSpecialAllowance
    * 调用getTax()方法时，真正执行的方法取决于运行时期实际类型的方法
    * */
    public static double totalTax(Income... incomes) {
        double total = 0;
        for (Income income: incomes) {
            total = total + income.getTax();
        }
        return total;
    }
}