import React, { useEffect, useState } from 'react';
import { batle } from './Battle';
import Logos from './ImgsTypes';

export default function App() {
  const [selectedTypes, setSelectedTypes] = useState([]);
  const pokemonTypes = [
    "normal", "fire", "water", "electric", "grass", "ice",
    "fighting", "poison", "ground", "flying", "psychic", "bug",
    "rock", "ghost", "dragon", "dark", "steel", "fairy"
  ];
  
  // Função para obter 6 tipos aleatórios
  const getRandomTypes = () => {
    const selectedTypes = [];
    const numTypesToSelect = 6;
    
    while (selectedTypes.length < numTypesToSelect) {
      const randomIndex = Math.floor(Math.random() * pokemonTypes.length);
      const randomType = pokemonTypes[randomIndex];
      if (!selectedTypes.includes(randomType)) {
        selectedTypes.push(randomType);
      }
    }
    
    return selectedTypes;
  };

  useEffect(() => {
    if (selectedTypes.length >= 6) {
      let partyOneWin = 0;
      let partyTwoWin = 0;
      let empate = 0;

      for (let i = 0; i < 100; i++) {
        switch (batle(selectedTypes, getRandomTypes())) {
          case 1:
            partyOneWin++;
            break
          case 2:
            partyTwoWin++
            break
          case 3:
            empate++;
        }
      }
      
      console.log(`A primeira equipe venceu ${partyOneWin} vezes`)
      console.log(`A segunda equipe venceu ${partyTwoWin} vezes`)
      console.log(`Houve empate ${empate} vezes`)
    };
  }, [selectedTypes])

  const handleCheckboxChange = (type) => {
    if (selectedTypes.includes(type)) {
      setSelectedTypes(selectedTypes.filter(t => t !== type));
    } else if (selectedTypes.length < 6) {
      setSelectedTypes([...selectedTypes, type]);
    }
  };

  return (
    <div className="App">
      <h2>Selecione até 6 tipos de Pokémon</h2>
      <form id="pokemon-types-form">
        {pokemonTypes.map((type) => (
          <span key={type}>
            <input
              id={type}
              type="checkbox"
              name="types"
              value={type}
              checked={selectedTypes.includes(type)}
              onChange={() => handleCheckboxChange(type)}
              disabled={!selectedTypes.includes(type) && selectedTypes.length >= 6}
            />
            <Logos type={type}/>
          </span>
        ))}
      </form>
    </div>
  );
}
