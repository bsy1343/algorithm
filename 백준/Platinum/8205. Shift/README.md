# [Platinum I] Shift - 8205

[문제 링크](https://www.acmicpc.net/problem/8205)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 165, 정답: 44, 맞힌 사람: 24, 정답 비율: 18.750%

### 분류

애드 혹, 해 구성하기, 수학

### 문제 설명

<p>Byteasar bought his son Bytie a set of blocks numbered from 1 to n and arranged them in a row in a certain order. Bytie&#39;s goal is to rearrange the blocks so that they are ordered naturally, from the smallest number to the largest. However, the only moves Bytie is allowed to make are:</p>

<ul>
	<li>putting the last block at the very beginning (move a), and</li>
	<li>putting the third block at the very beginning (move b).</li>
</ul>

<p>Help Bytie by writing a program that tells whether a given arrangement of blocks can be properly reordered, and tells the right sequence of moves if it is.</p>

### 입력

<p>In the first line of the standard input there is a single integer n, 1 &le; n &le; 2,000. In the second line there are n integers from the range 1 to n, separated by single spaces. No number appears twice, and thus they represent the initial arrangement of the blocks.</p>

### 출력

<p>If there is no sequence of moves leading to an arrangement with increasing blocks&#39; numbers, your program should print out &quot;NIE DA SIE&quot; (there is no way in Polish), without the quotation marks.</p>

<p>Otherwise there should be a single integer m (m &le; n^2), denoting the number of operations, in the first line. An operation is a k-fold execution of either a or b move.</p>

<p>If m &gt; 0, then there should be a sequence of m integers with either a or b appended in the second line. Thus ka (for 0 &lt; k &lt; n) denotes the k-fold execution of the move a. Analogously, kb (for 0 &lt; k &lt; n) denotes the -fold execution of the move b.</p>

<p>Furthermore, the characters appended to the numbers in the second line have to alternate.</p>

<p>Should there be more than one solution, your program is free to pick one arbitrarily.</p>