# [Platinum III] Folding Stick - 26105

[문제 링크](https://www.acmicpc.net/problem/26105)

### 성능 요약

시간 제한: 0.4 초, 메모리 제한: 1024 MB

### 통계

제출: 513, 정답: 232, 맞힌 사람: 187, 정답 비율: 45.610%

### 분류

다이나믹 프로그래밍, 자료 구조, 누적 합, 우선순위 큐

### 문제 설명

<p>There is a folding stick made up of $n$ segments of positive length. The segments are connected by hinges (stretchable strings), allowing the segments to be folded $180$ degrees at each hinge. The <em>wrapping length</em> is said to be the length of the folded stick after the stick is folded at hinges one or more. Depending on the folding strategy, the wrapping length may be different.</p>

<p>You are to find the minimum wrapping length under the condition that the stick is folded in the following way: First, place the segments of the stick along a horizontal line. Then, fold the stick clockwise from left to right. During folding, the segment attached to the left side of each hinge rotates 180 degrees clockwise or not at all.</p>

<p>For example, the figure below shows a four-segment stick with a sum of segment lengths of $10$. In the figure, the lengths of the segments are $3$, $2$, $2$, and $3$ from left to right, and the hinges are marked with ①, ②, ③.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/0f27f678-d172-4395-9b7a-8b3cbedb1cea/-/preview/" style="width: 312px; height: 55px;" /></p>

<p>In this example, the stick cannot be folded at both hinges ① and ②. This is because if the stick is folded at hinge ① and then at hinge ②, the segment with length 3 passing over the hinge ② will be broken. If it is folded only at hinge ②, the wrapping length is 5. If it is folded at hinges ① and ③ in order, the wrapping length is 4 as shown in the figure below.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/bbb60e1d-20d8-4198-bc9a-3bcbfe9bbabe/-/preview/" style="width: 478px; height: 66px;" /></p>

<p>Given a sequence of segments lengths of a folding stick, write a program to output the minimum wrapping length of the stick.</p>

### 입력

<p>Your program is to read from standard input. The input starts with a line containing an integer, $n$ ($2 &le; n &le; 100\,000$), where $n$ is the number of segments of a folding stick. The next line contains $n$ positive integers which represent a sequence of lengths of segments from the leftmost one to rightmost one of the stick. Each segment length is no more than $20\,000$.</p>

### 출력

<p>Your program is to write to standard output. Print exactly one line. The line should contain the positive integer representing the minimum wrapping length.</p>