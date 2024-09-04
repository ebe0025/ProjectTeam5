// import { useState, useEffect } from "react";
// import axios from "axios";

// function ImageList() {
//   const [images, setImages] = useState([]);

//   useEffect(() => {
//     // 컴포넌트가 마운트될 때 서버에서 이미지 목록을 가져옴
//     axios.get("http://localhost:8080/board/totalBoard")
//       .then((response) => {
//         console.log("Fetched images:", response.data); // 데이터 확인용
//         setImages(response.data);
//       })
//       .catch((error) => {
//         console.error("Error fetching images:", error);
//         alert("이미지 목록을 가져오는 중 오류가 발생했습니다.");
//       });
//   }, []);

//   return (
//     <div>
//       <h2>Uploaded Images</h2>
//       <div style={{ display: "flex", flexWrap: "wrap" }}>
//         {images.map((image, index) => (
//           <div key={index} style={{ margin: "10px" }}>
//             <img
//               src={`http://localhost:8080${image.imgPath}`} // 이미지 경로를 사용하여 렌더링
//               alt={image.bTitle}
//               style={{ maxWidth: "2 00px", maxHeight: "200px", objectFit: "cover" }}
//             />
//             <p>{image.btitle}</p>
//             <p>{image.bcontent}</p>
//           </div>
//         ))}
//       </div>
//     </div>
//   );
// }

// export default ImageList;