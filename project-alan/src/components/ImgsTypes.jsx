export default function Logos({type}) {
  return (
    <>
      <label htmlFor={type}>
        <div className="imgContainer">
          <img src={`../../public/imgs/${type}.png`} alt="test" />
        </div>
        <span>{type.toUpperCase()}</span>
      </label>
    </>
  )
}