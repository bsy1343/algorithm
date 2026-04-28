# [Platinum III] Defend the Bases - 22620

[문제 링크](https://www.acmicpc.net/problem/22620)

### 성능 요약

시간 제한: 8 초 (추가 시간 없음), 메모리 제한: 512 MB

### 통계

제출: 200, 정답: 87, 맞힌 사람: 33, 정답 비율: 28.947%

### 분류

이분 탐색, 매개 변수 탐색, 이분 매칭

### 문제 설명

<p>A country Gizevom is being under a sneak and fierce attack by their foe. They have to deploy one or more troops to every base immediately in order to defend their country. Otherwise their foe would take all the bases and declare &quot;All your base are belong to us.&quot;</p>

<p>You are asked to write a program that calculates the minimum time required for deployment, given the present positions and marching speeds of troops and the positions of the bases.</p>

### 입력

<p>The input consists of multiple datasets. Each dataset has the following format:</p>

<pre>
<i>N M</i>
<i>x</i><sub>1</sub> <i>y</i><sub>1</sub> <i>v</i><sub>1</sub>
<i>x</i><sub>2</sub> <i>y</i><sub>2</sub> <i>v</i><sub>2</sub>
...
<i>x</i><sub><i>N</i></sub> <i>y</i><sub><i>N</i></sub> <i>v</i><sub><i>N</i></sub>
<i>x&#39;</i><sub>1</sub> <i>y&#39;</i><sub>1</sub>
<i>x&#39;</i><sub>2</sub> <i>y&#39;</i><sub>2</sub>
...
<i>x&#39;</i><sub><i>M</i></sub> <i>y&#39;</i><sub><i>M</i></sub></pre>

<p><i>N</i>&nbsp;is the number of troops (1 &le;&nbsp;<i>N</i>&nbsp;&le; 100);&nbsp;<i>M</i>&nbsp;is the number of bases (1 &le;&nbsp;<i>M</i>&nbsp;&le; 100); (<i>x<sub>i</sub></i>,&nbsp;<i>y<sub>i</sub></i>&nbsp;) denotes the present position of&nbsp;<i>i</i>-th troop;&nbsp;<i>v<sub>i</sub></i>&nbsp;is the speed of the&nbsp;<i>i</i>-th troop (1 &le;&nbsp;<i>v<sub>i</sub></i>&nbsp;&le; 100); (<i>x&#39;<sub>j</sub></i>,&nbsp;<i>y&#39;<sub>j</sub></i>) is the position of the&nbsp;<i>j</i>-th base.</p>

<p>All the coordinates are integers between 0 and 10000 inclusive.</p>

<p>The last dataset is followed by a line containing two zeros. This line is not a part of any dataset and should not be processed.</p>

### 출력

<p>For each dataset, print the minimum required time in a line.</p>