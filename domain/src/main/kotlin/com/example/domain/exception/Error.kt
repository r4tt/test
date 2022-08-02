package com.example.domain.exception

sealed class Error(
    open val code: Int,
    override val message: String,
    override val cause: Throwable?,
) : Throwable(message, cause) {

    companion object {
        const val UNEXPECTED_ERROR_STATUS_CODE = 500_000
        const val NOT_FOUND_ERROR_STATUS_CODE = 404_000
        const val UNAUTHORIZED_ERROR_STATUS_CODE = 401_000
        const val SERIALIZATION_ERROR_STATUS_CODE = 400_000
    }
    class UnexpectedError(
        cause: Throwable?,
    ) : Error(
        code = UNEXPECTED_ERROR_STATUS_CODE,
        message = "An unexpected error occurred",
        cause = cause,
    )

    class NotFoundError(
        cause: Throwable?,
    ) : Error(
        code = NOT_FOUND_ERROR_STATUS_CODE,
        message = "Not found",
        cause = cause,
    )
}