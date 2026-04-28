# [Bronze I] 멀티버스 Ⅰ - 18868

[문제 링크](https://www.acmicpc.net/problem/18868)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 512 MB

### 통계

제출: 2228, 정답: 1230, 맞힌 사람: 923, 정답 비율: 59.587%

### 분류

브루트포스 알고리즘

### 문제 설명

<p>M개의 우주가 있고, 각 우주에는 1부터 N까지 번호가 매겨진 행성이 N개 있다. 행성의 크기를 알고 있을때, 균등한 우주의 쌍이 몇 개인지 구해보려고 한다.&nbsp;구성이 같은데 순서만 다른 우주의 쌍은 한 번만 센다.</p>

<p>두 우주 A와 B가 있고,&nbsp;우주 A에 있는 행성의 크기는 A<sub>1</sub>, A<sub>2</sub>, ..., A<sub>N</sub>, 우주 B에 있는 행성의 크기는 B<sub>1</sub>, B<sub>2</sub>, ..., B<sub>N</sub>라고 하자. 두 우주의 행성 크기가 모든 1 &le; i, j &le; N에 대해서 아래와 같은 조건을 만족한다면, 두 우주를 균등하다고 한다.</p>

<ul>
	<li>A<sub>i</sub> &lt; A<sub>j</sub> &rarr;&nbsp;B<sub>i</sub> &lt; B<sub>j</sub></li>
	<li>A<sub>i</sub> = A<sub>j</sub> &rarr; B<sub>i</sub> = B<sub>j</sub></li>
	<li>A<sub>i</sub> &gt; A<sub>j</sub> &rarr; B<sub>i</sub> &gt; B<sub>j</sub></li>
</ul>

### 입력

<p>첫째 줄에 우주의 개수 M과 각 우주에 있는 행성의 개수 N이 주어진다. 둘째 줄부터 M개의 줄에 공백으로 구분된 행성의 크기가 한 줄에 하나씩 1번 우주부터 차례대로 주어진다.</p>

### 출력

<p>첫째 줄에 균등한 우주의 쌍의 개수를 출력한다.</p>

### 제한

<ul>
	<li>2 &le; M &le; 10</li>
	<li>3 &le; N &le; 100</li>
	<li>1 &le;&nbsp;행성의 크기 &le; 10,000</li>
</ul>