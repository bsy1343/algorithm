# [Platinum III] 연산 - 17126

[문제 링크](https://www.acmicpc.net/problem/17126)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 168, 정답: 45, 맞힌 사람: 37, 정답 비율: 57.812%

### 분류

자료 구조, 정렬, 세그먼트 트리, 값 / 좌표 압축

### 문제 설명

<p>값이 0으로 초기화되어 있고 인덱스는 0으로 시작하는 정수 배열 A에 대해 다음 세 함수가 주어진다.</p>

<ul>
	<li>더하기 (key, value) : A[key]의 값을 value만큼 더한다. 리턴하는 값은 A[key]가 아니라, 배열 A 값 전체의 합이다.</li>
	<li>구간합 (key1, key2) : key1 &le; i &le; key2 인 모든 i에 대한 A[i]의 구간합을 리턴한다. (key1 &le; key2)</li>
	<li>삭제 (key) : A[key]의 값을 0으로 만든다. 리턴하는 값은 역시 해당 연산 이후 배열 A 값 전체의 합이다.</li>
</ul>

<p>연산을 수행할 때마다, 리턴값을 출력하는 프로그램을 작성하시오.</p>

<p>예를 들어 아래와 같은 12개의 연산을 순서대로 적용한다고 해보자. 화살표 이후에 나타나는 값이 바로 당신의 프로그램이 출력해야하는 값이다.</p>

<ul>
	<li>더하기 (key=27, value=30) &rarr; 30</li>
	<li>더하기 (key=25, value= 40) &rarr; 70</li>
	<li>삭제 (key=17) &rarr; 70</li>
	<li>더하기 (key=17, value=20) &rarr; 90</li>
	<li>더하기 (key=5, value=50) &rarr; 140</li>
	<li>구간합 (key1=10, key2=20) &rarr; 20</li>
	<li>구간합 (key1=25, key2=30) &rarr; 70</li>
	<li>삭제 (key=25) &rarr; 100</li>
	<li>삭제 (key=17) &rarr; 80</li>
	<li>더하기 (key=27, value=20) &rarr; 100</li>
	<li>구간합 (key1=10, key2=20) &rarr; 0</li>
	<li>구간합 (key1=25, key2=30) &rarr; 50</li>
</ul>

<p>총 n개의 연산이 주어졌을 때, 각 연산을 적용한 이후 올바른 값을 출력하는 프로그램을 작성하시오.</p>

### 입력

<p>첫 줄에 연산의 수 n이 주어진다.</p>

<p>각 연산은 종류에 따라 아래와 같은 형태로 한 줄에 하나씩 주어진다:</p>

<ul>
	<li>더하기: 줄의 첫 입력으로 1이 주어지고 이후에 key과 value가 공백으로 구분되어 주어진다.</li>
	<li>구간합: 줄의 첫 입력으로 2이 주어지고 이후에 두 개의 key가 공백으로 구분되어 주어진다.</li>
	<li>삭제: 줄의 첫 입력으로 3가 주어지고 이후에 key가 주어진다.</li>
</ul>

### 출력

<p>한 줄에 각 함수의 리턴값을 공백으로 구분해서 출력해야 한다.</p>

### 힌트

<p>입출력 방식이 느리면 여러 줄을 입력받거나 출력할 때 시간초과가 날 수 있다.</p>

<p>C++을 사용하고 있고 <code>cin</code>/<code>cout</code>을 사용하고자 한다면, <code>cin.tie(NULL)</code>과 <code>sync_with_stdio(false)</code>를 둘 다&nbsp;적용해 주고, <code>endl</code> 대신 개행문자(<code>\n</code>)를 쓰자.&nbsp;단, 이렇게 하면 더 이상 <code>scanf</code>/<code>printf</code>/<code>puts</code>/<code>getchar</code>/<code>putchar</code>&nbsp;등 C의 입출력 방식을 사용하면 안 된다.</p>

<p>Java를 사용하고 있다면, <code>Scanner</code>와 <code>System.out.println</code> 대신 <code>BufferedReader</code>와 <code>BufferedWriter</code>를 사용할 수 있다.&nbsp;<code>BufferedWriter.flush</code>는 맨 마지막에 한 번만 하면 된다.</p>

<p>Python을 사용하고 있다면, <code>input</code>&nbsp;대신 <code>sys.stdin.readline</code>을 사용할 수 있다. 단, 이때는 맨 끝의 개행문자까지 같이 입력받기 때문에 문자열을 저장하고 싶을 경우 <code>.rstrip()</code>을 추가로 해 주는 것이 좋다.</p>