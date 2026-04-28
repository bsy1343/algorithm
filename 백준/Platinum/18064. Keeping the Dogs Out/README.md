# [Platinum IV] Keeping the Dogs Out - 18064

[문제 링크](https://www.acmicpc.net/problem/18064)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 23, 정답: 16, 맞힌 사람: 15, 정답 비율: 78.947%

### 분류

브루트포스 알고리즘, 그리디 알고리즘

### 문제 설명

<p>Your best friend keeps telling you about her neighbour&rsquo;s annoying dogs &ndash; apparently, they constantly lay waste to her garden and leave smelly &ldquo;gifts&rdquo;. Today, she has decided to start working on a solution: building a wall to keep them out.</p>

<p>Of course the wall must have the same height in all places (i.e. be rectangular), and it cannot have any holes that would let the dogs through. Your friend does not really care about the wall&rsquo;s exact dimensions, though.</p>

<p>She has already bought the stones she plans to use (and she wants to use all of them!) and sorted them by size. All of them have the same width, but the length and height may vary. For each stone however, its length is equal to its height and both are a power of two. The width of the wall must be equal to the width of the stones, i.e. you may not rotate the stones and you may not put two stones behind each other.</p>

<p>Given the side lengths and quantities of the stones, determine if it is possible to build a wall using all available stones, and if so, what length and height such a wall might have.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/18064.%E2%80%85Keeping%E2%80%85the%E2%80%85Dogs%E2%80%85Out/4fc810bb.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/18064.%E2%80%85Keeping%E2%80%85the%E2%80%85Dogs%E2%80%85Out/4fc810bb.png" data-original-src="https://upload.acmicpc.net/cf5a17a7-1312-490c-bad2-12b3c9484eba/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 238px; height: 241px;" /></p>

<p style="text-align: center;">Figure K.1: Illustration of the first sample.</p>

### 입력

<p>The input consists of:</p>

<ul>
	<li>One line with an integer n (0 &le; n &le; 25), indicating that the largest stone has a side length of 2<sup>n</sup>.</li>
	<li>One line with n + 1 integers m<sub>0</sub>, . . . , m<sub>n</sub> (0 &le; m<sub>i</sub> &le; 10<sup>15</sup> for each i, m<sub>n</sub> &ge; 1), where m<sub>i</sub> describes the number of stones of side length 2<sup>i</sup>.</li>
</ul>

<p>It is guaranteed that the combined area of all stones is at most 10<sup>15</sup>.</p>

### 출력

<p>If it is possible to build a rectangular wall without any holes, output one line with two integers, the length and height of a possible wall that can be built. Otherwise, output impossible. If multiple solutions exist, output any of them.</p>