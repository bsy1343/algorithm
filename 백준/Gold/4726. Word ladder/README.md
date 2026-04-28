# [Gold IV] Word ladder - 4726

[문제 링크](https://www.acmicpc.net/problem/4726)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 29, 정답: 18, 맞힌 사람: 12, 정답 비율: 54.545%

### 분류

그래프 이론, 문자열, 최단 경로, 플로이드–워셜

### 문제 설명

<p>You now work for a puzzle company. They have a puzzle they call a Word Ladder. A solver starts with a given starting word, and makes changes one letter at a time until s/he reaches a target word, with no word in the chain appearing more than once. There are three ways to take a single step from one word to another:</p>

<ul>
	<li>Change one letter&nbsp;</li>
	<li>Add one letter</li>
	<li>Remove one letter</li>
</ul>

<p>So, it&rsquo;s one step from COT to CAT, one step from CAT to SCAT, and one step from SCAT to SAT. Here&rsquo;s a word ladder from COT to SCAT:</p>

<p>COT &rArr; CAT &rArr; SAT &rArr; SCAT&nbsp;</p>

<p>Here&rsquo;s another word ladder from COT to SCAT:</p>

<p>COT &rArr; CAT &rArr; SCAT</p>

<p>The length of a word ladder is the number of words in it, so the examples above show a word ladder of length 4, and one of length 3. The second is the shortest possible between COT and SCAT. Shorter ladders are considered better than longer ladders.</p>

<p>The puzzle company knows that, given two words, a smart solver will always find the best ladder, which is the shortest ladder, between them. They want to give their solvers a challenge, so they are looking for long word ladders. Given a limited vocabulary, you need to tell them the length of the longest word ladder that a smart solver would find using only words in that vocabulary - that is, the longest of all best ladders.</p>

### 입력

<p>Input will consist of multiple datasets. Each dataset starts with an integer N (1 &le; N &le; 500) which indicates the number of words in the vocabulary. The words follow, one per line.</p>

<p>Each word will consist only of 1 to 50 lower-case letters. There will be no other characters or white space.</p>

<p>The end of input is indicated by a line containing a single zero.</p>

### 출력

<p>For each input set, print a line containing a single integer representing the length of the longest ladder that a smart solver would find.</p>