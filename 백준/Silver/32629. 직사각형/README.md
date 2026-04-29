# [Silver III] 직사각형 - 32629

[문제 링크](https://www.acmicpc.net/problem/32629)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 1024 MB (추가 메모리 없음)

### 통계

제출: 429, 정답: 226, 맞힌 사람: 188, 정답 비율: 53.258%

### 분류

수학

### 문제 설명

<p>크기가 무한한 정사각 격자가 있다. 이 격자 위에 $N$개의 $1 \times 1$ 정사각형들을 각각 서로 다른 칸에 배치하려고 한다.</p>

<p>다음 조건들을 만족하는 도형 중 둘레가 최소인 도형을 <strong>최소 경계 직사각형</strong>이라고 하자.</p>

<ul>
	<li>도형은 모든 변이 격자와 평행한 직사각형이다.</li>
	<li>도형은 배치한 정사각형들을 모두 포함한다.</li>
</ul>

<p>$N$개의 정사각형을 배치하는 방법들 중 최소 경계 직사각형의 둘레가 가장 짧은 경우는 어떤 경우일까?</p>

### 입력

<p>첫 번째 줄에 테스트 케이스의 개수 $T$가 주어진다. ($1 \le T \le 2 \times 10^5$)</p>

<p>두 번째 줄부터 $T$개의 줄에 걸쳐 각 줄에 하나씩, 배치하고자 하는 정사각형의 개수 $N$이 주어진다. ($1 \le N \le 10^9$)</p>

### 출력

<p>각 테스트 케이스마다 최소 경계 직사각형의 둘레가 가장 짧은 경우의 둘레를 출력한다.</p>

### 힌트

<p>이 문제는 입력 데이터의 용량이 커서, 시간 초과를 받지 않으려면 빠른 입출력 방법을 사용해야 할 수 있다.</p>

<ul>
	<li>C++을 사용하고 있고 <code>cin/cout</code>을 사용하고자 한다면:

	<ul>
		<li><code>cin.tie(nullptr)</code>와 <code>ios::sync_with_stdio(false)</code>를 <code>main</code> 함수 안의 맨 위에 적는다.</li>
		<li><code>endl</code> 대신 개행 문자(<code>\n</code>)를 사용한다.</li>
		<li>단, 이렇게 할 경우 <code>scanf/printf/puts/getchar/putchar</code> 등 C의 입출력 방식을 사용하면 안 된다.</li>
	</ul>
	</li>
	<li>Java를 사용하고 있다면:
	<ul>
		<li><code>Scanner</code>와 <code>System.out.println</code> 대신 <code>BufferedReader</code>와 <code>BufferedWriter</code>를 사용한다.</li>
		<li><code>BufferedWriter.flush</code>를 마지막에 한 번 수행한다.</li>
	</ul>
	</li>
	<li>Python을 사용하고 있다면:
	<ul>
		<li><code>input</code> 대신 <code>sys.stdin.readline</code>을 사용한다. 단, 이 함수는 맨 끝의 개행 문자까지 같이 입력받음에 유의한다.</li>
		<li>개행 문자를 제외한 문자열을 저장하고 싶을 경우 <code>.rstrip()</code>을 추가로 해 주는 것이 좋다.</li>
	</ul>
	</li>
</ul>