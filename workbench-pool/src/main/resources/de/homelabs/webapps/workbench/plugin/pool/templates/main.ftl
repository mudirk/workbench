			<div id="subdiv">
	<ul id="submenu">
		<li style="background-image: url(img/circle-check-2x.png);background-repeat: no-repeat;"><a href="#">anlegen</a></li>								
	</ul>
</div>
			<p>Der Pool ist ein Ort, an dem Dinge schnell und unkompliziert erfasst werden können. Später besteht die Möglichkeit, Elemente des Pools ind konkrete
			Objekte umzuwandeln. Weiterhin können Pool-Objekte mit Objekten aus Pulgins ergänzt werden. 
			</p>
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
					<td><a href="#" title="bearbeiten"><img src="img/pencil-2x.png" /></a>&nbsp;&nbsp;<a href="#" title="l&ouml;schen"><img src="img/trash-2x.png" /></a></td>
					<td class="td_id">${poolitem.id}</td>
					<td>${poolitem.created?datetime}</td>
					<td>${poolitem.author}</td>
					<td>simple</td>
					<td>${poolitem.name}</td>
				</tr>
				</#list>
				</#if>
			</table>	