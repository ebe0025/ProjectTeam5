import logo from './logo.svg';
import './App.css';
import { Route, Routes, useNavigate } from 'react-router-dom';
import { useState } from 'react';
import ImageUpload from './page/imageUpload';
import ImageList from './page/imageList';
import ImageDetail from './page/imageDetail';
import SignupForm from './page/signupForm';

function App() {
  return (
    <div className="App">
      <Routes>
        <Route path='/' element={<ImageUpload />} />
        <Route path='/1' element={< ImageList/>} />
        <Route path="/detail/:bnum" element={<ImageDetail />} />
        <Route path='/signup' element={<SignupForm/>} />
      </Routes>
    </div>
  );
}





export default App;
