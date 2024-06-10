package fastcampus.issueservice.domain.enums

enum class IssueStatus {
    TODO, IN_PROGRESS, RESOLVED;

    companion object {
        operator fun invoke(status: String): IssueStatus {
            return valueOf(status.uppercase())
        }
    }
}
