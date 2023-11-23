import "./Card.css";

function Card(props)
{
    const classes = "card" + props.className;   //  so anything we receive as  a class name from outside is added to the string
    return <div className={classes}>{props.children}</div>;
}

export default Card;