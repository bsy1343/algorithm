# [Platinum IV] Vrsta - 27551

[문제 링크](https://www.acmicpc.net/problem/27551)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 103, 정답: 74, 맞힌 사람: 68, 정답 비율: 74.725%

### 분류

자료 구조, 세그먼트 트리, 이분 탐색, 값 / 좌표 압축

### 문제 설명

<p>Domagoj&rsquo;s favorite school subject is P.E. Every P.E. class starts with warm-up exercises. The teacher has an interesting way of choosing the student who will lead the warm-up. The students stand in a line sorted by their height. The teacher will choose the student that is standing in the middle of the line. If two students are in the middle, he will choose the shorter one. For example: if the students have heights $1$ $3$ $5$ $7$ $11$, the student with height $5$ will lead the warm-up exercises.</p>

<p>Domagoj does not remember how tall his classmates are. Luckily, next to him stands Lovro who is very good at estimating people&rsquo;s heights. He gives Domagoj $n$ statements: &ldquo;<em>There are $a_i$ students entering the gym with height $v_i$</em>&rdquo;. After every statement said by Lovro, Domagoj is interested in the height of the student who will lead the warm-up, if only the students who entered the gym come to P.E. class. Help him answer his questions!</p>

### 입력

<p>The first line contains the integer $n$ ($1 &le; n &le; 200\,000$), the number of Lovro&rsquo;s statements.</p>

<p>The following $n$ lines contain two integers $v_i$, $a_i$ ($1 &le; v_i , a_i &le; 10^9$), the height and the number of students in Lovro&rsquo;s statement.</p>

### 출력

<p>In the $i$-th of $n$ lines output the answer to Domagoj&rsquo;s question after $i$ of Lovro&rsquo;s statements.</p>