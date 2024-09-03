import React from "react";
import "./MusicList.css"; // 스타일시트를 추가합니다.

function MusicList({ allMusic, onSongSelect, currentSongIndex }) {
  return (
    <div className="music-list">
      <ul>
        {allMusic.map((song, index) => (
          <li
            key={index}
            onClick={() => onSongSelect(index)}
            className={index === currentSongIndex ? "active" : ""}
          >
            <p>{song.name} - {song.artist}</p>
          </li>
        ))}
      </ul>
    </div>
  );
}

export default MusicList;
