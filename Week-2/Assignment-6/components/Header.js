function Header(){
    const [clicked, setClicked] = React.useState('Welcome Message'); 
    
    const handleClick = () => {
       setClicked('Have a Good Time!'); 
    }

    return (
        <h1 onClick={handleClick}>{clicked}</h1>
    )
}