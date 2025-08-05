import React from 'react';
import Header from './Header';
import Footer from './Footer';

// We use { children } to pass page content into our layout
const Layout = ({ children }) => {
  return (
    <div className="flex flex-col min-h-screen">
      <Header />
      
      {/* This main tag will grow to fill the available space */}
      <main className="flex-grow container mx-auto px-6 py-8">
        {children} {/* Page-specific content will be rendered here */}
      </main>
      
      <Footer />
    </div>
  );
};

export default Layout;