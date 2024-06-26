package fastcampus.issueservice.web

import fastcampus.issueservice.config.AuthUser
import fastcampus.issueservice.model.IssueRequest
import fastcampus.issueservice.service.IssueService
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/issues")
class IssueController (
    private val issueService: IssueService
){
    @PostMapping
    fun create(
//        authUser: AuthUser,
        @RequestBody request: IssueRequest,
    ) {
        return issueService.create(1, request)
    }
}