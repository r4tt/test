package com.example.domain.usecase

abstract class Validator {
    companion object {
        const val CODE_MAX_LENGTH = 6
        const val CODE_MIN_LENGTH = 2
        const val STRING_MIN_LENGTH = 0
        const val STRING_MAX_LENGTH = 255
        const val EMAIL_MAX_LENGTH = 255
        const val TELEPHONE_MIN_LENGTH = 10
        const val TELEPHONE_MAX_LENGTH = 12
        const val INVOICE_NAME_MAX_LENGTH = 255
        const val INVOICE_TAX_CODE_MAX_LENGTH = 255
        const val INVOICE_ADDRESS_MAX_LENGTH = 255
        const val NOTE_MAX_LENGTH = 255
        const val NAME_MIN_LENGTH = 1
        const val WARD_MIN_LENGTH = 2
        const val WARD_MAX_LENGTH = 6
        const val DISTRICT_MIN_LENGTH = 2
        const val DISTRICT_MAX_LENGTH = 6
        const val PROVINCE_MIN_LENGTH = 2
        const val PROVINCE_MAX_LENGTH = 6
        const val FULL_ADDRESS_MIN_LENGTH = 1
        const val ADDRESS_ID_MIN_LENGTH = 1
    }

    open fun validate(): Error? {
        return null
    }
}