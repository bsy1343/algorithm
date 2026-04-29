# [Silver I] 직각이등변삼각형 - 34116

[문제 링크](https://www.acmicpc.net/problem/34116)

### 성능 요약

시간 제한: 2 초 (추가 시간 없음), 메모리 제한: 2048 MB

### 통계

제출: 991, 정답: 503, 맞힌 사람: 377, 정답 비율: 55.198%

### 분류

기하학, 수학, 애드 혹

### 문제 설명

<p>$2$차원 평면 위에 서로 다른 $N$개의 점이 있다. $1 ≤ i ≤ N$인 각 $i$에 대해, $i$번째 점의 좌표는 $(x_i , y_i )$이다.</p>

<p><strong>이등변삼각형</strong>이란, 세 변 중 길이가 같은 두 변이 있는 삼각형을 의미한다. <strong>직각삼각형</strong>이란, 한 내각이 직각($90^\circ$) 인 삼각형을 의미한다. 직각삼각형의 <strong>빗변</strong>이란, 직각삼각형에서 직각과 마주보는 변을 의미하며, 길이가 가장 긴 변이기도 하다.</p>

<p><strong>직각이등변삼각형</strong>이란, 직각삼각형이면서 이등변삼각형인 삼각형을 의미한다. 즉, 삼각형의 한 내각이 직각이고, 빗변이 아닌 두 변의 길이가 서로 같은 삼각형을 의미한다.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/34116.%E2%80%85%EC%A7%81%EA%B0%81%EC%9D%B4%EB%93%B1%EB%B3%80%EC%82%BC%EA%B0%81%ED%98%95/47838867.png" data-original-src="https://boja.mercury.kr/assets/problem/34116-1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 400px; height: 149px;"></p>

<p>다음 두 조건을 모두 만족하는 직각이등변삼각형 중 빗변의 길이가 가장 짧은 것의 빗변의 길이를 구하는 프로그램을 작성하라.</p>

<ul>
	<li>$N$개의 점 $(x_1 , y_1 ),(x_2 , y_2 ), \cdots ,(x_N , y_N )$은 모두 직각이등변삼각형의 경계(변 위)나 내부에 위치한다. 어떤 점이 직각이등변삼각형의 꼭짓점에 위치하는 경우도 경계에 위치한 것으로 간주한다.</li>
	<li>빗변이 $x$축과 평행하다. 즉, 직각이등변삼각형의 빗변의 두 끝점의 $y$좌표가 같다. 이는 다음 그림과 같이 직각이 빗변의 위쪽에 있는 직각이등변삼각형과 직각이 빗변의 아래쪽에 있는 두 종류의 직각이등변삼각형만 조건을 만족함을 의미한다.</li>
</ul>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/34116.%E2%80%85%EC%A7%81%EA%B0%81%EC%9D%B4%EB%93%B1%EB%B3%80%EC%82%BC%EA%B0%81%ED%98%95/b47213cb.png" data-original-src="https://boja.mercury.kr/assets/problem/34116-2.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 382px; height: 115px;"></p>

<p>예를 들어, 다음 그림과 같이 $5$개의 점 $(0, −1), (2, 4), (4, −1), (−1, 2), (3, 1)$이 주어졌다고 하자. 점은 크기를 갖지 않으나, 그림에서는 편의를 위해 점을 원으로 표현하였다.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/34116.%E2%80%85%EC%A7%81%EA%B0%81%EC%9D%B4%EB%93%B1%EB%B3%80%EC%82%BC%EA%B0%81%ED%98%95/2f002d1f.jpg" data-original-src="https://boja.mercury.kr/assets/problem/34116-3.jpg" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 241px; height: 242px;"></p>

<p>직각이 빗변의 위쪽에 있는 직각이등변삼각형 중 빗변의 길이가 가장 짧은 것은 아래 그림과 같이 세 꼭짓점이 $(1.5, 4.5),(−4, −1),(7, −1)$인 삼각형이며, 이 직각이등변삼각형의 빗변의 길이는 $11$이다.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/34116.%E2%80%85%EC%A7%81%EA%B0%81%EC%9D%B4%EB%93%B1%EB%B3%80%EC%82%BC%EA%B0%81%ED%98%95/d66bd9c6.jpg" data-original-src="https://boja.mercury.kr/assets/problem/34116-4.jpg" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 452px; height: 275px;"></p>

<p>직각이 빗변의 아래쪽에 있는 직각이등변삼각형 중 빗변의 길이가 가장 짧은 것은 아래 그림과 같이 세 꼭짓점이 $(2, −3),(−5, 4),(9, 4)$인 삼각형이며, 이 직각이등변삼각형의 빗변의 길이는 $14$이다.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/34116.%E2%80%85%EC%A7%81%EA%B0%81%EC%9D%B4%EB%93%B1%EB%B3%80%EC%82%BC%EA%B0%81%ED%98%95/f4fa228f.jpg" data-original-src="https://boja.mercury.kr/assets/problem/34116-5.jpg" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 555px; height: 310px;"></p>

<p>두 직각이등변삼각형 중 빗변의 길이가 짧은 것은 직각이 빗변의 위쪽에 있는 경우이므로 $11$이 구하고자 하는 길이가 된다.</p>

### 입력

<p>첫 번째 줄에 정수 $N$이 주어진다.</p>

<p>다음 $N$개의 줄 중 $i$ ($1 ≤ i ≤ N$)번째 줄에는 두 정수 $x_i$ 와 $y_i$가 공백을 사이에 두고 주어진다.</p>

### 출력

<p>첫 번째 줄에 조건을 모두 만족하는 직각이등변삼각형 중 빗변의 길이가 가장 짧은 것의 빗변의 길이를 출력한다. 답이 항상 정수임을 증명할 수 있다.</p>

### 제한

<ul>
	<li>주어지는 모든 수는 정수이다.</li>
	<li>$2 ≤ N ≤ 100\, 000$</li>
	<li>$1 ≤ i ≤ N$인 각 $i$에 대해, $−100\, 000\, 000 ≤ x_i , y_i ≤ 100\, 000\, 000$</li>
	<li>주어지는 $N$개의 점들은 모두 서로 다르다.</li>
	<li>즉, $1 ≤ i &lt; j ≤ N$인 모든 $i$, $j$에 대해 $x_i \ne x_j$ 또는 $y_i \ne y_j$이다.</li>
</ul>