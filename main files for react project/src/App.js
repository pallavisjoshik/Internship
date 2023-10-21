// import logo from './logo.svg';
import './Navbar.css'
import './App.css';
import Navbar1 from './component/Navbar1';
import Home from './component/Home';
import Experience from './component/Experience';
import Education from './component/Education';
import Resume from './component/Resume';
import Portfolio3 from './component/Portfolio3';
// import Blog from './component/Blog';
import Footer from './component/Footer';

function App() {
  return (
    <>
   < Navbar1/>
    <Home/>
    <Experience/>
    <Education></Education>
    <Resume/>
    <Portfolio3/>
    {/* <Blog/> */}
    <Footer/>
    </>
  );
}

export default App;
