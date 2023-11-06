/**
 * 
 */
 
 function submitForm() {
    var firstName = document.getElementById('fname').value;
    var lastName = document.getElementById('lname').value;
    var dob = document.getElementById('dob').value;
    var country = document.getElementById('country').value;
    var gender = document.getElementById('male').checked ? 'Male' : '';
    gender += document.getElementById('female').checked ? ' Female' : '';
    var profession = document.getElementById('profession').value;
    var email = document.getElementById('email').value;
    var mobile = document.getElementById('mobile').value;

    if (firstName && lastName && dob && country && (gender === 'Male' || gender === 'Female') && profession && email && mobile) {
        var popupContent = `<p><strong>First Name:</strong> ${firstName}</p>`;
        popupContent += `<p><strong>Last Name:</strong> ${lastName}</p>`;
        popupContent += `<p><strong>Date of Birth:</strong> ${dob}</p>`;
        popupContent += `<p><strong>Country:</strong> ${country}</p>`;
        popupContent += `<p><strong>Gender:</strong> ${gender}</p>`;
        popupContent += `<p><strong>Profession:</strong> ${profession}</p>`;
        popupContent += `<p><strong>Email:</strong> ${email}</p>`;
        popupContent += `<p><strong>Mobile Number:</strong> ${mobile}</p>`;

        document.getElementById('popup-content').innerHTML = popupContent;
        document.getElementById('popup').style.display = 'block';
        resetForm();
    } else {
        alert('Please fill out all the fields.');
    }
}

function resetForm() {
    document.getElementById('survey-form').reset();
}

function closePopup() {
    document.getElementById('popup').style.display = 'none';
}