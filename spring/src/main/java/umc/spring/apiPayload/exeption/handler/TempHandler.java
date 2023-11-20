package umc.spring.apiPayload.exeption.handler;

import umc.spring.apiPayload.code.BaseErrorCode;
import umc.spring.apiPayload.exeption.GeneralException;

public class TempHandler extends GeneralException {

    public TempHandler(BaseErrorCode errorCode) {
        super(errorCode);
    }
}