# [Silver IV] Levenshtein Distance - 17998

[문제 링크](https://www.acmicpc.net/problem/17998)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 512 MB

### 통계

제출: 151, 정답: 101, 맞힌 사람: 88, 정답 비율: 64.234%

### 분류

자료 구조, 문자열, 정렬, 집합과 맵, 트리를 사용한 집합과 맵

### 문제 설명

<p>The <em>Levenshtein Distance</em> between two strings is the smallest number of simple one-letter operations needed to change one string to the other. The operations are:</p>

<ul>
	<li>Adding a letter anywhere in the string.</li>
	<li>Removing a letter from anywhere in the string.</li>
	<li>Changing any letter in the string to any other letter.</li>
</ul>

<p>Given a specific alphabet and a particular query string, find all other unique strings from that alphabet that are at a <em>Levenshtein Distance</em> of 1 from the given string, and list them in alphabetical order, with no duplicates.</p>

<p>Note that the query string must not be in the list. Its <em>Levenshtein Distance</em> from itself is 0, not 1.</p>

### 입력

<p>Input consists of exactly two lines. The first line of input contains a sequence of unique lower-case letters, in alphabetical order, with no spaces between them. This is the alphabet to use.</p>

<p>The second line contains a string <em>s</em> (2 &le; |<em>s</em>| &le; 100), which consists only of lower-case letters from the given alphabet. This is the query string.</p>

### 출력

<p>Output a list, in alphabetical order, of all strings which are a <em>Levenshtein Distance</em> of 1 from the query string 𝒔. Output one word per line, with no duplicates.</p>