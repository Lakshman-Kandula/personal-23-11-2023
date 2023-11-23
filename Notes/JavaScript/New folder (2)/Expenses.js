// import logo from './logo.svg';
import './Expenses.css';
import ExpenseItem from "./components/ExpenseItem";
import Card from "./Card";

function Expenses() {

  const expenses = [
    {id: 1, title: "Electricity Bill", amount: 1200, date: new Date()},
    {id: 2, title: "Room Rent", amount: 5800, date: new Date()},
    {id: 3, title: "Groceries Bill", amount: 3300, date: new Date()},
    {id: 4, title: "Pocket Money", amount: 5000, date: new Date()},
  ];


  return (
    // <div className="App">
    //   <header className="App-header">
    //     <img src={logo} className="App-logo" alt="logo" />
    //     <p>
    //       Edit <code>src/App.js</code> and save to reload.
    //     </p>
    //     <a
    //       className="App-link"
    //       href="https://reactjs.org"
    //       target="_blank"
    //       rel="noopener noreferrer"
    //     >
    //       Learn React
    //     </a>
    //   </header>
    // </div>

    <Card className="expenses">
      {/* <h2>Let's get started</h2> */}
      <ExpenseItem title={expenses[0].title} amount={expenses[0].amount} date={expenses[0].date}></ExpenseItem>
      <ExpenseItem title={expenses[1].title} amount={expenses[1].amount} date={expenses[1].date}></ExpenseItem>
      <ExpenseItem title={expenses[2].title} amount={expenses[2].amount} date={expenses[2].date}></ExpenseItem>
      <ExpenseItem title={expenses[3].title} amount={expenses[3].amount} date={expenses[3].date}></ExpenseItem>
      {/* <p>Hi Everyone!!!</p> */}
    </Card>

  );
}

export default Expenses;
