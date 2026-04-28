# [Gold II] Waffle Choppers - 27748

[문제 링크](https://www.acmicpc.net/problem/27748)

### 성능 요약

시간 제한: 6 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 6, 정답: 5, 맞힌 사람: 5, 정답 비율: 83.333%

### 분류

그리디 알고리즘

### 문제 설명

<p>The diners at the Infinite House of Pancakes have gotten tired of circular pancakes, so the chefs are about to offer a new menu option: waffles! As a publicity stunt, they have made one large waffle that is a grid of square cells with <b>R</b> rows and <b>C</b> columns. Each cell of the waffle is either empty, or contains a single chocolate chip.</p>

<p>Now it is time for the chefs to divide up the waffle among their hungry diners. A <i>horizontal cut</i> runs along the entire gridline between two of the rows; a <i>vertical cut</i> runs along the entire gridline between two of the columns. For efficiency&#39;s sake, one chef will make exactly <b>H</b> different horizontal cuts and another chef will make exactly <b>V</b> different vertical cuts. This will conveniently create one piece for each of the (<b>H</b> + 1) &times; (<b>V</b> + 1) diners. The pieces will not necessarily all be of equal sizes, but that is fine; market research has shown that the diners do not care about that.</p>

<p>What the diners do care about is the number of chocolate chips they get, so each piece must have exactly the same number of chocolate chips. Can you determine whether the chefs can accomplish this goal using the given numbers of horizontal and vertical cuts?</p>

### 입력

<p>The first line of the input gives the number of test cases, <b>T</b>; <b>T</b> test cases follow. Each begins with one line containing four integers <b>R</b>, <b>C</b>, <b>H</b>, and <b>V</b>: the number of rows and columns in the waffle, and the exact numbers of horizontal and vertical cuts that the chefs must make. Then, there are <b>R</b> more lines of <b>C</b> characters each; the j-th character in the i-th of these lines represents the cell in the i-th row and the j-th column of the waffle. Each character is either <code>@</code>, which means the cell has a chocolate chip, or <code>.</code>, which means the cell is empty.</p>

### 출력

<p>For each test case, output one line containing <code>Case #x: y</code>, where <code>x</code> is the test case number (starting from 1) and <code>y</code> is <code>POSSIBLE</code> if the chefs can accomplish the goal as described above, or <code>IMPOSSIBLE</code> if they cannot.</p>

### 제한

<ul>
	<li>1 &le; <b>T</b> &le; 100.</li>
</ul>

### 힌트

<p>Note that the last two sample cases would not appear in test set 1.</p>

<p>In Sample Case #1, one possible strategy is to make the horizontal cut between the second and third rows from the top, and make the vertical cut between the fourth and fifth columns from the left. That creates the following pieces, each of which has exactly two chocolate chips:</p>

<p><code>.@@. .@ .... .@ @.@. @@</code></p>

<p>In Sample Case #2, no matter where you make the horizontal cut and the vertical cut, you will create pieces with unequal numbers of chocolate chips, so the case is impossible.</p>

<p>In Sample Case #3, there are no chocolate chips in the waffle. Any cutting strategy creates pieces which have the same number of chocolate chips (zero), so the diners are happy... but maybe not as happy as they would have been if they had gotten chocolate chips!</p>

<p>In Sample Case #4, just as in Sample Case #2, you cannot succeed regardless of where you make your horizontal cut and your vertical cut.</p>

<p>In Sample Case #5, the chefs can make the only two possible horizontal cuts, and make the two vertical cuts to the right of the first and third columns.</p>

<p>Although Sample Case #6 would be possible for other numbers of horizontal and vertical cuts, remember that you must use exactly <b>H</b> horizontal cuts and exactly <b>V</b> vertical cuts. No matter where you make your one horizontal cut and two vertical cuts, you cannot succeed.</p>