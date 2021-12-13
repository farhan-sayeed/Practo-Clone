<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
<div>
	<ul>
		<li><a href="#" id="loginLink">Login</a></li>
		<li><a href="C:\Users\hp\git\Practo-Clone\practoclone\src\main\webapp\WEB-INF\views/register.jsp" id="registerLink">Register</a></li>
	</ul>
</div>
<div class="outer-box center-align outer-space">
   <div>
     <div>Mobile Number / Email ID</div>
      
    <input autofocus="" id="username" name="username" placeholder="Mobile Number / Email ID" type="text" value="">
  
   </div>

   <div>
     <div>Password</div>
          <input id="password" name="password" placeholder="Password" type="password" value="">
   </div>

   <div id="forgotPasswordContainer" style="pointer-events: auto; opacity: 1;">
   <div class="padding-top-8 font-12">
      <div class="forget-pasword">
      <a href="#" id="forgotPassword">Forgot password?</a>
      </div>
      <div style="clear:both"></div>
   </div>
  </div>
   <div class="padding-top-20 font-12 textMuted">
      <div class="otp-flow">
       <div class="otp_flow">
          <input id="otp_flow" name="otp_flow" type="checkbox" value="y">
          <label for="otp_flow"></label>
           <label class="mousePointer font-12 textMuted line-height-20" for="otp_flow">Login with OTP instead of password</label>
       </div>
      
      </div>
   </div>
   
   <div class="padding-top-20" style="margin-top: 20px;">
      <button type="submit" class="btn  btn-lg common-btn practo-btn" id="login">
		Login
	  </button>
   </div>
 </div>
</body>
</html>