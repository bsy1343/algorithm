# [Platinum V] Guarding the Border - 11128

[문제 링크](https://www.acmicpc.net/problem/11128)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 256 MB

### 통계

제출: 33, 정답: 16, 맞힌 사람: 16, 정답 비율: 48.485%

### 분류

자료 구조, 그리디 알고리즘, 매개 변수 탐색, 우선순위 큐

### 문제 설명

<p>As newly appointed Chief of Security, you have decided that it&rsquo;s time to upgrade the border defense. There have been rumors of some neighboring countries developing nuclear weapons, so a few extra archer towers will be needed. In order to spot the miscreants when they approach, you would like to minimize the maximal distance between adjacent towers.</p>

<p>The border is modeled as a cyclic straight line from 0 to L, with N (old) towers placed along it. The country is an inland country, so the first and last towers are neighboring as well (consider points 0 and L to be the same). You have enough finances to place up to M new towers along the border. Find the lowest possible maximal distance between adjacent towers after the placement.</p>

### 입력

<p>The first line of input contains a single number T, the number of test cases. Then follow T lines, each describing a test case. Each test case starts with three integers N, M and L. N is the amount of towers already present at the border, M is the maximum amount of new towers you are allowed to place and L is the length of the border. Then follow N floating-point numbers t<sub>i</sub> describing the locations of the current towers.</p>

<ul>
	<li>0 &lt; T &le; 100</li>
	<li>0 &le; N &le; 20000</li>
	<li>0 &lt; M &le; 20000</li>
	<li>0 &lt; L &le; 10000000</li>
	<li>0 &le; t<sub>i</sub> &lt; L</li>
	<li>No two towers are located at the exact same location.</li>
	<li>An absolute or relative error of up to 10<sup>&minus;7</sup> compared to the correct answer will be accepted for the distances.</li>
</ul>

### 출력

<p>For each test case, output one line containing a single number, the lowest possible maximal distance between adjacent towers after the placement.</p>