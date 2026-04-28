# [Platinum I] Hidden Pancakes - 22911

[문제 링크](https://www.acmicpc.net/problem/22911)

### 성능 요약

시간 제한: 서브태스크 참고 (추가 시간 없음), 메모리 제한: 1024 MB (추가 메모리 없음)

### 통계

제출: 103, 정답: 59, 맞힌 사람: 54, 정답 비율: 57.447%

### 분류

조합론, 다이나믹 프로그래밍, 트리에서의 다이나믹 프로그래밍, 수학, 트리

### 문제 설명

<p>We are cooking N pancakes in total. We cook one pancake with a 1 centimeter (cm) radius, one with a 2 cm radius, one with a 3 cm radius, ..., and one with an N cm radius, not necessarily in that order. After we cook the first pancake, we just lay it on a plate. After we cook each subsequent pancake, we lay it on top of the previously made pancake, with their centers coinciding. In this way, a pancake is visible from the top of the stack when we first add it. A pancake only becomes hidden if we later cook another pancake with a larger radius.</p>

<p>For example, say we cook 4 pancakes. We first cook the pancake with radius 3 cm, and it is visible. Then, we cook the pancake with radius 1 cm, lay it on top of the first one and both are visible. Third, we cook the pancake with radius 2 cm, and now that covers the previous pancake, but not the first one, so 2 pancakes remain visible in total. Finally, we cook the pancake with radius 4 cm which covers the other pancakes leaving only 1 visible pancake. The picture below illustrates the state of the stack after each pancake is cooked. Within each stack, the fully colored pancakes are visible and the semi-transparent pancakes are not visible.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/baf3db07-084b-4750-b46f-bd0ade5f81a8/-/preview/" style="width: 400px; height: 139px;" /></p>

<p>Let V<sub>i</sub> be the number of visible pancakes when the stack contains exactly i pancakes. In the example above, V<sub>1</sub> = 1, V<sub>2</sub> = 2, V<sub>3</sub> = 2, and V<sub>4</sub> = 1.</p>

<p>Given the list V<sub>1</sub>, V<sub>2</sub>, &hellip;, V<sub>N</sub>, how many of the N! possible cooking orders yield those values? Since the output can be a really big number, we only ask you to output the remainder of dividing the result by the prime 10<sup>9</sup>+7 (1000000007).</p>

### 입력

<p>The first line of the input gives the number of test cases, T. T test cases follow, each described with two lines. The first line of a test case contains a single integer N, the number of pancakes we cook. The second line of a test case contains N integers V<sub>1</sub>, V<sub>2</sub>, ..., V<sub>N</sub>, representing the number of visible pancakes after we cook 1, 2, ..., N pancakes, respectively.</p>

### 출력

<p>For each test case, output one line containing&nbsp;<code>Case #x:&nbsp;y</code>, where&nbsp;<code>x</code>&nbsp;is the test case number (starting from 1) and&nbsp;<code>y</code>&nbsp;is the number of cooking orders of&nbsp;N&nbsp;pancakes that yield the given numbers of visible pancakes after each step, modulo the prime&nbsp;10<sup>9</sup>+7 (1000000007).</p>

### 제한

<ul>
	<li>1 &le; T &le; 100.</li>
	<li>1 &le; V<sub>i</sub> &le; i, for all i.</li>
</ul>