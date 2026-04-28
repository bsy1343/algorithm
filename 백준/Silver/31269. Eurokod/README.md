# [Silver V] Eurokod - 31269

[문제 링크](https://www.acmicpc.net/problem/31269)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 68, 정답: 55, 맞힌 사람: 53, 정답 비율: 82.812%

### 분류

구현, 정렬

### 문제 설명

<p>This year, for the first time, the <em>Eurokod</em> is being held, an international competition in writing beautiful and readable code!</p>

<p>There are $n$ contestants participating in the competition, labeled with numbers from $1$ to $n$, and each of them has written a code.</p>

<p>Their codes are evaluated by an association of computer scientists. The association consists of a president and members of the association. The president awards points to codes in one way, and the members of the association award points in another way.</p>

<p><strong>President&rsquo;s points:</strong></p>

<p>The president will rank the codes from the most beautiful to the least beautiful (in his opinion). The first code will be awarded $n$ points, and each subsequent code will be awarded one point less than the previous one.</p>

<p><strong>Members of the association&rsquo;s points:</strong></p>

<p>Each member of the association will vote for the code he considers the most beautiful. After each member of the association has voted, the codes will be ranked in descending order according to the number of votes they received from the members of the association. The first code (the one with the most votes) will be awarded $n$ points, and each subsequent code will be awarded one point less than the previous one.</p>

<p><strong>Total points:</strong></p>

<p>The total number of points for each code is equal to the sum of the points awarded by the president and the number of points awarded by the members of the association.</p>

<p>Your task is to print the order of codes in descending order according to the number of points.</p>

<p>If more codes have the same number of points, then the better ranked one is the one that has won more points from the members of the association.</p>

### 입력

<p>The first line contains an integer $n$ ($1 &le; n &le; 50$), the number of contestants.</p>

<p>The second line contains $n$ integers $a_i$ ($1 &le; a_i &le; n$), where the $i$-th integer represents the label of the code that the president ranked $i$-th. The ranking of the president is given in the order from the most beautiful to the least beautiful, it contains all the labels from $1$ to $n$ exactly once.</p>

<p>The third line contains $n$ integers $b_i$ ($0 &le; b_i &le; 200$), where the $i$-th integer represents the number of <strong>votes</strong> that the $i$-th code received from the members of the association. There won&rsquo;t be two codes that received the same number of votes.</p>

### 출력

<p>In $n$ lines, print the ranking of codes in descending order according to the number of points.</p>

<p>Each line should be in the form &quot;<code>[rank]. Kod[label] ([number of points])</code>&quot;, where <code>[rank]</code> is the rank of the code in the ranking, <code>[label]</code> is the label of the code written in two-digit form with leading zeros, and <code>[number of points]</code> is the number of points that the code won.</p>

<p>For example, if the first place was won by the code with the label $3$ with $12$ points, then the first line is &quot;<code>1. Kod03 (12)</code>&quot;.</p>

### 힌트

<p>Clarification of the first example: <code>Kod03</code> and <code>Kod02</code> have the same number of points, but <code>Kod03</code> has more votes from the members of the association, so it is better ranked.</p>

<p>Clarification of the second example: The president ranked the <code>Kod05</code> as the most beautiful, so it won $n = 5$ points.</p>