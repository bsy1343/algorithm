# [Platinum II] 배열 알아맞히기 - 23636

[문제 링크](https://www.acmicpc.net/problem/23636)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 632, 정답: 74, 맞힌 사람: 53, 정답 비율: 11.597%

### 분류

수학, 사칙연산, 무작위화

### 문제 설명

<p>베시는 양의 정수로&nbsp;이루어진 수열 $A = \{A_1, A_2, \cdots, A_N\}$를&nbsp;가지고 있다. 이 수열은&nbsp;다음과 같은&nbsp;특징을 가진다.</p>

<ul>
	<li>$A$의 길이 $N$은&nbsp;4의 배수이다.</li>
	<li>$A$의&nbsp;원소는 모두 $A_i=a \times&nbsp;(i-1)+b$ 의 형태로 나타낼 수 있다. 즉, $A$는 공차가 $a$이고 초항이 $b$인&nbsp;등차수열의 첫&nbsp;$N$개의 항이다. ($1&nbsp;\leq a, b&nbsp;\leq 1,000,000,000$, $~a, b$는 정수)</li>
</ul>

<p>하지만 베시의 컴퓨터가 고장 나&nbsp;수열의 $N/4$개의 원소에 양의 정수&nbsp;$k$가&nbsp;더해졌다. ($1&nbsp;\leq k&nbsp;\leq 1,000,000,000$)</p>

<p>베시를 위해 수열 $A$의 공차 $a$, 초항 $b$, 그리고 더해진 값 $k$를 구해보자.</p>

### 입력

<p>첫 번째 줄에 베시가 가지고 있는 수열의 크기를 나타내는 정수&nbsp;$N$이 주어진다.</p>

<ul>
	<li>$1 \leq N \leq 500,000$</li>
	<li>$N \equiv&nbsp;0 \pmod 4$</li>
</ul>

### 출력



### 제한

<p>채점기는 적응적이지 않다. 즉, 베시의 수열은 채점 데이터에 저장되어 있으며,&nbsp;실행 중에 생성되거나&nbsp;변경되지 않는다.</p>

### 힌트

<p>언어 별로 표준 출력 버퍼를&nbsp;<strong><code>flush</code>&nbsp;</strong>하는 방법은 다음과 같다.</p>

<ul>
	<li>C: <code>fflush(stdout)</code></li>
	<li>C++: <code>std::cout &lt;&lt; std::flush</code></li>
	<li>Java: <code>System.out.flush()</code></li>
	<li>Python: <code>sys.stdout.flush()</code></li>
	<li>기타 언어의 경우 각 언어의 documentation을 참조하라.</li>
</ul>