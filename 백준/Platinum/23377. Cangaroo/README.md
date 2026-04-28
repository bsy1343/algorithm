# [Platinum IV] Cangaroo - 23377

[문제 링크](https://www.acmicpc.net/problem/23377)

### 성능 요약

시간 제한: 4 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 91, 정답: 71, 맞힌 사람: 64, 정답 비율: 78.049%

### 분류

다이나믹 프로그래밍, 비트마스킹, 비트필드를 이용한 다이나믹 프로그래밍

### 문제 설명

<p>Let us talk about the big elephant in the room<sup>1</sup>: you&#39;ve had a kangaroo in your room for a while now and you need to hide it without raising suspicion, since you want to keep the animal. Hiding an animal of this size is difficult: if you use a lot of space, it is obvious that you are hiding something from your friends. Hence, you want to use as little space as possible to hide the kangaroo.</p>

<p>When the kangaroo was placed against the wall, you took a black and white picture of the animal. Looking around in the house, the only tools you found to hide the kangaroo with were empty tin cans. The dimensions of the tin cans correspond with $2 \times 2$ pixels in the picture and these cans cannot overlap. So, you can make a <em>cangaroo</em> and if someone asks why you have cans in the shape of a kangaroo, you simply say it is a bad joke of yours.</p>

<p>The position of each can has to exactly correspond to a block of $2\times 2$ pixels in the picture, and they cannot be shifted or rotated to only partially cover some pixels. Furthermore, cans cannot float in the air, so every can has to be supported either by the floor, which is just below the bottom row of the picture, or by another can, for which at least one of the left and right half must directly rest on another can. The structure does not otherwise need to be balanced.</p>

<p>What is the minimum number of cans needed to hide the kangaroo?</p>

<p><sup>1</sup>You also wanted an elephant but this did not fit with the kangaroo in your room, sadly.</p>

### 입력

<p>The input consists of:</p>

<ul>
	<li>One line containing two integers $n$ ($2\leq n\leq 100$) and $m$ ($2\leq m\leq 10$), the height and width of your room. Both $n$ and $m$ are even.</li>
	<li>$n$ lines, each containing $m$ characters that are either &#39;<code>.</code>&#39; or &#39;<code>#</code>&#39;, where &#39;<code>#</code>&#39; marks a position that needs to be hidden by a can.</li>
</ul>

### 출력

<p>Output the minimal number of $2 \times 2$ cans that is required to hide the kangaroo in the room.</p>