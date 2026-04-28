# [Platinum I] Cubic Art - 12820

[문제 링크](https://www.acmicpc.net/problem/12820)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 8, 정답: 5, 맞힌 사람: 5, 정답 비율: 71.429%

### 분류

애드 혹, 자료 구조, 구현, 세그먼트 트리

### 문제 설명

<p>Modern art is unpredictable. When Bob was tidying his room he found his old Rubik&rsquo;s cube. Then the moment came. He closed his eyes, listened to his inner voice, made a few moves (up to 65 000) and the masterpiece was nearly complete. But the final state was not to his liking. He realized he did some of the moves incorrectly. If only he could go back in time and change them!</p>

<p>All he now needs to do is a few changes (again, up to 65 000 of them). Each of the changes consists of replacing one move with some other move. Bob would like to see what each change does. But it is annoying to repeat the entire sequence of moves again and again.</p>

<p>You are given the initial state of Bob&rsquo;s Rubik&rsquo;s cube. (The cube is not necessarily solved in its initial state.) You are also given the original sequence of moves Bob performed.</p>

<p>Finally, you are given a sequence of changes. Each change is of the form &ldquo;change the k-th move into this new move&rdquo;. For each change, output the state of the cube at the end of the entire sequence of moves.</p>

<p>Note that the changes are permanent &ndash; for example, the second change should be applied to the sequence of moves with the first change, not to the original sequence.</p>

### 입력

<p>Cube&rsquo;s I/O</p>

<p>Let the cube&rsquo;s colors be A,B,C,D,E,F. When you are playing with the cube, the middle squares of its faces do not move. Therefore, we will always use A as the color of the center of the top face, B, C, D, E as the centers of the side faces (in order), and F as the center of the bottom face. The surface of the cube can then be unfolded into the following form:</p>

<pre>
???
?A?
???
????????????
?B??C??D??E?
????????????
???
?F?
???</pre>

<p>First 9 lines of the input contain the description of the starting state of the cube. The description is given in the above form. You may assume that the centers of the six faces are labeled as shown above.</p>

<p>Then there is a line with two integers n and m: n is the number of moves and m is number of subsequent changes.</p>

<p>Next n lines are describing Bob&rsquo;s original moves. They have the form &ldquo;C<sub>i</sub> d<sub>i</sub>&rdquo;, where C<sub>i</sub> is the color of the center of the rotated side and d<sub>i</sub> is &minus;1 in case of a clockwise move and 1 in case of a counterclockwise move.</p>

<p>The last m lines describe the changes, in order. Each one has the form &ldquo;a<sub>j</sub> C<sub>j</sub> d<sub>j</sub>&rdquo;, where a<sub>j</sub> is the (1-based) index of the move that is being replaced and C<sub>j</sub> d<sub>j</sub> describes the new move.</p>

<p>In all test cases, n, m &le; 65 000.&nbsp;</p>

### 출력

<p>Let S<sub>i</sub> be the sequence of moves obtained from the initial sequence by applying the first i changes. For each i between 1 and m, inclusive, output 9 lines: the final state of the cube obtained by starting in the initial configuration and performing the sequence of moves S<sub>i</sub>. Use the same format as in the input.</p>

### 힌트

<p>The original moves cancel each other out. At the end of the original sequence of moves, the cube is back in its initial state.</p>

<p>After we make the four changes described in the input, we obtain a sequence of moves that flips everything except for the centers of all sides.</p>