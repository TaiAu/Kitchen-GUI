# TeamProject03

SPRINT 1

The Model View Controller architecture is the core of the application structure:

The Controller interprets input from the users (Customer, Kitchen, Waiter, Management), updating the Model and/or View.

The Model manages the data logic of the application domain, responds to requests for information about its state (usually from the view) and responds to instructions to change state (usually from the controller).

The Customer View updates the Order with MenuItems selected by the Customer.
The Order is sent to the Kitchen View.

The Kitchen View updates the Order when the food has been completed.
The Order is sent to the Waiter View.

The Waiter View updates the Order when the food has been delivered.
The Order is sent to the Payment Interface.

The Management View has a view of all the other Views (Customer, Kitchen, Waiter).

BEING IMPLEMENTED:

Customer - view menu

The Model contains a Database that keeps all the data to be accessed by other classes as needed.

Customer - ordering

An Order is created by an item factory in the Model.

MVC - Ben & Tai

Customer View - Sam

Waiter View - Sabina

Kitchen View - William

Management View - Lauren
