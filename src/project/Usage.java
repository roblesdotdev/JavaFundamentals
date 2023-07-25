package project;

public class Usage {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        System.out.println(e1.getId());
        Employee e2 = new Employee();
        System.out.println(e2.getId());

        ExpenseClaim expenseClaim = new ExpenseClaim(
                1,
                554,
                "2023-12-12",
                24.5
        );
        System.out.println(expenseClaim.getEmployeeId());

        expenseClaim.setPaid(true);
        System.out.println(expenseClaim.getPaid());
        expenseClaim.setApproved(true);
        expenseClaim.setPaid(true);
        System.out.println(expenseClaim.getPaid());

        ExpenseItem item = new ExpenseItem(1, 2, "hotel", "paid hotel", 33.44);
        System.out.println(item.amount());
        System.out.println(item.description());
    }
}
