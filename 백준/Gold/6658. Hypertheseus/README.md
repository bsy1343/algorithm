# [Gold III] Hypertheseus - 6658

[문제 링크](https://www.acmicpc.net/problem/6658)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 10, 정답: 6, 맞힌 사람: 6, 정답 비율: 75.000%

### 분류

너비 우선 탐색, 그래프 이론, 그래프 탐색

### 문제 설명

<p>For one of their clients, ACM prepares a TV advertisement that features ancient heroes, for example Prometheus, Achilles, Odysseus and many others. To demonstrate how difficult was life for these heroes, ACM runs computer simulations of their most famous tasks. In this problem, we will try to solve the problem of Theseus.</p>

<p>Theseus was an Athenian hero who killed Minotaur, the half-man, half-bull monster residing in an inescapable Labyrinth constructed by Daedalus. The hardest part of Theseus&rsquo; task was not killing the monster &mdash; the legend says Minotaur was just sleeping when Theseus came to him. Thus, the hero was able to batter the monster with his bare hands. But then the real challenge came: to find the way out. As you may know, Ariadne, beautiful daughter of king Minos, played an important role in this part. But that&rsquo;s a different story.</p>

<p>As the technology advanced a lot since the ancient times, there are several important differences in today&rsquo;s simulations:</p>

<p>1. Labyrinth-making skills advanced as well. Two-dimensional labyrinths are not a big challenge anymore. Thus, our labyrinth is d-dimensional. It looks like a regular &rdquo;grid&rdquo; of n<sub>1</sub>&times;n<sub>2</sub>&times;...&times;n<sub>d</sub> (hyper)cubes, each of them being either empty (corridor) or filled with a rock (wall). Theseus moves in steps, each step means travelling between two neighboring empty hypercubes in any dimension. Two hypercubes are considered neighboring, if and only if the difference in their space coordinates is exactly one in one dimension, and zero in all other dimensions.</p>

<p>2. Our Minotaur is stronger, thus, it is no more possible to batter him with bare hands. Theseus must use a sword which lies somewhere inside the labyrinth. Note that before he takes the sword, he cannot go through the hypercube where Minotaur resides!</p>

### 입력

<p>The input consists of several labyrinth descriptions. Each description begins with a line containing a single integer number d (2 &le; d &le; 20) &mdash; the number of dimensions. On the second line of each description, there are d integer numbers n<sub>1</sub>, n<sub>2</sub>, ..., n<sub>d</sub> separated by spaces. These numbers give the size of the labyrinth in every dimension, measured in unit hypercubes (&forall;i : 2 &le; ni). You may assume that the total number of hypercubes in any labyrinth will not exceed 2<sup>20</sup> = 1048576.</p>

<p>Then a labyrinth map follows, the description is defined recursively: Two-dimensional labyrinth (of the size n<sub>1</sub> &times; n<sub>2</sub>) is described by n<sub>2</sub> lines containing n<sub>1</sub> characters each. Every character describes a single hypercube (&rdquo;square&rdquo; in the case of 2 dimensions) and is either &ldquo;#&rdquo; (rock), &ldquo;.&rdquo; (free space), or one of uppercase letters &ldquo;T&rdquo; (Theseus&rsquo; position), &ldquo;M&rdquo; (Minotaur), and &rsquo;S&rsquo; (sword). Each of these three objects will appear exactly once in the whole labyrinth. The hypercubes containing the letters are considered &rdquo;empty&rdquo; otherwise, i.e., Theseus can walk (and must walk) through them.</p>

<p>For better clarity of the input, each two-dimensional map is followed by one empty line.</p>

<p>For d &gt; 2, any d-dimensional labyrinth is a sequence of nd &rdquo;layers&rdquo;, each layer being a description of a (d &minus; 1)-dimensional labyrinth.</p>

<p>The last labyrinth description is followed by a line containing zero. This line terminates the input and no output should be produced for it.</p>

### 출력

<p>For each labyrinth, output the sentence &ldquo;Theseus needs S steps.&rdquo;, where S is the smallest possible amount of steps needed to reach the hypercube with the sword, the hypercube with Minotaur, and then back to the original Theseus&rsquo; position (where the exit is supposed to be). It is not possible to leave the labyrinth area, i.e., all hypercubes outside the labyrinth are considered rocks. Exit may appear in an inner hypercube, it may not reside on the &ldquo;border&rdquo;.</p>

<p>If it is not possible to solve the situation at all, output sentences &ldquo;No solution. Poor Theseus!&rdquo;</p>