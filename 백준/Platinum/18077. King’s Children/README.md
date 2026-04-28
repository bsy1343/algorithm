# [Platinum II] King’s Children - 18077

[문제 링크](https://www.acmicpc.net/problem/18077)

### 성능 요약

시간 제한: 2 초 (추가 시간 없음), 메모리 제한: 512 MB

### 통계

제출: 51, 정답: 19, 맞힌 사람: 19, 정답 비율: 46.341%

### 분류

해 구성하기, 분할 정복, 구현

### 문제 설명

<p>The King of Byteland has decided to divide the country into provinces, one for each of his children.</p>

<p>The map of Byteland is a rectangular matrix consisting of n rows and m columns. Each king&rsquo;s child has a castle, located in one of the cells of the matrix (each cell contains at most one castle). King wants to split the Byteland in the following way:</p>

<ul>
	<li>Each province must be a rectangle.</li>
	<li>Each cell of the Byteland territory must belong to exactly one province.</li>
	<li>Each province must contain the castle of exactly one king&rsquo;s child, the owner of this province.</li>
</ul>

<p>The king loves all his children, but one of them is his favorite. The king wants to split the kingdom in such a way that the area of the province that belongs to his favorite child is as large as possible. Can you help him to solve this tricky task?</p>

### 입력

<p>The first line of the input contains two integers n and m (1 &le; n, m &le; 1000). The following n lines contain m characters each. Each character represents one cell of the matrix. Character &lsquo;.&rsquo; represents an empty cell, uppercase letters from &lsquo;A&rsquo; to &lsquo;Z&rsquo; represent the castles. Letter &lsquo;A&rsquo; corresponds to the castle of the king&rsquo;s favorite child.</p>

<p>All letters are different. There is exactly one letter &lsquo;A&rsquo;.</p>

### 출력

<p>Output the same matrix, replacing each character &lsquo;.&rsquo; with the lowercase letter, corresponding to the owner of the province containing this cell.</p>