# [Bronze III] Sequences - 5101

[문제 링크](https://www.acmicpc.net/problem/5101)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 2634, 정답: 1014, 맞힌 사람: 869, 정답 비율: 40.102%

### 분류

수학, 사칙연산

### 문제 설명

<p>An arithmetic sequence is one in which there is some first number, and then a series of numbers which are all a fixed number different.</p>

<p>For example 3, 5, 7, 9 is an arithmetic sequence that has a first number 3. Then each term after that in the sequence is formed by adding 2 to the previous term. (The terms are different by 2). The 3 is also called the first term (term 1) and 9 is the 4th term.</p>

<p>Given a starting number, a difference and a value, your program is to work out if the number could be part of the sequence. If so, output which term that number would be, and if not, output a letter X.</p>

### 입력

<p>Input will consist of a number of lines, where each line has 3 numbers separated by spaces.</p>

<p>The first number is an integer&nbsp;that is the first term in the sequence. The second is the difference - this will be a non-zero integer. The third is the value that you will need to test to determine whether it can be part of the sequence or not.</p>

<p>Input is terminated by a zero value for each of the 3 numbers.</p>

### 출력

<p>Output will consist of one line for each input line. It will consist of either a number indicating which term it is, or X if the number isn&rsquo;t part of the sequence</p>

### 제한

<ul>
	<li>-6,000,000 &le; a starting number, a difference, a value &le;&nbsp;6,000,000</li>
</ul>

### 힌트

<p>11 is the 5th term</p>

<p>The sequence is &ndash;1, -4, -7, -10</p>

<p>(-1+ -3 = -4, -4 + &ndash;3 = -7, -7+ -3 = -10)</p>

<p>-8 isn&rsquo;t in the sequence.</p>