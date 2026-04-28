# [Platinum V] What’s your Logo? - 4936

[문제 링크](https://www.acmicpc.net/problem/4936)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 55, 정답: 33, 맞힌 사람: 14, 정답 비율: 60.870%

### 분류

자료 구조, 오일러 지표 (χ=V-E+F), 기하학, 구현

### 문제 설명

<p><img alt="" src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/4936/1.png" style="float:right; height:284px; width:157px" />Imagine a 2D diagram drawn in the following way: Starting at the origin, you&rsquo;re given a sequence of letters which is entirely made of the following four letters &rsquo;U&rsquo;, &rsquo;D&rsquo;, &rsquo;L&rsquo;, and &rsquo;R&rsquo;. A &rsquo;U&rsquo; is an instruction for you to move one unit upward and drawing a segment at the same time. Similarly, &rsquo;D&rsquo; is for moving down, &rsquo;L&rsquo; for left, and &rsquo;R&rsquo; for right. For example, figure (a) is drawn by giving the sequence &rsquo;UURDLL&rsquo; while figure (b) is the result of &rsquo;UURRRDLLLLUURRRDDD&rsquo; (in both figures, the starting point is identified by a small circle.)</p>

<p>While segments are allowed to intersect, they&rsquo;re not allowed to overlap. In other words, any two segments will have, at most, one point in common. We&rsquo;re interested in knowing the number of closed polygons, not containing any lines inside, in such diagrams. Figure (a), has only one closed polygon while figure (b) has three. Write a program to do exactly that.</p>

### 입력

<p>Your program will be tested on one or more test cases. Each test case is specified on a separate line. The diagram is specified using a sequence made entirely of (U|D|L|R) and terminated by the letter &rsquo;Q&rsquo;. All letters are capital letters. None of the segments in a test case will overlap. The end of test cases is identified by the letter &rsquo;Q&rsquo; on a line by itself.</p>

<p>&nbsp;</p>

### 출력

<p>For each test case, write the answer on a separate line.</p>