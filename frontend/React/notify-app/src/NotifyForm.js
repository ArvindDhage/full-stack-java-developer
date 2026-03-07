import { useState } from "react";
import axios from "axios";

function NotifyForm() {

  const [formData, setFormData] = useState({
    name: "",
    email: "",
    massage: ""
  });

  const handleChange = (e) => {
    setFormData({
      ...formData,
      [e.target.name]: e.target.value
    });
  };

  const handleSubmit = async (e) => {
    e.preventDefault();

    try {
      const response = await axios.post(
        "http://localhost:8080/api/form",
        formData
      );

      alert("Form submitted successfully");
      console.log(response.data);

    } catch (error) {
      console.error(error);
      alert("Error submitting form");
    }
  };

  return (
    <div>
      <h1>Notify App</h1>

      <form onSubmit={handleSubmit}>

        <label>Name</label>
        <br />
        <input
          type="text"
          name="name"
          onChange={handleChange}
          required
        />

        <br /><br />

        <label>Email</label>
        <br />
        <input
          type="email"
          name="email"
          onChange={handleChange}
          required
        />

        <br /><br />

        <label>Message</label>
        <br />
        <textarea
          name="massage"
          rows="3"
          onChange={handleChange}
          required
        ></textarea>

        <br /><br />

        <button type="submit">Send</button>

      </form>
    </div>
  );
}

export default NotifyForm;