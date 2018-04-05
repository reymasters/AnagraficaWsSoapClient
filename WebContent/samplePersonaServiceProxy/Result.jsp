<%@page contentType="text/html;charset=UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<HTML>
<HEAD>
<TITLE>Result</TITLE>
</HEAD>
<BODY>
<H1>Result</H1>

<jsp:useBean id="samplePersonaServiceProxyid" scope="session" class="it.au.service.PersonaServiceProxy" />
<%
if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
samplePersonaServiceProxyid.setEndpoint(request.getParameter("endpoint"));
%>

<%
String method = request.getParameter("method");
int methodID = 0;
if (method == null) methodID = -1;

if(methodID != -1) methodID = Integer.parseInt(method);
boolean gotMethod = false;

try {
switch (methodID){ 
case 2:
        gotMethod = true;
        java.lang.String getEndpoint2mtemp = samplePersonaServiceProxyid.getEndpoint();
if(getEndpoint2mtemp == null){
%>
<%=getEndpoint2mtemp %>
<%
}else{
        String tempResultreturnp3 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(getEndpoint2mtemp));
        %>
        <%= tempResultreturnp3 %>
        <%
}
break;
case 5:
        gotMethod = true;
        String endpoint_0id=  request.getParameter("endpoint8");
            java.lang.String endpoint_0idTemp = null;
        if(!endpoint_0id.equals("")){
         endpoint_0idTemp  = endpoint_0id;
        }
        samplePersonaServiceProxyid.setEndpoint(endpoint_0idTemp);
break;
case 10:
        gotMethod = true;
        it.au.service.PersonaService getPersonaService10mtemp = samplePersonaServiceProxyid.getPersonaService();
if(getPersonaService10mtemp == null){
%>
<%=getPersonaService10mtemp %>
<%
}else{
        if(getPersonaService10mtemp!= null){
        String tempreturnp11 = getPersonaService10mtemp.toString();
        %>
        <%=tempreturnp11%>
        <%
        }}
break;
case 13:
        gotMethod = true;
        String nome_1id=  request.getParameter("nome16");
            java.lang.String nome_1idTemp = null;
        if(!nome_1id.equals("")){
         nome_1idTemp  = nome_1id;
        }
        String cognome_2id=  request.getParameter("cognome18");
            java.lang.String cognome_2idTemp = null;
        if(!cognome_2id.equals("")){
         cognome_2idTemp  = cognome_2id;
        }
        String mail_3id=  request.getParameter("mail20");
            java.lang.String mail_3idTemp = null;
        if(!mail_3id.equals("")){
         mail_3idTemp  = mail_3id;
        }
        samplePersonaServiceProxyid.addPersonaCustom(nome_1idTemp,cognome_2idTemp,mail_3idTemp);
break;
case 22:
        gotMethod = true;
        String id_4id=  request.getParameter("id31");
        int id_4idTemp  = Integer.parseInt(id_4id);
        it.au.bean.Persona getPersona22mtemp = samplePersonaServiceProxyid.getPersona(id_4idTemp);
if(getPersona22mtemp == null){
%>
<%=getPersona22mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">nome:</TD>
<TD>
<%
if(getPersona22mtemp != null){
java.lang.String typenome25 = getPersona22mtemp.getNome();
        String tempResultnome25 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typenome25));
        %>
        <%= tempResultnome25 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">mail:</TD>
<TD>
<%
if(getPersona22mtemp != null){
java.lang.String typemail27 = getPersona22mtemp.getMail();
        String tempResultmail27 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typemail27));
        %>
        <%= tempResultmail27 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">cognome:</TD>
<TD>
<%
if(getPersona22mtemp != null){
java.lang.String typecognome29 = getPersona22mtemp.getCognome();
        String tempResultcognome29 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typecognome29));
        %>
        <%= tempResultcognome29 %>
        <%
}%>
</TD>
</TABLE>
<%
}
break;
case 33:
        gotMethod = true;
        String nome_6id=  request.getParameter("nome38");
            java.lang.String nome_6idTemp = null;
        if(!nome_6id.equals("")){
         nome_6idTemp  = nome_6id;
        }
        String mail_7id=  request.getParameter("mail40");
            java.lang.String mail_7idTemp = null;
        if(!mail_7id.equals("")){
         mail_7idTemp  = mail_7id;
        }
        String cognome_8id=  request.getParameter("cognome42");
            java.lang.String cognome_8idTemp = null;
        if(!cognome_8id.equals("")){
         cognome_8idTemp  = cognome_8id;
        }
        %>
        <jsp:useBean id="it1au1bean1Persona_5id" scope="session" class="it.au.bean.Persona" />
        <%
        it1au1bean1Persona_5id.setNome(nome_6idTemp);
        it1au1bean1Persona_5id.setMail(mail_7idTemp);
        it1au1bean1Persona_5id.setCognome(cognome_8idTemp);
        samplePersonaServiceProxyid.addPersona(it1au1bean1Persona_5id);
break;
}
} catch (Exception e) { 
%>
Exception: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.toString()) %>
Message: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.getMessage()) %>
<%
return;
}
if(!gotMethod){
%>
result: N/A
<%
}
%>
</BODY>
</HTML>