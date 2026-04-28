# [Gold I] 완전그래프의 최소 스패닝 트리 - 20390

[문제 링크](https://www.acmicpc.net/problem/20390)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 16 MB

### 통계

제출: 1112, 정답: 395, 맞힌 사람: 152, 정답 비율: 26.343%

### 분류

그래프 이론, 최소 스패닝 트리

### 문제 설명

<p>0 부터 <em>N</em>&nbsp;- 1 까지 번호가 부여된&nbsp;<em>N</em> 개의 정점을 가진 완전그래프가 있다.</p>

<p>각 정점 <em>i</em> 는 어떤 값 <em>X<sub>i</sub></em> 를 가지고 있다.</p>

<p>번호의 크기 관계가 <em>i</em>&nbsp; &lt; <em>j</em>&nbsp; 를 만족하는 두 정점 <em>i</em> 와 <em>j</em>&nbsp;사이를&nbsp;연결하는 양방향 간선의 가중치 <em>dist</em>(<em>i</em>, <em>j</em>) 는 다음과 같이 계산된다.</p>

<p style="text-align: center;"><em>dist</em>(<em>i</em>, <em>j</em>) = ((<em>X<sub>i</sub></em>&nbsp; &times; <em>A</em> + <em>X<sub>j</sub></em>&nbsp; &times;&nbsp;<em>B</em>) % <em>C</em>)&nbsp;^ <em>D</em></p>

<p>여기서 <em>A</em>,&nbsp;<em>B</em>,&nbsp;<em>C</em>,&nbsp;<em>D</em> 는&nbsp;상수이고, % 는 나눗셈의 나머지 연산, ^ 는 bitwise XOR 연산을 의미한다.</p>

<p>주어진 그래프의 최소 신장 트리 (MST) 의 가중치를 구해보자.</p>

### 입력

<p>첫 번째 줄에는 정점의 개수 <em>N</em> 이 주어진다.</p>

<p>두 번째 줄에는 4 개의 정수 <em>A</em>, <em>B</em>, <em>C</em>, <em>D</em> 가 차례대로 주어진다.</p>

<p>세 번째 줄에는 <em>N</em> 개의 정수가 주어진다. 이는 <em>X<sub>i</sub></em>&nbsp;가 0 번 정점부터 시작해서 <em>N</em>-1 번까지 순서대로&nbsp;주어진 것이다.</p>

<p>입력으로 주어지는 모든 수는 제약사항의 범위를 만족하는 정수이며, 각 수는 공백으로 구분된다.</p>

### 출력

<p>최소 신장 트리의 가중치를 출력한다.</p>

### 제한

<ul>
	<li>1 &le; <em>N</em> &le; 10,000</li>
	<li>0 &le; <em>X<sub>i</sub></em>, <em>A</em>, <em>B</em>, <em>C</em>, <em>D</em> &le; 1,000,000,000,000</li>
	<li><em>C</em> &ne; 0</li>
</ul>

### 힌트

<p>시간 / 메모리 제한으로 인해 C/C++ 와 Java11, 그리고 PyPy3 이외의 언어로는&nbsp;정해로도&nbsp;정답을 받을 수 있는 것이 보장되지 않는다.</p>