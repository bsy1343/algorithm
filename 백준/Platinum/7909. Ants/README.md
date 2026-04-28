# [Platinum I] Ants - 7909

[문제 링크](https://www.acmicpc.net/problem/7909)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 8 MB

### 통계

제출: 7, 정답: 2, 맞힌 사람: 2, 정답 비율: 50.000%

### 분류

수학, 많은 조건 분기

### 문제 설명

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/7909.%E2%80%85Ants/aa84217d.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/7909.%E2%80%85Ants/aa84217d.png" data-original-src="https://upload.acmicpc.net/c0aa94ec-359c-429c-813f-a3b46f131b2e/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 237px; height: 225px;" /></p>

<p>Computer geeks like trees. Ants also like trees. Therefore we are given a tree with two ants walking on it &mdash; the Left Ant and the Right Ant &mdash; in a way shown in the above figure (the ants walk along the path depicted with a dotted line). They start their journey at the lower end of the trunk, on its opposite sides. The Left Ant needs 2 seconds to walk along a single edge of the tree if walking from the root (upwards), and 1 second if walking towards the root (downwards). The Right Ant is two times faster. When the two ants meet, they both turn around and start walking in the opposite directions. If any of the ants steps from the tree to the ground, it immediately starts to climb on the opposite side of the trunk. Apart from that, the ants are so tiny that they would not be visible even under a microscope (they are depicted larger in the figure on purpose). Your task is to write a program that computes the moment at which the ants turn around for the second time.</p>

### 입력

<p>The first line of the input contains a single integer t (1 &le; t &le; 1000) representing the number of test cases described in the input.</p>

<p>The description of each test case consists of two lines. The first line contains an even integer n (2 &le; n &le; 100 000 000) denoting the number of edges in the tree. The second line holds a description of the tree. It is a string consisting of n/2 characters representing a 2n-bit binary number written in a hexadecimal form (using digits and small letters from a to f). This number shows the Left Ant&rsquo;s path around the whole tree assuming that the Right Ant stands still. The consecutive bits of this number (starting from the left) mean if the Left Ant walks away from the root of the tree along the corresponding edge (bit 1) or if it walks towards the root along this edge (bit 0). The root has a trunk, that is, there is exactly one edge leading from the root of the tree.</p>

<p>The size of the input file does not exceed 50 MB, which is much more than the amount of memory available for your program.</p>

### 출력

<p>Your program should output t lines containing answers to the consecutive test cases. Each answer should represent the moment (in seconds) in which the ants turn around for the second time, given as an irreducible fraction p/q (without any white space around /), where p and q are positive integers. If the answer is integer then, obviously, q = 1.</p>

### 힌트

<p>The sample data corresponds to the figure above, and transforms to the following sequence of bits:</p>

<p>1111 1011 0001 1101 1010 0011 0000 1101 0001 1011 0111 0010 0011 0000</p>