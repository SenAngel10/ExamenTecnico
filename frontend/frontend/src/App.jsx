import { useEffect } from "react";
import "./App.css";
import { useState } from "react";
import { getEstudiantes } from "./services/estudianteService";
import EstudianteCard from "./components/EstudianteCard";

function App() {
  const [estudiantes, setEstudiantes] = useState([]);
  const [loading, setLoading] = useState(true);
  const [error, setError] = useState(null);

  useEffect(() => {
    getEstudiantes()
      .then((data) => {
        setEstudiantes(data.data);
        setLoading(false);
      })
      .catch(() => {
        setError("Error al cargar estudiantes");
        setLoading(false);
      });
  }, []);

  if (loading) return <p>Cargando...</p>;
  if (error) return <p>{error}</p>;

  return (
    <div>
      <h1>Listado de Estudiantes</h1>
      <div className="grid">
        {estudiantes.map((est) => (
          <EstudianteCard key={est.numeroControl} estudiante={est} />
        ))}
      </div>
    </div>
  );
}

export default App;
