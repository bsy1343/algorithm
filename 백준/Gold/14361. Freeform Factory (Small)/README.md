# [Gold IV] Freeform Factory (Small) - 14361

[문제 링크](https://www.acmicpc.net/problem/14361)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 43, 정답: 21, 맞힌 사람: 17, 정답 비율: 56.667%

### 분류

애드 혹, 백트래킹, 비트마스킹, 브루트포스 알고리즘

### 문제 설명

<p>You have just built a brand new factory. Your factory has&nbsp;N&nbsp;different machines, and each machine needs to be&nbsp;operated&nbsp;by exactly one worker for the factory to function well.</p>

<p>You have also hired&nbsp;N&nbsp;workers to operate those machines. Since you were in a hurry when you hired them, you did not check whether they actually know how to operate your machines. Now you have finally asked them, and so you have the information on whether the i-th worker can operate the j-th machine, for each i and j.</p>

<p>In a typical working day, the workers will arrive at the factory in a random order, which can be different each day. As each worker arrives, they will find all machines that they know how to operate and that do not already have an operator. They will choose one of those at random and operate it for the whole working day. If all machines they know how to operate already have an operator, they will not work that day. Your goal is to make sure that all machines are being operated each working day, regardless of what order the workers arrive in and which machines they choose.</p>

<p>For example, suppose there are two workers A and B, and two machines 1 and 2. Suppose that A knows how to operate 1 and 2, and B knows how to operate 1 but not 2. If worker B arrives first, he will pick machine 1, then when worker A arrives she will have to choose 2, and the factory will work well. However, if worker A arrives first, it might happen that she chooses to operate 1 on that day, and then when worker B arrives he does not have anything to do, leaving machine 2 without an operator, and causing your factory to waste a whole day!</p>

<p>As another example, suppose there are two workers A and B, and two machines 1 and 2, and that A knows how to operate 1 but not 2, and B does not know how to operate anything. Then, regardless of the order in which the workers arrive, the factory will not be able to function well.</p>

<p>Before you open your factory, in order to guarantee that the factory will constantly function well, you can teach your workers how to operate machines. It costs one dollar to give a single worker a lesson on how to operate a single machine. Each lesson involves only one worker and only one machine, but you can teach any number of lessons to any number of workers, and the same worker can receive multiple lessons. You cannot make a worker forget how to operate a machine if they already know how to operate it.</p>

<p>For example, both examples above can be fixed by teaching worker B to operate machine 2. In that case each machine is guaranteed to have an operator every day, regardless of which order the workers arrive in and which machines they choose to operate when they have more than one possibility.</p>

<p>What is the minimum amount of dollars you need to spend on training workers to make sure the factory functions well every day?</p>

### 입력

<p>The first line of the input gives the number of test cases,&nbsp;T.&nbsp;T&nbsp;test cases follow. Each test case starts with one line with an integer&nbsp;N, the number of workers (and machines). This line is followed by&nbsp;N&nbsp;lines with a string of&nbsp;N&nbsp;characters each. The j-th character on the i-th of those lines is&nbsp;<code>1</code>&nbsp;if the i-th worker knows how to operate the j-th machine, and&nbsp;<code>0</code>otherwise.</p>

<h3>Limits</h3>

<ul>
	<li>1 &le;&nbsp;T&nbsp;&le; 100.</li>
	<li>1 &le;&nbsp;N&nbsp;&le; 4.</li>
</ul>

### 출력

<p>For each test case, output one line containing&nbsp;<code>Case #x: y</code>, where&nbsp;<code>x</code>&nbsp;is the test case number (starting from 1), and&nbsp;<code>y</code>&nbsp;is a non-negative integer: the minimum amount of dollars you need to spend to make sure that all&nbsp;N&nbsp;machines will always have an operator.</p>

### 힌트

<p>Sample cases #1 and #2 are the ones described in the problem statement.</p>

<p>In sample case #3, nobody knows how to do anything! One optimal strategy is to teach worker A to operate machine 1, worker B to operate machine 2, and worker C to operate machine 3.</p>

<p>In sample case #4, no action is necessary. There is only one worker, and the worker already knows how to operate the one machine.</p>

<p>In sample case #5, worker B already knows how to operate machines 1 and 2. One optimal strategy is to teach worker A to operate machine 3, and make A the only worker who can operate that machine. But now we have to consider that B might operate either machine 1 or 2 upon arrival, so C needs to be able to operate the one not chosen by B. So C must be taught to operate both 1 and 2.</p>