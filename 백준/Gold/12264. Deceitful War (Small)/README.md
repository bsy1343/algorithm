# [Gold I] Deceitful War (Small) - 12264

[문제 링크](https://www.acmicpc.net/problem/12264)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 28, 정답: 26, 맞힌 사람: 26, 정답 비율: 92.857%

### 분류

그리디 알고리즘, 정렬, 게임 이론, 두 포인터

### 문제 설명

<p>Naomi and Ken sometimes play games together. Before they play, each of them gets&nbsp;<strong>N</strong>&nbsp;identical-looking blocks of wood with masses between 0.0kg and 1.0kg (exclusive). All of the blocks have different weights. There are lots of games they could play with those blocks, but they usually play something they call War. Here is how War works:</p>

<ol>
	<li>Each player weighs each of his or her own blocks, so each player knows the weights of all of his or her own blocks, but not the weights of the other player&#39;s blocks.</li>
	<li>They repeat the following process&nbsp;<strong>N</strong>&nbsp;times:
	<ol>
		<li>Naomi chooses one of her own blocks, with mass Chosen<sub>Naomi</sub>.</li>
		<li>Naomi tells Ken the mass of the block she chose.</li>
		<li>Ken chooses one of his own blocks, with mass Chosen<sub>Ken</sub>.</li>
		<li>They each put their block on one side of a&nbsp;<a href="https://www.google.com/search?q=balance+scale&amp;tbm=isch">balance scale</a>, and the person whose block is heavier gets one point.</li>
		<li>Both blocks are destroyed in a fire.</li>
	</ol>
	</li>
</ol>

<p>Naomi has realized three things about War. First, she has realized that she loses a lot. Second, she has realized that there is a unique strategy that Ken can follow to maximize his points without assuming anything about Naomi&#39;s strategy, and that Ken always uses it. Third, she has realized that she hates to lose. Naomi has decided that instead of playing War, she will play a game she calls Deceitful War. The great thing about Deceitful War is that Ken will think they&#39;re playing War!</p>

<p>Here is how Deceitful War works, with differences between Deceitful War and War in bold:</p>

<ol>
	<li>Each player weighs each of his or her own blocks.&nbsp;<strong>Naomi also weighs Ken&#39;s blocks while he isn&#39;t looking, so Naomi knows the weights of all blocks</strong>&nbsp;and Ken only knows the weights of his own blocks.</li>
	<li>They repeat the following process&nbsp;<strong>N</strong>&nbsp;times:
	<ol>
		<li>Naomi chooses one of her own blocks, with mass Chosen<sub>Naomi</sub>.</li>
		<li>Naomi tells Ken&nbsp;<strong>a number,&nbsp;</strong><strong>Told</strong><strong><sub>Naomi</sub></strong><strong>, between 0.0kg and 1.0kg exclusive.</strong>&nbsp;Ken, who thinks they&#39;re playing War, thinks the number Naomi just told him is Chosen<sub>Naomi</sub>.</li>
		<li>Ken chooses one of his own blocks, with mass Chosen<sub>Ken</sub>.</li>
		<li>They each put their block on one side of a&nbsp;<a href="https://www.google.com/search?q=balance+scale&amp;tbm=isch">balance scale</a>, and the person whose block is heavier gets one point.</li>
		<li>Both blocks are destroyed in a fire.</li>
	</ol>
	</li>
</ol>

<p>Naomi doesn&#39;t want Ken to know that she isn&#39;t playing War; so when she is choosing which block to play, and what mass to tell Ken, she must make sure that the balance scale won&#39;t reveal that Chosen<sub>Naomi</sub>&nbsp;&ne; Told<sub>Naomi</sub>. In other words, she must make decisions so that:</p>

<ul>
	<li>Chosen<sub>Naomi</sub>&nbsp;&gt; Chosen<sub>Ken</sub>&nbsp;if, and only if, Told<sub>Naomi</sub>&nbsp;&gt; Chosen<sub>Ken</sub>, and</li>
	<li>Told<sub>Naomi</sub>&nbsp;is not equal to the mass of any of Ken&#39;s blocks, because he knows that isn&#39;t possible.</li>
</ul>

<p>It might seem like Naomi won&#39;t win any extra points by being deceitful, because Ken might discover that she wasn&#39;t playing War; but Naomi knows Ken thinks both players are playing War, and she knows what he knows, and she knows Ken will always follow his unique optimal strategy for War, so she can always predict what he will play.</p>

<p>You&#39;ll be given the masses of the blocks Naomi and Ken started with. Naomi will play Deceitful War optimally to gain the maximum number of points. Ken will play War optimally to gain the maximum number of points&nbsp;<em>assuming that both players are playing War</em>. What will Naomi&#39;s score be? What would it have been if she had played War optimally instead?</p>

<p>Examples</p>

<p>If each player has a single block left, where Naomi has 0.5kg and Ken has 0.6kg, then Ken is guaranteed to score the point. Naomi can&#39;t say her number is &ge; 0.6kg, or Ken will know she isn&#39;t playing War when the balance scale shows his block was heavier.</p>

<p>If each player has two blocks left, where Naomi has [0.7kg, 0.2kg] and Ken has [0.8kg, 0.3kg], then Naomi could choose her 0.2kg block, and deceive Ken by telling him that she chose a block that was 0.6kg. Ken assumes Naomi is telling the truth (as in how the War game works) and will play his 0.8kg block to score a point. Ken was just deceived, but he will never realize it because the balance scale shows that his 0.8kg block is, like he expected, heavier than the block Naomi played. Now Naomi can play her 0.7kg block, tell Ken it is 0.7kg, and score a point. If Naomi had played War instead of Deceitful War, then Ken would have scored two points and Naomi would have scored zero.</p>

### 입력

<p>The first line of the input gives the number of test cases, <strong>T</strong>. <strong>T</strong> test cases follow. Each test case starts with a line containing a single integer <strong>N</strong>, the number of blocks each player has. Next follows a line containing <strong>N</strong> space-separated real numbers: the masses of Naomi&#39;s blocks, in kg. Finally there will be a line containing <strong>N</strong> space-separated real numbers: the masses of Ken&#39;s blocks, in kg.</p>

<p>Each of the masses given to Ken and Naomi will be represented as a 0, followed by a decimal point, followed by 1-5 digits. Even though all the numbers in the input have 1-5 digits after the decimal point, Ken and Naomi don&#39;t know that; so Naomi can still tell Ken that she played a block with mass 0.5000001kg, and Ken has no reason not to believe her.</p>

<p>Limits</p>

<ul>
	<li>1 &le; <strong>T</strong> &le; 50.</li>
	<li>All the masses given to Ken and Naomi are distinct, and between 0.0 and 1.0 exclusive.</li>
	<li><span style="line-height:1.6em">1 &le; </span><strong style="line-height:1.6em">N</strong><span style="line-height:1.6em"> &le; 10.</span></li>
</ul>

### 출력

<p>For each test case, output one line containing &quot;Case #<strong>x</strong>: <strong>y</strong> <strong>z</strong>&quot;, where <strong>x</strong> is the test case number (starting from 1), <strong>y</strong> is the number of points Naomi will score if she plays Deceitful War optimally, and <strong>z</strong> is the number of points Naomi will score if she plays War optimally.</p>