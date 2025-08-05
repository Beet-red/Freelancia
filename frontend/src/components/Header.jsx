import React from 'react';

const Header = () => {
  return (
    <header className="bg-white shadow-md">
      <nav className="container mx-auto px-6 py-4 flex justify-between items-center">
        <a href="/" className="text-2xl font-bold text-gray-800">
          Freelancia
        </a>
        <div className="space-x-4">
          <a href="/find-work" className="text-gray-600 hover:text-blue-500">Find Work</a>
          <a href="/find-talent" className="text-gray-600 hover:text-blue-500">Find Talent</a>
          <a href="/login" className="text-gray-600 hover:text-blue-500">Login</a>
          <a href="/register" className="bg-blue-500 text-white px-4 py-2 rounded-md hover:bg-blue-600">
            Register
          </a>
        </div>
      </nav>
    </header>
  );
};

export default Header;