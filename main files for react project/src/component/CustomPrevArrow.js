import React from 'react';

function CustomPrevArrow(props) {
  return (
    <div className="slick-prev" onClick={props.onClick}>
      Previous
    </div>
  );
}

export default CustomPrevArrow;
