# [Platinum III] Secret - 21829

[문제 링크](https://www.acmicpc.net/problem/21829)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 210, 정답: 57, 맞힌 사람: 49, 정답 비율: 29.697%

### 분류

분할 정복

### 문제 설명

<p>Anna invented a secret binary operation ★. For non-negative integers x, y less than or equal to 1 000 000 000, a non-negative integer x ★ y less than or equal to 1 000 000 000 is determined. This operation ⋆ is associative. Namely, the equality (x ★ y) ★ z = x ★ (y ★ z) holds for non-negative integers x, y, z less than or equal to 1 000 000 000. This value is simply denoted by x ★ y ★ z.</p>

<p>Anna planned to play a game with Bruno. She asked him to guess the operation ★. She showed N integers A<sub>0</sub>, A<sub>1</sub>, . . . , A<sub>N&minus;1</sub> to him. She gave to him a number of queries of the following form: &ldquo;What is the value of A<sub>L</sub> ★ A<sub>L+1</sub> ★ &middot; &middot; &middot; ★ A<sub>R</sub>?&rdquo;</p>

<p>Bruno said it is difficult to play this game without hints. Anna decided to give hints to him. Each hint is given as follows: he will choose x, y to ask the value of x ★ y, and she will tell him the value of x ★ y. He can ask for hints when the integers A<sub>0</sub>, A<sub>1</sub>, . . . , A<sub>N&minus;1</sub> are given in the beginning of the game. He can also ask for hints when she gives a query to him. Of course, he would like to reduce the number of hints. Because he would like to behave as if he knows almost everything about the operation ★, he would especially like to reduce the number of hints after a query is given to him.</p>

<p>Write a program which implements Bruno&rsquo;s strategy to ask for hints and answer Anna&rsquo;s queries correctly.</p>

### 입력

<p>The sample grader reads the following data from the standard input.</p>

<ul>
	<li>The first line contains an integer N, the number of the integers shown by Anna.</li>
	<li>The second line contains space separated integers A<sub>0</sub>, A<sub>1</sub>, . . . , A<sub>N&minus;1</sub>, the integers shown by Anna.</li>
	<li>The third line contains an integer Q, the number of queries given by Anna.</li>
	<li>The (j + 1)-st line (0 &le; j &le; Q &minus; 1) of the following Q lines contains space separated integers L<sub>j</sub> and R<sub>j</sub> (0 &le; L<sub>j</sub> &le; R<sub>j</sub> &le; N &minus; 1). This means, in the (j + 1)-st query, Anna asks the value of A<sub>L<sub>j</sub></sub> ★ A<sub>L<sub>j+1</sub></sub> ★ &middot; &middot; &middot; ★ A<sub>R<sub>j</sub></sub> .</li>
</ul>

### 출력

<p>When the program terminates successfully, the sample grader writes to the <strong>standard output</strong> the values returned by Query one per line. It also writes the following information to the <strong>standard error</strong>.</p>

<ul>
	<li>If your program is considered as <strong>Wrong Answer [1]</strong>, it writes &ldquo;<code>Wrong Answer [1]</code>&rdquo;. (The quotation mark is not written actually.)</li>
	<li>If your program is not considered as <strong>Wrong Answer [1]</strong>, it writes the number of calls to <code>Secret</code> in the procedure Init, and the maximum number of calls to <code>Secret</code> in each call to the procedure Query.</li>
</ul>

### 제한

<ul>
	<li>1 &le; N &le; 1 000.</li>
	<li>0 &le; A<sub>i</sub> &le; 1 000 000 000 (0 &le; i &le; N &minus; 1).</li>
	<li>The number of calls to Query is less than or equal to 10 000.</li>
</ul>