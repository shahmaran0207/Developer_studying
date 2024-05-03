//화살표 없이 펼치는 중괄호는 자바 객체

const url = "http://localhost:8080/day92/board"



fetch(url, { method: 'get' })
    .then(response => response.json())
    .then(data => {
        let msg = '';
        for (let i = 0; i < data.length; i++) {
            msg +=
                `<tr>` +
                `<td>${data[i].idx}</td>` +
                `<td>${data[i].title}</td>` +
                `<td>${data[i].contents}</td>` +
                `<td>${data[i].nick}</td>` +
                `<td>${data[i].v_count}</td>` +
                `<td>${data[i].w_date}</td>`
                + `</tr>`
        }
        document.querySelector('tbody').innerHTML = msg;
    });

let btns = document.querySelectorAll('button');

btns[0].onclick = () => {
    let title = prompt("제목");
    let contents = prompt("내용");
    let user_idx = Number(prompt("계정번호"));

    let result = {
        'title': title,
        'contents': contents,
        'user_idx': user_idx 
    };

    fetch(url, { 
        method: 'post',
        headers: {
            'Content-Type': 'application/json'
        },
        body : JSON.stringify(result)
    })
    .then(response => response.json())
    .then(data => {
        let msg = '작성 실패';

        if (data != 0) {
            msg = '작성 완료';
        } 

        alert(msg);
        location.reload();
    });
};

btns[1].onclick = () => {
    let title = prompt("제목");
    let contents = prompt("내용");
    let idx = Number(prompt("idx"));

    
    fetch(url, {
        method: 'PATCH',
        headers: {
            "Content-Type": "application/json"
        },
        body: JSON.stringify({
            "title": title,
            "contents": contents,
            "idx": idx
        }),
    })
    .then(response => response.json())
    .then(data => {
        let msg = '수정 실패';

        if (data != 0) {
            msg = '수정 완료';
        } 

        alert(msg);
        location.reload();
    });
};

btns[2].onclick = () => {
    let idx=Number(prompt("삭제할 계정 번호"));

    if (idx ==0){
        alert("값을 입력하세요");
        return;
    }

    fetch(url+`/?idx=${idx}`, {method: 'DELETE'})
    .then(response => response.json())
    .then(data => {
        let msg = '삭제 실패';

        if (data != 0) {
            msg = '삭제 완료';
        } 

        alert(msg);
        location.reload();
    });
};
