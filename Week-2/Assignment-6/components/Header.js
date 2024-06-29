function Header(){
    const [clicked, setClicked] = useState('Welcome Message'); 
    
    const handleClick = () => {
       setClicked('Have a Good Time!'); 
    }

    return (
        <h1 onclick={handleClick}>{setClicked}</h1>
    )
}