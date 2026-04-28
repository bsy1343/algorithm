# [Gold I] Ancient Manuscript - 3377

[문제 링크](https://www.acmicpc.net/problem/3377)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 28, 정답: 11, 맞힌 사람: 8, 정답 비율: 66.667%

### 분류

구현, 다이나믹 프로그래밍

### 문제 설명

<p>Baltic archaeologists are currently engaged in a very important project and have recently found an ancient manuscript that seems to be crucial for the understanding of the culture that inhabited the area they are exploring. The manuscript is full of drawings, so scientists are able to get a general feel for the subject of the document.</p>

<p>However, there is also a written part, and with that scientists are in trouble. Apart from the language used in the writing being a very ancient, several parts of manuscript were destroyed, some letters disappeared, and they are unable to completely understand what is written there.</p>

<p>One of the scientists said, that the words in the manuscript remind him of a language about which it is known that in any word there may be no more than V<sub>C</sub> and C<sub>C</sub> consecutive vowels and consonants, respectively, and that no more than V<sub>E</sub> and C<sub>E</sub> consecutive vowels and consonants, respectively, may be equal.</p>

<p>That scientist left the group in search of a more precise information. The others, while waiting for that scientist to return, decided to check whether nothing in the manuscript contradicts his hypothesis and estimate the amount of work that may lie ahead, so they want to know in how many different ways the manuscript can possibly be deciphered. We must help them!</p>

<p>Note: vowels are &ldquo;aeiou&rdquo; and there are 21 other letters in the alphabet &ndash; consonants.</p>

### 입력

<p>The first line of the input file contains four integers V<sub>E</sub>, V<sub>C</sub>, C<sub>E</sub> and C<sub>C</sub> (1 &le; V<sub>E</sub> &le; V<sub>C</sub> &le; 4, 1 &le; C<sub>E</sub> &le; C<sub>C</sub> &le; 4) separated by single spaces. The second line contains one word extracted from the manuscript consisting of up to 15 Latin alphabet lowercase letters with missing characters (if any) designated by &ldquo;<code>*</code>&rdquo;.</p>

### 출력

<p>One integer, describing in how many ways it is possible to make up a legal word based only on the constraints given. You may assume that the answer will fit into a 64-bit signed integer. It may happen that scientist&rsquo;s conjecture about the language is incorrect and that there are no ways to make up a legal word; in this case, the answer is, obviously, 0</p>