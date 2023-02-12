<%@ page language="java" contentType="text/html; charset=ISO-8859-1" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="org.nrifintech.Interest" %>
<!DOCTYPE html>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Simple Interest Calculator</title>
    <link
      href="https://fonts.googleapis.com/css2?family=Poppins:wght@400;500&display=swap"
      rel="stylesheet"
    />
    <style>
      * {
        padding: 0;
        margin: 0;
        box-sizing: border-box;
        font-family: "Poppins", sans-serif;
      }
      body {
        height: 100vh;
        background: linear-gradient(#01e26e, #72ffb4);
      }
      .container {
        background-color: #ffffff;
        position: absolute;
        transform: translate(-50%, -50%);
        top: 50%;
        left: 50%;
        width: 80vw;
        max-width: 600px;
        min-width: 350px;
        padding: 60px 30px;
        border-radius: 10px;
        box-shadow: 0 20px 40px rgba(0, 0, 0, 0.2);
      }
      label {
        display: block;
        font-size: 22px;
        margin-bottom: 10px;
        font-weight: 500;
      }
      input {
        margin-bottom: 20px;
        border: none;
        font-size: 20px;
        border-bottom: 2px solid #585858;
        color: #585858;
        padding: 2px 15px;
      }
      input:focus {
        outline: none;
        border-bottom: 2.4px solid #01e26e;
      }
      .input-wrapper {
        display: flex;
        justify-content: space-between;
        gap: 20px;
      }
      .input-wrapper input {
        width: 100%;
      }
      .time-wrapper input {
        width: 60%;
      }
      select {
        width: 35%;
        border: 1px solid #585858;
        font-size: 20px;
        margin-left: 3%;
        padding: 8px 0;
        border-radius: 5px;
      }
      #calculate-btn {
        display: block;
        background-color: #01e26e;
        border: none;
        color: #ffffff;
        margin: 20px auto 0 auto;
        padding: 15px 40px;
        font-size: 20px;
        border-radius: 5px;
        cursor: pointer;
        transition: 0.2s all;
      }
      #calculate-btn:active {
        transform: scale(0.8);
      }
      #result {
        background-color: #c6ffe2;
        margin-top: 30px;
        color: #585858;
        text-align: center;
        font-size: 18px;
        padding: 20px;
        border-radius: 5px;
      }
      #result div {
        margin-bottom: 10px;
      }
      #result span {
        color: #000000;
        font-weight: 500;
      }
    </style>
  </head>
  <%
    double principal = 0.0;
    double rate = 0.0;
    int time = 0;
    String duration = "year";

    if (request.getMethod().equals("POST")) {
        principal = Double.parseDouble(request.getParameter("principal"));
        rate = Double.parseDouble(request.getParameter("rate"));
        time = Integer.parseInt(request.getParameter("time"));
        duration = request.getParameter("duration");
    }
    Interest interest = new Interest();
    double interestAmount = interest.simIntCalculate(principal, rate, time, duration);
    double totalAmount = interestAmount + principal;
   %>
  <body>
    <form action="helloservlet" method = "post">
      <div class="container">
        <div class="input-wrapper">
          <div class="wrapper">
            <label for="principal">Principal($):</label>
            <input name = "principal" type="number" id="principal" value="<%= principal %>" />
          </div>
          <div class="wrapper">
            <label for="rate">Rate:</label>
            <input name = "rate" type="number" id="rate" value="<%= rate %>" />
          </div>
        </div>
        <label for="time">Time:</label>
        <div class="time-wrapper">
          <input name = "time" type="number" id="time" value="<%= time %>" />
          <select name="duration" id="duration">
            <option value="year">Year</option>
            <option value="month">Month</option>
          </select>
        </div>
        <input type="submit" id="calculate-btn" value="Calculate" />
        <div id="result">
          <div>Principal Amount: <span><%= principal %></span></div>
          <div>Total Interest: <span><%= interestAmount %></span></div>
          <div>Total Amount: <span><%= totalAmount %></span></div>
        </div>
      </div>
    </form>
  </body>
</html>
