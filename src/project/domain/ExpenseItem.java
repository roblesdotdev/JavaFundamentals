package project.domain;

public record ExpenseItem(
        Integer id,
        Integer claimId,
        String expenseType,
        String description,
        Double amount
) {
}
