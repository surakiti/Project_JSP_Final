<%-- 
    Document   : Index
    Created on : Nov 20, 2016, 1:31:29 AM
    Author     : surakitisopontanapat
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!DOCTYPE html>
<html lang="en">

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Calcories</title>

    <link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

    <link href="vendor/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
    <link href="https://fonts.googleapis.com/css?family=Montserrat:400,700" rel="stylesheet" type="text/css">
    <link href='https://fonts.googleapis.com/css?family=Kaushan+Script' rel='stylesheet' type='text/css'>
    <link href='https://fonts.googleapis.com/css?family=Droid+Serif:400,700,400italic,700italic' rel='stylesheet' type='text/css'>
    <link href='https://fonts.googleapis.com/css?family=Roboto+Slab:400,100,300,700' rel='stylesheet' type='text/css'>

    <link href="css/agency.min.css" rel="stylesheet">
    <link rel="shortcut icon" type="image/png" href="img/logoD.jpg"/>

</head>

<body id="page-top" class="index">
    <nav id="mainNav" class="navbar navbar-default navbar-custom navbar-fixed-top">
        <div class="container">
            <div class="navbar-header page-scroll">
                <a class="navbar-calcories page-scroll" href="#page-top">Calcories</a>
            </div>

            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                <ul class="nav navbar-nav navbar-right">
                    <li class="hidden">
                        <a href="#page-top"></a>
                    </li>
                    <li>
                        <a class="page-scroll" href="#about">About</a>
                    </li>
                    <li>
                        <a class="page-scroll" href="#voucher">Voucher</a>
                    </li>
                    <li>
                        <a class="page-scroll" href="#team">Team</a>
                    </li>
                    <li>
                        <a class="page-scroll" href="Profiles" style="color:#F27935;" ><e:set value="${sessionScope.fullnames==null ? 'Login':'555555s'}"/>${sessionScope.fullnames==null ? 'Login':sessionScope.fullnames}</a>
                    </li>
                   
                </ul>
            </div>
        </div>
    </nav>

    <header>
        <div class="container">
            <div class="intro-text">
                <div class="intro-heading">LET'S BURN<br>YOUR WEIGHT</div>
                <a href="#about" class="page-scroll btn btn-xl">LEARN MORE</a>
            </div>
        </div>
    </header>

    <section id="about" class="bg-light-gray">
        <div class="container">
            <div class="row">
                <div class="col-lg-12 text-center">
                    <h2 class="section-heading">ABOUT</h2>
                    <h3 class="section-subheading text-muted">Make your life better.</h3>
                </div>
            </div>
            <div class="row text-center">
                <div class="col-md-4">
                    <span class="fa-stack fa-4x">
                        <i class="fa fa-circle fa-stack-2x text-primary"></i>
                        <i class="fa fa-bar-chart fa-stack-1x fa-inverse"></i>
                    </span>
                    <h4 class="service-heading">BMI Calculate</h4>
                    <p class="text-muted">Calculate a BMI and check a body shape.</p>
                </div>
                <div class="col-md-4">
                    <span class="fa-stack fa-4x">
                        <i class="fa fa-circle fa-stack-2x text-primary"></i>
                        <i class="fa fa-cutlery fa-stack-1x fa-inverse"></i>
                    </span>
                    <h4 class="service-heading">Track a Daily routines</h4>
                    <p class="text-muted">Calculate a food's calories and exercise burned in real life.</p>
                </div>
                <div class="col-md-4">
                    <span class="fa-stack fa-4x">
                        <i class="fa fa-circle fa-stack-2x text-primary"></i>
                        <i class="fa fa-gift fa-stack-1x fa-inverse"></i>
                    </span>
                    <h4 class="service-heading">Earn a Special gift</h4>
                    <p class="text-muted">Special gift can earned by points that get from the app.</p>
                </div>
            </div>
        </div>
    </section>

    <section id="voucher">
        <div class="container">
            <div class="row">
                <div class="col-lg-12 text-center">
                    <h2 class="section-heading">Voucher</h2>
                    <h3 class="section-subheading text-muted">Earn coins and gifts!</h3>
                </div>
            </div>
            <div class="row">
                <div class="col-sm-4">
                    <div class="team-member">
                        <img src="http://image.flaticon.com/icons/svg/172/172665.svg" class="img-responsive" alt="" width="60%">
                        <h4>Movie Ticket</h4>
                        <p class="text-muted">Earn movie ticket voucher from your points.</p>
                    </div>
                </div>
            	<div class="col-sm-4">
                    <div class="team-member">
                        <img src="http://image.flaticon.com/icons/svg/214/214335.svg" class="img-responsive" alt="" width="60%">
                        <h4>Plane Ticket</h4>
                        <p class="text-muted">Make a journey trip with your points.</p>
                    </div>
                </div>
                <div class="col-sm-4">
                    <div class="team-member">
                        <img src="http://image.flaticon.com/icons/svg/233/233006.svg" class="img-responsive" alt="" width="60%">
                        <h4>Fitness Voucher</h4>
                        <p class="text-muted">Loss your weight with your points.</p>
                    </div>
                </div>
            </div>
        </div>
    </section>
        <section id="team" class="bg-light-gray">
        <div class="container">
            <div class="row">
                <div class="col-lg-12 text-center">
                    <h2 class="section-heading">Team</h2>
                    <h3 class="section-subheading text-muted"></h3>
                </div>
            </div>
            <div class="row">
                <div class="col-sm-4">
                    <div class="team-member">
                        <img src="https://scontent.fbkk2-3.fna.fbcdn.net/v/t1.0-9/14590406_1193906027332369_2093348446874887868_n.jpg?oh=31c4599e772d73ae47aef28ebcd2093f&oe=58961006" class="img-responsive img-circle" width="60%">
                        <h4>Asia</h4>
                        <p class="text-muted">Java Developer</p>
                        <ul class="list-inline social-buttons">
                            <li><a href="#"><i class="fa fa-twitter"></i></a>
                            </li>
                            <li><a href="https://www.facebook.com/surakiticap"><i class="fa fa-facebook"></i></a>
                            </li>
                        </ul>
                    </div>
                </div>
                <div class="col-sm-4">
                    <div class="team-member">
                        <img src="https://scontent.fbkk2-3.fna.fbcdn.net/v/t1.0-9/14705842_1621033434588765_2445910201713144821_n.jpg?oh=242cc0b4270cfaa64f61d5fd21d11227&oe=58CF3202" class="img-responsive img-circle" width="60%">
                        <h4>Pome</h4>
                        <p class="text-muted">Java Developer</p>
                        <ul class="list-inline social-buttons">
                            <li><a href="#"><i class="fa fa-twitter"></i></a>
                            </li>
                            <li><a href="https://www.facebook.com/ApplezPOM"><i class="fa fa-facebook"></i></a>
                            </li>
                        </ul>
                    </div>
                </div>
                <div class="col-sm-4">
                    <div class="team-member">
                        <img src="https://scontent.fbkk2-3.fna.fbcdn.net/v/t1.0-9/14568104_1280727431951243_7069999087461772364_n.jpg?oh=f8fb4ffa60d143c83eb612de36f909e1&oe=58C3CFE6" class="img-responsive img-circle" width="60%">
                        <h4>Book</h4>
                        <p class="text-muted">Java Developer</p>
                        <ul class="list-inline social-buttons">
                            <li><a href="#"><i class="fa fa-twitter"></i></a>
                            </li>
                            <li><a href="https://www.facebook.com/bookwiwit"><i class="fa fa-facebook"></i></a>
                            </li>
                        </ul>
                    </div>
                </div>
                <div class="col-sm-6">
                    <div class="team-member">
                        <img src="https://scontent.fbkk2-3.fna.fbcdn.net/v/t1.0-9/13700200_1228698250496164_2704095577524482580_n.jpg?oh=93bca85e3d8dfa85024ddd83686e20c4&oe=5891BCB7" class="img-responsive img-circle" width="40%">
                        <h4>Earth</h4>
                        <p class="text-muted">Web Developer</p>
                        <ul class="list-inline social-buttons">
                            <li><a href="#"><i class="fa fa-twitter"></i></a>
                            </li>
                            <li><a href="https://www.facebook.com/TheEarThPr"><i class="fa fa-facebook"></i></a>
                            </li>
                        </ul>
                    </div>
                </div>
                <div class="col-sm-6">
                    <div class="team-member">
                        <img src="https://scontent.fbkk2-3.fna.fbcdn.net/v/t1.0-9/12522918_1184300628247533_7471262031574958381_n.jpg?oh=28fec6a20727245e2ed11d0d46532218&oe=58908F0D" class="img-responsive img-circle" width="40%">
                        <h4>Pan</h4>
                        <p class="text-muted">Web Developer</p>
                        <ul class="list-inline social-buttons">
                            <li><a href="#"><i class="fa fa-twitter"></i></a>
                            </li>
                            <li><a href="https://www.facebook.com/shunq96x"><i class="fa fa-facebook"></i></a>
                            </li>
                        </ul>
                    </div>
                </div>
            </div>
        </div>
    </section>
    
    <footer>
        <div class="container">
            <div class="row">
                <div class="col-md-4">
                    <span class="copyright">2016 JSP Project "Calcories"</span>
                </div>
                <div class="col-md-4"><!--
                    <ul class="list-inline social-buttons">
                        <li><a href="#"><i class="fa fa-twitter"></i></a>
                        </li>
                        <li><a href="#"><i class="fa fa-facebook"></i></a>
                        </li>
                        <li><a href="#"><i class="fa fa-linkedin"></i></a>
                        </li>
                    </ul>-->
                </div>
                <div class="col-md-4">
                    <ul class="list-inline quicklinks">
                        <li><a href="https://www.sit.kmutt.ac.th/">SIT</a>
                        </li>
                        <li><a href="http://www.kmutt.ac.th/">KMUTT</a>
                        </li>
                    </ul>
                </div>
            </div>
        </div>
    </footer>
    
    <!-- jQuery -->
    <script src="vendor/jquery/jquery.min.js"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="vendor/bootstrap/js/bootstrap.min.js"></script>

    <!-- Plugin JavaScript -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-easing/1.3/jquery.easing.min.js"></script>

    <!-- Contact Form JavaScript -->
    <script src="js/jqBootstrapValidation.js"></script>
    <script src="js/contact_me.js"></script>

    <!-- Theme JavaScript -->
    <script src="js/agency.min.js"></script>

</body>

</html>
