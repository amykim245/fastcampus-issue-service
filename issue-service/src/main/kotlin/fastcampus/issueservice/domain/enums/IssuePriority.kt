package fastcampus.issueservice.domain.enums

enum class IssuePriority {
    LOW, MEDIUM, HIGH;

    companion object {
        operator fun invoke(priority: String): IssuePriority {
            return valueOf(priority.uppercase())
        }
    }
}
