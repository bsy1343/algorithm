# [Silver V] Dogs and Cats - 23261

[문제 링크](https://www.acmicpc.net/problem/23261)

### 성능 요약

시간 제한: 서브태스크 참고 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 74, 정답: 56, 맞힌 사람: 52, 정답 비율: 75.362%

### 분류

구현, 시뮬레이션

### 문제 설명

<p>You work for an animal shelter and you are responsible for feeding the animals. You already prepared $D$&nbsp;portions of dog food and&nbsp;$C$&nbsp;portions of cat food.</p>

<p>There are a total of&nbsp;$N$&nbsp;animals waiting in a line, some of which are dogs and others are cats. It might be possible that all the animals in the line are dogs or all the animals are cats. A string $S$&nbsp;of&nbsp;$N$&nbsp;characters&nbsp;<code>C</code>&nbsp;and&nbsp;<code>D</code>&nbsp;represents the order of cats and dogs in the line. The&nbsp;$i$-th character is equal to&nbsp;<code>C</code>&nbsp;if the&nbsp;$i$-th animal in the line is a cat. Similarly, the&nbsp;$i$-th character is equal to&nbsp;<code>D</code>&nbsp;if the&nbsp;$i$-th animal in the line is a dog.</p>

<p>The animals are fed in the order they stay in the line. Each dog eats exactly&nbsp;$1$&nbsp;portion of dog food and similarly each cat eats exactly&nbsp;$1$&nbsp;portion of cat food. Moreover, you have extra portions of cat food. Every time&nbsp;<u>a dog</u>&nbsp;eats food, you bring&nbsp;$M$&nbsp;extra portions of cat food for cats.</p>

<p>Animals have to be fed in the order they wait in line and an animal can only eat if the animal before it has already eaten. That means that if you run out of dog (or cat) food portions and a dog (or a cat) is about to get fed, the line will not move, as all the animals will wait patiently.</p>

<p>You need to determine if in this scenario&nbsp;<u>all the dogs</u>&nbsp;in the line will be fed. Note that this means that some cats might remain in the line, but worry not, you will eventually feed them later!</p>

### 입력

<p>The first line of the input gives the number of test cases, $T$.&nbsp;$T$&nbsp;test cases follow.</p>

<p>The first line of each test case contains four integers&nbsp;$N$,&nbsp;$D$,&nbsp;$C$, and&nbsp;$M$: the number of animals, the initial number of dog food portions, the initial number of cat food portions, and the additional portions of cat food that we add after a dog eats a portion of dog food, respectively.</p>

<p>The next line contains a string&nbsp;$S$&nbsp;of length&nbsp;$N$&nbsp;representing the arrangement of animals.</p>

### 출력

<p>For each test case, output one line containing&nbsp;<code>Case #x:&nbsp;y</code>, where $x$&nbsp;is the test case number (starting from&nbsp;$1$) and&nbsp;$y$&nbsp;is&nbsp;<code>YES</code>&nbsp;if all the dogs will be fed and&nbsp;<code>NO</code>&nbsp;otherwise.</p>

### 제한

<ul>
	<li>$1 \le T \le 100$.</li>
	<li>$1 &le; N &le; 10^4$.</li>
	<li>$0 &le; D, C &le; 10^6$.</li>
	<li>$S$ consists of only characters&nbsp;<code>C</code>&nbsp;and&nbsp;<code>D</code>.</li>
</ul>