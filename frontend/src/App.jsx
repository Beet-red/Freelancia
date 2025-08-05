import Layout from './components/Layout';
//import Register from './components/Register';

function App() {
  return (
    // By wrapping Register with Layout, it becomes the 'children'
    // that gets rendered inside the <main> tag of our Layout component.
    <Layout>
      {/* <div className="flex items-center justify-center">
        <Register />
      </div> */}
    </Layout>
  );
}

export default App;