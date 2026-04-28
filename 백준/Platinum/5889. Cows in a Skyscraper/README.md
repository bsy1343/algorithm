# [Platinum II] Cows in a Skyscraper - 5889

[문제 링크](https://www.acmicpc.net/problem/5889)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 130, 정답: 45, 맞힌 사람: 35, 정답 비율: 33.654%

### 분류

비트마스킹, 다이나믹 프로그래밍, 비트필드를 이용한 다이나믹 프로그래밍

### 문제 설명

<p>A little known fact about Bessie and friends is that they love stair climbing races. A better known fact is that cows really don&#39;t like going down stairs. So after the cows finish racing to the top of their favorite skyscraper, they had a problem. Refusing to climb back down using the stairs, the cows are forced to use the elevator in order to get back to the ground floor.</p>

<p>The elevator has a maximum weight capacity of W (1 &lt;= W &lt;= 100,000,000) pounds and cow i weighs C_i (1 &lt;= C_i &lt;= W) pounds. Please help Bessie figure out how to get all the N (1 &lt;= N &lt;= 18) of the cows to the ground floor using the least number of elevator rides. The sum of the weights of the cows on each elevator ride must be no larger than W.</p>

### 입력

<ul>
	<li>Line 1: N and W separated by a space.</li>
	<li>Lines 2..1+N: Line i+1 contains the integer C_i, giving the weight of one of the cows.</li>
</ul>

### 출력

<ul>
	<li>Line 1: A single integer, R, indicating the minimum number of elevator rides needed.</li>
	<li>Lines 2..1+R: Each line describes the set of cows taking one of the R trips down the elevator. Each line starts with an integer giving the number of cows in the set, followed by the indices of the individual cows in the set.</li>
</ul>

### 힌트

<h4>Input Details</h4>

<p>There are four cows weighing 5, 6, 3, and 7 pounds. The elevator has a maximum weight capacity of 10 pounds.</p>

<h4>Output Details</h4>

<p>We can put the cow weighing 3 on the same elevator as any other cow but the other three cows are too heavy to be combined. For the solution above, elevator ride 1 involves cow #1 and #3, elevator ride 2 involves cow #2, and elevator ride 3 involves cow #4. Several other solutions are possible for this input.</p>