# [Silver I] Typewriter Monkey (Small) - 12149

[문제 링크](https://www.acmicpc.net/problem/12149)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 82, 정답: 47, 맞힌 사람: 35, 정답 비율: 64.815%

### 분류

문자열, 브루트포스 알고리즘

### 문제 설명

<p>Your publishing house has decided to use monkeys randomly typing at keyboards to write great works of literature. You are the supervisor for one monkey with a keyboard containing&nbsp;<strong>K</strong>&nbsp;keys, each of which is labeled with an uppercase English letter. (There may be multiple keys displaying the same letter.) The monkey will start with an empty string and repeat the following&nbsp;<strong>S</strong>&nbsp;times: choose a key from its keyboard uniformly at random and press it, adding a copy of that key&#39;s letter to the right end of the string. The final resulting string will have length&nbsp;<strong>S</strong>.<br />
<br />
You have a&nbsp;<em>target word</em>&nbsp;of length&nbsp;<strong>L</strong>&nbsp;that you are hoping the monkey will type. (The target word will not necessarily be a real English word.) This target word may even appear multiple times in what the monkey types. (Overlapping instances count too -- for example, if &quot;ABA&quot; is the target word and the monkey types &quot;ABABA&quot;, that contains two instances of the target.)<br />
<br />
You plan to pay the monkey one banana for each instance of the target word that it types. When you go to inspect the monkey&#39;s work, you will bring along the minimum number of bananas that you need to&nbsp;<em>ensure</em>&nbsp;that you will always have enough bananas to pay the monkey, no matter what it has typed. Then, you will pay the monkey one banana for each instance of the target word that it&nbsp;<em>actually</em>&nbsp;typed. You will keep the remaining bananas that you brought with you.<br />
<br />
What is the expected number of bananas that you will get to keep?</p>

### 입력

<p>The first line of the input gives the number of test cases,&nbsp;<strong>T</strong>.&nbsp;&nbsp;<strong>T</strong>&nbsp;test cases follow. Each consists of three lines. The first contains three space-separated positive integers:&nbsp;<strong>K</strong>,&nbsp;<strong>L</strong>, and&nbsp;<strong>S</strong>. The second contains a string of&nbsp;<strong>K</strong>&nbsp;uppercase English letters representing the monkey&#39;s keyboard. The third contains a string of&nbsp;<strong>L</strong>&nbsp;uppercase English letters representing the target word.</p>

<h3>Limits</h3>

<ul>
	<li>1 &le;&nbsp;<strong>T</strong>&nbsp;&le; 100.</li>
	<li>1 &le;&nbsp;<strong>K</strong>&nbsp;&le; 7.</li>
	<li>1 &le;&nbsp;<strong>L</strong>&nbsp;&le;&nbsp;<strong>S</strong>&nbsp;&le; 7.</li>
</ul>

### 출력

<p>For each test case, output one line containing &quot;Case #x: y&quot;, where y is the expected number of bananas you will get to keep after paying the monkey.</p>

<p>y will be considered correct if it is within an absolute or relative error of 10<sup>-6</sup>&nbsp;of the correct answer.</p>

### 힌트

<p>Note that Case #5 is not within the limits for the Small dataset.<br />
<br />
In Case #1, the monkey has no chance of typing the target word &quot;MONKEY&quot; even once (because his keyboard lacks most of the letters in &quot;MONKEY&quot;), so you do not bring any bananas along when you visit, and of course you do not pay any. Poor monkey!<br />
<br />
In Case #2, the monkey is guaranteed to type &quot;AAAA&quot;, which has two overlapping instances of the target word &quot;AAA&quot;. You will bring two bananas and then pay both.<br />
<br />
In Case #3, the monkey will produce the following outputs with equal probability (1/4 each): &quot;AA&quot;, &quot;AB&quot;, &quot;BA&quot;, &quot;BB&quot;. These have 0, 1, 1, and 2 instances of the target word, respectively. You must bring 2 bananas to be ready for the &quot;BB&quot; case, but you will on average pay (0 + 1 + 1 + 2) / 4 = 1.<br />
<br />
In Case #4, the monkey has a 1/3 chance of typing a &quot;G&quot; first and a 1/3 chance of typing an &quot;O&quot; second, for a 1/9 chance of typing &quot;GO&quot;. You will bring one banana and give it up 1/9 of the time.<br />
<br />
In Case #5, the monkey could in theory type &quot;ROSENCRANTZ&quot; up to nine times, but the chances of this happening even once are so small that they are negligible compared to the acceptable margin of error for answers.</p>