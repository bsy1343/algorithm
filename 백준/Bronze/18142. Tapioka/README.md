# [Bronze II] Tapioka - 18142

[문제 링크](https://www.acmicpc.net/problem/18142)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 273, 정답: 210, 맞힌 사람: 185, 정답 비율: 77.083%

### 분류

구현, 문자열

### 문제 설명

<p>Nowadays, bubble tea has been famous around the globe. They have different names &ndash; bubbles, pearls, and tapioka. People start thinking to put almost every food together with tapioka. E.g., bubble tea pizza, bubble tea ramen, bubble tea hotpot, bubble tea cake, and so on.</p>

<p>Given the name of a dish, you are going to repeatedly remove all the tapioka part and reveal the true colors of that dish. Notice that the dishes in this problem will consist of exactly three words. Every dish always starts with either the term &ldquo;bubble tea&rdquo; or &ldquo;tapioka&rdquo;. For example, you may observe a dish named &ldquo;bubble tea ramen&rdquo;, but you will never observe a dish named &ldquo;bubble ramen tea&rdquo;.</p>

### 입력

<p>The input file contains exactly one test case. There is only one line in the input file, and it contains a dish name consisting of exactly three words.</p>

### 출력

<p>If after repeatedly removing all occurrence of &ldquo;bubble&rdquo; or &ldquo;tapioka&rdquo; (as entire word) but you found nothing left, output &ldquo;nothing&rdquo;. Otherwise, output the remaining words separated by blanks in the original order.</p>

### 제한

<ul>
	<li>In this problem, a word is a string of English letters in lowercase.</li>
	<li>In the input file, all words are seperated by blanks.</li>
	<li>The length of each word does not exceed 32.</li>
</ul>