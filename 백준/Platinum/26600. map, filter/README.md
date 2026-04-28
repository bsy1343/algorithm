# [Platinum IV] map, filter - 26600

[문제 링크](https://www.acmicpc.net/problem/26600)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 334, 정답: 46, 맞힌 사람: 36, 정답 비율: 13.793%

### 분류

이분 탐색, 브루트포스 알고리즘, 많은 조건 분기, 구현, 수학, 정렬

### 문제 설명

<p>최근 자바스크립트를 공부한 효석이는 <code>map</code>, <code>filter</code>의 매력에 빠져버렸다. 그래서 <code>map</code>, <code>filter</code> 명령을 처리해주는 새로운 프로그램을 만들었다.</p>

<p>프로그램은 정수로 이루어진 길이 $N$인 배열 $A$를 가지고 시작한다. 프로그램은 한 줄에 명령의 종류, 연산자, 정수 $x$ 3개의 입력을 받아서 동작을 수행한다.</p>

<p>프로그램은 아래의 입력을 처리할 수 있다.</p>

<ul>
	<li><code>map</code> 명령

	<ul>
		<li><code>map</code> <code>+</code> $x$ : 배열의 모든 원소에 정수 $x$만큼 더해준다.</li>
		<li><code>map</code> <code>*</code> $x$ : 배열의 모든 원소에 정수 $x$만큼 곱해준다.</li>
		<li><code>map</code> <code>%</code> $x$ : 배열의 모든 원소를 $x$로 나눈 나머지로 바꿔준다.</li>
	</ul>
	</li>
	<li><code>filter</code> 명령
	<ul>
		<li><code>filter</code> <code>&gt;=</code> $x$ : 배열의 원소 중 $x$보다 크거나 같은 원소를 가진 새로운 배열을 반환한다.</li>
		<li><code>filter</code> <code>&lt;=</code> $x$ : 배열의 원소 중 $x$보다 작거나 같은 원소를 가진 새로운 배열을 반환한다.</li>
		<li><code>filter</code> <code>==</code> $x$ : 배열의 원소 중 $x$와 같은 원소를 가진 새로운 배열을 반환한다.</li>
	</ul>
	</li>
</ul>

<p>처음 배열 $A$와 명령들이 주어졌을 때 <code>filter</code> 명령의 수행 결과로 반환받은 새로운 배열의 길이를 출력하는 프로그램을 작성하시오.</p>

### 입력

<p>첫째 줄에 배열의 길이 $N$이 주어진다. $( 1 \leq N \leq 100\,000 )$</p>

<p>둘째 줄에 프로그램이 가지고 시작하는 배열 $A$의 원소 $A_{i}$가 공백으로 구분되어 주어진다. $( 1 \leq A_{i} \leq 100\,000 )$</p>

<p>셋째 줄에 명령의 개수 $Q$가 주어진다. $( 1 \leq Q \leq 100\,000 )$</p>

<p>넷째 줄부터 $Q+3$번째 줄 까지 한 줄에 하나씩 명령이 주어진다. 하나의 명령은 명령의 종류, 연산자, 정수 $x$ 3개의 입력이 공백으로 구분되어 주어진다.</p>

<p>명령의 종류가 <code>map</code>인 경우 아래의 제한이 적용된다.</p>

<ul>
	<li>$1 \leq x \leq 100$</li>
</ul>

<p>명령의 종류가 <code>filter</code>인 경우 아래의 제한이 적용된다.</p>

<ul>
	<li>$0 \leq x \leq 2^{63} - 1$</li>
</ul>

<p>명령을 처리하는 과정에서 $0 \leq A_{i} \leq 2^{63} - 1$임이 보장된다.</p>

### 출력

<p><code>filter</code> 명령을 수행할 때마다 <code>filter</code> 명령으로 반환받은 배열의 원소의 개수를 출력한다.</p>