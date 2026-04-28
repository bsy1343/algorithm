# [Gold IV] Word Morph - 6023

[문제 링크](https://www.acmicpc.net/problem/6023)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 126, 정답: 29, 맞힌 사람: 24, 정답 비율: 27.273%

### 분류

너비 우선 탐색, 그래프 이론, 그래프 탐색, 구현, 문자열

### 문제 설명

<p>Farmer John is playing a word game against his cows. It starts like this:</p>

<ul>
	<li>Farmer John chooses a word, such as &#39;cat&#39;</li>
	<li>The cows then choose their own word, perhaps &#39;dog&#39;</li>
</ul>

<p>Farmer John then must morph his word to the cows&#39; word by performing a number of steps, each one of which changes one single letter at a time to make a new, valid word.</p>

<p>Farmer John can only use the words in the following file <a href="http://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/data/6023/dict.txt">dict.txt</a>.</p>

<p>For this example, Farmer John could make the following sequence of four words:</p>

<pre>
      &#39;cat&#39; -&gt; &#39;cot&#39; -&gt; &#39;cog&#39; -&gt; &#39;dog&#39;</pre>

<p>to morph words from the first word &#39;cat&#39; to the final word &#39;dog&#39; in just three moves. The cows will never give Farmer John an impossible task. Farmer John must get from his word to the cows&#39; word in as few moves as possible.</p>

<p>You will be given a starting word and an ending word. Determine and output a number which is the least number of legal letter changes required to morph the starting word to the ending word.</p>

### 입력

<ul>
	<li>Line 1: A single string that is the starting word</li>
	<li>Line 2: A single string that is the end word</li>
</ul>

### 출력

<ul>
	<li>Line 1: A single integer that is the number of times a letter must be changed to transform the starting word into the ending word.</li>
</ul>