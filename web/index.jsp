<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
    <link rel="stylesheet" href="style.css">
</head>
<body>
<%
    String text = "Lorem ipsum dolor amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor. Aenean massa. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Donec quam felis, ultricies nec, pellentesque eu, pretium quis, sem. Nulla consequat massa quis enim. Donec pede justo, fringilla vel, aliquet nec, vulputate eget, arcu. In enim justo, rhoncus ut, imperdiet a, venenatis vitae, justo. Nullam dictum felis eu pede mollis pretium. Integer tincidunt. Cras dapibus. Vivamus elementum semper nisi. Aenean vulputate eleifend tellus. Aenean leo ligula, porttitor eu, consequat vitae, eleifend ac, enim. Aliquam lorem ante, dapibus in, viverra quis, feugiat a, tellus. Phasellus viverra nulla ut metus varius laoreet. Quisque rutrum. Aenean imperdiet. Etiam ultricies nisi vel augue. Curabitur ullamcorper ultricies nisi. Nam eget dui.";
%>
<%
    if (session.getAttribute("newText") != null)
        text = (String) session.getAttribute("newText");
%>
<div class="View">
    <form action=Servlet method="post">
  <textarea name="textArea" rows="10" cols="100">
    <%=text%>
  </textarea>
        <br>

        <select id="selectedOption" name="selectedOption">
            <option>Choose transformation</option>
            <option value="lowercase">Lowercase</option>
            <option value="uppercase">Uppercase</option>
            <option value="mixedcase">Mixedcase</option>
        </select>
        <br>
        <button type="submit">Modify</button>
    </form>
</div>
</body>
</html>
