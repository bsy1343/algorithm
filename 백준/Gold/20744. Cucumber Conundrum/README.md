# [Gold IV] Cucumber Conundrum - 20744

[문제 링크](https://www.acmicpc.net/problem/20744)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 26, 정답: 10, 맞힌 사람: 10, 정답 비율: 38.462%

### 분류

기하학, 수학

### 문제 설명

<p>Maj loves pickled cucumber (also known as <em>pickles</em>). However, her partner is not as keen on filling a sandwich with pickles. Maj would like to maximize the amount of pickles on a sandwich, while still avoiding being judged by her partner.</p>

<p>Both Maj&#39;s sandwich and the pickles have a circular shape. The sandwich has radius $s$ cm and the pickles have radius $r$ cm.</p>

<p>Maj has exactly $n$ pickles. She wants to place as many of them as possible on her sandwich, as long as:</p>

<ul>
	<li>at most $z \%$ of the area of the sandwich is covered by pickles.</li>
	<li>no two pickles overlap (but they are allowed to touch).</li>
</ul>

<p>How many pickles can Maj place on her sandwich?</p>

### 입력

<p>The input consists of:</p>

<ul>
	<li>one line with the decimal numbers $s$ and $r$ ($1 \le s \le 10$, $0.5 \le r \le s$, at most $6$ digits after the decimal point), the radius of the sandwich and the radius of a pickle, in centimetres.</li>
	<li>one line with the integers $n$ and $z$ ($1 \le n \le 7$, $0 \le z \le 100$), the number of pickles Maj have, and the maximum area she may cover with them, in percent.</li>
</ul>

### 출력

<p>Output the maximum number of pickles Maj can place on her sandwich. The input will always be constructed such that this number does not change if the radius of the sandwich increases or decreases by $10^{-6}$.</p>