<#import "/spring.ftl" as spring />

<h1>testplugin</h1>

<#if message??>
<p>
	${message}
</p>
</#if>

<span>
	<p>Form</p>
	<form method="post">
		
		
		<input type="text" name="items['0']" />
		
		
		
		<input type="text" name="items['1']" />

		
		<input type="submit" value="abschicken" />
	</form>
</span>