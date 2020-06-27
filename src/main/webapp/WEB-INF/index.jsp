<%@ include file="IncludeTop.jsp" %> 
<table style="border:none;border-collapse:collapse;width:100%">
  <tr>
    <td style="text-align:left;vertical-align:top;width:100%">
      <table style="border:none;border-collapse:collapse;width:80%">
        <tr>
          <td valign="top">                    
            <!-- SIDEBAR -->
            <table id="index">
              <tr>
                <td>
                <c:if test="${!empty userSession.account}">
			       <b><i><font size="4" color="RED">Welcome ${userSession.account.firstName}!</font></i></b>
                </c:if>&nbsp;
                </td>
              </tr>
              <tr>
                <td>
                  <a href="<c:url value="/spetstore/category.do?categoryId=FISH"/>">
                     FISH</a>
                </td>
              </tr>
              <tr>
                <td>
                  <a href="<c:url value="/shop/viewCategory.do?categoryId=DOGS"/>">
                    <img border="0" src="../images/dogs_icon.gif" /></a>
                </td>
              </tr>
              <tr>
                <td>
                  <a href="<c:url value="/shop/viewCategory.do?categoryId=CATS"/>">
                    <img border="0" src="../images/cats_icon.gif" /></a>
                </td>
              </tr>
              <tr>
                <td>
                  <a href="<c:url value="/shop/viewCategory.do?categoryId=REPTILES"/>">
                    <img border="0" src="../images/reptiles_icon.gif" /></a>
                </td>
              </tr>
              <tr>
                <td>
                  <a href="<c:url value="/shop/viewCategory.do?categoryId=BIRDS"/>">
                    <img border="0" src="../images/birds_icon.gif" /></a>
                </td>
              </tr>
            </table>
          </td>
          <td style="text-align:center;background-color:white;height:300;width:100%">
            MAIN IMAGE
            <p>main contents</p>
          </td>
        </tr>
      </table>
    </td>
  </tr>
</table>
<!-- 주석추가 -->
<%-- <%@ include file="IncludeBanner.jsp" %> --%>

<%@ include file="IncludeBottom.jsp" %>
