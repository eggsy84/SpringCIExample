<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<form:form commandName="calcCommand">
	<table>
		<tr>
			<td><form:input path="valueOne" /></td>
			<td align="center" colspan="2">
				<span style="font-size: 1.5em"> + </span>
			</td>
			<td><form:input path="valueTwo"/></td>
			<td>
				<c:if test="${not empty total}"> = ${total}</c:if>
			</td>
		</tr>
		<tr>
			<td colspan="2">
				<input type="submit" value="Do some maths" />
			</td>
		</tr>
	</table>
</form:form>

