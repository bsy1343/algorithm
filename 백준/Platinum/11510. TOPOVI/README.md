# [Platinum II] TOPOVI - 11510

[문제 링크](https://www.acmicpc.net/problem/11510)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 64 MB

### 통계

제출: 107, 정답: 53, 맞힌 사람: 43, 정답 비율: 50.588%

### 분류

구현, 자료 구조, 집합과 맵, 해시를 사용한 집합과 맵

### 문제 설명

<p>Mirko is a huge fan of chess and programming, but typical chess soon became boring for him, so he started having fun with rook pieces.</p>

<p>He found a chessboard with N rows and N columns and placed K rooks on it.</p>

<p>Mirko&rsquo;s game is made of the following rules:</p>

<ol>
	<li>Each rook&rsquo;s power is determined by an integer.</li>
	<li>A rook sees all the fields that are in his row or column except its own field.</li>
	<li>We say that a field is attacked if the binary XOR of all the powers of the rooks that see the field is greater than 0.</li>
</ol>

<p>Notice that the field a rook is at can be attacked or not.</p>

<p>Initially, Mirko placed the rooks in a certain layout on the board and will make P moves. After each move, determine how many fields are attacked.</p>

<p>Every rook can be moved to any free field on the whole board (not only across column and row).</p>

### 입력

<p>The first line of input contains integers N, K, P (1 &le; N &le; 1 000 000 000, 1 &le; K &le; 100 000, 1 &le; P &le; 100 000).</p>

<p>Each of the following K lines contains three integers R, C, X (1 &le; R, C &le; N, 1 &le; X &le; 1 000 000 000) which denote that initially there is a rook of power X on the field (R, C).</p>

<p>Each of the following P lines contains four integers R1, C1, R2, C2 (1 &le; R1, C1, R2, C2 &le; N) which denote that the rook has moved from field (R1, C1) to field (R2, C2).</p>

<p>It is guaranteed that there will not be two rooks on one field at any point.&nbsp;</p>

### 출력

<p>The output must consist of P lines, the kth line containing the total number of attacked fields after k moves.</p>

### 힌트

<p>Clarification of the first example: After the first move, every field on the board is attacked. For example, field (1, 1) is seen by only one rook so the total XOR for that field is 1. After the second move none of the fields are attacked. For example, field (1,1) is seen by both rooks so the total XOR for that field is 0.</p>