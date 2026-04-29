# [Gold I] Transforming Pairs - 33734

[문제 링크](https://www.acmicpc.net/problem/33734)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 2048 MB

### 통계

제출: 85, 정답: 44, 맞힌 사람: 42, 정답 비율: 52.500%

### 분류

수학, 애드 혹, 유클리드 호제법, 정수론

### 문제 설명

<p>Bessie the brilliant bovine has discovered a new fascination—mathematical magic! One day, while trotting through the fields of Farmer John’s ranch, she stumbles upon two enchanted piles of hay. The first pile contains $a$ bales, and the second pile contains $b$ bales ($1\le a,b\le 10^{18}$).</p>

<p>Next to the hay, half-buried in the dirt, she discovers an ancient scroll. As she unfurls it, glowing letters reveal a prophecy:</p>

<p><em>To fulfill the decree of the Great Grasslands, the chosen one must transform these two humble hay piles into exactly $c$ and $d$ bales—no more, no less. </em></p>

<p>Bessie realizes she can only perform the following two spells:</p>

<ul>
	<li>She can magically conjure new bales to increase the first pile’s size by the amount currently in the second pile.</li>
	<li>She can magically conjure new bales to increase the second pile’s size by the amount currently in the first pile.</li>
</ul>

<p>She must perform these operations sequentially, but she can perform them any number of times and in any order. She must reach exactly $c$ bales in the first pile and $d$ bales in the second pile ($1\le c,d\le 10^{18}$).</p>

<p>For each of $T$ ($1\le T\le 10^4$) independent test cases, output the minimum number of operations needed to fulfill the prophecy, or if it is impossible to do so, output -1.</p>

### 입력

<p>The first line contains $T$.</p>

<p>The next $T$ lines each contain four integers $a,b,c,d$.</p>

### 출력

<p>Output $T$ lines, the answer to each test case.</p>