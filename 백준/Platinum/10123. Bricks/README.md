# [Platinum I] Bricks - 10123

[문제 링크](https://www.acmicpc.net/problem/10123)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 256 MB

### 통계

제출: 290, 정답: 50, 맞힌 사람: 43, 정답 비율: 16.667%

### 분류

그리디 알고리즘, 해 구성하기, 많은 조건 분기

### 문제 설명

<p>Little Bitie and his friends spent the whole yesterday playing with colorful bricks in the kindergarten. Initially they made building models but they quickly got bored with that. Then they decided to place the bricks in a line, one after another. To avoid a dull look, they tried to avoid putting two bricks of the same color next to each other. After a long while they succeeded in placing all the bricks while observing this rule. Then the day care was over, and the children went home with their parents.</p>

<p>Today Bitie came to the kindergarten early. He was satisfied to see that their yesterday&#39;s creation was still standing. But then he tripped over in a most unfortunate way, falling right on the line of bricks, which all mixed in a pile. The boy quickly sorted them by color and wondered how best to quickly reassemble the perfect line. He managed to recall what were the colors of the two bricks on both end of the line.</p>

<p>Help little Bitie out and tell him how to order the bricks in a line so that no two bricks of the same color are next to each other and the bricks at the ends of the line have the colors that he recalled. Note that Bitie could have made a mistake in recalling the two colors or perhaps he did not find some of the blocks after falling into them, so the reconstruction might not be possible.</p>

### 입력

<p>There are three integers in the first line of the standard input, k, p, and q(1 &le; k &le; 1,000,000, 1 &le; p,q &le; k), separated by single spaces, denoting the number of brick colors, and the colors of the first and the last brick in the desired arrangement, respectively. In the second line, there are k integers, i<sub>1</sub>, i<sub>2</sub>, &hellip;, i<sub>k</sub>(1 &le; i<sub>j</sub> &le; 1,000,000), separated by single spaces. The number i<sub>j</sub> signifies that Bitie has exactly i<sub>j</sub> bricks of color j. You may assume that the total number of bricks does not exceed one million, i.e., that n=i<sub>1</sub>+i<sub>2</sub>+&hellip;+i<sub>k</sub> &le; 1,000,000.</p>

### 출력

<p>Your program should print n integers to the standard output, separated by single spaces. The numbers should represent the colors of successive bricks in an arrangement that satisfies aforementioned constraints. If no such arrangement exists, your program should print only a single integer:0.</p>

<p>If there are several correct answers, your program can pick one arbitrarily.</p>

### 힌트

<p>In the first example, another correct arrangement is &quot;3 1 2 3 2 3 2 1&quot;. In the second example Bitie must have made a mistake-it is impossible to arrange the bricks so that they satisfy the constraints.</p>