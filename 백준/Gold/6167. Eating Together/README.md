# [Gold III] Eating Together - 6167

[문제 링크](https://www.acmicpc.net/problem/6167)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 198, 정답: 107, 맞힌 사람: 87, 정답 비율: 58.784%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>The cows are so very silly about their dinner partners. They have organized themselves into three groups (conveniently numbered 1, 2, and 3) that insist upon dining together. The trouble starts when they line up at the barn to enter the feeding area.</p>

<p>Each cow i carries with her a small card upon which is engraved D_i (1 &lt;= D_i &lt;= 3) indicating her dining group membership. The entire set of N (1 &lt;= N &lt;= 30,000) cows has lined up for dinner but it&#39;s easy for anyone to see that they are not grouped by their dinner-partner cards.</p>

<p>FJ&#39;s job is not so difficult. &nbsp;He just walks down the line of cows changing their dinner partner assignment by marking out the old number and writing in a new one. By doing so, he creates groups of cows like 111222333 or 333222111 where the cows&#39; dining groups are sorted in either ascending or descending order by their dinner cards.</p>

<p>FJ is just as lazy as the next fellow. He&#39;s curious: what is the absolute mminimum number of cards he must change to create a proper grouping of dining partners? He must only change card numbers and must not rearrange the cows standing in line.</p>

### 입력

<ul>
	<li>Line 1: A single integer: N</li>
	<li>Lines 2..N+1: Line i describes the i-th cow&#39;s current dining group with a single integer: D_i</li>
</ul>

<p>&nbsp;</p>

### 출력

<ul>
	<li>Line 1: A single integer representing the minimum number of changes that must be made so that the final sequence of cows is sorted in either ascending or descending order</li>
</ul>

<p>&nbsp;</p>