# [Platinum II] POEM - 32182

[문제 링크](https://www.acmicpc.net/problem/32182)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 50, 정답: 18, 맞힌 사람: 15, 정답 비율: 40.541%

### 분류

자료 구조, 그래프 이론, 그래프 탐색, 해 구성하기, 누적 합, 깊이 우선 탐색, 분리 집합, 강한 연결 요소, 역추적, 2-sat

### 문제 설명

<hr />
<blockquote>
<p><strong>POEM</strong></p>

<p class="problem-text-wapas">wapas</p>

<p class="problem-text-start">밤하늘에 $N$개의 서로 다른 정수로 가득 차</p>

<p>가슴속으로 그 정수들을 살펴보니</p>

<p class="problem-text-start">절댓값이 $2N$을 넘지 않는구나</p>

<p>$0$도 존재하지 않는구나</p>

<p class="problem-text-start">밤하늘의 외로운 수들을 위해, 나는</p>

<p>$M$개의 계약으로 $1$번부터 $N$번까지</p>

<p>수들에게 번호를 붙여준다</p>

<p class="problem-text-start">계약은 $4$가지 형태로</p>

<p class="problem-text-start">$P$ $L$ $R$</p>

<p>$L$번 수부터 $R$번 수까지 순서대로 곱했을 때 양수(Plus)</p>

<p class="problem-text-start">$O$ $L$ $R$</p>

<p>$L$번 수부터 $R$번 수까지 순서대로 더했을 때 홀수(Odd)</p>

<p class="problem-text-start">$E$ $L$ $R$</p>

<p>$L$번 수부터 $R$번 수까지 순서대로 더했을 때 짝수(Even)</p>

<p class="problem-text-start">$M$ $L$ $R$</p>

<p>$L$번 수부터 $R$번 수까지 순서대로 곱했을 때 음수(Minus)</p>

<p class="problem-text-start">계약을 실현하며, 번호를 붙이니</p>

<p>밤하늘의 외로운 수들이 빛난다</p>

<p class="problem-text-start">아아, 얼마나 아름다운가!</p>
</blockquote>

<hr />
<p>시에서 만족하는 $N$개의 정수를 화자가 붙인 번호 순서대로 나열하라.</p>

### 입력

<p>첫 번째 줄에 $N$과 $M$이 공백으로 구분되어 주어진다.</p>

<p>그다음 줄부터 $M$개의 줄에 걸쳐 계약의 정보가 주어진다. 그중 $i$번째 줄에는 $i$번째 계약이 주어진다.</p>

<p>계약은 $Q$, $L$, $R$로 형태로 공백으로 구분되어 주어진다. $Q$는 <span style="color:#e74c3c;"><code>P</code></span>, <span style="color:#e74c3c;"><code>O</code></span>, <span style="color:#e74c3c;"><code>E</code></span>, <span style="color:#e74c3c;"><code>M</code></span> 문자 중 하나이고, $L$, $R$은 양의 정수이다.</p>

### 출력

<p>첫 번째 줄에 모든 계약을 만족하는 $N$개의 수를 공백으로 구분하여 출력한다. 그중 $j$번째 수는 화자가 붙인 번호 $j$번의 수이다.</p>

<p>만약 모든 계약을 만족하도록 수를 나열할 수 없다면 <span style="color:#e74c3c;"><code>0</code></span>을 출력한다.</p>

<p>만족하는 경우가 여럿인 경우는 그중 아무거나 하나를 출력한다.</p>

### 제한

<ul>
	<li>$1 \le N, M \le 100\,000$</li>
	<li>$1 \le L \le R \le N$</li>
</ul>