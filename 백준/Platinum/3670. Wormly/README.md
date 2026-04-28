# [Platinum II] Wormly - 3670

[문제 링크](https://www.acmicpc.net/problem/3670)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 41, 정답: 15, 맞힌 사람: 11, 정답 비율: 40.741%

### 분류

자료 구조, 그리디 알고리즘, 두 포인터, 덱

### 문제 설명

<p>Jonly is writing his first computer game. For the opening scene he wants to have the main character, Wormly, cross Bridgely, the bridge. Wormly is a worm made of b equal circular bubbles and l legs. At all times each leg has to be under one of the bubbles, and under each bubble there can be at most one leg. Bridgely was supposed to be composed of n planks with the width of each plank equal to the diameter of each of Wormly&rsquo;s bubbles. However, some of the planks are missing.</p>

<p>At every moment, Wormly can do exactly one of the following:</p>

<p>Move one of its legs forward over any number of (possibly missing) planks. After the move, the leg should be on a plank and underneath one of Wormly&rsquo;s bubbles. A leg isn&rsquo;t allowed to overtake other legs.<br />
Move all of its bubbles forward one plank while its legs remain on the same planks. After the move each leg must still be under one of Wormly&rsquo;s bubbles.</p>

<p><img alt="" src="/upload/images2/worm.png" style="height:178px; width:365px" /></p>

<p>In this example, the only possible move for the last leg is to position b. (The plank at position a is missing, so the leg cannot move there. To get to position c, the last leg would have to overtake the first leg.) Also, in this example, moving all the bubbles forward is not allowed because Wormly&rsquo;s last leg would end up without a bubble over it.</p>

<p>Now Jonly is wondering how long the animation takes until Wormly reaches the end of Bridgely. Initially Wormly&rsquo;s bubbles are directly above the leftmost b planks of the bridge and its legs are on the leftmost l planks. At the end of the animation Wormly&rsquo;s bubbles have to be directly above the rightmost b planks and its legs have to be on the rightmost l planks.</p>

<p>The left- and rightmost l planks of Bridgely are not missing.</p>

### 입력

<p>On the first line a positive integer: the number of test cases, at most 100. After that per test case:</p>

<ul>
	<li>One line with three integers l, b and n (1 &le; l &le; b &le; n &le; 1 000 000): the number of legs, the number of bubbles and the length of the bridge respectively.</li>
	<li>One line with a string consisting of n characters, either &lsquo;0&rsquo; or &lsquo;1&rsquo;, describing Bridgely. A one indicates a plank and a zero indicates a missing plank.</li>
</ul>

### 출력

<p>Per test case:</p>

<ul>
	<li>One line with an integer: the minimum number of steps it takes Wormly to cross Bridgely. If it is impossible to get across while satisfying the constraints, the line must contain &ldquo;IMPOSSIBLE&rdquo; instead.</li>
</ul>