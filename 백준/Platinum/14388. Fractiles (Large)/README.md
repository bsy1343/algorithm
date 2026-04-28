# [Platinum II] Fractiles (Large) - 14388

[문제 링크](https://www.acmicpc.net/problem/14388)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 72, 정답: 36, 맞힌 사람: 33, 정답 비율: 50.000%

### 분류

수학, 정수론

### 문제 설명

<p>Long ago, the Fractal civilization created artwork consisting of linear rows of tiles. They had two types of tile that they could use: gold (<code>G</code>) and lead (<code>L</code>).</p>

<p>Each piece of Fractal artwork is based on two parameters: an original sequence of&nbsp;K&nbsp;tiles, and a complexity&nbsp;C. For a given original sequence, the artwork with complexity 1 is just that original sequence, and the artwork with complexity&nbsp;X+1 consists of the artwork with complexity&nbsp;X, transformed as follows:</p>

<ul>
	<li>replace each&nbsp;<code>L</code>&nbsp;tile in the complexity&nbsp;X&nbsp;artwork with another copy of the original sequence</li>
	<li>replace each&nbsp;<code>G</code>&nbsp;tile in the complexity&nbsp;X&nbsp;artwork with&nbsp;K&nbsp;<code>G</code>&nbsp;tiles</li>
</ul>

<p>For example, for an original sequence of&nbsp;<code>LGL</code>, the pieces of artwork with complexity 1 through 3 are:</p>

<ul>
	<li>C&nbsp;= 1:&nbsp;<code>LGL</code>&nbsp;(which is just the original sequence)</li>
	<li>C&nbsp;= 2:&nbsp;<code>LGLGGGLGL</code></li>
	<li>C&nbsp;= 3:&nbsp;<code>LGLGGGLGLGGGGGGGGGLGLGGGLGL</code></li>
</ul>

<p>Here&#39;s an illustration of how the artwork with complexity 2 is generated from the artwork with complexity 1:</p>

<p><img alt="" src="https://onlinejudgeimages.s3.amazonaws.com/problem/14381/%EB%8B%A4%EC%9A%B4%EB%A1%9C%EB%93%9C.png" /></p>

<p>You have just discovered a piece of Fractal artwork, but the tiles are too dirty for you to tell what they are made of. Because you are an expert archaeologist familiar with the local Fractal culture, you know the values of&nbsp;K&nbsp;and&nbsp;C&nbsp;for the artwork, but you do not know the original sequence. Since gold is exciting, you would like to know whether there is at least one&nbsp;<code>G</code>&nbsp;tile in the artwork. Your budget allows you to hire&nbsp;S&nbsp;graduate students, each of whom can clean one tile of your choice (out of the&nbsp;K<sup>C</sup>&nbsp;tiles in the artwork) to see whether the tile is&nbsp;<code>G</code>&nbsp;or&nbsp;<code>L</code>.</p>

<p>Is it possible for you to choose a set of no more than&nbsp;S&nbsp;specific tiles to clean, such that&nbsp;no matter what&nbsp;the original pattern was, you will be able to know for sure whether at least one&nbsp;<code>G</code>&nbsp;tile is present in the artwork? If so, which tiles should you clean?</p>

### 입력

<p>The first line of the input gives the number of test cases,&nbsp;T.&nbsp;T&nbsp;test cases follow. Each consists of one line with three integers:&nbsp;K,&nbsp;C, and&nbsp;S.</p>

<h3>Limits</h3>

<ul>
	<li>1 &le;&nbsp;T&nbsp;&le; 100.</li>
	<li>1 &le;&nbsp;K&nbsp;&le; 100.</li>
	<li>1 &le;&nbsp;C&nbsp;&le; 100.</li>
	<li>K<sup>C</sup>&nbsp;&le; 10<sup>18</sup>.</li>
	<li>1 &le;&nbsp;S&nbsp;&le;&nbsp;K.</li>
</ul>

### 출력

<p>For each test case, output one line containing&nbsp;<code>Case #x: y</code>, where&nbsp;<code>x</code>&nbsp;is the test case number (starting from 1) and&nbsp;<code>y</code>&nbsp;is either&nbsp;<code>IMPOSSIBLE</code>&nbsp;if no set of tiles will answer your question, or a list of between 1 and&nbsp;S&nbsp;positive integers, which are the positions of the tiles that will answer your question. The tile positions are numbered from 1 for the leftmost tile to&nbsp;K<sup>C</sup>&nbsp;for the rightmost tile. Your chosen positions may be in any order, but they must all be different.</p>

### 힌트

<p>Note: for some of these sample cases, other valid solutions exist.</p>

<p>In sample case #1, there are four possible original sequences:&nbsp;<code>GG</code>,&nbsp;<code>GL</code>,&nbsp;<code>LG</code>, and&nbsp;<code>LL</code>. They would produce the following artwork, respectively:</p>

<ul>
	<li>Original sequence&nbsp;<code>GG</code>:&nbsp;<code>GGGGGGGG</code></li>
	<li>Original sequence&nbsp;<code>GL</code>:&nbsp;<code>GGGGGGGL</code></li>
	<li>Original sequence&nbsp;<code>LG</code>:&nbsp;<code>LGGGGGGG</code></li>
	<li>Original sequence&nbsp;<code>LL</code>:&nbsp;<code>LLLLLLLL</code></li>
</ul>

<p>One valid solution is to just look at tile #2. If tile #2 turns out to be&nbsp;<code>G</code>, then you will know for sure the artwork contains at least one&nbsp;<code>G</code>. (You will not know whether the original sequence is&nbsp;<code>GG</code>,&nbsp;<code>GL</code>, or&nbsp;<code>LG</code>, but that doesn&#39;t matter.) If tile #2 turns out to be&nbsp;<code>L</code>, then you will know that the original sequence must be&nbsp;<code>LL</code>, so there are no&nbsp;<code>G</code>s in the artwork. So&nbsp;<code>2</code>&nbsp;is a valid solution.</p>

<p>On the other hand, it would not be valid to just look at tile #1. If it turns out to be&nbsp;<code>L</code>, you will only know that the original sequence could have been either&nbsp;<code>LG</code>&nbsp;or&nbsp;<code>LL</code>. If the original sequence is&nbsp;<code>LG</code>, there is at least one&nbsp;<code>G</code>&nbsp;in the artwork, but if the original sequence is&nbsp;<code>LL</code>, there are no&nbsp;<code>G</code>s. So&nbsp;<code>1</code>&nbsp;would not be a valid solution.</p>

<p>Note that&nbsp;<code>1 2</code>&nbsp;is also a valid solution, because tile #2 already provides all the information you need.&nbsp;<code>1 2 3</code>&nbsp;is not a valid solution, because it uses too many tiles.</p>

<p>In sample case #2, the artwork must consist of only one tile: either&nbsp;<code>G</code>&nbsp;or&nbsp;<code>L</code>. Looking at that tile will trivially tell you whether or not the artwork has a&nbsp;<code>G</code>&nbsp;in it.</p>

<p>In sample case #3, which would not appear in the Small dataset, the artwork must be either&nbsp;<code>GG</code>,&nbsp;<code>GL</code>,&nbsp;<code>LG</code>, or&nbsp;<code>LL</code>. You can only look at one tile, and neither of them on its own is enough to answer the question. If you see&nbsp;<code>L</code>&nbsp;for tile #1, you will not know whether the artwork is&nbsp;<code>LG</code>&nbsp;or&nbsp;<code>LL</code>, so you will not know whether any&nbsp;<code>G</code>s are present. If you see&nbsp;<code>L</code>&nbsp;for tile #2, you will not know whether the artwork is&nbsp;<code>GL</code>&nbsp;or&nbsp;<code>LL</code>, so you will not know whether any&nbsp;<code>G</code>s are present.</p>

<p>Sample case #4 is like sample case #3, but with access to one more tile. Now you can just look at the entire artwork.</p>

<p>In sample case #5, there are eight possible original sequences, and they would produce the following artwork:</p>

<p>&nbsp;</p>

<ul>
	<li>Original sequence&nbsp;<code>GGG</code>:&nbsp;<code>GGGGGGGGG</code></li>
	<li>Original sequence&nbsp;<code>GGL</code>:&nbsp;<code>GGGGGGGGL</code></li>
	<li>Original sequence&nbsp;<code>GLG</code>:&nbsp;<code>GGGGLGGGG</code></li>
	<li>Original sequence&nbsp;<code>GLL</code>:&nbsp;<code>GGGGLLGLL</code></li>
	<li>Original sequence&nbsp;<code>LGG</code>:&nbsp;<code>LGGGGGGGG</code></li>
	<li>Original sequence&nbsp;<code>LGL</code>:&nbsp;<code>LGLGGGLGL</code></li>
	<li>Original sequence&nbsp;<code>LLG</code>:&nbsp;<code>LLGLLGGGG</code></li>
	<li>Original sequence&nbsp;<code>LLL</code>:&nbsp;<code>LLLLLLLLL</code></li>
</ul>

<p>One valid solution is to look at tiles #2 and #6. If they both turn out to be&nbsp;<code>L</code>s, the artwork must be all&nbsp;<code>L</code>s. Otherwise, there must at least one&nbsp;<code>G</code>. Note that&nbsp;<code>1 2</code>&nbsp;would not be a valid solution, because even if those tiles both turn out to be&nbsp;<code>L</code>s, that does not rule out an original sequence of&nbsp;<code>LLG</code>.&nbsp;<code>6 2</code>&nbsp;would be a valid solution, since the order of the positions in your solution does not matter.</p>