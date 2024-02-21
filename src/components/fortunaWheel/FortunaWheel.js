import React, { useState, useEffect, useRef } from 'react';
import './FortunaWheel.css';

export const FortunaWheel = () => {
  const sectors = [
    { color: '#fff', label: '1' },
    { color: '#000000', label: '2' },
    { color: '#fff', label: '3' },
    { color: '#000000', label: '4' },
    { color: '#fff', label: '5' },
    { color: '#000000', label: '6' },
    { color: '#fff', label: '7' },
    { color: '#000000', label: '8' },
    { color: '#fff', label: '9' },
    { color: '#000000', label: '10' },
    { color: '#fff', label: '11' },
    { color: '#000000', label: '12' },
    { color: '#fff', label: '13' },
    { color: '#000000', label: '14' },
    { color: '#fff', label: '15' },
    { color: '#000000', label: '16' },
    { color: '#fff', label: '17' },
    { color: '#000000', label: '18' },
    { color: '#fff', label: '19' },
    { color: '#000000', label: '20' },
  ];

  const [angVel, setAngVel] = useState(0);
  const [rotation, setRotation] = useState(0);
  const [selectedIndexes, setSelectedIndexes] = useState([]);
  const [availableIndexes, setAvailableIndexes] = useState(Array.from({ length: sectors.length }, (_, index) => index));
  const spinEl = useRef(null);

  useEffect(() => {
    const ctx = document.querySelector('#wheel').getContext('2d');
    const dia = ctx.canvas.width;
    const rad = dia / 2;
    const PI = Math.PI;
    const TAU = 2 * PI;
    const arc = TAU / sectors.length;
    const friction = 0.991;

    const rand = (m, M) => Math.random() * (M - m) + m;

    const getIndex = () => {
      const index = Math.floor(sectors.length - (rotation / TAU) * sectors.length) % sectors.length;
      return index >= 0 ? index : index + sectors.length;
    };

    const drawSector = (sector, i) => {
      const ang = arc * i;
      ctx.save();
      ctx.beginPath();
      ctx.fillStyle = sector.color;
      ctx.moveTo(rad, rad);
      ctx.arc(rad, rad, rad, ang, ang + arc);
      ctx.lineTo(rad, rad);
      ctx.fill();
      ctx.translate(rad, rad);
      ctx.rotate(ang + arc / 2);
      ctx.textAlign = 'right';
      ctx.fillStyle = '#ff0000';
      ctx.font = 'bold 30px sans-serif';
      ctx.fillText(sector.label, rad - 10, 10);
      ctx.restore();
    };

    const rotate = () => {
      const index = getIndex();
      const sector = sectors[index];
      if (sector) {
        ctx.canvas.style.transform = `rotate(${rotation - PI / 2}rad)`;
        spinEl.current.textContent = !angVel ? 'SPIN' : sector.label;
        spinEl.current.style.background = sector.color;
      }
    };

    const frame = () => {
      if (!angVel) return;
      setAngVel(angVel * friction);
      if (angVel < 0.002) setAngVel(0);
      setRotation(rotation + angVel);
      rotate();
    };

    const engine = () => {
      frame();
      requestAnimationFrame(engine);
    };

    sectors.forEach(drawSector);
    rotate();
    engine();

    const spinButton = document.querySelector('#spin');
    spinButton.addEventListener('click', () => {
      if (!angVel && availableIndexes.length > 0) {
        const newIndex = availableIndexes[Math.floor(Math.random() * availableIndexes.length)];

        setAvailableIndexes((prevIndexes) => prevIndexes.filter((index) => index !== newIndex));

        setSelectedIndexes([...selectedIndexes, newIndex]);
        setAngVel(rand(0.25, 0.45));
      }
    });

    return () => {
      spinButton.removeEventListener('click', () => {
        if (!angVel && availableIndexes.length > 0) {
          const newIndex = availableIndexes[Math.floor(Math.random() * availableIndexes.length)];

          setAvailableIndexes((prevIndexes) => prevIndexes.filter((index) => index !== newIndex));

          setSelectedIndexes([...selectedIndexes, newIndex]);
          setAngVel(rand(0.25, 0.45));
        }
      });
    };
  }, [angVel, rotation, sectors, selectedIndexes, availableIndexes]);

  return (
    <div id="wheelOfFortune" className="wheel-of-fortune">
      <div className='outer-wheel'>
        <canvas id="wheel" className="wheel" width="600" height="600" />
      </div>
      <div id="spin" className="spin" ref={spinEl}>
        START
      </div>
    </div>
  );
};
