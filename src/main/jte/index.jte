@param String name
@param String role

<!DOCTYPE html>
<html lang="en">
<head>
    <title>Magv-Pharma Dashboard</title>
</head>
<body>
    <h1>Welcome, ${name}!</h1>
    <p>Your current role is: ${role}</p>

    @if(role.equals("ADMIN"))
        <button>Access Admin Panel</button>
    @endif
</body>
</html>