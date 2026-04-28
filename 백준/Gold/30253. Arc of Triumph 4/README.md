# [Gold III] Arc of Triumph 4 - 30253

[문제 링크](https://www.acmicpc.net/problem/30253)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 23, 정답: 9, 맞힌 사람: 5, 정답 비율: 35.714%

### 분류

그리디 알고리즘, 애드 혹, 해 구성하기

### 문제 설명

<p>Emperor Kostas is planning to commemorate the victory against his rival Max by building an Arc of Triumph. He has already designed the Arc and is now looking for an engineer who would build it as cheap as possible.</p>

<p>An arc is a narrow structure made out of stone blocks. It is fully described by its twodimensional cross-section. For example, the cross-section of one of the arc of triumphs in Rome is as follows:</p>

<pre style="text-align: center;">
########
########
########
###..###
#.#..#.#
#.#..#.#</pre>

<p>In this cross-section <code>#</code> denotes a block and <code>.</code> denotes an empty space.</p>

<p>In order for an arc to stand, all of the blocks have to be stable. A block is stable if:</p>

<ul>
	<li>it is standing on the ground or on another stable block</li>
	<li>it belongs to a horizontal interval of blocks where the outer blocks are stable.</li>
</ul>

<p>For example, in the following diagram:</p>

<pre style="text-align: center;">
########
########
##XAYZ##
###..###
B.#..#.#
C.#..#.#</pre>

<p>the bloc <code>B</code> is stable because it is standing on a stable block <code>C</code> (the latter is stable since it is standing on the ground). The block <code>A</code> is stable because it belongs to an interval <code>XAYZ</code> where the outer blocks <code>X</code> and <code>Z</code> are stable.</p>

<p>An arc is built by putting one block after another. At any moment of construction all of the blocks have to be stable. For this reason, it is impossible to build some of the arcs without additional temporary constructions. For example, it is not possible to build an arc depicted above because it will never be possible to put block <code>A</code> in a stable manner. Therefore, the engineer is going to use a temporary wooden construction. The wooden construction is made out of wooden blocks.</p>

<p>While building them it is important to take into account the same requirements: blocks are put one by one and at any moment of building the blocks have to be stable. When determining the stability of the block both wooden and stone blocks are considered identical.</p>

<p>Therefore, the arc depicted above can be built using three wooden blocks. The essential step is illustrated here:</p>

<pre style="text-align: center;">
..####..
###^.###
#.#^.#.#
#.#^.#.#</pre>

<p>(<code>^</code> denotes wooden blocks).</p>

<p>The construction starts with a plain empty field and continues with performing consecutive steps. Possible types of steps are listed below:</p>

<ul>
	<li>a stone block is put in a selected square,</li>
	<li>a wooden block is put in a selected square,</li>
	<li>a wooden block is removed from a selected square.</li>
</ul>

<p>At each moment of time all of the blocks that are put up have to be stable. Wodden blocks are expensive and Kostas is willing to buy as few wooden blocks as possible. The removed wooden blocks may be used again.</p>

<p>Your task is to build an arc using the smallest possible amount of wooden blocks. After the construction has ended, the stone blocks have to be in exactly the same positions as it is stated in the plan. However, there may be some wooden blocks remaining.</p>

### 입력

<p>In the first line four numbers separated by spaces are presented: arc width M, arc heigth N, and parameters A and B that describe the scoring function (see section Grading).</p>

<p>In the following N lines the arc is described (starting from the top and ending at the bottom) &ndash; each of them contains M symbols <code>#</code> and <code>.</code> (<code>#</code> denotes a block and . denotes an empty space).</p>

### 출력

<p>Output the whole arc construction process: for each step output a line with two numbers separated by spaces &ndash; the coordinates of the block you wish to add or remove. If there have not yet been a block in that place, a block will be put there:</p>

<ul>
	<li>stone block if there is a stone block in this location in the building plan</li>
	<li>wooden block if there is an empty space in this location in the building plan</li>
</ul>

<p>If a wooden block has already been there, it will be removed.</p>

### 제한

<ul>
	<li>1 &le; M, N &le; 100</li>
</ul>