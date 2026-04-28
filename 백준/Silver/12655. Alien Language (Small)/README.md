# [Silver II] Alien Language (Small) - 12655

[문제 링크](https://www.acmicpc.net/problem/12655)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 94, 정답: 55, 맞힌 사람: 50, 정답 비율: 63.291%

### 분류

자료 구조, 문자열, 브루트포스 알고리즘, 집합과 맵, 파싱

### 문제 설명

<p>After years of study, scientists at Google Labs have discovered an alien language transmitted from a faraway planet. The alien language is very unique in that every word consists of exactly&nbsp;<strong>L</strong>&nbsp;lowercase letters. Also, there are exactly&nbsp;<strong>D</strong>&nbsp;words in this language.</p>

<p>Once the dictionary of all the words in the alien language was built, the next breakthrough was to discover that the aliens have been transmitting messages to Earth for the past decade. Unfortunately, these signals are weakened due to the distance between our two planets and some of the words may be misinterpreted. In order to help them decipher these messages, the scientists have asked you to devise an algorithm that will determine the number of possible interpretations for a given pattern.</p>

<p>A pattern consists of exactly&nbsp;<strong>L</strong>&nbsp;tokens. Each token is either a single lowercase letter (the scientists are very sure that this is the letter) or a group of unique lowercase letters surrounded by parenthesis ( and ). For example: (ab)d(dc) means the first letter is either a or b, the second letter is definitely d and the last letter is either d or c. Therefore, the pattern (ab)d(dc) can stand for either one of these 4 possibilities: add, adc, bdd, bdc.</p>

### 입력

<p>The first line of input contains 3 integers,&nbsp;<strong>L</strong>,&nbsp;<strong>D</strong>&nbsp;and&nbsp;<strong>N</strong>&nbsp;separated by a space.&nbsp;<strong>D</strong>&nbsp;lines follow, each containing one word of length&nbsp;<strong>L</strong>. These are the words that are known to exist in the alien language.&nbsp;<strong>N</strong>&nbsp;test cases then follow, each on its own line and each consisting of a pattern as described above. You may assume that all known words provided are unique.</p>

<p>Limits</p>

<ul>
	<li>1 &le;&nbsp;<strong>L</strong>&nbsp;&le; 10</li>
	<li>1 &le;&nbsp;<strong>D</strong>&nbsp;&le; 25</li>
	<li>1 &le;&nbsp;<strong>N</strong>&nbsp;&le; 10</li>
</ul>

### 출력

<p>For each test case, output&nbsp;</p>

<pre>
Case #<strong>X</strong>: <strong>K</strong></pre>

<p>where&nbsp;<strong>X</strong>&nbsp;is the test case number, starting from 1, and&nbsp;<strong>K</strong>&nbsp;indicates how many words in the alien language match the pattern.</p>