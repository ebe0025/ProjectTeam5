import React, { useEffect, useRef, useState } from 'react';

function MusicPlayer({ currentSong, isPlaying, onPlayPauseClick, onNextPrevClick }) {
  const audioRef = useRef(null);
  const [isRepeating, setIsRepeating] = useState(false);
  const [currentTime, setCurrentTime] = useState(0);
  const [duration, setDuration] = useState(0);

  useEffect(() => {
    if (audioRef.current) {
      const audioElement = audioRef.current;

      // Update duration when metadata is loaded
      audioElement.addEventListener('loadedmetadata', () => {
        setDuration(audioElement.duration);
      });

      // Update current time while the audio is playing
      const timeUpdateHandler = () => {
        setCurrentTime(audioElement.currentTime);
      };
      audioElement.addEventListener('timeupdate', timeUpdateHandler);

      // Play or pause audio based on `isPlaying` prop
      if (isPlaying) {
        audioElement.play().catch(error => console.error("Audio play error:", error));
      } else {
        audioElement.pause();
      }

      return () => {
        audioElement.removeEventListener('timeupdate', timeUpdateHandler);
      };
    }
  }, [isPlaying, currentSong]);

  const handleRepeatToggle = () => {
    setIsRepeating(prevState => !prevState);
  };

  const handleProgressChange = (e) => {
    const value = e.target.value;
    if (audioRef.current) {
      const newTime = (value / 100) * duration;
      audioRef.current.currentTime = newTime;
      setCurrentTime(newTime);
    }
  };

  const formatTime = (time) => {
    const minutes = Math.floor(time / 60);
    const seconds = Math.floor(time % 60).toString().padStart(2, '0');
    return `${minutes}:${seconds}`;
  };

  return (
    <div className="music__inner">
      <div className="music__top">
        <h3>Now Playing</h3>
      </div>
      <div className="music__song">
        <p className="name">{currentSong.name}</p>
        <p className="artist">{currentSong.artist}</p>
      </div>
      <audio
        src={`../songs/${currentSong.audio}.mp3`}
        ref={audioRef}
        autoPlay={isPlaying}
        controls
        loop={isRepeating}
      >
        Your browser does not support the audio element.
      </audio>
      <div className="music__progress" aling="center">
        <span className="current-time">{formatTime(currentTime)}</span>
        <input
          type="range"
          min="0"
          max="100"
          value={duration ? (currentTime / duration) * 100 : 0}
          onChange={handleProgressChange}
        />
        <span className="duration">{formatTime(duration)}</span>
      </div>
      <div className="music__control" aling="center">
        <button onClick={() => onNextPrevClick(false)}>Prev</button>
        <button onClick={onPlayPauseClick}>{isPlaying ? "Pause" : "Play"}</button>
        <button onClick={() => onNextPrevClick(true)}>Next</button>
        <button onClick={handleRepeatToggle}>
          {isRepeating ? "Repeat On" : "Repeat Off"}
        </button>
      </div>
    </div>
  );
}

export default MusicPlayer;
