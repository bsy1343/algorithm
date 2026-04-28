# [Gold II] What are Birds? (Large) - 12688

[문제 링크](https://www.acmicpc.net/problem/12688)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 41, 정답: 16, 맞힌 사람: 16, 정답 비율: 55.172%

### 분류

기하학

### 문제 설명

<p>You are studying animals in a forest, and are trying to determine which animals are birds and which are not.</p>

<p>You do this by taking two measurements of each animal &ndash; their height and their weight. For an animal to be a bird, its height needs to be within some range, and its weight needs to be within another range, but you&#39;re not sure what the height and weight ranges are. You also know that&nbsp;<em>every</em>&nbsp;animal that satisfies these ranges is a bird.</p>

<p>You have taken some of the animals you have measured and shown them to biologists, and they have told you which are birds and which are not. This has given you some information on what the height and weight ranges for a bird must be. For the remaining animals, your program should determine if they are definitely birds, definitely not birds, or if you don&#39;t know from the information you have.</p>

### 입력

<p>One line containing an integer&nbsp;<strong>C</strong>, the number of test cases in the input.</p>

<p>Then for each of the&nbsp;<strong>C</strong>&nbsp;test cases:</p>

<p>&nbsp;</p>

<ul>
	<li>One line containing an integer&nbsp;<strong>N</strong>, the number of animals you have shown to the biologists.</li>
	<li><strong>N</strong>&nbsp;lines, one for each of these animals, each of the format &quot;<strong>H W X</strong>&quot;, where&nbsp;<strong>H</strong>&nbsp;is the height of the animal,&nbsp;<strong>W</strong>&nbsp;is the weight of the animal, and&nbsp;<strong>X</strong>&nbsp;is either the string &quot;BIRD&quot; or &quot;NOT BIRD&quot;. All numbers are positive integers.</li>
	<li>One line containing an integer&nbsp;<strong>M</strong>, the number of animals you have not shown to the biologists.</li>
	<li><strong>M</strong>&nbsp;lines, one for each of these animals, each of the format &quot;<strong>H W</strong>&quot;, where&nbsp;<strong>H</strong>&nbsp;is the height of the animal and&nbsp;<strong>W</strong>&nbsp;is the weight of the animal. All numbers are positive integers.​</li>
</ul>

<p>Limits</p>

<ul>
	<li>1 &le;&nbsp;<strong>C</strong>&nbsp;&le; 10</li>
	<li>1 &le; all heights and weights &le; 1000000</li>
	<li>1 &le;&nbsp;<strong>N</strong>&nbsp;&le; 1000</li>
	<li>1 &le;&nbsp;<strong>M</strong>&nbsp;&le; 1000</li>
</ul>

### 출력

<p>For each of the&nbsp;<strong>C</strong>&nbsp;test cases:</p>

<ul>
	<li>One line containing the string &quot;Case #<strong>X</strong>:&quot; where&nbsp;<strong>X</strong>&nbsp;is the number of the test case, starting from 1.</li>
	<li>M lines, each containing one of &quot;BIRD&quot;, &quot;NOT BIRD&quot;, or &quot;UNKNOWN&quot; (quotes are just for clarity and should not be part of the output).</li>
</ul>

### 힌트

<p>Case 1:</p>

<p>The animal &quot;1500 1500&quot; must be within the ranges for birds, since we know that the ranges for height and weight each include 1000 and 2000.</p>

<p>The animal &quot;900 900&quot; may or may not be a bird; we don&#39;t know if the ranges for height and weight include 900.</p>

<p>The animal &quot;1400 2020&quot; is within the height range for birds, but if 2020 was in the weight range, then the animal &quot;1500 2010&quot;, which we know is not a bird, would also have to be within the weight range.</p>

<p>Case 2:</p>

<p>In this case we know that birds must have a height of 501. But we don&#39;t know what the weight range for a bird is, other than that it includes weight 700.</p>

<p>Case 3:</p>

<p>In this case, we know that anything with height 100 and weight 100 is not a bird, but we just don&#39;t know what birds are.</p>