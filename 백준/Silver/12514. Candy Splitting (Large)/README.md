# [Silver II] Candy Splitting (Large) - 12514

[문제 링크](https://www.acmicpc.net/problem/12514)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 96, 정답: 70, 맞힌 사람: 67, 정답 비율: 76.136%

### 분류

비트마스킹, 그리디 알고리즘

### 문제 설명

<p>Sean and Patrick are brothers who just got a nice bag of candy from their parents. Each piece of candy has some positive integer value, and the children want to divide the candy between them. First, Sean will split the candy into two piles, and choose one to give to Patrick. Then Patrick will try to calculate the value of each pile, where the value of a pile is the sum of the values of all pieces of candy in that pile; if he decides the piles don&#39;t have equal value, he will start crying.</p>

<p>Unfortunately, Patrick is very young and doesn&#39;t know how to add properly. He&nbsp;<em>almost</em>knows how to add numbers in binary; but when he adds two 1s together, he always forgets to carry the remainder to the next bit. For example, if he wants to sum 12 (1100 in binary) and 5 (101 in binary), he will add the two rightmost bits correctly, but in the third bit he will forget to carry the remainder to the next bit:</p>

<pre>
  1100
+ 0101
------
  1001
</pre>

<p>So after adding the last bit without the carry from the third bit, the final result is 9 (1001 in binary). Here are some other examples of Patrick&#39;s math skills:</p>

<pre>
5 + 4 = 1
7 + 9 = 14
50 + 10 = 56
</pre>

<p>Sean is very good at adding, and he wants to take as much value as he can without causing his little brother to cry. If it&#39;s possible, he will split the bag of candy into two non-empty piles such that Patrick thinks that both have the same value. Given the values of all pieces of candy in the bag, we would like to know if this is possible; and, if it&#39;s possible, determine the maximum possible value of Sean&#39;s pile.</p>

### 입력

<p>The first line of the input gives the number of test cases,&nbsp;<strong>T</strong>.&nbsp;&nbsp;<strong>T</strong>&nbsp;test cases follow. Each test case is described in two lines. The first line contains a single integer&nbsp;<strong>N</strong>, denoting the number of candies in the bag. The next line contains the&nbsp;<strong>N</strong>&nbsp;integers&nbsp;<strong>C<sub>i</sub></strong>&nbsp;separated by single spaces, which denote the value of each piece of candy in the bag.</p>

<h3>Limits</h3>

<ul>
	<li>1 &le;&nbsp;<strong>T</strong>&nbsp;&le; 100.</li>
	<li>1 &le;&nbsp;<strong>C<sub>i</sub></strong>&nbsp;&le; 10<sup>6</sup>.</li>
	<li>2 &le;&nbsp;<strong>N</strong>&nbsp;&le; 1000.</li>
</ul>

### 출력

<p>For each test case, output one line containing &quot;Case #x: y&quot;, where x is the case number (starting from 1). If it is impossible for Sean to keep Patrick from crying, y should be the word &quot;NO&quot;. Otherwise, y should be the value of the pile of candies that Sean will keep.</p>