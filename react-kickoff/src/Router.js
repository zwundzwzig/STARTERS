import React from 'react';
import { BrowserRouter, Routes, Route } from 'react-router-dom';

const Router = () => {
  return (
    <BrowserRouter>                                                                 
      <Routes>                                                                   
        <Route path="/" element={<Components />} />
      </Routes>
    </BrowserRouter>
  );
};

export default Router;
