<!DOCTYPE html>
<html lang="en">

<head>
    <!-- Required meta tags-->
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="Colorlib Templates">
    <meta name="author" content="Colorlib">
    <meta name="keywords" content="Colorlib Templates">

    <!-- Title Page-->
    <title>Apply for Event</title>

    <!-- Font special for pages-->
    <link href="https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i,800,800i" rel="stylesheet">

    <!-- Main CSS-->
    <link href="main2.css" rel="stylesheet" media="all">
</head>

<body>
    <div class="page-wrapper bg-dark p-t-100 p-b-50">
        <div class="wrapper wrapper--w900">
            <div class="card card-6">
                <div class="card-heading">
                    <h2 class="title">Apply for Event</h2>
                </div>
               
                <div class="card-body">
                     <form method="POST" action="iioi">
                     <div class="form-row">
                            <div class="name">Reg.No</div>
                            <div class="value">
                                <input class="input--style-6" type="text" name="rno">
                            </div>
                        </div>
                        <div class="form-row">
                            <div class="name">Organization name</div>
                            <div class="value">
                                <input class="input--style-6" type="text" name="orga_name">
                            </div>
                        </div>
                        <div class="form-row">
                            <div class="name">Event name</div>
                            <div class="value">
                                <div class="input-group">
                                    <input class="input--style-6" type="text" name="ename">
                                </div>
                            </div>
                        </div>
                        <div class="form-row">
                            <div class="name">University name</div>
                            <div class="value">
                                <div class="input-group">
                                  <select name="txtUni">
                                            <option disabled="disabled" selected="selected">Choose University</option>
                                            <option>NSBM Green University</option>
                                            <option>Plymouth University</option>
                                            <option>IIT Madras</option>
                                             <option>All</option>
                                        </select>
                                </div>
                            </div>
                        </div>
                        <div class="form-row">
                            <div class="name">Date</div>
                            <div class="value">
                                <div class="input-group">
                                    <input class="input--style-6" type="text" name="edate">
                                </div>
                            </div>
                        </div>
                        <div class="form-row">
                            <div class="name">Event details</div>
                            <div class="value">
                                <div class="input-group">
                                    <textarea class="textarea--style-6" name="edetail" ></textarea>
                                </div>
                            </div>
                        </div>
                        <div class="form-row">
                            <div class="name">Upload Image</div>
                            <div class="value">
                                <div class="input-group js-input-file">
                                    <input class="input-file" type="file" name="photo" id="file">
                                    <label class="label--file" for="file">Choose file</label>
                                    <span class="input-file__info">No file chosen</span>
                                </div>
                                <div class="label--desc">Upload your Image. Max file size 50 MB</div>
                            </div>
                        </div>
                        
                        <div class="card-footer">
                    <button class="btn btn--radius-2 btn--blue-2" type="submit">Send Application</button>
                </div>
                     </form>
                </div>
                
               
            </div>
        </div>
    </div>

    <!-- Jquery JS-->
    <script src="jquery2.min.js"></script>


    <!-- Main JS-->
    <script src="global2.js"></script>

</body><!-- This templates was made by Colorlib (https://colorlib.com) -->

</html>
<!-- end document-->