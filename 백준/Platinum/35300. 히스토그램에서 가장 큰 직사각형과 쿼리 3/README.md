# [Platinum II] 히스토그램에서 가장 큰 직사각형과 쿼리 3 - 35300

[문제 링크](https://www.acmicpc.net/problem/35300)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 157, 정답: 45, 맞힌 사람: 35, 정답 비율: 29.167%

### 분류

무작위화, 애드 혹

### 문제 설명

<p>한버미는 길이가 $N$인 순열 $A$를 가지고 있다. 즉, $A$는 $1$ 이상 $N$ 이하의 정수들이 정확히 한 번씩 등장하는 수열이다. 당신은 한버미만 알고 있는 순열 $A$에서 $A_x=\left\lfloor\frac{N}{2}\right\rfloor+1$인 인덱스 $x$를 찾아야 한다. 이를 위해 당신은 한버미에게 아래와 같은 질문을 최대 $10^4$번 할 수 있다.</p>

<p>각 질문마다 당신은 길이가 $N$인 순열 $p$를 선택한다. 한버미는 $i$번째 막대의 높이가 $A_{p_i}$인 <strong>히스토그램</strong> $H$를 생각한 뒤, $H$에 완전히 포함되면서 밑변이 히스토그램의 아랫변과 평행한 직사각형들 중 가장 넓이가 큰 직사각형을 하나 찾는다. 만약 가장 넓이가 큰 직사각형이 여러 개라면 그중 높이가 최대인 것을 아무거나 하나 찾는다. 선택한 직사각형의 밑변이 $l$번째 막대부터 $r$번째 막대까지의 밑변 전체와 같고 높이가 $h$일 때, 한버미는 세 정수 $l,r,h$를 답한다.</p>

### 입력



### 출력



### 제한

<ul>
<li>$3\le N\le 50$</li>
<li>$1\le l\le r\le N$</li>
<li>$1\le h\le N$</li>
</ul>

### 힌트

<p>히스토그램은 직사각형 여러 개가 아래쪽으로 정렬되어 있는 도형이다. 각 직사각형은 너비가 $1$로 일정하지만, 높이는 서로 다를 수도 있다. 예를 들어, 다음 그림은 높이가 $3, 5, 8, 8, 4, 7$인 직사각형으로 이루어진 히스토그램이다.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/35300.%E2%80%85%ED%9E%88%EC%8A%A4%ED%86%A0%EA%B7%B8%EB%9E%A8%EC%97%90%EC%84%9C%E2%80%85%EA%B0%80%EC%9E%A5%E2%80%85%ED%81%B0%E2%80%85%EC%A7%81%EC%82%AC%EA%B0%81%ED%98%95%EA%B3%BC%E2%80%85%EC%BF%BC%EB%A6%AC%E2%80%853/0e19363b.webp" data-original-src="https://boja.mercury.kr/assets/problem/35300-1.webp" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 360px; height: 262px;"></p>

<p>당신의 프로그램은 무언가를 출력한 후 즉시 출력 버퍼를 비워야 한다. 다음은 언어별 출력 버퍼를 비우는 방법이다.</p>

<ul>
<li>C —<span style="color:#e74c3c;"><code>fflush(stdout)</code></span></li>
<li>C++ —<span style="color:#e74c3c;"><code>std::cout.flush()</code></span></li>
<li>Python —<span style="color:#e74c3c;"><code>sys.stdout.flush()</code></span></li>
<li>Java —<span style="color:#e74c3c;"><code>System.out.flush()</code></span></li>
<li>그 외의 언어는 각 언어의 Documentation을 참고한다.</li>
</ul>

<p>또한, 예제의 빈 줄은 입출력이 어떤 방식으로 이루어지는지 이해를 돕기 위해 의도적으로 추가된 것이며, 실제 입출력에는 빈 줄이 나타나지 않는다.</p>