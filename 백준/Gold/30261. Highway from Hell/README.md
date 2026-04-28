# [Gold IV] Highway from Hell - 30261

[문제 링크](https://www.acmicpc.net/problem/30261)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 5, 정답: 2, 맞힌 사람: 2, 정답 비율: 40.000%

### 분류

구현, 브루트포스 알고리즘, 시뮬레이션, 물리학

### 문제 설명

<p>To get to Griffith Park, P-22 had to cross multiple freeways. Crossing freeways is dangerous, in particular with all those 62 lanes freeways in LA seem to have. Cars drive by at different speeds, and if you get hit by just one, that&rsquo;s it. You are to write a program that will help P-22 evaluate whether a proposed strategy for crossing a freeway will let him survive, or if not, at which step he would be killed (so he can work on improving it).</p>

<p>We will approximate both P-22 and the cars as 1 &times; 1 squares, with the edges not included (so mathematically, the square (0, 1) &times; (0, 1)). When we describe them, we will be using a 2-D map, and any coordinate we give you will be the bottom left corner of a square (car or P-22). P-22 will try to go from (0, 0) to (0, L + 1), where L is the number of lanes the freeway has. Lane i goes from y-coordinate i to y-coordinate i + 1. (So 0 and L + 1 are just outside of traffic.) In each time step, he can move one lane higher or lower (or stay put) &mdash; he cannot cross multiple lanes in one step, and he does not want to move left or right. A proposed strategy is encoded as a string consisting of characters &lsquo;+&rsquo;, &lsquo;-&rsquo;, &lsquo;0&rsquo;, meaning that P-22 moves to the next higher or next lower lane or stays put, respectively. Specifically, the character in position t = 0, 1, . . . describes what P-22 does from time t until time t + 1. The proposed strategies will all be legal, so they do not move lower from 0 or higher from L + 1, they will end up in L + 1 (assuming P-22 survives), and they will not reach L + 1 at any time before the final step. (P-22 is smart enough not to run back onto the freeway once he has crossed it.)</p>

<p>Each car will stay in one lane throughout, and drive at a constant speed. For each car, you will be given its initial position (an integer lane and floating point position in that lane) and the (floating point) speed with which it drives. The speed describes how many positions the car moves in one time step. Cars move continuously, and so does P-22. So when he crosses a lane, he will temporarily occupy (part of) both lanes, so he could be hit by cars in either lane. Notice, however, that he will not be hit by a car in a different lane as he waits in one lane (because we excluded the edge of the squares).</p>

### 입력

<p>The first line contains a number 1 &le; K &le; 100, which is the number of input data sets in the file. This is followed by K data sets of the following form:</p>

<p>The first line of a data set contains two integers n, L with 0 &le; n &le; 1000 (the number of cars) and 1 &le; L &le; 100 (the number of lanes to cross). This is followed by n lines, each containing an integer ℓ<sub>i</sub> and two floating point numbers s<sub>i</sub>, v<sub>i</sub>. ℓ<sub>i</sub> is the lane that car i drives in, s<sub>i</sub> is the starting position of car i (along the x-axis) at time 0, and v<sub>i</sub> &gt; 0 is the speed with which car i drives.<sup>1</sup> Finally, there is a single line containing a string of at most 1000 characters, each &lsquo;+&rsquo;, &lsquo;-&rsquo;, or &lsquo;0&rsquo;, giving P-22&rsquo;s strategy under consideration.</p>

<hr />
<p><sup>1</sup>You do not need to worry about whether cars may crash into each other &mdash; that&rsquo;s not P-22&rsquo;s concern.</p>

### 출력

<p>For each data set, first output &ldquo;Data Set x:&rdquo; on a line by itself, where x is its number. Then, output the string &ldquo;success&rdquo; if P-22 can make it all the way to the other side of the freeway. Otherwise, enter the first (integer) time step in the strategy during which P-22 would be hit by a car.</p>

<p>Each data set should be followed by a blank line.</p>