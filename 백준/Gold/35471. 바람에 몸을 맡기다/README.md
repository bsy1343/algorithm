# [Gold I] 바람에 몸을 맡기다 - 35471

[문제 링크](https://www.acmicpc.net/problem/35471)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 30, 정답: 23, 맞힌 사람: 23, 정답 비율: 82.143%

### 분류

구현, 시뮬레이션, 애드 혹

### 문제 설명

<blockquote>
<p><em>큰일이다. 아침 수업인데 늦잠을 자버렸다.</em></p>

<p><em>바깥엔 비바람이 휘몰아친다.</em></p>

<p><em>우산을 폈다. 뒤집혔다. 하늘로 솟구쳤다.</em></p>

<p><em>멀어지는 우산이 나를 부르는 것만 같다.</em></p>

<p><em>그래! 수업에 늦지 않을 방법은 단 하나뿐!</em></p>
</blockquote>

<p>자취방을 나선 윤이는 바람에 몸을 맡기고 학교까지 날아가기로 결심했다. 하지만 오늘의 태풍은 만만치 않을 것이다.</p>

<p>윤이가 사는 동네의 지도는 $H\times W$ 격자로 나타낼 수 있다. 각 격자칸은 빈칸이거나 건물이다. 일기 예보에 따르면 태풍은 매초 주어진 방향에 따라 총 $T$초 동안 몰아치며, 그 뒤에는 잠잠해진다.</p>

<p>윤이는 매초 바람의 방향을 따라 한 칸 날아간다. 바람 방향의 반대편에 건물이 있다면, 날아가는 대신 건물 벽을 붙잡고 그 자리에서 버티는 선택도 가능하다. 하지만 윤이가 날아가는 방향에 건물이 있다면 강력한 운동 에너지를 경험하고 기절할 것이다. 또한 윤이가 지도 밖을 벗어난다면 태풍에 삼켜지고 말 것이다.</p>

<p style="text-align:center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/35471.%E2%80%85%EB%B0%94%EB%9E%8C%EC%97%90%E2%80%85%EB%AA%B8%EC%9D%84%E2%80%85%EB%A7%A1%EA%B8%B0%EB%8B%A4/2a785289.jpg" data-original-src="https://boja.mercury.kr/assets/problem/35471-1.jpg" onerror="this.onerror=null;this.src=this.dataset.originalSrc" width="600"></p>

<p>윤이는 $T$초 동안 다치지 않고 날아다니다가, 태풍이 잠잠해지는 순간 강의실 건물 앞에 정확히 안착할 계획을 세웠다. 윤이의 계획은 과연 성공할 수 있을까?</p>

### 입력

<p>첫째 줄에 격자의 크기를 나타내는 정수 $H$, $W$가 공백으로 구분되어 주어진다. $(1\le H,W\le 1\, 000)$</p>

<p>둘째 줄에 윤이가 출발한 위치의 좌표 $(r_s,c_s)$가 공백으로 구분되어 주어진다. $(1\le r_s\le H;1\le c_s\le W)$</p>

<p>셋째 줄에 윤이가 도착할 위치의 좌표 $(r_e,c_e)$가 공백으로 구분되어 주어진다. $(1\le r_e\le H;1\le c_e\le W)$</p>

<p>다음 $H$개의 줄에 격자를 나타내는 길이 $W$의 문자열이 주어진다. 각 문자의 의미는 다음과 같다.</p>

<ul>
<li><span style="color:#e74c3c;"><code>.</code></span>: 빈칸</li>
<li><span style="color:#e74c3c;"><code>#</code></span>: 건물</li>
</ul>

<p>다음 줄에 $T$초 동안 바람이 부는 방향을 나타내는 길이 $T$의 문자열이 주어진다. $(1\le T\le 10^6)$ 각 문자의 의미는 다음과 같다.</p>

<ul>
<li><span style="color:#e74c3c;"><code>U</code></span>: 위 방향으로 부는 바람</li>
<li><span style="color:#e74c3c;"><code>R</code></span>: 오른쪽 방향으로 부는 바람</li>
<li><span style="color:#e74c3c;"><code>D</code></span>: 아래 방향으로 부는 바람</li>
<li><span style="color:#e74c3c;"><code>L</code></span>: 왼쪽 방향으로 부는 바람</li>
</ul>

<p>모든 좌표는 행, 열 순서로 주어지며, 가장 왼쪽 위 좌표는 $(1,1)$이다. 윤이가 출발한 위치와 도착할 위치에는 건물이 없음이 보장된다.</p>

### 출력

<p>윤이가 정확히 $T$초 뒤에 목적지에 도착할 수 있으면 첫째 줄에 <span style="color:#e74c3c;"><code>YES</code></span>, 그렇지 않으면 <span style="color:#e74c3c;"><code>NO</code></span>를 출력한다.</p>

<p><span style="color:#e74c3c;"><code>YES</code></span>를 출력한 경우, 둘째 줄에 윤이의 계획을 나타내는 길이 $T$의 문자열을 출력한다. 각 문자의 의미는 다음과 같다.</p>

<ul>
<li><span style="color:#e74c3c;"><code>F</code></span>: 바람을 타고 한 칸 날아간다.</li>
<li><span style="color:#e74c3c;"><code>G</code></span>: 바람 방향의 반대편에 있는 건물을 붙잡고 그 자리에 있는다.</li>
</ul>

<p>가능한 답이 여러 가지라면 그중 아무거나 하나를 출력한다.</p>