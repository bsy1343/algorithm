# [Platinum V] Combining Riceballs - 14045

[문제 링크](https://www.acmicpc.net/problem/14045)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 49, 정답: 26, 맞힌 사람: 20, 정답 비율: 64.516%

### 분류

다이나믹 프로그래밍, 두 포인터

### 문제 설명

<p>Alphonse has N rice balls of various sizes in a row. He wants to form the largest rice ball possible for his friend to eat. Alphonse can perform the following operations:</p>

<ul>
	<li>If two <strong>adjacent</strong> rice balls have the same size, Alphonse can combine them to make a new rice ball. The new rice ball&rsquo;s size is the sum of the two old rice balls&rsquo; sizes. It occupies the position in the row previously occupied by the two old rice balls.</li>
	<li>If two rice balls have the same size, and there is <strong>exactly one rice ball between them</strong>, Alphonse can combine all three rice balls to make a new rice ball. (The middle rice ball does not need to have the same size as the other two.) The new rice ball&rsquo;s size is the sum of the three old rice balls&rsquo; sizes. It occupies the position in the row previously occupied by the three old rice balls.</li>
</ul>

<p>Alphonse can perform each operation as many times as he wants.</p>

<p>Determine the size of the largest rice ball in the row after performing 0 or more operations.</p>

### 입력

<p>The first line will contain the integer, N (1 &le; N &le; 400).</p>

<p>The next line will contain N space separated integers representing the sizes of the riceballs, in order from left to right. Each integer is at least 1 and at most 1 000 000.</p>

### 출력

<p>Output the size of the largest riceball Alphonse can form.</p>