package com.switchfully.controllers.exceptionController;


import com.switchfully.exceptions.CustomerNotFoundException;
import com.switchfully.exceptions.ItemNotFoundException;
import com.switchfully.exceptions.NotAuthorizedException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@ControllerAdvice
public class ControllerExceptions {

    private static final Logger logger = LoggerFactory.getLogger(ControllerExceptions.class);

    @ExceptionHandler(IllegalArgumentException.class)
    public void wrongInput(IllegalArgumentException illegalArgumentException, HttpServletResponse httpServletResponse) throws IOException {
        logger.error("user provided wrong input", illegalArgumentException);
        httpServletResponse.sendError(HttpServletResponse.SC_BAD_REQUEST, illegalArgumentException.getMessage());
    }

    @ExceptionHandler(CustomerNotFoundException.class)
    public void customerNotFound(CustomerNotFoundException customerNotFoundException, HttpServletResponse httpServletResponse) throws IOException {
        logger.error("Customer could not be found", customerNotFoundException);
        httpServletResponse.sendError(HttpServletResponse.SC_BAD_REQUEST, customerNotFoundException.getMessage());
    }

    @ExceptionHandler(ItemNotFoundException.class)
    public void ItemNotFound(ItemNotFoundException itemNotFoundException, HttpServletResponse httpServletResponse) throws IOException {
        logger.error("Customer could not be found", itemNotFoundException);
        httpServletResponse.sendError(HttpServletResponse.SC_BAD_REQUEST, itemNotFoundException.getMessage());
    }

    @ExceptionHandler(NotAuthorizedException.class)
    public void actionNotAuthorized(NotAuthorizedException notAuthorizedException, HttpServletResponse httpServletResponse) throws IOException {
        logger.error("Someone tried to do an unauthorized action", notAuthorizedException);
        httpServletResponse.sendError(HttpServletResponse.SC_FORBIDDEN, notAuthorizedException.getMessage());
    }



}
