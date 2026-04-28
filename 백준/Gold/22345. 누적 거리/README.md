# [Gold II] 누적 거리 - 22345

[문제 링크](https://www.acmicpc.net/problem/22345)

### 성능 요약

시간 제한: 3 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 2340, 정답: 741, 맞힌 사람: 566, 정답 비율: 40.603%

### 분류

수학, 정렬, 이분 탐색, 누적 합

### 문제 설명

<p>KOI 나라는 수직선 위에 놓인 N개의 마을로 구성되어 있다. 이 중 i (1 &le; i &le; N)번째 마을은 x<sub>i</sub> 위치에 놓여 있으며 a<sub>i</sub>명이 거주 중이다. 또한 서로 다른 두 마을이 같은 위치에 놓인 경우는 없다.</p>

<p>KOI 나라는 모든 국민이 참여하는 모임을 개최하려고 한다. 모든 사람들이 모임 장소에 도착하기 위해 이동해야 하는 거리의 합을 누적 거리라고 부르고, 모임 장소가 x일 때의 <strong>누적 거리</strong>를 f(x)로 나타내자.</p>

<p>i번째 마을에 사는 사람이 x 위치에서 열리는 모임에 참가하기 위해서 이동해야 하는 거리는 |x<sub>i</sub> &minus; x|이다. i번째 마을에는 a<sub>i</sub>명이 거주 중이므로 i번째 마을에 사는 사람들의 이동 거리의 합은 a<sub>i</sub>|x<sub>i</sub> &minus; x|가 된다. 이 값을 모든 마을에 대해 합한 값이 모임 장소가 x일 때의 누적 거리가 될 것이다. 즉, f(x) = a<sub>1</sub> &times; |x<sub>1</sub> &minus; x| + a<sub>2</sub> &times; |x<sub>2</sub> &minus; x| + &middot; &middot; &middot; + a<sub>n</sub> &times; |x<sub>n</sub> &minus; x|이다.</p>

<p>예를 들어 마을의 위치가 x<sub>1</sub> = 1, x<sub>2</sub> = 3, x<sub>3</sub> = 6이고, 각 마을에 거주하는 사람들의 수가 a<sub>1</sub> = 2, a<sub>2</sub> = 1, a<sub>3</sub> = 3이라고 하면, 모임 장소가 x = 4일 때의 누적 거리는 f(4) = 2 &times; |1 &minus; 4| + 1 &times; |3 &minus; 4| + 3 &times; |6 &minus; 4| = 13 이다.</p>

<p>KOI 나라는 모임이 개최될 장소의 후보를 Q개 준비해 두었다. 이 때 j (1 &le; j &le; Q)번째 후보 장소의 위치는 q<sub>j</sub>이다. 이 때 서로 다른 두 후보 장소의 위치가 같은 경우는 없으나 마을의 위치와 후보 장소의 위치가 같을 수 있다. 각각의 후보 장소에 대해 누적 거리를 계산하는 프로그램을 작성하라.</p>

### 입력

<p>첫 번째 줄에 N과 Q가 공백을 사이에 두고 차례로 주어진다.</p>

<p>다음 N개의 줄에는 마을에 대한 정보가 주어진다. 이 중 i (1 &le; i &le; N)번째 줄에는 a<sub>i</sub>와 x<sub>i</sub>가 공백을 사이에 두고 차례로 주어진다.</p>

<p>다음 Q개의 줄에는 모임 장소 후보에 대한 정보가 주어진다. 이 중 j (1 &le; j &le; Q)번째 줄에는 q<sub>j</sub>가 주어진다.</p>

### 출력

<p>j (1 &le; j &le; Q)번째 줄에 모임 장소가 j번째 후보 모임 장소인 q<sub>j</sub>일 때의 누적 거리, 즉 f(q<sub>j</sub>)의 값을 출력한다.</p>

### 제한

<ul>
	<li>1 &le; N &le; 200 000</li>
	<li>모든 i (1 &le; i &le; N)에 대해, 1 &le; a<sub>i</sub> &le; 1 000</li>
	<li>모든 i (1 &le; i &le; N)에 대해, &minus;10<sup>9</sup> &le; x<sub>i</sub> &le; 10<sup>9</sup></li>
	<li>1 &le; Q &le; 200 000</li>
	<li>모든 j (1 &le; j &le; Q)에 대해, &minus;10<sup>9</sup> &le; q<sub>j</sub> &le; 10<sup>9</sup></li>
	<li>1 &le; i<sub>1</sub> &lt; i<sub>2</sub> &le; N에 대해 x<sub>i<sub>1</sub></sub> &ne; x<sub>i<sub>2</sub></sub>. 즉, 모든 마을의 위치는 서로 다르다.</li>
	<li>1 &le; j<sub>1</sub> &lt; j<sub>2</sub> &le; Q에 대해 q<sub>j<sub>1</sub></sub>&nbsp;&ne;&nbsp;q<sub>j<sub>2</sub></sub>. 즉, 모든 후보 장소의 위치는 서로 다르다.</li>
	<li>주어지는 모든 수는 정수이다.</li>
</ul>

### 힌트

<p>|x|는 x &lt; 0이면 &minus;x, x &ge; 0이면 x인 절댓값 기호이다.</p>