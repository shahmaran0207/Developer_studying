function scrollToFeature() {
    var targetSection = document.querySelector("#fu");

    if (targetSection) {
        targetSection.scrollIntoView({ behavior: 'smooth' });
    }
}

function submitForm(event) {
    event.preventDefault(); // 양식 제출을 중지하여 페이지가 새로 고치지 않도록 합니다.

    // 지역 입력값 가져오기 (이 부분은 입력칸이 없으므로 필요 없습니다.)

    // 결과를 결과 창에 표시
    var resultElement = document.getElementById("result");

    // 예산 계산 알고리즘을 통해 동적으로 계산된 예산을 설정
    var calculatedBudget = 1000; // 알고리즘에 따라 계산된 예산 값

    // 결과를 HTML에 표시
    resultElement.textContent = "예상 예산: " + calculatedBudget + "원";
}