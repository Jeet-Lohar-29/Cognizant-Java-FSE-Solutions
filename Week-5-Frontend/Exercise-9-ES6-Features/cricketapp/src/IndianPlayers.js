import React from "react";

const IndianTeam = [
  "Sachin",
  "Dhoni",
  "Virat",
  "Rohit",
  "Yuvraj",
  "Raina"
];

const [
  first,
  second,
  third,
  fourth,
  fifth,
  sixth
] = IndianTeam;

export function OddPlayers() {

  return (

    <div>

      <li>First : {first}</li>
      <li>Third : {third}</li>
      <li>Fifth : {fifth}</li>

    </div>

  );

}

export function EvenPlayers() {

  return (

    <div>

      <li>Second : {second}</li>
      <li>Fourth : {fourth}</li>
      <li>Sixth : {sixth}</li>

    </div>

  );

}

const T20players = [
  "First Player",
  "Second Player",
  "Third Player"
];

const RanjiPlayers = [
  "Fourth Player",
  "Fifth Player",
  "Sixth Player"
];

export const IndianPlayers = [
  ...T20players,
  ...RanjiPlayers
];

export function ListofIndianPlayers() {

  return (

    <div>

      {
        IndianPlayers.map((player, index) => (

          <li key={index}>
            Mr. {player}
          </li>

        ))
      }

    </div>

  );

}