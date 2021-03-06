/*
 * Copyright 2017 Grzegorz Skorupa <g.skorupa at gmail.com>.
 * Licensed under the Apache License, Version 2.0 http://www.apache.org/licenses/LICENSE-2.0
 */

var globalEvents = riot.observable();

var app = {
    "user": {
        "name": "",
        "token": "",
        "status": "logged-out",
        "alerts": [],
        "role": ""
    },
    "offline": false,
    "authAPI": "http://localhost:8080/api/auth",
    "csAPI": "http://localhost:8080/api/cs",
    "cmAPI": "http://localhost:8080/api/cm",
    "userAPI": "http://localhost:8080/api/user",
    "currentPage": "main",
    "language": "en",
    "languages": ["en", "pl", "fr"],
    "debug": false,
    "localUid": 0,
    "requests": 0,
    "log": function(message){if(app.debug){console.log(message)}}
}

// ucs-2 string to base64 encoded ascii
    function utoa(str) {
        return window.btoa(unescape(encodeURIComponent(str)));
    }
    // base64 encoded ascii to ucs-2 string
    function atou(str) {
        return decodeURIComponent(escape(window.atob(str)));
    }