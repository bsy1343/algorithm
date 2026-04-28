# [Platinum III] Luna Likes Love - 22008

[문제 링크](https://www.acmicpc.net/problem/22008)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 63, 정답: 33, 맞힌 사람: 31, 정답 비율: 53.448%

### 분류

자료 구조, 그리디 알고리즘, 세그먼트 트리

### 문제 설명

<p>Luna came up with a wild idea. She lined up her $2n$ friends into a long line and gave each of them an integer number between $1$ and $n$, inclusive. Each number is used exactly twice. Each pair of friends who share the same number forms a couple.</p>

<p>Luna wants to send each of the $n$ couples on a date. However, it is not that straightforward. In order to send a couple on a date, the two friends forming the couple must stand next to each other in the line, i.e., there cannot be anybody else standing between them. There are two possible actions that Luna can take:</p>

<ul>
	<li>She can swap any two friends who stand next to each other in the line.</li>
	<li>If a couple is standing next to each other in the line, Luna can send them on a date. This removes the couple from the line. The remaining friends then shift to fill in the gap in the line.</li>
</ul>

<p>The actions can be performed in any order. E.g., she can make some swaps, then send some pairs of friends on a date, and then go back to making swaps.</p>

<p>Find and report the minimum number of actions needed to send everybody on a date.</p>

### 입력

<p>The first line of the input contains a single integer $n$.</p>

<p>The second line of the input contains $2n$ single-space separated integers $a_i$ ($1 \le a_i \le n$) -- the sequence of numbers received by the friends in the long line, in order.</p>

### 출력

<p>The first and only line of the output contains the minimum number of actions Luna must make in order to send every couple on a date.</p>

### 힌트

<p>In the first sample, Luna could start by swapping the third and the fourth friend. After this swap the line looks as follows: 3 1 1 2 2 3.</p>

<p>Then, she can send the couple with number 1 and the couple with number 2 on a date (in any order). Once she does so, the two friends with number 3 are now adjacent in line and Luna can send them on a date, too.</p>

<p>Overall this solution takes 4 actions: one swap and three dates.</p>