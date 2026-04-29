# [Bronze III] Animal Farm - 32449

[문제 링크](https://www.acmicpc.net/problem/32449)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 365, 정답: 228, 맞힌 사람: 190, 정답 비율: 61.688%

### 분류

구현

### 문제 설명

<p>On Animal Farm, the animals have rebelled against their human owner and have taken over the management of the farm. To ensure equality and fairness among all the animals, they have decided to create a new set of rules. However, as the new leaders, the pigs have started making changes to the rules to favor themselves.</p>

<p>The farm maintains a hierarchy of animals based on their species, with each animal assigned a specifc infuence level. This infuence level, represented as a positive integer, determines the animal’s priority in decision-making. Within a group, an animal can make decisions if it has the highest influence level among the members.</p>

<p>The pigs have a plan to maximize their collective infuence in the leadership council by selecting a specific group of animals. Given a list of animals with their species and influence levels, you are tasked to form the most influential leadership council while adhering to the following rules:</p>

<ol>
	<li>Only one pig species is allowed in the council to avoid power conflicts among the pigs.</li>
	<li>Every council member of non-pig species should have an influence level less than the influence level of the only pig’s in the council.</li>
</ol>

<p>Determine the maximum total influence levels of the council that can be formed under these rules.</p>

### 입력

<p>The first line contains an integer $n$, representing the number of animals. The next $n$ lines each contain a string <code>species</code> and a positive integer <code>influence</code>:</p>

<ul>
	<li><code>species</code> is a string representing the species of the animal, e.g., “<code>pig</code>”, “<code>horse</code>”, “<code>cow</code>”, etc.</li>
	<li><code>influence</code> is an integer representing the influence level of the animal.</li>
</ul>

### 출력

<p>Output a single integer, the maximum total influence levels of the leadership council that can be formed following the rules.</p>

### 제한

<ul>
	<li>$1 ≤ n ≤ 10^5$.</li>
	<li>The length of <code>species</code> is at most $10$.</li>
	<li><code>species</code> consists of only English characters in lowercase.</li>
	<li>At least one animal’s <code>species</code> is <code>pig</code>.</li>
	<li><code>influence</code> is at most $10^8$.</li>
</ul>