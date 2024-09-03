// src/components/MusicPlayer.js
import React, { useRef, useState } from 'react';
import './MusicPlayer.css'; // 음악 플레이어에 대한 스타일 파일

function MusicPlayer() {
  const audioRef = useRef(null);
  const [isPlaying, setIsPlaying] = useState(false);

  // 재생 또는 일시정지 버튼 클릭 시 동작
  const togglePlayPause = () => {
    if (isPlaying) {
      audioRef.current.pause();
    } else {
      audioRef.current.play();
    }
    setIsPlaying(!isPlaying);
  };

  return (
    <div className="music-player">
      <audio ref={audioRef} src="path-to-your-music-file.mp3" preload="auto" />
      <div className="player-controls">
        <button onClick={togglePlayPause}>
          {isPlaying ? '⏸️' : '▶️'}
        </button>
        <button onClick={() => (audioRef.current.currentTime -= 10)}>⏪</button>
        <button onClick={() => (audioRef.current.currentTime += 10)}>⏩</button>
      </div>
    </div>
  );
}

export default MusicPlayer;
