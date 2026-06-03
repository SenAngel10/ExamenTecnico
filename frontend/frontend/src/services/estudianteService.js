const URL = "http://localhost:8080";

export const getEstudiantes = async () => {
  const res = await fetch(`${URL}/estudiantes`);
  const data = await res.json();
  return data;
};
