/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/JavaScript.js to edit this template
 */
var req;
var isIE;

function init() {
    completeField = document.getElementById("complete-field");
}

function doCompletion() {
        var url = "autocomplete?action=complete&amp;id=" + escape(completeField.value);
//Three parameters are specified when you create an XMLHttpRequest object: a URL, the HTTP method (GET or POST), 
//and whether or not the interaction is asynchronous. 
//In the above example, the parameters are:
//    The URL autocomplete, and the text entered into the complete-field by the user:
//      GET, signifying that HTTP interactions use the GET method, and
//      true, signifying that the interaction is asynchronous:
        req = initRequest();
        req.open("GET", url, true);
        req.onreadystatechange = callback;
//If the interaction is set as asynchronous, a callback function must be specified. 
//The callback function for this interaction is set with the statement and a callback() 
//function must later be defined. The HTTP interaction begins when XMLHttpRequest.send() is called. 
//This action maps to the HTTP request that is sent to the web server in the above flow diagram.
        req.send(null);
}
//Notice that the XMLHttpRequest object is actually created by initRequest(), 
//which is called by doCompletion(). The function checks whether XMLHttpRequest 
//can be understood by the browser, and if so it creates an XMLHttpRequest object. Otherwise, 
//it performs a check on ActiveXObject (the XMLHttpRequest equivalent for Internet Explorer 6), 
//and creates an ActiveXObject if identified.


function initRequest() {
    if (window.XMLHttpRequest) {
        if (navigator.userAgent.indexOf('MSIE') != -1) {
            isIE = true;
        }
        return new XMLHttpRequest();
    } else if (window.ActiveXObject) {
        isIE = true;
        return new ActiveXObject("Microsoft.XMLHTTP");
    }
}

