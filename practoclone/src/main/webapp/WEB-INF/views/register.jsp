<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
</head>
<body>

<div class="outer-space">
    <p class="no-bottom-margin">Full Name</p>
    <input autofocus="autofocus" class="form-control email-text" id="name" name="name" placeholder="Full Name" type="text" value="">
    <input type="hidden" id="is-patient-signup">

    <div class="padding-top-8">
        <p class="no-bottom-margin">Mobile Number</p>
        <div class="padding-top-8">
            <div class="select-box"><select class="countryCode" id="country" name="country"><option selected="" value="IN">+91(IND)</option><option value="SG">+65(SGP)</option><option value="PH">+63(PHL)</option><option value="MY">+60(MYS)</option><option value="ID">+62(IDN)</option><option value="BR">+55(BRA)</option><option value="MX">+52(MEX)</option><option value="AR">+54(ARG)</option><option value="CL">+56(CHL)</option><option value="VN">+84(VNM)</option><option value="AE">+971(UAE)</option><option value="KW">+965(KW)</option><option value="TZ">+255(TZA)</option><option value="BH">+973(BH)</option><option value="SA">+966(SA)</option><option value="US">+1(USA)</option></select></div>
            <input class="form-control email-text " id="mobile" name="mobile" placeholder="Mobile Number" type="tel" value="">
        </div>
    </div>

    <div class="padding-top-8">
        <p class="no-bottom-margin">Create Password</p>
        <div class="padding-top-8">
            <input class="form-control email-text" id="password" name="password" placeholder="Password" type="password" value="">
            <div class="password-strength">
              Password Strength: <span id="password-strength-indicator">&nbsp;</span>
            </div>
        </div>
    </div>

    <div>
      <input id="csrf_token" name="csrf_token" type="hidden" value="ImNhNjllMDg2ZWFiYzM0NTVjY2E0ZmIwZDEyZTYzNzYzNDdkMDE3ZGUi.YbbobA.Yx2EnqqENCPr3AgGv0p4bxFjD58">
      <input id="intent" name="intent" type="hidden" value="fabric">
      <input id="source" name="source" type="hidden" value="">
      <input id="view_type" name="view_type" type="hidden" value="normal">
      <input id="type" name="type" type="hidden" value="patient">
   </div>

   <div>
      <div class="padding-top-20 font-12 textMuted">
        <div class="otp-flow">
         <div class="otp_flow">
            <input checked="checked" id="subscribe_promotion" name="subscribe_promotion" type="checkbox" value="y">
			<label class="mousePointerSignup font-12 textMuted line-height-20" for="subscribe_promotion"> By signing up, I agree to <a href="https://www.practo.com/ray/terms" target="_blank" id="terms">terms</a></label>
         </div>

        </div>
      </div>
      <div class="padding-top-20">
        <div id="recaptcha-container-register" data-sitekey="6LcgVBgUAAAAANU9A74W9CtzZ3NeJdhbGIoUbDXG" data-size="invisible">
        </div>
        <button class="btn  btn-lg common-btn practo-btn" id="EmailRegister">Send OTP</button>
      </div>
   </div>
  </div>
</body>
</html>