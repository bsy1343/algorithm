# [Platinum III] <em><strong><span style="color:#e74c3c;">R</span><span style="color:#f1c40f;">R</span><span style="color:#1abc9c;">E</span><span style="color:#3498db;">F</span></strong></em> - 20307

[문제 링크](https://www.acmicpc.net/problem/20307)

### 성능 요약

시간 제한: 0.5 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 730, 정답: 121, 맞힌 사람: 85, 정답 비율: 16.378%

### 분류

수학, 구현, 문자열, 파싱, 선형대수학, 가우스 소거법

### 문제 설명

<p>주어지는 행렬의 <u><em><strong><a href="https://en.m.wikipedia.org/wiki/Row_echelon_form" style="text-decoration:none;"><span style="color:#e74c3c; text-decoration:underline">R</span><span style="color:#f1c40f; text-decoration:underline">R</span><span style="color:#2ecc71; text-decoration:underline">E</span><span style="color:#3498db; text-decoration:underline">F</span></a></strong></em></u>를 출력하자.</p>

<p><em><strong><span style="color:#e74c3c;">R</span><span style="color:#f1c40f;">R</span><span style="color:#1abc9c;">E</span><span style="color:#3498db;">F</span></strong></em>(<em><strong><span style="color:#e74c3c;">R</span></strong>educed <strong><span style="color:#f1c40f;">R</span></strong>ow <strong><span style="color:#1abc9c;">E</span></strong>chelon <strong><span style="color:#3498db;">F</span></strong>orm</em>)는 다음과 같은 성질을 가지는 행렬이다.</p>

<ul>
	<li>모든 원소가 $0$인 행(<strong>모두 $0$인 행</strong>)은 그렇지 않은 행(<strong>$0$이 아닌 원소가 있는 행</strong>)보다 아래쪽에 위치한다.</li>
	<li>모든 $0$이 아닌 행의 최고차 계수는 $1$이다.</li>
	<li>모든 $0$이 아닌 행의 최고차 계수는 그 위 행의 최고차 계수보다 오른쪽에 있다.</li>
	<li>모든 $0$이 아닌 행의 최고차 계수가 위치한 열의 모든 원소는 $0$이다.<span style="display: none;"> </span></li>
</ul>

### 입력

<p>첫째 줄에 행렬의 크기를 나타내는 $N$, $M$이 주어진다. ($1 \leq N, M \leq 5$)</p>

<p>둘째 줄부터 $N$개 줄에 $M$개의 유리수가 주어진다. 유리수는 기약분수 $P$/$Q$ 형태이다. ($P \in \mathbb{Z} \cap \left[-9, 9\right]$, $Q \in \mathbb{Z} \cap \left(0, 9\right]$)</p>

<p>$Q = 1$인 경우는 $P$만 주어지고, $P &gt; 0$이면 부호는 생략한다.</p>

### 출력

<p>주어진 행렬의 <em><strong><span style="color:#e74c3c;">R</span><span style="color:#f1c40f;">R</span><span style="color:#1abc9c;">E</span><span style="color:#3498db;">F</span></strong></em>를 출력한다.</p>

<p>행렬의 각 원소는 기약분수 $P$/$Q$ 형태로 출력한다. $Q = 1$인 경우는 $P$만 출력하고, $P &gt; 0$이면 부호는 생략한다.</p>

### 힌트

<p><em>RREF</em>는 <em>Reduced Row Echelon Form</em>의 약자이다.</p>