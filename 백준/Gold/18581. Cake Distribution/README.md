# [Gold V] Cake Distribution - 18581

[문제 링크](https://www.acmicpc.net/problem/18581)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 20, 정답: 14, 맞힌 사람: 14, 정답 비율: 70.000%

### 분류

수학, 정렬, 정수론, 해 구성하기

### 문제 설명

<p>You are about to have a birthday and you would like to prepare a birthday cake that weighs anywhere between 1 and 10<sup>18</sup> grams inclusive. You know that there will be A, B or C guests at the party. You would like to cut this cake into pieces such that:</p>

<ul>
	<li>The weight of each piece is a positive integer number of grams.</li>
	<li>No matter how many guests arrive, the pieces can be distributed between the guests in such a way that each guest gets the same amount of cake. Note that some guests might get more than one piece.</li>
</ul>

<p>You don&rsquo;t want to spend too much time cutting the cake, so you would like to have at most 5,000 pieces. Let&rsquo;s do it!</p>

### 입력

<p>The only line of input contains the 3 numbers A, B, C, all positive integers not more than 1000.</p>

### 출력

<p>On the first line, output one number K, the number of pieces. On each of the next K lines, output a description of each piece, consisting of 4 numbers, w<sub>i</sub>, a<sub>i</sub>, b<sub>i</sub>, c<sub>i</sub>, where w<sub>i</sub> is the weight of the piece in grams and a<sub>i</sub>, b<sub>i</sub>, c<sub>i</sub> are indices of the person who will get this piece if A, B, or C guests arrive, respectively. The indices should satisfy 1 &le; a<sub>i</sub> &le; A, 1 &le; b<sub>i</sub> &le; B, 1 &le; c<sub>i</sub> &le; C. The sum of all wis must be less than or equal to 10<sup>18</sup>.</p>