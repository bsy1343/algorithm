# [Gold IV] FreeCell - 11201

[문제 링크](https://www.acmicpc.net/problem/11201)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 117, 정답: 42, 맞힌 사람: 37, 정답 비율: 36.634%

### 분류

수학

### 문제 설명

<p>FreeCell Solitaire is, just as computer science, mostly about sorting. The goal is to sort a deck of cards using a fairly convoluted algorithm.</p>

<p>The rules are the following: A shuffled deck is laid out in eight stacks. Only the topmost card of a stack may be moved. A card of value v may be moved to the top of another stack only if the column is empty, or if the topmost card of the destination stack is of the opposite color and of value v + 1. For instance the three of hearts may be moved on top of the four of clubs. At your disposal you have four free cells (think of them as the available memory if you like!) that are initially empty. Free cells can hold at most one card each, which can be moved according to the same rules as stack cards. Figure H.1 below illustrates a few legal moves.</p>

<p style="text-align: center;"><img alt="" src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/11201/1.png" style="height:279px; width:432px" /></p>

<p style="text-align: center;">Figure H.1: Legal moves for the three of hearts and six of clubs</p>

<p>Most FreeCell computer games allow you to move a pile of cards, provided there are enough empty cells and empty stacks to accomplish this by moving cards from the pile one by one. In the image above for instance, the whole pile with 5, 4 and 3 can be moved over 6 of spades by using some of the free cells and the empty stack to temporarily hold 3 and 4.</p>

<p>You would like to move a sorted pile of K cards from one stack to the top of another stack which is non-empty, but of appropriate color and value. You will ignore all other non-empty stacks, because otherwise you would have to take into account the color and value of the topmost card of those stacks and that would be too complicated.</p>

<p>Even though you ignore the other non-empty stacks, you can still use N free cells and M empty stacks. Is it possible to perform this move?</p>

### 입력

<p>The input consists of several test cases. Each test case is represented by a line with three numbers N, M and K respectively. N is the number of free cells, M is the number of empty stacks and K is the size of the pile you are moving. We are considering a generalized form of Free Cell in which 0 &le; N, M &le; 5 and 0 &le; K &le; 100.</p>

### 출력

<p>The program should print &ldquo;yes&rdquo; if it is possible to move a pile of K cards using N free cells and M empty stacks, and &ldquo;no&rdquo; otherwise.</p>