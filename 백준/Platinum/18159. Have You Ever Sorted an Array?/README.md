# [Platinum V] Have You Ever Sorted an Array? - 18159

[문제 링크](https://www.acmicpc.net/problem/18159)

### 성능 요약

시간 제한: 4 초, 메모리 제한: 512 MB

### 통계

제출: 196, 정답: 36, 맞힌 사람: 24, 정답 비율: 20.000%

### 분류

정렬, 트리

### 문제 설명

<p>이제부터 여러분은 교준이와 간단한 게임을 하게 된다.</p>

<p>교준이는 마음속으로, 1부터 N까지 N개의 자연수로 이루어진 수열 A를 생각한다. 교준이는 여러분에게 자연수 N만 알려준다. 아직 여러분은 수열 A를 정확히 알지 못한다.</p>

<p>여러분은 교준이 마음속에 있는 수열 A를 알아내기 위하여, 교준이에게 다음과 같은 질문을 할 수 있다.</p>

<ul>
	<li>&quot;수열 A의 a번째 수와 b번째 수 중 뭐가 더 커?&quot; (1 &le; a &lt; b &le; N)</li>
</ul>

<p><strong>최소한의 질문</strong>으로 수열 A를 <strong>정확하게</strong> 알아내는 것이 이 게임의 목표이다. 교준이와 본 게임을 진행하는 프로그램을 작성하시오.</p>

### 입력

<p>Sample Grader는 다음과 같은 정보를 Standard Input을 통해 읽는다. 여러분은 어떠한 입력도 받으면 안된다.</p>

<p>첫 번째 줄에 교준이와 할 게임의 총 판 수와 교준이가 생각한 수열 A의 길이를 의미하는 자연수 T, N이 공백을 사이에 두고 주어진다.</p>

<p>두 번째 줄부터 T개의 줄에 걸쳐, 수열 A를 나타내는 N개의 자연수가 공백을 사이에 두고 주어진다.</p>

### 출력

<p>Sample Grader는 다음과 같은 정보를 Standard Output을 통해 출력한다. 여러분은 어떠한 출력도 하면 안된다.</p>

<p>여러분이 T판의 게임에서 전부 수열 A를 정확하게 알아낸 경우 Sample Grader는 &quot;<code>Accept. Max Questions = %d</code>&quot;의 형태로 출력한다. 이때, &quot;<code>%d</code>&quot;는 여러분이 게임 한 판에서 함수 <code>compare</code>의 최다 호출 횟수를 나타내는 정수이다.</p>

<p>Sample Grader가 &quot;틀렸습니다&quot;라고 판정한 경우 Sample Grader는 &quot;<code>Wrong Answer [4]</code>&quot;와 같은 형태로 출력한다.</p>

### 제한

<ul>
	<li>1 &le; T &le; 5&nbsp;&times; 10<sup>4</sup></li>
	<li>1 &le; N &le; 7</li>
	<li>1 &le; A<sub>i</sub> &le; N (1 &le; i &le; N)</li>
	<li>A<sub>i</sub> &ne; A<sub>j</sub> (1 &le; i &lt; j &le; N)</li>
</ul>