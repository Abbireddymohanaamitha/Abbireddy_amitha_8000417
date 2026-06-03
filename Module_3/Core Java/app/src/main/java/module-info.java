module com.practice {
    requires com.utils;
    requires com.greetings;
    requires java.sql;
    requires java.net.http;
    requires com.google.gson;
    exports com.practice;
    exports com.practice.basics;
    exports com.practice.methods;
    exports com.practice.arrays;
    exports com.practice.oop;
    exports com.practice.exceptions;
    exports com.practice.files;
    exports com.practice.collections;
    exports com.practice.threads;
    exports com.practice.jdbc;
    exports com.practice.networking;
    exports com.practice.reflection;
    exports com.practice.bytecode;
}
