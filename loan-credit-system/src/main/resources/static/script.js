function applyLoan() {

    const data = {
        fullname: document.getElementById("fullname").value,
        panNumber: document.getElementById("panNumber").value,
        email: document.getElementById("email").value,
        loanAmount: document.getElementById("loanAmount").value,
        tenureMonths: document.getElementById("tenureMonths").value,
        annualIncome: document.getElementById("annualIncome").value
    };

    fetch("http://localhost:1901/loans/apply", {
        method: "POST",
        headers: {
            "Content-Type": "application/json"
        },
        body: JSON.stringify(data)
    })
    .then(async res => {
        const result = await res.json();
        if (!res.ok) {
            throw result;
        }
        return result;
    })
    .then(res => {
        document.getElementById("result").innerText =
            `Status: ${res.status}, Credit Score: ${res.creditScore}`;
    })
    .catch(err => {
        document.getElementById("result").innerText =
            err.message || "Validation error";
    });
}
