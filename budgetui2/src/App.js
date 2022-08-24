import { DataGrid} from '@mui/x-data-grid'
import './pages/CurrentAllocation'
import './App.css';

import Header from './components/header/Header'
import CurrentAllocation from './pages/CurrentAllocation';
function App() {
  return (
    <div className="App">
      <Header/>
      <h1>Citi BEATS</h1>
      <h2>Budget Estimation, Analytics and Tracking System</h2>
      <hr/>
      <CurrentAllocation/>
      </div>
    
  );
}

export default App;
