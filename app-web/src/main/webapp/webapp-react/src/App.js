import PrimerComponente from "./Components/PrimerComponente";
import { useState } from 'react';

const semana = [
  'LUNES',
  'MARTES',
  'MIERCOLES'
];

function App() {
  //variables
  const [edad, setEdad] = useState(0);
  const [apellido, setApellido] = useState('');
  const [dias, setDias] = useState(semana);
  //hook
  //metodos
  const incrementar = () => {
    console.log('edad', edad);
    setEdad(edad + 1);
  }

  const decrementar = () => {
    setEdad(edad - 1);
  }

  return (
    <>
      <label>{edad}</label>
      <br />
      <button className='btn btn-info' onClick={incrementar}>Incrementar</button>
      <button className='btn btn-info' onClick={decrementar}>Incrementar</button>
      <div>
        <ul>
          {
            dias.map((dia, index) => {
              return <li key={index}>{dia}</li>
            })
          }
        </ul>
      </div>
    </>

  );
}

export default App;
