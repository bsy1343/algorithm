# [Silver II] Bronze Lilypad Pond - 6229

[문제 링크](https://www.acmicpc.net/problem/6229)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 241, 정답: 133, 맞힌 사람: 124, 정답 비율: 55.856%

### 분류

그래프 이론, 그래프 탐색, 너비 우선 탐색

### 문제 설명

<p>Farmer John has installed a beautiful pond for his cows&#39; esthetic enjoyment and exercise. The rectangular pond has been partitioned into square cells of M rows and N columns (1 &lt;= M &lt;= 30; 1 &lt;= N &lt;= 30). Some of the cells have astonishingly sturdy lilypads; others have rocks; the remainder are just beautiful, cool, blue water.</p>

<p>Bessie is practising her ballet moves by jumping from one lilypad to another and is currently located at one of the lilypads (see the input data for the location&#39;s specifier). She wants to travel to another lilypad in the pond by jumping from one lilypad to another. She can jump neither into the water nor onto a rock.</p>

<p>Surprising only to the uninitiated, Bessie&#39;s jumps between lilypads always appear as a sort of chess-knight&#39;s move: move M1 (1 &lt;= M1 &lt;= 30) &#39;squares&#39; in one direction and then M2 (1 &lt;= M2 &lt;= 30; M1 != M2) more in an orthogonal direction (or perhaps M2 in one direction and then M1 in an orthogonal direction). Bessie sometimes might have as many as eight choices for her jump.</p>

<p>Given the pond layout and the format of Bessie&#39;s jumps, determine the smallest number of leaps that Bessie must make to move from her starting location to her final destination, a feat which is always possible for the given test data.</p>

### 입력

<ul>
	<li>Line 1: Four space-separated integers: M, N, M1, and M2</li>
	<li>Lines 2..M+1: Line i+1 describes row i of the pond using N space-separated integers with these values: 0 indicates empty water; 1 indicates a lilypad; 2 indicates a rock; 3 indicates the lilypad Bessie upon which she starts; 4 indicates the lilypad that is Bessie&#39;s destination.</li>
</ul>

<p>&nbsp;</p>

### 출력

<ul>
	<li>Line 1: A single integer that is the minimum number of jumps between lilypads that Bessie must make to travel from her starting place to her destination.</li>
</ul>

### 힌트

<p>Bessie cleverly hops onto the pad at row 1, column 3 on her way to the right hand side.</p>