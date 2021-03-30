package com.switchfully.controllers.exceptionController;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;

@ControllerAdvice
public class ControllerExceptions {

    private static final Logger logger = LoggerFactory.getLogger(ControllerExceptions.class);


    /*
    @ExceptionHandler(BookNotFoundException.class)
    public void bookNotFound(BookNotFoundException bookNotFoundException, HttpServletResponse httpServletResponse) throws IOException {
        logger.error("Someone searched for a book that could not be found in the database", bookNotFoundException);
        httpServletResponse.sendError(HttpServletResponse.SC_BAD_REQUEST, bookNotFoundException.getMessage());
    }*/

}
