# [Platinum II] An Arithmetic Rectangle - 3314

[문제 링크](https://www.acmicpc.net/problem/3314)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 22, 정답: 4, 맞힌 사람: 4, 정답 비율: 23.529%

### 분류

많은 조건 분기, 구현, 수학

### 문제 설명

<p>After the lesson on arithmetic progressions, the teacher gave Peter homework: a sheet of paper with numbers written in some cells of a R &times; C grid. Some of the cells were empty. Peter&#39;s task is to create an arithmetic rectangle by filling in the missing numbers. In an arithmetic rectangle, all the numbers in each row and in each column have to form an arithmetic progression in the order in which they appear.</p>

<p>For example, this is a 3 &times; 5 arithmetic rectangle:</p>

<pre>
 1 3 5 7 9
 2 2 2 2 2
 3 1 -1 -3 -5</pre>

<p>Peter is lazy to do such tasks manually. He wants you to write a program that will do it for him.</p>

<p>You are given a grid of integers, some of them substituted by dots. Find out whether it is possible to replace the dots by some rational numbers in order to obtain an arithmetic rectangle. If there is a solution, find one.</p>

<p>Note: An arithmetic progression is a sequence of numbers such that the difference of any two successive elements of the sequence is a constant.</p>

### 입력

<p>The first line of the input contains two positive integers R and C: the dimensions of the grid. R lines follow, each of them containing C tokens separated by single spaces. Each of the tokens is either a dot (.), or an integer.</p>

### 출력

<p>If there is no solution, output a single line with the string &quot;No solution.&quot; (quotes for clarity). If there are multiple solutions, pick and output any single solution.</p>

<p>When outputting a solution, output R rows, each with C space-separated rational numbers.</p>

<p>Each rational number shall be printed as &quot;N/D&quot;, where D is positive and N and D are relatively prime. If D is 1, omit the &quot;/D&quot; part.</p>

<p>No number in your output may have more than 20 digits. (It should be easy to satisfy this restriction, its only intent is to simplify checking your outputs.)</p>

### 제한

<p>Each number given in the grid is between -100 and 100, inclusive. There are 10 batches of test cases, worth 10 points each. In batches 1 through 9 we have 1 &le; R, C &le; 6. The properties of the individual batches are given below.</p>

<ul>
	<li>Batch 1. All numbers are already filled in.</li>
	<li>Batch 2. Either R = 1 or C = 1 in each test case.</li>
	<li>Batch 3. R = C = 2 in each test case.</li>
	<li>Batch 4. Each test case has a unique solution that can be found using the approach suggested in the first example.</li>
	<li>Batch 5. Each test case has a unique solution, and the solution contains integers only.</li>
	<li>Batch 6. Each test case has a unique solution.</li>
	<li>Batch 7. Each test case either has a unique solution that contains integers only, or has no solution at all.</li>
	<li>Batch 8. Each test case either has a unique solution, or has no solution at all.</li>
	<li>Batch 9. Arbitrary test cases.</li>
	<li>Batch 10. Arbitrary test cases with 1 &le; R, C &le; 50.</li>
</ul>