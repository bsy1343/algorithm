# [Platinum V] 전시회 - 15554

[문제 링크](https://www.acmicpc.net/problem/15554)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 866, 정답: 404, 맞힌 사람: 334, 정답 비율: 47.109%

### 분류

그리디 알고리즘, 정렬, 누적 합

### 문제 설명

<p>승원이는 미술품 N개를 가지고 있다. 각각의 미술품은 1번부터 N번까지 번호가 매겨져 있다. i번 미술품의 크기는 A<sub>i</sub>, 가치는 B<sub>i</sub>로 나타낸다.</p>

<p>오늘은 승원이의 저택 1층에서 미술품을 전시하려고 한다. 승원이는 아래 조건을 만족하는 미술품을 골라서 전시하려고 한다.</p>

<ul>
	<li>전시할 미술품 중에서 가장 큰 크기를 A<sub>max</sub>, 가장 작은 크기를 A<sub>min</sub> 이라고 한다. 전시할 미술품의 가치의 합을 S라고 한다.</li>
	<li>이때,&nbsp;S &minus; (A<sub>max</sub> &minus; A<sub>min</sub>) 가 가장 커야 한다.</li>
</ul>

<p>승원이가 가지고 있는 미술품 N개의 크기와 가치가 주어졌을 때,&nbsp;S &minus; (A<sub>max</sub> &minus; A<sub>min</sub>) 의 최댓값을 구하는 프로그램을 작성하시오.</p>

### 입력

<p>첫째 줄에 승원이가 가지고 있는 미술품의 개수 N (2 &le; N &le; 500,000)이 주어진다.</p>

<p>둘째 줄부터 N개의 줄에 미술품의 크기 A<sub>i</sub>와 가치 B<sub>i</sub>가 1번 미술품 부터 순서대로 주어진다. (1 &le; A<sub>i</sub> &le; 1,000,000,000,000,000 = 10<sup>15</sup>, 1 &le; B<sub>i</sub> &le; 1,000,000,000)</p>

### 출력

<p>첫째 줄에&nbsp; S &minus; (A<sub>max</sub> &minus; A<sub>min</sub>) 의 최댓값을 출력한다.</p>

### 힌트

<p>예제 1의 경우에 승원이는 3개의 미술품을 가지고 있고, 크기와 가치는 다음과 같다.</p>

<ul>
	<li>1번 미술품의 크기는 2, 가치는 3.</li>
	<li>2번 미술품의 크기는 11, 가치는 2.</li>
	<li>3번 미술품의 크기는 4, 가치는 5</li>
</ul>

<p>이때는, 1번과 3번을 전시하면&nbsp;S &minus; (A<sub>max</sub> &minus; A<sub>min</sub>) = 6가 되고, 가장 큰 값이다.</p>

<ul>
	<li>크기가 가장 큰 미술품은 3번이다. 따라서, A<sub>max</sub> = 4.</li>
	<li>크기가 가장 작은 미술품은 1번이다. 따라서,&nbsp;A<sub>min</sub> = 2.</li>
	<li>전시할 미술품 가치의 합은&nbsp;3 + 5 = 8 이다.</li>
</ul>

<p>따라서,&nbsp;S = 8 이고,&nbsp; S &minus; (A<sub>max</sub> &minus; A<sub>min</sub>) 는 6이다.</p>