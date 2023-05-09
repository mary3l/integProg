<%-- 
    Document   : index
    Created on : May 9, 2023, 9:55:51 PM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <!--(Ctrl-Space) will produce suggestions for HTML tags and attributes-->
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script type="text/javascript" src="javascript.js"></script>
        <title>Auto-Completion using AJAX</title>
    </head>
    <body *onload="init()"*>
        <!--        
        This ensures that init() is called each time the page is loaded.
        The role of doCompletion() is to:
            create a URL that contains data that can be utilized by the server-side,
            initialize an XMLHttpRequest object, and
            prompt the XMLHttpRequest object to send an asynchronous request to the server.
        
        Asynchronous interaction implies that the browser can continue to process events in the 
        page after the request is sent. Data is passed in the background, and can be automatically 
        loaded into the page without requiring a page refresh.
        -->
        <h1>Auto-Completion using AJAX</h1>
        <p>This example shows how you can do real time auto-completion using Asynchronous
            JavaScript and XML (Ajax) interactions.</p>

        <p>In the form below enter a name. Possible names that will be completed are displayed
            below the form. For example, try typing in "Bach," "Mozart," or "Stravinsky,"
            then click on one of the selections to see composer details.</p>

        <form name="autofillform" action="autocomplete">
            <table border="0" cellpadding="5">
                <thead>
                    <tr>
                        <th></th>
                        <th></th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td><strong>Composer Name:</strong></td>
                        <td><input type="text"
                                   size="40"
                                   id="complete-field"
                                   onkeyup="doCompletion();">
                        </td>
                    </tr>
                    <tr>
                        <td></td>
                        <td></td>
                    </tr>
                </tbody>
            </table>
        </form>


    </body>
</html>

