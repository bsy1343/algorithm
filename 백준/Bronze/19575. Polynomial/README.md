# [Bronze I] Polynomial - 19575

[문제 링크](https://www.acmicpc.net/problem/19575)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 1492, 정답: 544, 맞힌 사람: 443, 정답 비율: 37.928%

### 분류

수학, 구현

### 문제 설명

<p>경근이는 수학을 좋아한다. 수학을 너무 좋아하는 나머지 다항식을 빠르게 평가하는 프로그램을 작성했다. 미지수 <em>x</em>로 구성된 다항식 <em>f</em>(<em>x</em>)에서 <em>x</em>에 <em>k</em>를 대입하여 <em>f</em>(<em>k</em>)를 구하는 것을 <strong>평가</strong>라고 한다. 하지만, 경근이가 작성한 프로그램은 다항식의 각 항을 평가해서 합치는 식으로 짜여&nbsp;있었기 때문에, 한 번 다항식을 평가할 때마다 차수의 제곱에 비례한 만큼의 시간이 걸렸다. 경근이는 계산 시간을&nbsp;조금이라도 줄이기 위해, 다항식 평가 알고리즘을 개선하여 성능을 최적화하기로 한다.</p>

<p>경근이가 생각한 아이디어는 이렇다. &ldquo;값을 더하고, 계수를 곱하고, 값을 더하고, 계수를 곱하는 것을 반복하면 어떨까?&rdquo;</p>

<p>예를 들면, <em>x</em><sup>4</sup> + 2<em>x</em><sup>3</sup> + 3<em>x</em><sup>2</sup> + 4<em>x</em> + 5는 경근이가 작성한 프로그램대로 계산한다면 덧셈 4회, 곱셈 9회의 연산이 필요하지만, 경근이가 생각한 대로라면&nbsp;앞의 다항식을 <em>x</em>(<em>x</em>(<em>x</em>(<em>x</em>&nbsp;+ 2) + 3) + 4) + 5로 바꿀 수 있으며, 덧셈 4회 곱셈 3회로 연산량이 대폭 줄어드는 셈이다.</p>

<p>경근이를 도와 다항식 계산 프로그램을 개선한 버전을 제출하도록 하자. 다항식 계산 프로그램의 성능을 개선하면 시간 초과가 뜨지 않는다.</p>

### 입력

<p>첫 번째 줄에는 다항식의 차수 <em>N</em>, 평가할 값인 정수&nbsp;<em>x</em>가 주어진다. (1 &le; <em>N</em> &le; 10<sup>6</sup>, 0 &le; <em>x</em> &le; 10<sup>8</sup>)</p>

<p>두 번째 줄부터&nbsp;<em>N</em> + 2번째 줄까지 다항식의 각 항에 대한 정보인 <em>A<sub>i</sub></em>, <em>i</em>가 각각 입력으로 주어진다. <em>A<sub>i</sub></em>는 항의 계수이며, <em>i</em>는 항의 차수이다. 항의 계수는 0 이상 100 이하의 정수이다.</p>

<p>항의 차수는 두 번째 줄부터 <em>N + </em>2번째 줄까지 각각 <em>N</em>, <em>N</em> &minus; 1, ..., 0이다.</p>

### 출력

<p>다항식을 평가한 후 10<sup>9</sup> + 7로 나눈 나머지를 출력한다.</p>

### 힌트

<p>입출력 방식이 느리면 여러 줄을 입력받거나 출력할 때 시간초과가 날 수 있다.</p>

<p>C++을 사용하고 있고 <code>cin</code>/<code>cout</code>을 사용하고자 한다면, <code>cin.tie(NULL)</code>과 <code>sync_with_stdio(false)</code>를 둘 다&nbsp;적용해 주고, <code>endl</code> 대신 개행문자(<code>\n</code>)를 쓰자.&nbsp;단, 이렇게 하면 더 이상 <code>scanf</code>/<code>printf</code>/<code>puts</code>/<code>getchar</code>/<code>putchar</code>&nbsp;등 C의 입출력 방식을 사용하면 안 된다.</p>

<p>Java를 사용하고 있다면, <code>Scanner</code>와 <code>System.out.println</code> 대신 <code>BufferedReader</code>와 <code>BufferedWriter</code>를 사용할 수 있다.&nbsp;<code>BufferedWriter.flush</code>는 맨 마지막에 한 번만 하면 된다.</p>

<p>Python을 사용하고 있다면, <code>input</code>&nbsp;대신 <code>sys.stdin.readline</code>을 사용할 수 있다.</p>

<p>마지막으로, Pypy3은 Python 3와 같은 문법을 가지면서 일반적으로 더 빠르게 동작한다. 연산량이 많은 문제에서 Python을 사용하고자 한다면 Pypy로 제출하는 것을 권장한다.</p>