import React from 'react';

function CustomNextArrow(props) {
  return (
    <div className="slick-next" onClick={props.onClick}>
      Next
    </div>
  );
}

export default CustomNextArrow;

