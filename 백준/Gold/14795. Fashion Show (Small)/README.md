# [Gold I] Fashion Show (Small) - 14795

[문제 링크](https://www.acmicpc.net/problem/14795)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 52, 정답: 22, 맞힌 사람: 20, 정답 비율: 45.455%

### 분류

그리디 알고리즘, 애드 혹, 해 구성하기

### 문제 설명

<p>You are about to host a fashion show to show off three new styles of clothing. The show will be held on a stage which is in the most fashionable of all shapes: an&nbsp;<strong>N</strong>-by-<strong>N</strong>&nbsp;grid of cells.</p>

<p>Each cell in the grid can be empty (which we represent with a&nbsp;<code>.</code>&nbsp;character) or can contain one fashion model. The models come in three types, depending on the clothing style they are wearing:&nbsp;<code>+</code>,&nbsp;<code>x</code>, and the super-trendy&nbsp;<code>o</code>. A cell with a&nbsp;<code>+</code>&nbsp;or&nbsp;<code>x</code>&nbsp;model in it adds 1&nbsp;<em>style point</em>&nbsp;to the show. A cell with an&nbsp;<code>o</code>&nbsp;model in it adds 2 style points. Empty cells add no style points.</p>

<p>To achieve the maximum artistic effect, there are rules on how models can be placed relative to each other.</p>

<ul>
	<li>Whenever any two models share a row or column, at least one of the two must be a&nbsp;<code>+</code>.</li>
	<li>Whenever any two models share a diagonal of the grid, at least one of the two must be an&nbsp;<code>x</code>.</li>
</ul>

<p>Formally, a model located in row i<sub>0</sub>&nbsp;and column j<sub>0</sub>&nbsp;and a model located in row i<sub>1</sub>&nbsp;and column j<sub>1</sub>&nbsp;share a row if and only if i<sub>0</sub>&nbsp;= i<sub>1</sub>, they share a column if and only if j<sub>0</sub>&nbsp;= j<sub>1</sub>, and they share a diagonal if and only if i<sub>0</sub>&nbsp;+ j<sub>0</sub>&nbsp;= i<sub>1</sub>&nbsp;+ j<sub>1</sub>&nbsp;or i<sub>0</sub>&nbsp;- j<sub>0</sub>&nbsp;= i<sub>1</sub>&nbsp;- j<sub>1</sub>.</p>

<p>For example, the following grid is not legal:</p>

<pre>
<code>...
x+o
.+.</code></pre>

<p>The middle row has a pair of models (<code>x</code>&nbsp;and&nbsp;<code>o</code>) that does not include a&nbsp;<code>+</code>. The diagonal starting at the&nbsp;<code>+</code>&nbsp;in the bottom row and running up to the&nbsp;<code>o</code>&nbsp;in the middle row has two models, and neither of them is an&nbsp;<code>x</code>.</p>

<p>However, the following grid is legal. No row, column, or diagonal violates the rules.</p>

<pre>
<code>+.x
+x+
o..</code></pre>

<p>Your artistic advisor has already placed&nbsp;<strong>M</strong>&nbsp;models in certain cells, following these rules. You are free to place any number (including zero) of additional models of whichever types you like. You may not remove existing models, but you may upgrade as many existing&nbsp;<code>+</code>and&nbsp;<code>x</code>&nbsp;models into&nbsp;<code>o</code>&nbsp;models as you wish, as long as the above rules are not violated.</p>

<p>Your task is to find a legal way of placing and/or upgrading models that earns the maximum possible number of style points.</p>

### 입력

<p>The first line of the input gives the number of test cases,&nbsp;<strong>T</strong>.&nbsp;<strong>T</strong>&nbsp;test cases follow. Each test case begins with one line with two integers&nbsp;<strong>N</strong>&nbsp;and&nbsp;<strong>M</strong>, as described above. Then,&nbsp;<strong>M</strong>&nbsp;more lines follow; the i-th of these lines has a&nbsp;<code>+</code>,&nbsp;<code>x</code>, or&nbsp;<code>o</code>&nbsp;character (the type of the model) and two integers&nbsp;<strong>R<sub>i</sub></strong>&nbsp;and&nbsp;<strong>C<sub>i</sub></strong>&nbsp;(the position of the model). The rows of the grid are numbered 1 through&nbsp;<strong>N</strong>, from top to bottom. The columns of the grid are numbered 1 through&nbsp;<strong>N</strong>, from left to right.</p>

### 출력

<p>For each test case, first output one line containing&nbsp;<code>Case #x: y z</code>, where&nbsp;<code>x</code>&nbsp;is the test case number (starting from 1),&nbsp;<code>y</code>&nbsp;is the number of style points earned in your arrangement, and&nbsp;<code>z</code>&nbsp;is the total number of models you have added and/or substituted in. Then, for each model that you have added or substituted in, output exactly one line in exactly the same format described in the Input section, where the character is the type of the model that you have added or substituted in. These&nbsp;<code>z</code>&nbsp;lines can be in any order.</p>

<p>If there are multiple valid answers, you may output any one of them.</p>

### 제한

<ul>
	<li>1 &le;&nbsp;<strong>T</strong>&nbsp;&le; 100.</li>
	<li>1 &le;&nbsp;<strong>N</strong>&nbsp;&le; 100.</li>
	<li>1 &le;&nbsp;<strong>C<sub>i</sub></strong>&nbsp;&le;&nbsp;<strong>N</strong>, for all i.</li>
	<li>0 &le;&nbsp;<strong>M</strong>&nbsp;&le;&nbsp;<strong>N</strong><sup>2</sup>.</li>
	<li>No two pre-placed models appear in the same cell.</li>
	<li>It is guaranteed that the set of pre-placed models follows the rules.</li>
	<li><strong>R<sub>i</sub></strong>&nbsp;= 1, for all i. (Any models that are pre-placed are in the top row. Note that you may add/replace models in that row and/or add models in other rows.)</li>
</ul>

### 힌트

<p>The sample output displays one set of answers to the sample cases. Other answers may be possible. Note that the last sample case would not appear in the Small dataset.</p>

<p>In sample case #1, the grid is 2-by-2 and is initially blank. The output corresponds to the following grid. (In these explanations, we will use&nbsp;<code>.</code>&nbsp;to denote a blank cell.)</p>

<pre>
<code>x.
+o</code></pre>

<p>In sample case #2, the only cell is already occupied by an&nbsp;<code>o</code>&nbsp;model, and it is impossible to add a new model or replace the&nbsp;<code>o</code>&nbsp;model.</p>

<p>In sample case #3, the grid looks like this before you place any models:</p>

<pre>
<code>...
+++
x..</code></pre>

<p>The output corresponds to this grid:</p>

<pre>
<code>.x.
++o
x..</code></pre>