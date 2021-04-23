package com.validation;

public class MoodAnalyzer {
    public String analyseMood(String message)
    {
        if(message.contains("Sad"))
        {
            return "SAD";
        }
        else
        {
            return "HAPPY";
        }
    }
}
