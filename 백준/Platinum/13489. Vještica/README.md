# [Platinum I] Vještica - 13489

[문제 링크](https://www.acmicpc.net/problem/13489)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 64 MB

### 통계

제출: 34, 정답: 21, 맞힌 사람: 20, 정답 비율: 86.957%

### 분류

다이나믹 프로그래밍, 비트마스킹, 비트필드를 이용한 다이나믹 프로그래밍

### 문제 설명

<p>Young hero, an adventurer Matej, has, after a long and strenuous journey, arrived to his final&nbsp;destination &ndash; the house of evil witch Marija. In order to complete his adventure, he must&nbsp;solve the final puzzle the witch gives him.</p>

<p>To even begin solving her puzzle, our hero needs to become familiar with the data structure&nbsp;called prefix tree (trie).</p>

<p>A prefix tree is a data structure that represents all prefixes of words from a certain set in the&nbsp;following way:</p>

<ul>
	<li>Each edge of the tree is denoted with a letter from the alphabet.</li>
	<li>The root of the tree represents an empty prefix.</li>
	<li>All other nodes in the tree represent a non-empty prefix in a way that each node&nbsp;represents a prefix obtained by concatenating letters written on the edges that lead&nbsp;from the root of the tree to that node (in that order).</li>
	<li>There will never be two edges labeled with the same letter coming out of a single&nbsp;node (this way we minimize the number of nodes necessary to represent all&nbsp;prefixes).&nbsp;</li>
</ul>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/13489.%E2%80%85Vje%C5%A1tica/5c81a7a0.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/13489.%E2%80%85Vje%C5%A1tica/5c81a7a0.png" data-original-src="https://onlinejudgeimages.s3.amazonaws.com/problem/13489/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7%202016-11-01%20%EC%98%A4%ED%9B%84%204.31.03.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:356px; width:390px" /></p>

<p>Prefix tree for words: &ldquo;A&rdquo;, &ldquo;to&rdquo;, &ldquo;tea&rdquo;, &ldquo;ted&rdquo;, &ldquo;ten&rdquo;, &ldquo;i&rdquo;, &ldquo;in&rdquo;, i &ldquo;inn&rdquo;.</p>

<p>Only after Matej learned what a prefix tree was does the real puzzle begin!</p>

<p>The witch, as you may have guessed, has N words that consist of lowercase letters of the&nbsp;English alphabet. The puzzle would be very simple if the witch wanted to know the number of nodes of the prefix tree for that set of words, but she is not interested in this. She wants to&nbsp;know the minimal number of nodes a prefix tree can have after permuting the letters of&nbsp;each word in an arbitrary manner​.</p>

<p>Help Matej find the answer to the puzzle!&nbsp;</p>

### 입력

<p>The first line of input contains the integer N ​(1 &le; N &le; 16).</p>

<p>Each of the following N lines contains a single word consisting of lowercase letter of the&nbsp;English alphabet.</p>

<p>The total length of all words will be less than 1 000 000.&nbsp;</p>

### 출력

<p>The first and only line of output must contain a number, the answer to witch Marija&rsquo;s puzzle.</p>