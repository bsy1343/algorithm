# [Gold II] Manhattan Sort - 9361

[문제 링크](https://www.acmicpc.net/problem/9361)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 84, 정답: 46, 맞힌 사람: 41, 정답 비율: 63.077%

### 분류

그리디 알고리즘, 정렬

### 문제 설명

<p>Yet another sorting problem! In this one, you&rsquo;re given a sequence S of N distinct integers and are asked to sort it with minimum cost using only one operation:&nbsp;</p>

<p>The Manhattan swap!&nbsp;</p>

<p>Let Si and Sj be two elements of the sequence at positions i and j respectively, applying the Manhattan swap operation to Si and Sj swaps both elements with a cost of |i-j|. For example, given the sequence {9,5,3}, we can sort the sequence with a single Manhattan swap operation by swapping the first and last elements for a total cost of 2 (absolute difference between positions of 9 and 3).&nbsp;</p>

### 입력

<p>The first line of input contains an integer T, the number of test cases. Each test case consists of 2 lines. The first line consists of a single integer (1 &lt;= N &lt;= 30), the length of the sequence S. The second line contains N space separated integers representing the elements of S. All sequence elements are distinct and fit in 32 bit signed integer.</p>

### 출력

<p>For each test case, output one line containing a single integer, the minimum cost of sorting the sequence using only the Manhattan swap operation.&nbsp;</p>