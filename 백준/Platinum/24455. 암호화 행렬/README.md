# [Platinum III] 암호화 행렬 - 24455

[문제 링크](https://www.acmicpc.net/problem/24455)

### 성능 요약

시간 제한: 0.8 초, 메모리 제한: 512 MB

### 통계

제출: 247, 정답: 53, 맞힌 사람: 28, 정답 비율: 16.568%

### 분류

수학, 무작위화

### 문제 설명

<p>$N \times N$ 행렬 세 개 $A_0,\ A_1,\ A_2$가 주어진다.</p>

<p>집합 $A = \{A_0,\ A_1,\ A_2\}$라 하면, 이 집합에 포함된 세 행렬의 어떤 순열 $X$, $Y$, $Z$가 $XY = Z$이라는 조건을 만족할 때, 각 행렬은 다음과 같은 특성을 갖는다고 하자.</p>

<ul>
	<li>$X$: <strong>평문</strong></li>
	<li>$Y$: <strong>암호화 행렬</strong></li>
	<li>$Z$: <strong>암호문</strong></li>
</ul>

<p>이때 $S(A_i | A)$를 집합 $A$에 속하는 원소 $A_i$의 특성들의 집합이라고 하자. $(0 \le i \le 2)$</p>

<p>&nbsp;예를 들어, $A_0 = \left( \begin{matrix} 0 &amp; 0 \\ 0 &amp; 1 \end{matrix} \right)$, $A_1 = \left( \begin{matrix} 1 &amp; 0 \\ 0 &amp; 0 \end{matrix} \right)$, $A_2 = \left( \begin{matrix} 0 &amp; 0 \\ 0 &amp; 0 \end{matrix} \right)$, 그리고 $A = \{A_0,\ A_1,\ A_2\}$ 라고 하자.</p>

<p>이때 $A_0A_1 = A_2$, 그리고 $A_1A_0 = A_2$ 이다.</p>

<p>따라서, $S(A_0 | A) = \{\textbf{평문}, \textbf{암호화 행렬}\}$, $S(A_1 | A) = \{\textbf{평문}, \textbf{암호화 행렬}\}$, $S(A_2 | A) = \{\textbf{암호문}\}$ 임을 알 수 있다.</p>

<p>이제 $f(A_i | A)$ $(0 \le i \le 2)$를 다음과 같이 정의하자.&nbsp;</p>

<p>$$f(A_i | A) = 1 \times \left[\textbf{평문} \in S(A_i | A)\right] + 2 \times \left[\textbf{암호화 행렬} \in S(A_i | A)\right] + 4 \times \left[\textbf{암호문} \in S(A_i | A)\right]$$</p>

<p>여기서 $[condition] = \begin{cases} 1 &amp; \texttt{if}\ \ condition \\ 0 &amp; \texttt{otherwise.} \end{cases}$ 이다.</p>

<p>즉, 위의 예시에서</p>

<p>$f(A_0 | A) = (1 \times 1) + (2 \times 1) + (4 \times 0) = 3$,</p>

<p>$f(A_1 | A) = (1 \times 1) + (2 \times 1) + (4 \times 0) = 3$,</p>

<p>$f(A_2 | A) = (1 \times 0) + (2 \times 0) + (4 \times 1) = 4$ 이다.</p>

<p>세 개의 $N \times N$ 행렬 $A_0$, $A_1$, $A_2$가 주어진다. $A = \{A_0,\ A_1,\ A_2\}$일 때, $f(A_0 | A),\ f(A_1 | A), f(A_2 | A)$을 구하는 프로그램을 작성하시오.</p>

### 입력

<p>첫 줄에는 정수 $N$이 주어진다. $(1 \le N \le 1\,000)$</p>

<p>다음 $3N$ 줄에 거쳐 세 행렬 $A_0$, $A_1$, $A_2$가 주어진다.</p>

<p>각 줄에는 $N$개의 정수가 공백으로 구분되어 주어지며, 각 정수의 절댓값은 $200$보다 작거나 같다.</p>

### 출력

<p>$f(A_0 | A)$, $f(A_1 | A)$, $f(A_2 | A)$를 한 줄에 하나씩 순서대로 출력한다.</p>