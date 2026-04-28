# [Platinum II] 호반우가 학교에 지각한 이유 6 - 30473

[문제 링크](https://www.acmicpc.net/problem/30473)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 78, 정답: 33, 맞힌 사람: 28, 정답 비율: 47.458%

### 분류

애드 혹, 구현, 누적 합

### 문제 설명

<p>마왕에게 거의 다다른 호반우지만 마왕의 옥좌로 들어가는 문이 잠겨 못 들어가고 있다.</p>

<p>문을 열기 위해서는 길이가 $N$인 마법 열쇠를 길이가 <strong>정확히</strong> $M$인 마법 열쇠로 만들어야 하는데 마법 열쇠의 힘을 최대한 크게 만들어야 한다.</p>

<p>길이가 $N$인 마법 열쇠는 $N$개의 음이 아닌 정수로 이루어진 수열 $a_{1},\,\,a_{2},\,\,a_{3}\,,\cdots,\,a_{N}$을 가지며 길이가 $N$인 마법 열쇠의 힘은 수열을 구성하는 $N$개의 수의 합으로 정의한다.</p>

<p>현재 마법 열쇠의 길이가 $ℓ$일 때 마법 열쇠에 다음 $4$가지 마법 중 하나를 적용하여 마법 열쇠의 길이를 줄일 수 있다.</p>

<ol>
	<li>마법 열쇠에서 $a_{1},\,a_{2}$를 제거하고 앞에 $a_{1}&oplus;a_{2}$를 추가하여 길이가 $ℓ-1$인 새로운 마법 열쇠를 만든다.</li>
	<li>마법 열쇠에서 $a_{ℓ-1},\,a_{ℓ}$을 제거하고 뒤에 $a_{ℓ-1}&oplus;a_{ℓ}$을 추가하여 길이가 $ℓ-1$인 새로운 마법 열쇠를 만든다.</li>
	<li>마법 열쇠에서 $a_{1},\,a_{2},\,a_{3},\,a_{4}$를 제거하고 앞에 $a_{2}&oplus;a_{3},\,a_{1}&oplus;a_{4}$를 추가하여 길이가 $ℓ-2$인 새로운 마법 열쇠를 만든다.</li>
	<li>마법 열쇠에서 $a_{ℓ-3},\,a_{ℓ-2},\,a_{ℓ-1},\,a_{ℓ}$을 제거하고 뒤에 $a_{ℓ-3}&oplus;a_{ℓ},\,a_{ℓ-2}&oplus;a_{ℓ-1}$을 추가하여 길이가 $ℓ-2$인 새로운 마법 열쇠를 만든다.</li>
</ol>

<p>각 연산마다 변화를 수열로 나타내면 다음과 같다.</p>

<ol>
	<li>$({\color{Red}a_{{\color{Red}1}}},\,\,{\color{Red}a_{{\color{Red}2}}},\,\,a_{3},\,\,a_{4}\,,\cdots,\,a_{ℓ}) \Rightarrow ({\color{Red}a_{{\color{Red}1}}}{\color{Red}&oplus;}{\color{Red}a_{{\color{Red}2}}},\,\,a_{3},\,\,a_{4}\,,\cdots,\,a_{ℓ})$</li>
	<li>$(a_{1}\,,\cdots,\,a_{ℓ-3},\,\,a_{ℓ-2},\,\,{\color{Red}a_{{\color{Red}ℓ{\color{Red}-}{\color{Red}1}}}},\,\,{\color{Red}a_{{\color{Red}ℓ}}}) \Rightarrow (a_{1}\,,\cdots,\,a_{ℓ-3},\,\,a_{ℓ-2},\,\,{\color{Red}a_{{\color{Red}ℓ}{\color{Red}-}{\color{Red}1}}}{\color{Red}&oplus;}{\color{Red}a_{{\color{Red}ℓ}}})$</li>
	<li>$({\color{Red}a_{{\color{Red}1}}},\,\,{\color{Blue}a_{{\color{Blue}2}}},\,\,{\color{Blue}a_{{\color{Blue}3}}},\,\,{\color{Red}a_{{\color{Red}4}}},\,\,a_{5},\,\,a_{6}\,,\cdots,\,a_{ℓ}) \Rightarrow ({\color{Blue}a_{{\color{Blue}2}}}{\color{Blue}&oplus;}{\color{Blue}a_{{\color{Blue}3}}},\,\,{\color{Red}a_{{\color{Red}1}}}{\color{Red}&oplus;}{\color{Red}a_{{\color{Red}4}}},\,\,a_{5},\,\,a_{6}\,,\cdots,\,a_{ℓ})$ </li>
	<li>$(a_{1}\,,\cdots,\,a_{ℓ-5},\,\,a_{ℓ-4},\,\,{\color{Red}a_{{\color{Red}ℓ}{\color{Red}-}{\color{Red}3}}},\,\,{\color{Blue}a_{{\color{Blue}ℓ}{\color{Blue}-}{\color{Blue}2}}},\,\,{\color{Blue}a_{{\color{Blue}ℓ}{\color{Blue}-}{\color{Blue}1}}},\,\,{\color{Red}a_{{\color{Red}ℓ}}}) \Rightarrow (a_{1}\,,\cdots,\,a_{ℓ-5},\,\,a_{ℓ-4},\,\,{\color{Red}a_{{\color{Red}ℓ}{\color{Red}-}{\color{Red}3}}}{\color{Red}&oplus;}{\color{Red}a_{{\color{Red}ℓ}}},\,\,{\color{Blue}a_{{\color{Blue}ℓ}{\color{Blue}-}{\color{Blue}2}}}{\color{Blue}&oplus;}{\color{Blue}a_{{\color{Blue}ℓ}{\color{Blue}-}{\color{Blue}1}}})$ </li>
</ol>

<p>호반우가 문을 열어 마왕에게 갈 수 있도록 도와주자!</p>

### 입력

<p>첫 번째 줄에 마법 열쇠의 길이 $N$과 목표 길이 $M$이 공백을 두고 주어진다. $(4 \le M \le N \le 3\,000)$</p>

<p>두 번째 줄에 $N$개의 수 $a_{1},\,\,a_{2},\,\,a_{3}\,,\cdots,\,a_{N}$이 공백을 두고 주어진다. $(0 \le a_{i} \le 10^{9})$</p>

### 출력

<p>길이가 $M$인 마법 열쇠를 만들었을 때 가능한 마법 열쇠의 힘 중 최댓값을 출력한다.</p>

### 힌트

<p>&oplus;는 Bitwise XOR 연산이며 비트 단위로 연산을 시행한다.</p>

<ul>
	<li><strong>Bitwise XOR</strong>

	<ul>
		<li>두 수의 비트마다 아래와 같은 연산을 진행한다.
		<ul>
			<li>두 비트가 서로 다르면 결과가 $1$이고, 그렇지 않으면 $0$이다.</li>
		</ul>
		</li>
		<li>예시
		<ul>
			<li>$\begin{aligned} 0110_{2} &amp;= 6 \\ \text{&oplus;} \ \ 1100_{2} &amp;= 12 \\ \text{────} \\ 1010_{2} &amp;= 10 \end{aligned}$ </li>
		</ul>
		</li>
	</ul>
	</li>
</ul>