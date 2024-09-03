import React, { useState } from "react";
import MusicPlayer from "./components/MusicPlayer";
//import MusicList from "./components/MusicList";
import allMusic from "./musicData";
import "./App.css";

function App() {
  const [currentSongIndex, setCurrentSongIndex] = useState(0);
  const [isPlaying, setIsPlaying] = useState(false);

  const handlePlayPauseClick = () => {
    setIsPlaying(prev => !prev);
  };

  const handleNextPrevClick = (next) => {
    setCurrentSongIndex(prevIndex => {
      let newIndex = next ? prevIndex + 1 : prevIndex - 1;
      if (newIndex < 0) newIndex = allMusic.length - 1;
      if (newIndex >= allMusic.length) newIndex = 0;
      return newIndex;
    });
    setIsPlaying(true);
  };

  // const handleSongSelect = (index) => {
  //   setCurrentSongIndex(index);
  //   setIsPlaying(true);
  // };

  return (
    <div className="App">
      <div className="wrap__music">
        <MusicPlayer
          currentSong={allMusic[currentSongIndex]}
          isPlaying={isPlaying}
          onPlayPauseClick={handlePlayPauseClick}
          onNextPrevClick={handleNextPrevClick}
        />

        {/* <MusicList
          allMusic={allMusic}
          onSongSelect={handleSongSelect}
          currentSongIndex={currentSongIndex}
        /> */}
      </div>
    </div>
  );
}

export default App;
