# [Gold V] THE SULTAN'S CHAPATI - 9697

[문제 링크](https://www.acmicpc.net/problem/9697)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 15, 정답: 14, 맞힌 사람: 14, 정답 비율: 93.333%

### 분류

해 구성하기, 그리디 알고리즘, 구현, 정렬

### 문제 설명

<p>The Sultan of Isketambola likes his Chapati served to him in a stack of uniquely sized Chapatis and heated up in a special way. The cook for the Sultan would have to heat up a stack of uniquely sized Chapati where each Chapati on the bottom of the stack is larger in diameter to the one above. You are to write a program that indicates how the stack can be sorted so that the largest Chapati is on the bottom and the smallest Chapati is on the top. The size of a Chapati is given by the Chapati&#39;s diameter. All Chapatis in a stack have different diameters.</p>

<p>Sorting a stack is done by a sequence of Chapati &ldquo;flips&rdquo;. A flip consists of inserting a spatula between two Chapatis in a stack and flipping (reversing) the Chapatis on the spatula (reversing the sub-stack). A flip is specified by giving the position of the Chapati on the bottom of the sub-stack to be flipped (relative to the whole stack). The Chapati on the bottom of the whole stack has position 1 and the Chapati on the top of a stack of n Chapatis has position n.&nbsp;</p>

<p>A stack is specified by giving the diameter of each Chapati in the stack in the order in which the Chapatis appear.</p>

<p>For example, consider the three stacks of Chapatis below (in which Chapati 8 is the top-most Chapati of the left stack):</p>

<p>8 2 4<br />
6 4 2<br />
1 1 1<br />
4 6 6<br />
2 8 8</p>

<p>The stack on the left can be transformed to the stack in the middle via flip(1). The middle stack can be transformed into the right stack via the command flip(4). A final flip of flip(3) will result in a sorted stack.</p>

### 입력

<p>First line of the input contains T the number of test cases (1&lt;=T&lt;=1000). Each test case consists two lines. First line of the test case contains N (1&lt;=N&lt;=30), the number of Chapatis in the stack. The next line contains N integers separated by a single space. Each integer specifies the diameter of the Chapati between 1 and 100 from the top most position to the bottom.</p>

### 출력

<p>For each test case, the output contains a line in the format Case #x: followed by a sequence of integers, where x is the case number (starting from 1). For each stack the sequence of flips should be terminated by a 0 (indicating no more flips are necessary). Once a stack is sorted, no more flips should be made.</p>