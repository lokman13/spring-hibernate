<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<head>
    <link rel="stylesheet" type="text/css"
          href="<%=request.getContextPath()%>/resources/css/style1.css">
</head>
<a href="<c:url value="/j_spring_security_logout" />" > Logout</a>
<div class="errors">
    ${exception}
</div>
<div id="formProd" class="cadre">
    <f:form modelAttribute="produit" action="saveProd"
            method="post" enctype="multipart/form-data">
    <table>
        <tr>
            <td>ID Produit</td>
            <td><f:input path="idProduit"/></td>
            <td><f:errors path="idProduit" cssClass="errors"></f:errors></td>
        </tr>
        <tr>
            <td>Désignation</td>
            <td><f:input path="designation"/></td>
            <td><f:errors path="designation" cssClass="errors"></f:errors></td>
        </tr>
        <tr>
            <td>Cétegorie</td>
            <td><f:select path="categorie.idcategorie" items="${categories}"
                          itemValue="idcategorie" itemLabel="nomCategorie"></f:select></td>
            <td><f:errors path="designation" cssClass="errors"></f:errors></td>
        </tr>
        <tr>
            <td>Description</td>
            <td><f:textarea path="description"/></td>
            <td><f:errors path="description" cssClass="errors"></f:errors></td>
        </tr>
        <tr>
            <td>Prix</td>
            <td><f:input path="prix"/></td>
            <td><f:errors path="prix" cssClass="errors"></f:errors></td>
        </tr>
        <tr>
            <td>Quantité</td>
            <td><f:input path="quantite"/></td>
            <td><f:errors path="quantite" cssClass="errors"></f:errors></td>
        </tr>
        <tr>
            <td>Séleclionner?</td>
            <td><f:checkbox path="selected"/></td>
            <td><f:errors path="selected" cssClass="errors"></f:errors></td>
        </tr>
        <tr>
            <td>Photo</td>
            <td>
                <c:if test="${produit.idProduit!=null}">
                    <img src="photoProd?idProd=${produit.idProduit }"/>
                </c:if>
            </td>
            <td>
                <input type="file" name="file"/>
            </td>
        </tr>
        <tr>
            <td><input type="submit" value="Save"></td>
        </tr>
    </table>
    </f:form>
</div>