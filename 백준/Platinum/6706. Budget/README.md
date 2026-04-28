# [Platinum II] Budget - 6706

[문제 링크](https://www.acmicpc.net/problem/6706)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 7, 정답: 4, 맞힌 사람: 4, 정답 비율: 57.143%

### 분류

최대 유량, 그래프 이론

### 문제 설명

<p>I have a problem. I was supposed to make a budget proposal for this competition and I havn&rsquo;t started yet. It must be done at the end of the competition or the others will notice that I havn&rsquo;t done it. This is where I need you.</p>

<p>The budget proposal is a matrix where the rows represent the different kinds of expenses and the columns reptresent the different sites.</p>

<p>We had a meeting about this some time ago where we discussed the sums over different kind of expenses and sums over different sites. There was also some talk about special constraints: someone mentioned that Stockholm would need at least SEK 2000 for food and someone from Lund argued they wouldn&rsquo;t use more than SEK 100 for paperclips. Anyway, I&rsquo;m sure there was more, I&rsquo;ll go and try to find some notes from that meeting if you write a program that can solve the problem when we get the data.</p>

<p>And, by the way, no one really reads budget proposals anyway, so you&rsquo;ll just have to make sure that it sums up properly and meets all constraints.</p>

### 입력

<p>The first line of the input contains an integer N giving the number of test cases.</p>

<p>The first line of each test case contains two integers m, n giving the number of rows and columns (m &le; 200, n &le; 20). The second line contains m integers, giving the row sums of the matrix. The third line contains n integers, giving the column sums of the matrix. The fourth line contains an integer c giving the number of constraints. The next c lines contain the constraints.</p>

<p>Each constraint consists of two integers r, c specifying some entry (or entries) in the matrix (the upper left corner is 1 1 and 0 is interpreted as all, i.e. 4 0 means all entries on the fourth row and 0 0 means the entire matrix), one element from the set {&lt;, =, &gt;} and one integer v, with the obvious interpretation. For instance, the constraint 1 2 &gt; 5 means that the entry in the 1st row and 2nd column must have an entry strictly greater than 5, and the constraint 4 0 = 3 means that all elements in the fourth row should be equal to 3.</p>

### 출력

<p>For each case output a matrix of non-negative integers meeting the above constraints or the string &ldquo;IMPOSSIBLE&rdquo; if no legal solution exists.</p>

<p>Output an empty line between cases.</p>