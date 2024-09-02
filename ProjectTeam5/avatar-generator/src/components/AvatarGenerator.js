// src/components/AvatarGenerator.js
import React, { useState } from 'react';
import styled from 'styled-components';

// 스타일 컴포넌트
const AvatarContainer = styled.div`
  display: flex;
  flex-direction: column;
  align-items: center;
  margin-top: 20px;
`;

const AvatarPreview = styled.div`
  width: 150px;
  height: 150px;
  border-radius: 50%;
  background-color: ${(props) => props.bgColor};
  display: flex;
  align-items: center;
  justify-content: center;
  font-size: 50px;
`;

const OptionContainer = styled.div`
  margin-top: 20px;
  display: flex;
  gap: 10px;
`;

const OptionButton = styled.button`
  padding: 10px;
  border: none;
  border-radius: 5px;
  cursor: pointer;
  background-color: #eee;
  &:hover {
    background-color: #ddd;
  }
`;

// 아바타 생성기 컴포넌트
const AvatarGenerator = () => {
  const [bgColor, setBgColor] = useState('#f0f0f0');
  const [emoji, setEmoji] = useState('😊');

  // 색상 옵션
  const colors = ['#f0f0f0', '#ff6347', '#4682b4', '#32cd32', '#ff69b4'];

  // 이모지 옵션
  const emojis = ['😊', '😎', '🤓', '😇', '🥳'];

  return (
    <AvatarContainer>
      <h1>아바타 생성기</h1>
      <AvatarPreview bgColor={bgColor}>{emoji}</AvatarPreview>

      <OptionContainer>
        {colors.map((color) => (
          <OptionButton key={color} onClick={() => setBgColor(color)}>
            {color}
          </OptionButton>
        ))}
      </OptionContainer>

      <OptionContainer>
        {emojis.map((emo) => (
          <OptionButton key={emo} onClick={() => setEmoji(emo)}>
            {emo}
          </OptionButton>
        ))}
      </OptionContainer>
    </AvatarContainer>
  );
};

export default AvatarGenerator;