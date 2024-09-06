<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Advance Java</title>
</head>
<body background="blue" >
<form method="post" action="/DBMVCdemo/MyServlet">
	<center>
		<table>
		<tr>
			<th colspan="2" style="color:green;"><h2>Questions Add Form</h2></th>
		</tr>
			<tr>
				<td>Question:</td>
				<td>
					<textarea name="question" rows="10" cols="50" placeholder="Enter Quetion"></textarea>
				</td>
			</tr>
			<tr>
				<td>Option A:</td>
				<td>
					<input type="text" name="optiona" style="width:370px;" placeholder="Enter Option A"/>
				</td>
			</tr>
			<tr>
				<td>Option B:</td>
				<td>
					<input type="text" name="optionb" style="width:370px;" placeholder="Enter Option B"/>
				</td>
			</tr>
			<tr>
				<td>Option C:</td>
				<td>
					<input type="text" name="optionc" style="width:370px;" placeholder="Enter Option C" />
				</td>
			</tr>
			<tr>
				<td>Option D:</td>
				<td>
					<input type="text" name="optiond" style="width:370px;" placeholder="Enter Option D"/>
				</td>
			</tr>
			<tr>
				<td>Correct Answer:</td>
				<td>
					<select name="correctans" style="width:370px;">
						<option value="">--SELECT Answer--</option>
						<option value="optiona">optiona</option>
						<option value="optionb">optionb</option>
						<option value="optionc">optionc</option>
						<option value="optiond">optiond</option>
					</select>
				</td>
			</tr>
			<tr>
				<td>Marks:</td>
				<td>
					<input type="number" name="marks" style="width:370px;" />
				</td>
			</tr>
			<tr>
				<td></td>
				<td>
					<input type="submit" value="Add Question" name="addquestion" />
				</td>
			</tr>
		</table>
	</center>
	</form>
</body>
</html>