# [Platinum IV] Merlin QA (Small) - 12125

[문제 링크](https://www.acmicpc.net/problem/12125)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 90, 정답: 35, 맞힌 사람: 34, 정답 비율: 50.746%

### 분류

그리디 알고리즘, 애드 혹

### 문제 설명

<p>Edythe is a young sorceress working in the quality assurance department of Merlin, Inc. -- a magic spell factory. Her job is to test the magic spells that Merlin himself invents. Each spell requires precise amounts of certain ingredients and transforms them into other amounts of other ingredients. Edythe&#39;s job is to cast each spell exactly once in order to verify that the spell works correctly.</p>

<p>She can cast a spell only if she has the required amount of each ingredient. If she has already created ingredients of the right type from previous spells, Edythe must use those first. However, if she still needs more ingredients, she is allowed to take them from Merlin&#39;s storehouse. She has no ingredients to start with, but at the end, she gets to keep all the extra ingredients that she created and didn&#39;t use.</p>

<p>Edythe wants to make as much profit as possible from her apprenticeship! She has to cast each of the&nbsp;<strong>N</strong>&nbsp;given spells exactly once, but she is free to do so in any order. Assuming that each spell works as expected, which ordering lets her earn the most money in the end?</p>

<p>For example, imagine that the test plan contains the following 3 spells:</p>

<ol>
	<li>Inputs: \$7 worth of gold. Outputs: \$5 worth of sulfur.</li>
	<li>Inputs: nothing. Outputs: \$10 worth of gold, \$10 worth of sulfur.</li>
	<li>Inputs: \$3 worth of gold, \$20 worth of sulfur. Outputs: \$2 worth of toads.</li>
</ol>

<p>Note that the first spell converts gold into sulfur, the second spell conjures up gold and sulfur from nothing, and the third spell converts gold and sulfur into toads.</p>

<p>If Edythe were to cast these spells in the order 1, 2, 3, then she would start by fetching \$7 worth of gold from the storehouse for spell #1. That would let her cast spells #1 and #2, giving her \$10 worth of gold and \$15 worth of sulfur. For the final spell, she would need \$3 worth of gold and \$20 worth of sulfur. She would have to use all of the sulfur she created so far, \$3 worth of gold, and \$5 more worth of sulfur that she fetched from the storehouse. This would leave her with \$9 worth of ingredients at the end (\$7 worth of gold and \$2 worth of toads).</p>

<p>But there is a better plan. If she cast the spells in the order 3, 1, 2, she would have \$27 worth of ingredients at the end (\$10 worth of gold, \$15 worth of sulfur, and \$2 worth of toads).</p>

### 입력

<p>The first line of the input gives the number of test cases,&nbsp;<strong>T</strong>.&nbsp;&nbsp;<strong>T</strong>&nbsp;test cases follow. Each one starts with a line containing&nbsp;<strong>N</strong>&nbsp;and&nbsp;<strong>M</strong>.&nbsp;<strong>M</strong>&nbsp;is the number of kinds of ingredients in the world. Each of the next&nbsp;<strong>N</strong>&nbsp;lines contains&nbsp;<strong>M</strong>&nbsp;integers describing a spell. Each integer is the value (or cost) of the corresponding ingredient. Negative integers are the dollar costs of the input ingredients; positive integers are the dollar values of the output ingredients; and zeros denote ingredients that are neither produced nor consumed by the spell. This also implies that no spell can simultaneously consume and produce the same ingredient.</p>

<h3>Limits</h3>

<ul>
	<li>1 &le;&nbsp;<strong>T</strong>&nbsp;&le; 100.</li>
	<li>1 &le;&nbsp;<strong>N</strong>&nbsp;&le; 100.</li>
	<li>-100 &le; Each integer in each spell &le; 100.</li>
	<li>1 &le;&nbsp;<strong>M</strong>&nbsp;&le; 2.</li>
</ul>

### 출력

<p>For each test case, output one line containing &quot;Case #x: y&quot;, where x is the test case number (starting from 1) and y is the largest value of ingredients Edythe can have at the end.</p>