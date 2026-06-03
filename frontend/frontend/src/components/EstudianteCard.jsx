export default function EstudianteCard({ estudiante }) {
  return (
    <div className="Card">
      <h3>{estudiante.nombre}</h3>
      <p>
        <strong>No. Control:</strong>
        {estudiante.numeroControl}
      </p>
      <p>
        <strong>Email:</strong>
        {estudiante.email}
      </p>
      <p>
        <strong>Calle:</strong>
        {estudiante.direccion.calle}
      </p>
      <p>
        <strong>Colonia:</strong>
        {estudiante.direccion.colonia}
      </p>
      <p>
        <strong>Ciudad:</strong>
        {estudiante.direccion.ciudad}
      </p>
      <p>
        <strong>Telefono:</strong>
        {estudiante.direccion.telefono}
      </p>
    </div>
  );
}
