# [Platinum II] Non-Decreasing Subarray Game - 18944

[문제 링크](https://www.acmicpc.net/problem/18944)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 256 MB

### 통계

제출: 290, 정답: 83, 맞힌 사람: 66, 정답 비율: 26.939%

### 분류

이분 탐색, 누적 합

### 문제 설명

<p>Yuto와 Platina가 Non-Decreasing Subarray Game을 하려고 한다. 게임은 길이 <em>N</em>의 배열 <em>A</em>에서 진행된다.</p>

<p>Yuto가 먼저 정수&nbsp;하나를 부르고, 그걸 듣고 Platina가 정수를 하나 부른다. 이때 얻게 되는 점수는 둘이 부른 수 중 크지 않은 수를 <em>a</em>, 작지 않은&nbsp;수를 <em>b</em>라고 했을 때, <em>a</em> &le; <em>i</em> &le; <em>j</em> &le; <em>b</em>이며 구간 [<em>i</em>, <em>j</em>]가 Non-Decreasing Subarray를 이루는 서로 다른 (<em>i</em>, <em>j</em>) 쌍의 개수이다.</p>

<p>이때 [<em>i</em>, <em>j</em>]가 Non-Decreasing Subarray 를 이룬다는 것은 주어진 배열에서 <em>i</em> &le; <em>x</em> &le; <em>y</em> &le; <em>j</em>이면, <em>A</em><sub><em>x</em>&nbsp;</sub>&le; <em>A<sub>y</sub></em>라는 것을 뜻한다.</p>

<p>Yuto는 점수가 최소화되기를 원하며, Platina는 점수가 최대화되기를 원한다. 이 게임은 너무나도 재미있어서 부를 수 있는 수의 제한을&nbsp;바꿔가면서 게임을 <em>T</em>판 진행하려고 한다! 각 판마다 둘이 얻게 될 점수를 구하여라.</p>

### 입력

<p>첫째 줄에는 두 양의 정수 <em>N</em>과 <em>T</em>가 주어진다.</p>

<p>둘째 줄에는 배열의 값 <em>A<sub>1</sub></em>, <em>A<sub>2</sub></em>, <em>A<sub>3</sub></em>, ..., <em>A<sub>N</sub></em>이 주어진다.</p>

<p>셋째 줄부터 <em>T</em>+2번째 줄까지는 <em>i</em>번째 게임에서 설정한 수의&nbsp;제한 <em>L</em><sub><em>i</em>, </sub><em>R<sub>i</sub></em>가&nbsp;양의 정수로 주어진다. 이는 그&nbsp;게임에서 두 사람이 부를 수 있는 수가 <em>L<sub>i</sub></em>&nbsp;이상 <em>R<sub>i</sub></em>&nbsp;이하라는 것을 뜻한다.</p>

### 출력

<p>각 게임별로 두 사람이 얻게 될 점수를 각 줄에 걸쳐 출력한다.</p>

### 제한

<ul>
	<li>1 &le; <em>N</em>,&nbsp;<em>T</em>&nbsp;&le; 500,000</li>
	<li>1 &le; <em>A</em><sub><em>i</em>&nbsp;</sub>&le; 10<sup>9</sup></li>
	<li>1 &le;&nbsp;<em>L</em><sub><em>i</em> </sub>&le; <em>R<sub>i</sub></em> &le;&nbsp;<em>N</em></li>
</ul>