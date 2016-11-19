<%-- 
    Document   : DessertList
    Created on : Nov 20, 2016, 5:29:28 AM
    Author     : surakitisopontanapat
--%>

<%@page import="java.util.List"%>
<%@page import="model.SearchFood"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Dessert List</title>

        <link rel="stylesheet" href="http://fonts.googleapis.com/css?family=Roboto:400,100,300,500">
        <link rel="stylesheet" href="vendor/bootstrap/css/bootstrap.min.css">
        <link rel="stylesheet" href="vendor/font-awesome/css/font-awesome.min.css">
        <link rel="stylesheet" href="vendor/others/profile.css">
        <link rel="stylesheet" href="css/calcories.css">
        <link href="css/agency.min.css" rel="stylesheet">

        <link rel="shortcut icon" href="">
</head>
<body id="page-top" class="index">
        <nav id="mainNav" class="navbar navbar-default navbar-custom navbar-fixed-top">
                <div class="container">
                    <div class="navbar-header page-scroll">
                        <a class="navbar-calcories page-scroll" href="index.html" style="color:#F27935;">Calcories</a>
                    </div>
                    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                        <ul class="nav navbar-nav navbar-right">
                            <li class="hidden">
                                <a href="#page-top"></a>
                            </li>
                            <li>
                                <a class="page-scroll" href="index.html#about" style="color:#F27935;">About</a>
                            </li>
                            <li>
                                <a class="page-scroll" href="index.html#portfolio" style="color:#F27935;">Voucher</a>
                            </li>
                            <li>
                                <a class="page-scroll" href="index.html#team" style="color:#F27935;">Team</a>
                            </li>
                            <li>
                                <a class="page-scroll" href="Profile.html" style="color:#F27935;">Mickey</a>
                            </li>
                        </ul>
                    </div>  
                </div> 
        </nav>
    <div class="paddingprofile">
        <div class="container">
            <div class="row">
                <div class="col-sm-8">
                    <h1>Dessert</h1>
                </div>
                <div class="col-sm-4">
                    <form class="form-inline" action="ListFood" method="post" style="margin-top: 5%">
                        <div class="form-group">
                            <div class="input-group">
                                <div class="input-group-addon">
                                    <img src="img/magnifying-glass-browser.png">
                                </div>
                                <input type="text" class="form-control" name='searchDes' placeholder = "Enter the Menu">   
                            </div>
                        </div>
                        <button type="submit" class="btn btn-default">Search</button>
                    </form> 
                </div>
            </div>
        <table class="table" style="text-align: center">
            
            <tr style="background-color: orange; color: white">
                <td>No.</td>
                <td>Name</td>
                <td>Calories</td>
                <td>Qty.</td>
                <td>Detail</td>
                <td>Add</td>
            </tr>
            <%
            //List<Customer> customers = Customer.findByName("");
            List<SearchFood> searchDessert = (List) request.getAttribute("searchDessert");
            if (searchDessert != null) {
        
            
                for (SearchFood c : searchDessert) {
            %>
            <tr>
                <td>1</td>
                <td><%=c.getFullname()%></td>
                <td><%=c.getCal()%></td>
                <td><%=c.getAmount()%></td>
                <td><%=c.getDetail()%></td>
                <td>
                    <input type="checkbox" name="did" title="Add"/>
                </td>
            <%}%>
            </tr>
            <%}%>
        </table>
        
        <br>
        <br>
        <div style="text-align: right; padding-right: 5%">
            <button type="submit" class="btn btn-warning">Add to my calories</button>
        </div>
    </div>
    </div>
    </div>
        <script src="assets/js/jquery-3.1.1.js"></script>
        <script src="assets/bootstrap/js/bootstrap.min.js"></script>
        <script src="assets/js/jquery.backstretch.min.js"></script>
        <script src="assets/js/scripts.js"></script>
        <script src="vendor/jquery/jquery.min.js"></script>
        <script src="vendor/bootstrap/js/bootstrap.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-easing/1.3/jquery.easing.min.js"></script>
        <script src="js/jqBootstrapValidation.js"></script>
        <script src="js/contact_me.js"></script>
        <script src="js/agency.min.js"></script>
        <script src="vendor/icheck/icheck.js"></script>
        <link href="vendor/icheck/skins/flat/orange.css" rel="stylesheet">
        <script src="vendor/icheck/icheck.js"></script>
        <script>
            $(document).ready(function(){
              $('input').iCheck({
                checkboxClass: 'icheckbox_flat-orange',
                radioClass: 'iradio_flat-orange'
              });
            });
        </script>
        <script src="js/calcories.js"></script>
</body>
</html>
