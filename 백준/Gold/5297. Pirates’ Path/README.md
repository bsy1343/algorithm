# [Gold III] Pirates’ Path - 5297

[문제 링크](https://www.acmicpc.net/problem/5297)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 21, 정답: 9, 맞힌 사람: 9, 정답 비율: 47.368%

### 분류

그래프 이론, 그래프 탐색, 최단 경로, 데이크스트라, 0-1 너비 우선 탐색

### 문제 설명

<p>Our captain Jack Sparrow is again on the natives&rsquo; island where again the natives think he is a God. But Captain Jack ain&rsquo;t giving in easily (especially when his life is at stake) and is trying to escape. The island is divided into different areas separated from one another by the many rivers abundant on the island. Two areas are adjacent if they are connected through a bridge. Of course captain Jack has to make it from the area where he&rsquo;s been kept in captivity to the area where the Black Pearl, his dear ship, is located. Quite unfortunately, the natives are very eager to keep their &ldquo;God&rdquo; on the island so they have decided that they will guard some selection of the bridges by putting one man on each selected bridge. Now, our captain, being as unwilling as he is to spend any extra effort whatsoever on a job (as well as desirous of being merciful to his devotees), would like to incapacitate as few natives as possible on his way back. WARNING: Jack needs to make his decision QUICKLY!</p>

### 입력

<p>Input consists of b + 1 lines where b is the number of bridges on the island. The first line contains 4 numbers separated by a single space:</p>

<p>n b s e</p>

<p>n is the number of areas on the island, b is the number of bridges, s (where 0 &le; s&lt;n) is the area where Captain Jack is being held and e (where 0 &le; e&lt;n) is the area where the Black Pearl is located.</p>

<p>Each of the next b lines describes a bridge. The line will contain 3 numbers separated by a single space:</p>

<p>a b c</p>

<p>a and b, 0 &le; a, b &lt; n are the areas connected by the bridge described by the line and c is a bit, either 0 or 1, indicating whether the bridge is being guarded by a man or not. If it is being guarded, only one man will be a guard.</p>

### 출력

<p>Note that there may not be a path from the area where Captain Jack is being kept to the area of the Black Pearl. If this is the case, output should be a single line containing the following (quotes for clarity):</p>

<p>&ldquo;It&rsquo;s over with Captain Jack. At least till Pirates of the Caribbean 3.&rdquo;</p>

<p>In case there is a path to the Black Pearl, output should be a single line containing (quotes for clarity):</p>

<p>&ldquo;x native(s) on the easiest way for Captain Jack.&rdquo;</p>

<p>where x should be replaced by the least number of natives guarding bridges on a path from the starting area to the area of the Black Pearl.</p>