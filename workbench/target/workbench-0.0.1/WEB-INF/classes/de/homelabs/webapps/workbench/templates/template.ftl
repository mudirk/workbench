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
		<h1>Workbench</h1>
		
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
			<!--<ul class="context_menu">
				<li>
				
					<a href="#" title="Benutzer auflisten" alt="Benutzer auflisten"><img src="img/page_find.png"></a>
				</li>
				<li>
					<a href="#" title="Benutzer anlegen" alt="Benutzer anlegen"><img src="img/page_add.png" /></a>
				</li>
			</ul>-->
			</#if>
			
			</p>
			<h2>Benutzerverwaltung | &Uuml;bersicht</h2>
			<p>The fact that you are seeing this page indicates that the website you just visited is either experiencing problems or is undergoing routine maintenance.</p>
			<p>If you would like to let the administrators of this website know that you've seen this page instead of the page you expected, you should send them e-mail. In general, mail sent to the name "webmaster" and directed to the website's domain should reach the appropriate person.</p>
			<table>
				<tr>
					<th>Id</th>
					<th>Name</th>
					<th>Status</th>
					<th>Login</th>
				</tr>
				<tr class="td_even">
					<td>1</td>
					<td>Dirk M&uuml;ller</td>
					<td>aktiv</td>
					<td>dmueller</td>
				</tr>
				<tr>
					<td class="td_odd">2</td>
					<td class="td_odd">Maximilian Mustermann</td>
					<td class="td_odd">aktiv</td>
					<td class="td_odd">mmustermann</td>
				</tr>
			</table>
			<div>&nbsp;</div>
		</aside>
	</section>
	
	<!--footer starts here -->
	<footer id="footer">
		<div class="footer_logo">
			<img src="img/logo_footer.jpg" alt="#">
        </div>
          
    	<!--<ul class="navlinks">
			<li><a href="#">nach Oben</a>|</li>
            <li><a href="#">About Us</a>|</li>
            <li><a href="#">Blog</a>|</li>
            <li><a href="#">Contact</a></li>
     	</ul>-->
        
        <p class="copyright"><a href="http://www.homelabs.de/" title="homelabs.de" target="_blank">homelabs</a> | 2014</p> 
     </footer><!--footer end -->  
    </div>
</body>
</html>