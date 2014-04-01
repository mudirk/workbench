<!doctype html>
<html lang="de">
<head>
<!-- Basic Page Needs -->
<meta charset="utf-8">
<title>Workbench</title>
<meta name="description" content="">
<meta name="author" content="">
<!-- CSS  -->
<link rel="stylesheet" href="css/style.css">
<!--[if lt IE 9]>
  <script src="js/html5.js">
  </script><![endif]--> 
<script src="js/jquery.min.js" type="text/javascript"></script>
<script src="js/jquery-1.8.2.min.js" type="text/javascript"></script>
<script src="js/jquery-ui-1.8.20.custom.min.js" type="text/javascript"></script>
<script src="js/respond.min.js" type="text/javascript"></script>
</head>
<body>
	<div id="wrapper">
	<header>
		<h1>${title}</h1>
	</header> 
    
	<!--<section class="content">
		<p>Infotext</p>
	</section>-->

	<section class="content-columns">
		<aside class="content-column-left">
			<!--<h2>Menu</h2>-->
			<ul class="main_menu">
			<#if mainMenuItems??>
				<#list mainMenuItems as menuItem>
					<li><a href="${menuItem.link}">${menuItem.text}</a></li>
				</#list>
			</#if>
			</ul>
		</aside>
		<aside class="content-column-right">				
			<#if contextMenuItems??>
			<ul class="context_menu">
				<#list contextMenuItems as contextMenuItem>
					<a href="${contextMenuItem.link}" title="${contextMenuItem.title}" alt="${contextMenuItem.alt}"><img src="${contextMenuItem.icon}" /></a>
				</#list>
			</ul>
			</#if>
			<#include "${contentTemplate}">						
			<div>&nbsp;</div>
		</aside>
	</section>
	
	<!--footer starts here -->
	<footer id="footer">
		<div class="footer_logo">
			<img src="img/logo_footer.jpg" alt="#">
        </div>     
        <p class="copyright"><a href="http://www.homelabs.de/" title="homelabs.de" target="_blank">homelabs</a> | 2014</p> 
     </footer><!--footer end -->  
    </div>
</body>
</html>