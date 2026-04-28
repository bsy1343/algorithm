# [Platinum II] Pack the Slopes - 27819

[문제 링크](https://www.acmicpc.net/problem/27819)

### 성능 요약

시간 제한: 30 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 12, 정답: 8, 맞힌 사람: 8, 정답 비율: 72.727%

### 분류

자료 구조, 그리디 알고리즘, Heavy-light 분할, 느리게 갱신되는 세그먼트 트리, 세그먼트 트리, 트리

### 문제 설명

<p>You are trying to organize a group of skiers. The skiers are taking a trip to a large mountain, which has been rented for the day.</p>

<p>There are <b>N</b> rest points numbered from 1 to <b>N</b> on the mountain, and they are connected by <b>N</b>-1 slopes. Each slope starts at some rest point and goes directly to another rest point, with no intermediate slopes or rest points. A slope can be traversed in only one direction.</p>

<p>Each skier starts at the summit rest point and traverses a slope to reach another rest point. From there, the skier can traverse another slope to reach another rest point, and so on. Once a skier reaches their destination rest point, they stop skiing for the day and head to the ski lodge for hot cocoa. The destination rest point cannot be the summit rest point. However, notice that a skier&#39;s destination rest point can be the start of zero or more slopes; that is, a skier does not necessarily have to keep using available slopes until there are none available: they can always walk carefully down the rest of the mountain! For all rest points, there is exactly one sequence of slopes that a skier can use to reach it from the summit rest point.</p>

<p>Each slope can accommodate only a certain total number of skiers in a day, after which the snow gets too choppy to ski. In addition, the ski resort can charge or reward each skier for each slope that they ski on. Each slope may have a different price, and each skier must pay the price for each slope they ski on. A slope&#39;s price can be positive, zero, or even negative; a negative price represents a bounty awarded for testing that slope. As the organizer, you pay all the slope prices and collect all the bounties on behalf of your group of skiers. Notice that if multiple skiers use the same slope, you pay that slope&#39;s price or collect the slope&#39;s bounty multiple times. The sum of all costs you pay minus the sum of all bounties you collect is the total expense for the trip. The expense can be positive, zero, or negative. A negative expense means that you actually made money on the trip!</p>

<p>As the organizer, you want to figure out the maximum number of skiers that you can put on the mountain. Also, you would like to figure out the minimum possible expense for a trip with that maximum number of skiers.</p>

### 입력

<p>The first line of the input gives the number of test cases, <b>T</b>. <b>T</b> test cases follow. The first line of a test case contains a single integer <b>N</b>: the number of rest points on the mountain.</p>

<p>Each of the final <b>N</b>-1 lines of a test case describes a slope via four integers <b>U<sub>i</sub></b>, <b>V<sub>i</sub></b>, <b>S<sub>i</sub></b>, and <b>C<sub>i</sub></b>. These are the slope&#39;s starting rest point, the slope&#39;s ending rest point, the maximum number of skiers the slope can accommodate, and the slope&#39;s price per skier, respectively.</p>

<p>The summit rest point where the skiers start from is always numbered 1.</p>

### 출력

<p>For each test case, output one line containing <code>Case #x: y z</code>, where <code>x</code> is the test case number (starting from 1), <code>y</code> is the maximum number of skiers, and <code>z</code> is the minimum expense for having <code>y</code> skiers ski at least one slope each.</p>

### 제한

<ul>
	<li>1 &le; <b>U<sub>i</sub></b> &le; <b>N</b>, for all i.</li>
	<li>2 &le; <b>V<sub>i</sub></b> &le; <b>N</b>, for all i. (No slope can end at the summit rest point.)</li>
	<li><b>U<sub>i</sub></b> &ne; <b>V<sub>i</sub></b>, for all i.</li>
	<li>1 &le; <b>S<sub>i</sub></b> &le; 10<sup>5</sup>, for all i.</li>
	<li>-10<sup>5</sup> &le; <b>C<sub>i</sub></b> &le; 10<sup>5</sup>, for all i.</li>
	<li>There is exactly one sequence of slopes that a skier can use to reach rest point r from the summit rest point, for all r.</li>
</ul>

### 힌트

<p>In Sample Case #1, we can send one skier to rest point 4, one skier to rest point 3, and two skiers to rest point 2.</p>

<p>In Sample Case #2, we can send three skiers to rest point 2, two skiers to rest point 5, and two skiers to rest point 4.</p>

<p>Notice that the first slope listed in a test case does not need to start at the summit rest point, and that slopes can have <b>U<sub>i</sub></b> &gt; <b>V<sub>i</sub></b>.</p>