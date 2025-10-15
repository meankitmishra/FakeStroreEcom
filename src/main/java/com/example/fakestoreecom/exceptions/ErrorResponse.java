package com.example.fakestoreecom.exceptions;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ErrorResponse {
    private String message;
    private int status;
    private LocalDateTime timestamp;

    public ErrorResponse(int _status, String _message, LocalDateTime _timestamp) {
        this.message = _message;
        this.status = _status;
        this.timestamp = _timestamp;
    }
}
