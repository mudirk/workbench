<!-- 
Links:
http://jqueryui.com/dialog/

-->
<script>
$(document).ready(function(){    
      var  dialog = $( "#dialog-form" ).dialog({
      autoOpen: false,
      height: 300,
      width: 350,
      modal: true
      });
        $('#create_post').click(function(e){
	        e.preventDefault();
	        $( "#dialog-form" ).load( "/workbench/pool/createform.html" );
	    	
	    });
	    
	     $( document ).ajaxStart(function() {
  			$.blockUI({ message: '<h1><img src="/workbench/img/busy.gif" width="16" />Bitte warten...</h1>' });
		});
		$( document).ajaxSuccess(function() {
			$.unblockUI();
			dialog.dialog("open"); 
		});
		
    }); 
    
</script>
<style type="text/css">
	#dialog-form {
	background-color:#cecece;
	opacity:0.92;
	}
</style>
			<div id="subdiv">
				<ul id="submenu">
					<li style="background-image: url(img/document-2x.png);background-repeat: no-repeat;"><a href="#" id="create_post">anlegen</a></li>		
				</ul>
			</div>
			<p>Der Pool ist ein Ort, an dem Dinge schnell und unkompliziert erfasst werden können. Später besteht die Möglichkeit, Elemente des Pools ind konkrete
			Objekte umzuwandeln. Weiterhin können Pool-Objekte mit Objekten aus Pulgins ergänzt werden. 
			</p>
			<div id="dialog-form" title="Create new user">
  <p class="validateTips">All form fields are required.</p>
 
  <form>
    <fieldset>
      <label for="name">Name</label>
      <input type="text" name="name" id="name" value="Jane Smith" class="text ui-widget-content ui-corner-all">
      <label for="email">Email</label>
      <input type="text" name="email" id="email" value="jane@smith.com" class="text ui-widget-content ui-corner-all">
      <label for="password">Password</label>
      <input type="password" name="password" id="password" value="xxxxxxx" class="text ui-widget-content ui-corner-all">
 
      <!-- Allow form submission with keyboard without duplicating the dialog button -->
      <input type="submit" tabindex="-1" style="position:absolute; top:-1000px">
    </fieldset>
  </form>
</div>
			<table>
				<tr>
					<th>Aktion</th>
					<th>ID</th>
					<th>erstellt</th>
					<th>Autor</th>
					<th>Typ</th>
					<th>Name</th>
				</tr>
				<#if poolitems??>
				<#assign index=0>
				<#list poolitems as poolitem>
				<tr class="<#if index==0>tr_even<#assign index=1><#else>tr_odd<#assign index=0></#if>">
					<td><a href="#" title="details"><img src="img/zoom-in-2x.png" /></a>&nbsp;&nbsp;<a href="#" title="bearbeiten"><img src="img/pencil-2x.png" /></a>&nbsp;&nbsp;<a href="#" title="l&ouml;schen"><img src="img/trash-2x.png" /></a></td>
					<td class="td_id">${poolitem.id}</td>
					<td>${poolitem.entityMetaData.createdAsText}</td>
					<td>${poolitem.entityMetaData.createdBy}</td>
					<td>simple</td>
					<td>${poolitem.name}</td>
				</tr>
				</#list>
				</#if>
			</table>	