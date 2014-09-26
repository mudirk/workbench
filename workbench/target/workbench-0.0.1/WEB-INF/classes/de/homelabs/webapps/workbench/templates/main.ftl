<html>
	<head>
		<title>Workbench - organize Work</title>
		<style>
			html, body {
				margin:0; padding:0;height:100%;
				font-family:"Trebuchet MS", Helvetica, sans-serif;
				font-size:small;
				color:#666;
			}

			img {padding:0;margin:0;border:0px;}
			
			#page {
				position:relative; /* needed for footer positioning*/
				margin:0 auto; /* center, not in IE5 */
				width:100%;
				/*background:#f0f0f0;*/
				background-color:#fff;
				height:auto !important; /* real browsers */
				height:100%; /* IE6: treaded as min-height*/
				min-height:100%; /* real browsers */
			}
			
			#top {
				padding:1em;
				margin-top:0px;
				background-color:#eee;
				border-bottom:6px double gray;
				height: 40px;
			}
			
			
			#bottom {
				position:relative;
				padding:1em 1em 5em; /* bottom padding for footer */
			}
	
			#footer {
				position:absolute;
				width:100%;
				bottom:0; /* stick to bottom */
				background:#ddd;
				border-top:6px double gray;
			}
			
			#left {
				position:absolute;
				float:left;
				height:auto !important; /* real browsers */
				height:100%; /* IE6: treaded as min-height*/
				min-height:100%; /* real browsers */
			}
			
			#content {
				background-color:#fff;
				padding-left:140px
			}
						
			#content h2 {padding:0px 0px 5px 10px;}
			#mainmenu {font-family:courier;font-size:0.9em; width:120px;margin:0; padding:0;}
			#mainmenu li {list-style: none; border-bottom: #fff solid; border-top: #fff solid; border-width: 1px;}
			#mainmenu a { border-bottom:1px solid black; margin:3px 2px 0px 2px; cursor:pointer; display:block; text-decoration:none;}
			#mainmenu a:hover{color:#f90;text-decoration:none;}
			
			#submenu {font-family:courier;font-size:1em;padding-left:12px;}
			#submenu li { display:inline;padding-left:20px;padding-bottom:2px;margin:0px 8px 0px 0px;}
			#submenu a { cursor:pointer;  text-decoration:none;}
			#submenu a:hover{color:#f90;text-decoration:none;}
			#subdiv {background-color:#e6e6e6;border:1px solid #995c00;margin-left:10px;margin-bottom:15px;}
			
			/* table */
			table {	border-spacing: 1px; border: 1px solid gray; padding: 1px; margin-left: 12px;font-family:"Palatino Linotype", "Book Antiqua", Palatino, serif; font-size:1em;}
			th { background-color:#995c00; font-weight:bold; color: #ffffff; padding: 5px; margin: 0px;}
			td {padding:5px;}
			.tr_even { background-color: #e6e6e6;font-size: 0.9em;}
			.tr_even td {border:1px solid #999999;}
			.tr_odd td {border:1px solid #999999;}
			.tr_odd { background-color: #ffffff; font-size: 0.9em;}
			.td_id {text-align:right;}
			
			/* typo */
			h1 { font:1.5em georgia,serif; 	margin:0.1em 0;}
			h2 { font:1.5em georgia,serif; margin:0 0 0.5em;}
			h1, h2, a {	color:orange;}
			p { line-height:1.5; margin:0 0 1em;}
			a {text-decoration: underline;color:#333;font-weight:bold;font-size:1.1em;}
			a:hover {color:#f90;}
			#top p { font-style:italic;	font-size:1.1em;margin:0;}
			#bottom p {text-align:justify;padding:0 1em;}
			#left p {padding:0em;margin:0em;}
			#footer p {padding:0.5em;margin:0;}
			#footer {font-family:courier;}
		</style>
		
		<!-- JQuery -->
		<script src="js/jquery.min.js" type="text/javascript"></script>
		<script src="js/jquery-1.8.2.min.js" type="text/javascript"></script>
		<script src="js/jquery-ui-1.8.20.custom.min.js" type="text/javascript"></script>
		<script src="js/jquery.blockUI.js" type="text/javascript"></script>
		<!--<script src="js/respond.min.js" type="text/javascript"></script>-->
		
	</head>
	
	<body>
		<div id="page">
			<div id="top">
				<h1>${title}</h1>
				<p>organize work</p>
			</div>
			<div id="bottom">
				<div id="left">
					<h2>Module</h2>
					<ul id="mainmenu">
						<#if mainMenuItems??>
							<#list mainMenuItems as menuItem>
								<li><a href="${menuItem.link}">${menuItem.text}</a></li>
							</#list>
						</#if>
					</ul>
					<br /><br />
					
				</div>
				<div id="content">
					<h2>[<span style="color:#995c00">${moduleTitle}</span>]</h2>
					
					<#if contextMenuItems??>
						<ul id="submenu">
							<#list contextMenuItems as contextMenuItem>
								<a href="${contextMenuItem.link}" title="${contextMenuItem.title}" alt="${contextMenuItem.alt}">${contextMenuItem.title}</a>
							</#list>
						</ul>
					</#if>
					
					<#include "${contentTemplate}">	
				</div>
			</div>
			<div id="footer">
				<p><a href="http://www.homelabs.de">2014 | homelabs</a></p>
			</div>
		</div>
	</body>
</html>