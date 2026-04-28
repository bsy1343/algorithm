# [Gold III] Pegs and Legs - 21206

[문제 링크](https://www.acmicpc.net/problem/21206)

### 성능 요약

시간 제한: 6 초, 메모리 제한: 1024 MB

### 통계

제출: 15, 정답: 10, 맞힌 사람: 10, 정답 비율: 71.429%

### 분류

수학, 다이나믹 프로그래밍, 확률론

### 문제 설명

<p>Pegs and Legs is a game where a disk slides down a nearly-vertical board. At the bottom of the board are places for the disk to land, called <em>legs</em>. Each leg is worth a certain amount of points if your disk lands in it.</p>

<p>You start with a disk at the top and drop it onto some <em>drop point</em> peg or directly into some <em>drop point</em> leg. When your disk hits a peg, one of three things happen: (1) the disk falls to the left with probability $\ell$, (2) the disk falls to the right with probability $r$, or (3) it gets stuck with probability $1 - \ell - r$. The probabilities may be different for each peg. If the disk falls to the left or to the right, then it will either fall onto another peg or into a leg. If the disk gets stuck, then you must drop it again from some drop point on the top. The figure below illustrates the 3rd sample input, the two dark pegs are the drop points.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/b8dc39fe-2690-4526-8936-2cbedcbefb1c/-/preview/" style="width: 300px; height: 225px;" /></p>

<p>Because of gravity it is not possible for a disk to hit the same peg more than once unless the disk is dropped again. The game continues until your disk lands in a leg, at which point you earn the value of that leg. What is the maximum possible expected score the player can earn?</p>

### 입력

<p>The first line of input contains two integers $L$ ($1 \leq L \leq 100\,000$), which is the number of legs, and $P$ ($1 \leq P \leq 100\,000$), which is the number of pegs. Legs are numbered from $1$ to $L$ and pegs are labeled from $L+1$ to $L+P$.</p>

<p>The next $L$ lines describe the legs, in order. Each of these lines contains a single integer $v$ ($1 \leq v \leq 1\,000\,000$), which is the value of this leg.</p>

<p>The next $P$ lines describe the pegs, in order. Each of these lines starts with two real numbers $\ell$ ($0 &lt; \ell &lt; 1$), which is the probability that the disk falls to the left after hitting this peg, and $r$ ($0 &lt; r &lt; 1$), which is the probability that the disk falls to the right after hitting this peg ($\ell + r \leq 1$), followed by two integers $x$ ($1 \leq x \leq L+P$), which is the label of the peg/leg the disk falls onto if it falls to the left, and $y$ ($1 \leq y \leq L+P$), which is the label of the peg/leg the disk falls onto if it falls to the right. It is guaranteed that $x$ and $y$ are smaller labels than the label of this peg.</p>

<p>All real numbers are specified to exactly 3 decimal places. A peg or leg is a drop point if there are no pegs that drop into this peg or leg.</p>

<p>It is guaranteed that from any peg (whether a drop point or not), the probability the disk eventually gets stuck after reaching this peg is at most $0.9999$.</p>

### 출력

<p>Display the maximum possible expected score the player can earn. Answers with an absolute error or relative error of at most $10^{-6}$ will be accepted.</p>