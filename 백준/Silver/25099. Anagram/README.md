# [Silver III] Anagram - 25099

[문제 링크](https://www.acmicpc.net/problem/25099)

### 성능 요약

시간 제한: 4 초 (추가 시간 없음), 메모리 제한: 256 MB

### 통계

제출: 259, 정답: 162, 맞힌 사람: 127, 정답 비율: 60.766%

### 분류

자료 구조, 문자열, 정렬, 집합과 맵, 해시를 사용한 집합과 맵

### 문제 설명

<p>Two words are anagrams if the letters of the first word can be reordered to obtain the second one. An instance of anagrams is the pair &ldquo;listen&rdquo; and &ldquo;silent&rdquo;.</p>

<p>You are given a list of words, each word consisting of lowercase letters. Your goal is to filter this list by dropping any word whose anagram has already appeared earlier on the list.</p>

### 입력

<p>The first line contains $n$, the length of the list. This is followed by $n$ lines, each containing one word.</p>

### 출력

<p>Print out the list of words without anagrams, one word per line. The words should appear in the same order as given in the input.</p>

### 제한

<ul>
	<li>$1 &le; n &le; 10^5$</li>
	<li>All letters are lowercase letters of the English alphabet.</li>
	<li>Length of any word will not exceed $100$.</li>
</ul>