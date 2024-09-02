import logo from './logo.svg';
import './App.css';
import { Route, Routes, useNavigate } from 'react-router-dom';
import { useState } from 'react';
import ImageUpload from './page/imageUpload';
import ImageList from './page/imageList';

function App() {
  return (
    <div className="App">
      <Routes>
        <Route path='/' element={<ImageUpload />} />
        <Route path='/1' element={< ImageList/>} />
      </Routes>
    </div>
  );
}





export default App;
