package com.hackathon.enrollmentSystem.enrollmentSystem.entity;

public enum Status {
    REVIEWING{
        public String toString(){ return "Reviewing"; }
    },

    ACCEPTED{
        public String toString(){ return "Accepted"; }
    },

    REFUSED{
        public String toString(){ return "Refused"; }
    }

}
