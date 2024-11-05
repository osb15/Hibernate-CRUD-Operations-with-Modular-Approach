Hibernate CRUD Operations Project
<h1>Hibernate CRUD Operations with Modular Approach</h1>

<p>This project demonstrates a modular approach to implementing CRUD (Create, Read, Update, Delete) operations using Hibernate and Java. The project includes different layers—Controller, Service, DAO, and Entity—making it organized and easy to maintain.</p>

<h2>Table of Contents</h2>
<ul>
    <li><a href="#technologies-used">Technologies Used</a></li>
    <li><a href="#project-structure">Project Structure</a></li>
    <li><a href="#setup">Setup</a></li>
    <li><a href="#modules-overview">Modules Overview</a>
        <ul>
            <li><a href="#controller">Controller</a></li>
            <li><a href="#service">Service</a></li>
            <li><a href="#dao">DAO</a></li>
            <li><a href="#entity">Entity</a></li>
        </ul>
    </li>
    <li><a href="#crud-operations">CRUD Operations</a></li>
    <li><a href="#how-to-run">How to Run</a></li>
</ul>

<h2 id="technologies-used">Technologies Used</h2>
<ul>
    <li>Java</li>
    <li>Hibernate ORM</li>
    <li>MySQL (or any preferred relational database)</li>
    <li>Maven (for dependency management)</li>
</ul>

<h2 id="project-structure">Project Structure</h2>
<pre>
src/
├── main/
│   ├── java/
│   │   └── Com/
│   │       ├── Controller/
│   │       │   └── Main.java
│   │       ├── Services/
│   │       │   └── Employee_Service.java
│   │       ├── DAO/
│   │       │   └── Employee_Dao.java
│   │       └── Entity/
│   │           └── Employee.java
│   └── resources/
│       └── hibernate.cfg.xml
</pre>

<h2 id="setup">Setup</h2>
<ol>
    <li><strong>Clone the Repository</strong>: Clone this repository to your local machine.</li>
    <li><strong>Configure Hibernate</strong>:
        <ul>
            <li>Open <code>hibernate.cfg.xml</code> located in <code>src/main/resources/</code>.</li>
            <li>Update the database connection properties:
                <pre>
&lt;property name="hibernate.connection.url"&gt;jdbc:mysql://localhost:3306/your_db&lt;/property&gt;
&lt;property name="hibernate.connection.username"&gt;your_username&lt;/property&gt;
&lt;property name="hibernate.connection.password"&gt;your_password&lt;/property&gt;
                </pre>
                Replace <code>your_db</code>, <code>your_username</code>, and <code>your_password</code> with your actual MySQL database details.
            </li>
        </ul>
    </li>
    <li><strong>Build and Run</strong>:
        <ul>
            <li>Use Maven to build the project: <code>mvn clean install</code>.</li>
            <li>Run the project via your IDE or using the <code>Main</code> class as the entry point.</li>
        </ul>
    </li>
</ol>

<h2 id="modules-overview">Modules Overview</h2>

<h3 id="controller">Controller</h3>
<p><strong>Location</strong>: <code>Com.Controller.Main</code><br>
<strong>Description</strong>: Acts as the entry point of the application. It prompts the user for input to perform CRUD operations and invokes methods from the <code>Employee_Service</code> class.</p>

<h3 id="service">Service</h3>
<p><strong>Location</strong>: <code>Com.Services.Employee_Service</code><br>
<strong>Description</strong>: Contains business logic for each CRUD operation. It acts as an intermediary between the <code>Controller</code> and <code>DAO</code> layers.</p>

<h3 id="dao">DAO</h3>
<p><strong>Location</strong>: <code>Com.DAO.Employee_Dao</code><br>
<strong>Description</strong>: Handles direct interaction with the database using Hibernate. Each method performs a specific CRUD operation on the <code>Employee</code> table in the database.</p>

<h3 id="entity">Entity</h3>
<p><strong>Location</strong>: <code>Com.Entity.Employee</code><br>
<strong>Description</strong>: Represents the <code>Employee</code> entity, which maps to the <code>Employee</code> table in the database. Each instance of this class represents a row in the table.</p>

<h2 id="crud-operations">CRUD Operations</h2>

<h3>Create</h3>
<p><strong>Method</strong>: <code>insert()</code><br>
<strong>Description</strong>: Prompts the user for employee details (ID, name, address, salary) and inserts a new employee record into the database.</p>

<h3>Read</h3>
<p><strong>Method</strong>: <code>fetch()</code><br>
<strong>Description</strong>: Retrieves all employee records from the database and displays them.</p>

<h3>Update</h3>
<p><strong>Method</strong>: <code>update()</code><br>
<strong>Description</strong>: Prompts the user for the employee ID and updated information. Updates the employee record with the new details.</p>

<h3>Delete</h3>
<p><strong>Method</strong>: <code>delete()</code><br>
<strong>Description</strong>: Prompts the user for the employee ID and deletes the corresponding employee record from the database.</p>

<h2 id="how-to-run">How to Run</h2>

<ol>
    <li><strong>Run the Main Class</strong>:
        <ul>
            <li>Navigate to <code>Com.Controller.Main</code> and run the <code>main</code> method.</li>
        </ul>
    </li>
    <li><strong>Input Operations</strong>:
        <ul>
            <li>When prompted, enter a number to select a CRUD operation:
                <ul>
                    <li><code>1</code> for Insert</li>
                    <li><code>2</code> for Delete</li>
                    <li><code>3</code> for Update</li>
                    <li><code>4</code> for Fetch</li>
                    <li><code>5</code> to Exit</li>
                </ul>
            </li>
        </ul>
    </li>
    <li><strong>Follow Prompts</strong>:
        <ul>
            <li>For each option, follow the prompts to enter required employee information.</li>
        </ul>
    </li>
</ol>
