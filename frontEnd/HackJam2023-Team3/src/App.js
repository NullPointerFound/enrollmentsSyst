import {
  createBrowserRouter,
  RouterProvider,
} from "react-router-dom";
import HomePage from "./Pages/HomePage";
import Apply from "./Pages/Apply"
import CheckStatus from "./Pages/CheckStatus";
import Management from "./Pages/Management";
import Login from "./Pages/Login";
import ErrorPage from "./Pages/ErrorPage";

const router = createBrowserRouter([
  {
    path: "/",
    element: <HomePage />,
    errorElement: <ErrorPage />,
  },
  {
    path: "/apply",
    element: <Apply />,
  },
  {
    path: "/checkstatus",
    element: <CheckStatus />,
  },
  {
    path: "/login",
    element: <Login />,
  },
  {
    path: "/management",
    element: <Management />,
  },

]);

function App() {
  return (
  <RouterProvider router={router} />
  )

}

export default App


// import { BrowserRouter as Router } from "react-router-dom"
// import { Routes, Route } from "react-router-dom"
// import Header from "./Component/Header"
// import About from "./Component/About"
// import Courses from "./Component/Courses"
// import Contact from "./Component/Contact"
// import Footer from "./Component/Footer"
// import HomePage from "./Pages/HomePage"

// function App() {
//   return (
//     <div>
//       <h1>Per Scholas </h1>
//       <Router>
//         <Header />
//         <About />
//         <Courses />
//         <Contact />
//         {/* <Routes>
//           <Route exact path="/" component={<HomePage />} />
//           <Route exact path="/about" component={<About />} />
//           <Route exact path="/courses" component={<Courses />} />
//           <Route exact path="/contact" component={<Contact />} />
//         </Routes> */}
//         <Footer />
//       </Router>
//     </div>
//   )
// }

// export default App
