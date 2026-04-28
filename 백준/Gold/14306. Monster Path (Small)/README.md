# [Gold V] Monster Path (Small) - 14306

[문제 링크](https://www.acmicpc.net/problem/14306)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 37, 정답: 21, 맞힌 사람: 18, 정답 비율: 60.000%

### 분류

백트래킹, 브루트포스 알고리즘, 깊이 우선 탐색, 그래프 이론, 그래프 탐색, 수학, 확률론

### 문제 설명

<p>Codejamon is a mobile game in which monster trainers walk around in the real world to catch monsters. You have an old smartphone with a short battery life, so you need to choose your path carefully to catch as many monsters as possible.</p>

<p>Suppose the Codejamon world is a rectangular grid with&nbsp;R&nbsp;rows and&nbsp;C&nbsp;columns. Rows are numbered from top to bottom, starting from 0; columns are numbered from left to right, starting from 0. You start in the cell in the&nbsp;R<sub>s</sub>th row and the&nbsp;C<sub>s</sub>th column. You will take a total of&nbsp;S&nbsp;unit steps; each step must be to a cell sharing an edge (not just a corner) with your current cell.</p>

<p>Whenever you take a step into a cell in which you have not already caught a monster, you will catch the monster in that cell with probability&nbsp;P&nbsp;if the cell has a monster attractor, or&nbsp;Q&nbsp;otherwise. If you do catch the monster in a cell, it goes away, and you cannot catch any more monsters in that cell, even on future visits. If you do not catch the monster in a cell, you may still try to catch the monster on a future visit to that cell. The starting cell is special: you have no chance of catching a monster there before taking your first step.</p>

<p>If you plan your path optimally before making any move, what is the maximum possible expected number of monsters that you will be able to catch?</p>

<p>The battery can only support limited steps, so hurry up!</p>

### 입력

<p>The first line of the input gives the number of test cases,&nbsp;T.&nbsp;T&nbsp;test cases follow.</p>

<p>Each test case starts with a line of five integers:&nbsp;R,&nbsp;C,&nbsp;R<sub>s</sub>,&nbsp;C<sub>s</sub>&nbsp;and&nbsp;S.&nbsp;R&nbsp;and&nbsp;C&nbsp;are the numbers of rows and columns in the grid;&nbsp;R<sub>s</sub>&nbsp;and&nbsp;C<sub>s</sub><br />
are the numbers of the row and column of your starting position, and&nbsp;S&nbsp;is the number of steps you are allowed to take.</p>

<p>The next line contains two decimals&nbsp;P&nbsp;and&nbsp;Q, where&nbsp;P&nbsp;is the probability of meeting a monster in cells with a monster attractor, and&nbsp;Q&nbsp;is the probability of meeting a monster in cells without a monster attractor.&nbsp;P&nbsp;and&nbsp;Q&nbsp;are each given to exactly four decimal places.</p>

<p>Each of the next&nbsp;R&nbsp;lines contains contains&nbsp;C&nbsp;space-separated characters; the j-th character of the i-th line represents the cell at row i and column j. Each element is either&nbsp;<code>.</code>&nbsp;(meaning there is no attractor in that cell) or&nbsp;<code>A</code>&nbsp;(meaning there is an attractor in that cell).</p>

<h3>Limits</h3>

<ul>
	<li>1 &le;&nbsp;T&nbsp;&le; 100.</li>
	<li>0 &le;&nbsp;R<sub>s</sub>&nbsp;&lt;&nbsp;R.</li>
	<li>0 &le;&nbsp;C<sub>s</sub>&nbsp;&lt;&nbsp;C.</li>
	<li>0 &le;&nbsp;Q&nbsp;&lt;&nbsp;P&nbsp;&le; 1.</li>
	<li>1 &le;&nbsp;R&nbsp;&le; 10.</li>
	<li>1 &le;&nbsp;C&nbsp;&le; 10.</li>
	<li>0 &le;&nbsp;S&nbsp;&le; 5.</li>
</ul>

### 출력

<p>For each test case, output one line containing&nbsp;<code>Case #x: y</code>, where&nbsp;<code>x</code>&nbsp;is the test case number (starting from 1) and&nbsp;<code>y</code>&nbsp;is the largest possible expected number of monsters that the player can catch in the given amount of steps.</p>

<p><code>y</code>&nbsp;will be considered correct if&nbsp;<code>y</code>&nbsp;is within an absolute or relative error of 10<sup>-6</sup>&nbsp;of the correct answer.&nbsp;</p>

### 힌트

<p>In Case #1, one of the best paths is (0,0)-&gt;(0,1)-&gt;(0,2)-&gt;(1,2)-&gt;(2,2)-&gt;(2,3). On this path, the expected number of monsters that you will catch is 0.2 + 0.2 + 0.2 + 0.8 + 0.2 = 1.6. Remember that there is no chance of catching a monster before taking your first step, which is why there are five probabilities in the calculation, not six.</p>

<p>In Case #2, one of the best paths is (9,1)-&gt;(9,2)-&gt;(8,2)-&gt;(8,3)-&gt;(8,2). On this path, the expected number of monsters that you will catch is 0.1 + 0.6121 + 0.1 + 0.23743359 = 1.04953359. Since we accept results within an absolute or relative error of 10<sup>-6</sup>&nbsp;of the correct answer (1.04953359), 1.0495336 is accepted.</p>