# [Platinum III] Acceptable Seating Arrangements - 31507

[문제 링크](https://www.acmicpc.net/problem/31507)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 2048 MB

### 통계

제출: 32, 정답: 16, 맞힌 사람: 16, 정답 비율: 57.143%

### 분류

해 구성하기, 구현

### 문제 설명

<p>Charlie is managing a classroom. The seats in the classroom are arranged in a grid with rows and columns. Each student has a distinct height.</p>

<p>A configuration of students to seats is <em>acceptable</em> if the following conditions are met:</p>

<ul>
	<li>Each student is assigned to exactly one seat.</li>
	<li>The students are seated in increasing order of height from left to right in each row.</li>
</ul>

<p>The students are initially seated in an acceptable arrangement. Charlie wants to rearrange students into a potentially different acceptable arrangement. To do this, he can swap any two students. However, he wants to ensure that the configuration stays acceptable after each swap.</p>

<p>Help Charlie devise a strategy to move the students from the original arrangement to his preferred arrangement. You don&#39;t need to minimize the number of swaps, but you are limited to at most $10^4$ swaps.</p>

<p>It can be proven that this is always possible for all possible inputs that satisfy the input constraints.</p>

### 입력

<p>The first line of input contains two integers $r$ and $c$ ($1 \le r,c \le 20$). Charlie&#39;s classroom has $r$ rows and $c$ columns of seats.</p>

<p>Each of the next $r$ lines contains $c$ integers $h$ ($1 \le h \le r \cdot c$), representing the heights of the students in each row in the original arrangement. The heights are guaranteed to be distinct, and the arrangement is guaranteed to be acceptable.</p>

<p>Each of the next $r$ lines contains $c$ integers $h$ ($1 \le h \le r \cdot c$), representing the heights of the students in each row in Charlie&#39;s desired arrangement. The heights are guaranteed to be distinct, and the arrangement is guaranteed to be acceptable.</p>

### 출력

<p>On the first line, output an integer $k$, which is the number of swaps to perform ($0 \le k \le 10^4$).</p>

<p>Then, output the $k$ swaps which change the original arrangement to Charlie&#39;s preferred arrangement. On each of the next $k$ subsequent lines, output four integers $r_1, c_1, r_2, c_2$ ($1 \le r_1, r_2 \le r$, $1 \le c_1, c_2 \le c$, $(r_1, c_1) \ne (r_2, c_2)$). This represents a swap of the student in row $r_1$, column $c_1$ with the student in row $r_2$, column $c_2$.</p>

<p>It can be proven that it&#39;s always possible to accomplish this in under $10^4$ swaps for all possible inputs that satisfy the input constraints. Remember that the arrangement must be acceptable after each swap.</p>