# [Gold III] K번째 음식 찾기 2 - 23792

[문제 링크](https://www.acmicpc.net/problem/23792)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 462, 정답: 179, 맞힌 사람: 155, 정답 비율: 41.892%

### 분류

이분 탐색, 매개 변수 탐색

### 문제 설명

<p>서준이는 한식,&nbsp;양식, 중식을 매우 좋아한다. 어느 날 아빠는 배고픈 서준이에게 한식 N개, 양식 N개, 중식 N개를&nbsp;주었다. 서준이는 모든 음식을 먹고 나서 각각의 음식&nbsp;맛을 매겼다. 음식의 맛은 2<sup>31&nbsp;</sup>&minus; 1보다 작거나 같은 자연수이며 값이 작을수록 더 맛있는 음식이다.</p>

<p>아빠는 한식[1..x], 양식[1..y], 중식[1..z]중에 k번째로 맛있는 음식을 찾는 질의를 서준이에게 주었는데 너무 배부른 서준이는 잠이 들고 말았다. 서준이를 대신하여 질의의&nbsp;정답을 출력하자.</p>

### 입력

<p>첫째 줄에 음식의 수 N이 주어진다.</p>

<p>다음 줄에 N개 한식의 맛 A<sub>x</sub>&nbsp;(1 &le; x &le; N)가 오름차순으로&nbsp;주어진다.</p>

<p>다음&nbsp;줄에 N개 양식의 맛 B<sub>y&nbsp;</sub>(1 &le; y&nbsp;&le; N)가&nbsp;오름차순으로 주어진다.</p>

<p>다음&nbsp;줄에 N개 중식의 맛 C<sub>z</sub>&nbsp;(1 &le; z&nbsp;&le; N)가 오름차순으로 주어진다.</p>

<p>다음 줄에 질의의 개수 Q가 주어진다. 다음 Q개의 줄에 각각의 질의 <code>x y z k</code>가 주어진다. (1 &le; k &le; x + y + z)</p>

### 출력

<p>Q개의 줄에 각각의 질의 정답을 출력하자. 각각의 질의 정답은&nbsp;음식의 종류(한식&nbsp;1, 양식&nbsp;2, 중식 3)와 음식의 번호를 빈칸을 사이에 두고 출력한다.</p>

### 제한

<ul>
	<li>1 &le; N &le; 100,000</li>
	<li>1 &le;&nbsp;A<sub>x</sub>&nbsp;&le; 2<sup>31&nbsp;</sup>&minus; 1</li>
	<li>1 &le;&nbsp;B<sub>y</sub>&nbsp;&le; 2<sup>31&nbsp;</sup>&minus; 1</li>
	<li>1 &le;&nbsp;C<sub>z</sub>&nbsp;&le; 2<sup>31&nbsp;</sup>&minus; 1</li>
	<li>1 &le; Q &le; 100,000</li>
	<li>3N개&nbsp;음식의 맛은 모두 서로 다르다.</li>
</ul>