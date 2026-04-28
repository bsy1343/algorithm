# [Platinum I] The Gardener of Seville (Large) - 14360

[문제 링크](https://www.acmicpc.net/problem/14360)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 51, 정답: 15, 맞힌 사람: 12, 정답 비율: 27.907%

### 분류

애드 혹, 그리디 알고리즘, 구현, 시뮬레이션

### 문제 설명

<p>You are the Gardener of Seville, a minor character in an opera. The setting for the opera is a courtyard which is a rectangle of unit cells, with&nbsp;R&nbsp;rows and&nbsp;C&nbsp;columns. You have been asked to install a maze of hedges in the courtyard: every cell must contain a hedge that runs diagonally from one corner to another. For any cell, there are two possible kinds of hedge: lower left to upper right, which we represent with&nbsp;<code>/</code>, and upper left to lower right, which we represent with&nbsp;<code>\</code>. Wherever two hedges touch, they form a continuous wall.</p>

<p>Around the courtyard is an outer ring of unit cells, one cell wide, with the four corners missing. Each of these outer cells is the home of a courtier. The courtiers in these outer cells are numbered clockwise, starting with 1 for the leftmost of the cells in the top row, and ending with 2 * (R&nbsp;+&nbsp;C) for the topmost cell in the left column. For example, for&nbsp;R&nbsp;= 2,&nbsp;C&nbsp;= 2, the numbering in the outer ring looks like this. (Note that no hedges have been added yet.)</p>

<p><code>&nbsp;12&nbsp;<br />
8&nbsp;&nbsp;3<br />
7&nbsp;&nbsp;4<br />
&nbsp;65&nbsp;</code></p>

<p>In this unusual opera, love is mutual and exclusive: each courtier loves exactly one other courtier, who reciprocally loves only them. Each courtier wants to be able to sneak through the hedge maze to his or her lover without encountering any other courtiers. That is, any two courtiers in love with each other must be connected by a path through the maze that is separated from every other path by hedge walls. It is fine if there are parts of the maze that are not part of any courtier&#39;s path, as long as all of the pairs of lovers are connected.</p>

<p>Given a list of who loves who, can you construct the hedge maze so that every pair of lovers is connected, or determine that this is&nbsp;<code>IMPOSSIBLE</code>?</p>

### 입력

<p>The first line of the input gives the number of test cases,&nbsp;T.&nbsp;T&nbsp;test cases follow. Each consists of one line with two integers&nbsp;R&nbsp;and&nbsp;C, followed by another line with a permutation of all of the integers from 1 to 2 * (R&nbsp;+&nbsp;C), inclusive. Each integer is the number of a courtier; the first and second courtiers in the list are in love and must be connected, the third and fourth courtiers in the list are in love and must be connected, and so on.</p>

<p>Limits</p>

<ul>
	<li>1 &le;&nbsp;T&nbsp;&le; 500.</li>
	<li>1 &le;&nbsp;R * C&nbsp;&le; 100.</li>
</ul>

### 출력

<p>For each test case, output one line containing&nbsp;only&nbsp;<code>Case #x:</code>, where&nbsp;<code>x</code>&nbsp;is the test case number (starting from 1). Then, if it is impossible to satisfy the conditions, output one more line with the text&nbsp;<code>IMPOSSIBLE</code>. Otherwise, output&nbsp;R&nbsp;more lines of&nbsp;C&nbsp;characters each, representing a hedge maze that satisfies the conditions, where every character is&nbsp;<code>/</code>&nbsp;or&nbsp;<code>\</code>. You may not leave any cells in the maze blank. If multiple mazes are possible, you may output any one of them.</p>

### 힌트

<p>In Case #3, the following pairs of courtiers are lovers: (8, 1), (4, 5), (2, 3), (7, 6). Here is an illustration of our sample output:</p>

<p><img src="%EB%B0%B1%EC%A4%80/Platinum/14360.%E2%80%85The%E2%80%85Gardener%E2%80%85of%E2%80%85Seville%E2%80%85(Large)/40ed1a24.png" data-original-src="https://onlinejudgeimages.s3.amazonaws.com/problem/14359/%EB%8B%A4%EC%9A%B4%EB%A1%9C%EB%93%9C%20(3).png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></p>

<p>For Case #3, note that this would also be a valid maze:</p>

<p><code>/\<br />
\/</code></p>

<p>In Case #4, the courtyard consists of only one cell, so the courtiers living around it, starting from the top and reading clockwise, are 1, 2, 3, and 4. There are only two possible options to put in the one cell:&nbsp;<code>/</code>&nbsp;or&nbsp;<code>\</code>. The first of these choices would form paths from 1 to 4, and from 2 to 3. The second of these choices would form paths from 1 to 2, and from 3 to 4. However, neither of these helps our lovesick courtiers, since in this case, 1 loves 3 and 2 loves 4. So this case is&nbsp;<code>IMPOSSIBLE</code>, and the opera will be full of unhappy arias!</p>