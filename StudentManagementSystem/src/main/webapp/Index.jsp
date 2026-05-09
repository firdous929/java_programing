<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Management - Lab 11</title>
<style>
    /* Dashboard Style Design */
    body { font-family: 'Segoe UI', Arial, sans-serif; background-color: #eef2f3; margin: 0; display: flex; justify-content: center; align-items: center; height: 100vh; }
    .card { background: white; padding: 40px; border-radius: 12px; box-shadow: 0 8px 30px rgba(0,0,0,0.08); width: 400px; }
    h2 { color: #2c3e50; text-align: center; margin-bottom: 30px; border-bottom: 2px solid #3498db; padding-bottom: 10px; }
    .input-group { margin-bottom: 20px; }
    label { display: block; margin-bottom: 8px; font-weight: 600; color: #34495e; }
    input[type="text"], input[type="number"] { width: 100%; padding: 12px; border: 1px solid #dcdfe6; border-radius: 6px; box-sizing: border-box; transition: border-color 0.3s; }
    input:focus { border-color: #3498db; outline: none; }
    input[type="submit"] { width: 100%; background-color: #3498db; color: white; padding: 14px; border: none; border-radius: 6px; cursor: pointer; font-size: 16px; font-weight: bold; margin-top: 10px; }
    input[type="submit"]:hover { background-color: #2980b9; }
</style>
</head>
<body>

<div class="card">
    <h2>Student Database Entry</h2>
    
    <!-- Action name must match your Servlet @WebServlet annotation -->
    <form action="StudentServlet" method="post">
        <div class="input-group">
            <label>Roll Number</label>
            <input type="number" name="rollno" required placeholder="Enter Roll No">
        </div>
        
        <div class="input-group">
            <label>Full Name</label>
            <input type="text" name="sname" required placeholder="Enter Full Name">
        </div>
        
        <div class="input-group">
            <label>Course Name</label>
            <input type="text" name="course" required placeholder="e.g. MCA">
        </div>
        
        <div class="input-group">
            <label>Academic Marks</label>
            <input type="number" step="0.01" name="marks" required placeholder="Enter Marks">
        </div>
        
        <input type="submit" value="Save Student Record">
    </form>
</div>

</body>
</html>