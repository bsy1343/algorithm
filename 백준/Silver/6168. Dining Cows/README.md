# [Silver IV] Dining Cows - 6168

[문제 링크](https://www.acmicpc.net/problem/6168)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 530, 정답: 232, 맞힌 사람: 195, 정답 비율: 48.750%

### 분류

브루트포스 알고리즘, 누적 합

### 문제 설명

<p>The cows are so very silly about their dinner partners. They have organized themselves into two groups (conveniently numbered 1 and 2) that insist upon dining together in order, with group 1 at the beginning of the line and group 2 at the end. The trouble starts when they line up at the barn to enter the feeding area.</p>

<p>Each cow i carries with her a small card upon which is engraved D_i (1 &lt;= D_i &lt;= 2) indicating her dining group membership. The entire set of N (1 &lt;= N &lt;= 30,000) cows has lined up for dinner but it&#39;s easy for anyone to see that they are not grouped by their dinner-partner cards.</p>

<p>FJ&#39;s job is not so difficult. &nbsp;He just walks down the line of cows changing their dinner partner assignment by marking out the old number and writing in a new one. By doing so, he creates groups of cows like 112222 or 111122 where the cows&#39; dining groups are sorted in ascending order by their dinner cards. Rarely he might change cards so that only one group of cows is left (e.g., 1111 or 222).</p>

<p>FJ is just as lazy as the next fellow. He&#39;s curious: what is the absolute minimum number of cards he must change to create a proper grouping of dining partners? He must only change card numbers and must not rearrange the cows standing in line.</p>

### 입력

<ul>
	<li>Line 1: A single integer: N</li>
	<li>Lines 2..N+1: Line i+1 describes cow i&#39;s dining preference with a single integer: D_i</li>
</ul>

<p>&nbsp;</p>

### 출력

<ul>
	<li>Line 1: A single integer that is the minimum number of cards Farmer John must change to assign the cows to eating groups as described.</li>
</ul>

<p>&nbsp;</p>