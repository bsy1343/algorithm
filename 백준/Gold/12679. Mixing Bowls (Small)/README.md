# [Gold V] Mixing Bowls (Small) - 12679

[문제 링크](https://www.acmicpc.net/problem/12679)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 50, 정답: 19, 맞힌 사람: 18, 정답 비율: 40.000%

### 분류

(분류 없음)

### 문제 설명

<p>You are following a recipe to create your lunch.</p>

<p>The recipe is a mixture made by combining ingredients together in a bowl. Each ingredient will be either:</p>

<ul>
	<li>Another mixture which you must make first in a separate bowl; or</li>
	<li>A basic ingredient you already have in your kitchen, which can be added directly.</li>
</ul>

<p>To make a mixture, you need to have all its ingredients ready, take an empty bowl and mix the ingredients in it. It is not possible to make mixtures by adding ingredients to an already-existing mixture in a bowl.</p>

<p>For example, if you want to make CAKE (a mixture) out of CAKEMIX (a mixture) and lies (a basic ingredient), then you must first make CAKEMIX in its own bowl, then add the CAKEMIX and lies to a second bowl to make the CAKE.</p>

<p>Once you have used a mixture as an ingredient and emptied the bowl it was prepared in, you can re-use that bowl for another mixture. So the number of bowls you need to prepare the recipe will depend on the order in which you decide to make mixtures.</p>

<p>Determine the minimum number of bowls you will need.</p>

### 입력

<p>The first line will contain an integer&nbsp;<strong>C</strong>, the number of test cases in the input file.</p>

<p>&nbsp;</p>

<p>For each test case, there will be:</p>

<p>The tokens on one line will be separated by single spaces.</p>

<p>The first mixture in a test case is the recipe you are making.</p>

<p>The names of mixtures are strings of between 1 and 20 UPPERCASE letters.</p>

<p>The names of basic ingredients are strings of between 1 and 20 lowercase letters.</p>

<p>Each mixture is used in exactly one other mixture, except for the recipe, which is not used in any other mixture. Each ingredient will appear at most once in the ingredient list for a mixture. No mixture will (directly or indirectly) require itself as an ingredient.</p>

<ul>
	<li>One line containing an integer&nbsp;<strong>N</strong>, the number of mixtures in the test case.</li>
	<li><strong>N</strong>&nbsp;lines, one for each mixture, containing:
	<ul>
		<li>One string giving the mixture name;</li>
		<li>An integer&nbsp;<strong>M</strong>, the number of ingredients in this mixture;</li>
		<li><strong>M</strong>&nbsp;strings, giving the names of each of the ingredients of this mixture.</li>
	</ul>
	</li>
</ul>

<p>Limits</p>

<ul>
	<li>1 &le;&nbsp;<strong>C</strong>&nbsp;&le; 10</li>
	<li>2 &le;&nbsp;<strong>M</strong>&nbsp;&le; 10</li>
	<li>1 &le;&nbsp;<strong>N</strong>&nbsp;&le; 10</li>
</ul>

### 출력

<p>For each test case, output one line containing &quot;Case #<strong>X</strong>:&nbsp;<strong>Y</strong>&quot; where&nbsp;<strong>X</strong>&nbsp;is the number of the test case, starting from 1, and&nbsp;<strong>Y</strong>&nbsp;is the minimum number of mixing bowls required.</p>

### 힌트

<p>In the first case, to satisfy your craving for SOUP, you follow these steps:</p>

<ol>
	<li>Make VEGETABLES by mixing celery and onions in a bowl.</li>
	<li>Make STOCK in a second bowl by mixing chicken and VEGETABLES from the first bowl. The first bowl becomes empty.</li>
	<li>Make SOUP in the first bowl by mixing STOCK, salt and water.</li>
</ol>

<p>In the second case, you have a choice of whether to make FLAVOR or FRUIT first before mixing them with milk and icecream to make MILKSHAKE.</p>

<p>If we make FRUIT first, we use four bowls:</p>

<ol>
	<li>Make FRUIT in a bowl by mixing banana and berries.</li>
	<li>Make SPICES in a second bowl by mixing nutmeg and cinnamon, and CHOCOLATE in a third bowl by mixing cocoa and syrup. (In either order)</li>
	<li>Make FLAVOR in a fourth bowl by mixing SPICES and CHOCOLATE.</li>
	<li>Make MILKSHAKE in the second or third bowl by mixing FRUIT, FLAVOR, milk and icecream.</li>
</ol>

<p>However if we make FRUIT after FLAVOR, we use three bowls:</p>

<ol>
	<li>Make SPICES in a bowl by mixing nutmeg and cinnamon, and CHOCOLATE in a second bowl by mixing cocoa and syrup. (In either order)</li>
	<li>Make FLAVOR in a third bowl by mixing SPICES and CHOCOLATE.</li>
	<li>Make FRUIT in the first bowl by mixing banana and berries.</li>
	<li>Make MILKSHAKE in the second bowl by mixing FRUIT, FLAVOR, milk and icecream.</li>
</ol>