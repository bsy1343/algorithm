# [Bronze I] Block Game - 14174

[문제 링크](https://www.acmicpc.net/problem/14174)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 1226, 정답: 713, 맞힌 사람: 668, 정답 비율: 60.452%

### 분류

구현, 문자열

### 문제 설명

<p>Farmer John is trying to teach his cows to read by giving them a set of N spelling boards typically used with preschoolers (1&le;N&le;100). Each board has a word and an image on each side. For example, one side might have the word &#39;cat&#39; along with a picture of a cat, and the other side might have the word &#39;dog&#39; along with a picture of a dog. When the boards are lying on the ground, N&nbsp;words are therefore shown. By flipping over some of the boards, a different set of N words can be exposed.</p>

<p>To help the cows with their spelling, Farmer John wants to fashion a number of wooden blocks, each embossed with a single letter of the alphabet. He wants to make sufficiently many blocks of each letter so that no matter which set of N words is exposed on the upward-facing boards, the cows will be able to spell all of these words using the blocks. For example, if N=3 and the words &#39;box&#39;, &#39;cat&#39;, and &#39;car&#39; were facing upward, the cows would need at least one &#39;b&#39; block, one &#39;o&#39; block, one &#39;x&#39; block, two &#39;c&#39; blocks, two &#39;a&#39; blocks, one &#39;t&#39; block, and one &#39;r&#39; block.</p>

<p>Please help the Farmer John determine the minimum number of blocks for each letter of the alphabet that he needs to provide, so that irrespective of which face of each board is showing, the cows can spell all N visible words.</p>

### 입력

<p>Line 1 contains the integer N.</p>

<p>The next N lines each contain 2 words separated by a space, giving the two words on opposite sides of a board. Each word is a string of at most 10 lowercase letters.</p>

### 출력

<p>Please output 26 lines. The first output line should contain a number specifying the number of copies of &#39;a&#39; blocks needed. The next line should specify the number of &#39;b&#39; blocks needed, and so on.</p>

### 힌트

<p>In this example, there are N=3 boards, giving 2<sup>3</sup>=8 possibilities for the set of upward-facing words:</p>

<ul>
	<li>fox dog car</li>
	<li>fox dog bus</li>
	<li>fox cat car</li>
	<li>fox cat bus</li>
	<li>box dog car</li>
	<li>box dog bus</li>
	<li>box cat car</li>
	<li>box cat bus</li>
</ul>

<p>We need enough blocks for each letter of the alphabet so that we can spell all three words, irrespective of which of these eight scenarios occurs.</p>