# [Gold IV] Song Titles - 11454

[문제 링크](https://www.acmicpc.net/problem/11454)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 109, 정답: 44, 맞힌 사람: 41, 정답 비율: 46.067%

### 분류

그리디 알고리즘, 문자열, 해 구성하기

### 문제 설명

<p>Somewhere on the outskirts of Leiden&rsquo;s music scene, there is an obscure instrumental rock group consisting of students from Leiden University. They call themselves naaagrm, which is an anagram of an existing word in the Swedish language. All of their song titles are anagrams of existings words as well. However, many people seem to struggle with the pronunciation of the band name, as they don&rsquo;t know how to properly pronunciate the triple a (in case you were wondering, it is pronounced as what linguists like to call an open front unrounded vowel, and a very long one at that). Therefore the band members have decided to modify all their song titles by changing the order of the letters in such a way that no two consecutive letters are the same. Since this is a tedious task, they ask for your help.</p>

### 입력

<p>The input starts with a line containing an integer T, the number of test cases. Then for each test case:</p>

<ul>
	<li>One line containing a single string, the current name of the song. The string consists of lowercase letters only, and has length between 1 and 10<sup>5</sup> inclusive.</li>
</ul>

### 출력

<p>For each test case, output an anagram of the input string such that no two consecutive letters are the same. If there are multiple ways to do this, output the lexicographically smallest one. If it is impossible to do so, output IMPOSSIBLE instead.</p>